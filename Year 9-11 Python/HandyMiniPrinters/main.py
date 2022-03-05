#Three python modules are imported into the program, random is used to genrerate the random song and sys is used to exit the program.
import random
import sys
import time
#Lists are prepared to be used to store the data from the lists in a format that is easier to manipulate. Variables are also created for future use.
songList=[]
artists=[]
wordNum=[]
firstLetter=[]
points=0
password="A"
username="A"
determine="E"
retry="yes"
condition="E"
rounds=0
#The file, under the name songlist.txt is opened to be read from and the random integer is generated to randomise the selection of the song.
songs=open("songlist.txt","r")
randoms=random.randint(0,19)

#Authorisation is included, meaning if the user doesn't input the correct data they won't have access.
while username!="Daniel" and password!="E":
 username=input("Username: ")
while password!="E":
 password=input("Password: ")
print("Authorisation complete")

#The game begins and all data is extracted and appended to different lists to make data manipulation easier
print("Guess The Song!")
print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
for num in range(0,20):
 songLine=songs.readline()
 splitLine=songLine.split(",")
 num=int(splitLine[3])
 wordNum.append(num)
 songList.append(splitLine[1])
 artists.append(splitLine[0])
 firstLetter.append(splitLine[2])
 
#The while loop allows the game to be infinite, until they lose.
while retry=="yes":
 #Variables are reset so the game continues to function through the conditions in if statements and while loops not being met (due to the reset.)
 attempt=0
 condition="E"
 rounds+=1 
 #The question is printed out via the random integer being the number used to chose the index which determines the output
 print("Round "+str(rounds))
 print("Artist: "+artists[randoms])
 print("Song: "+firstLetter[randoms])
 print("Which song is it?")
 #The while loop allows the user to have a maximum of two turns per question
 while attempt != 2: 
   attempt+=1
   #The if statement prevents the same code being repirnted if they get it right the first time
   if condition=="correct":
     time.sleep(0.01)
   else:
     #The user inputs their answer which is checked against the list.
     print("Attempt number "+str(attempt))
     answer=input("Your answer: ")
     if answer == songList[randoms]:
       print("Correct\n")
       condition="correct"
       #The next random integer is generated for a varied result next time and points are added
       randoms=random.randint(0,19) 
       if attempt == 1:
         points += 3
       else:
         points += 1
       attempt=1  
     else:
       #The game only finishes when the user gets an incorrect answer twice and their point total around with round streak is printed
       print("Incorrect") 
       if attempt==2:
         print("You finished with "+str(points)+" points in round "+str(rounds))
         sys.exit("Game Over")
       else:
         time.sleep(0.01)
#The file is closed
songs.close()