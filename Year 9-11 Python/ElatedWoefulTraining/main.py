import time
#Lists are created to store the data in the file separately, variables are also created for future use.
data=[]
weights=[]
magicMushrooms=[]
condition="why"
num2=0
#The file is opened to be read, this means it can't be altered but data can be aquired from it.
file = open("7J_Mushrooms.csv","r")
#The array for the table is printed.
print("Mushroom                Weight      Cooking")
print("***************************************************")
#The FOR loop splits the data into indexes using the .split() function and appends it to the lists created above using the .append() function
for num in range(0,10):
 index=file.readline()
 splitIndex=index.split(",")
 magicMushrooms.append(splitIndex[0])
 data.append(index)
 weights.append(int(splitIndex[1]))
#The weights list is sorted so the integers are arranged from lowest to greatest
weights.sort()
#The file is closed
file.close()

#This marks the second part of the program, below the file is reopened under another name and lines are re read to make this obvious. Other variables are also created
file2 = open("7J_Mushrooms.csv","r")
index2=file2.readline()
splitIndex2=index2.split(",")
checker = " "

#The WHILE loop allows the data to be printed out through using multiple IF and ELSE statements in order to check through the .csv file. This is done through opening, closing and reopening the file whilst having numbers in the weights list checked against it; allowing the data to be printed out in the appropriate way
while condition == "why":
 if weights[num2] == int(splitIndex2[1]): 
   file2 = open("7J_Mushrooms.csv","r")
   num2 += 1
   #Using % allows the data in the brackets to be output and formatted in the outlined way
   print("%-20s%5d%25s"%(splitIndex2[0],int(splitIndex2[1]),splitIndex2[2]))
   file2.close()
   checker = "yes"
   if num2 == 10:
     condition = "bcuz" 
   else:
     time.sleep(0.01)
 else:
   time.sleep(0.01)
 if checker == "yes":
   file2 = open("7J_Mushrooms.csv","r")
 else:
   time.sleep(0.01)  
 checker = "no" 
 index2 = file2.readline()
 splitIndex2 = index2.split(",")