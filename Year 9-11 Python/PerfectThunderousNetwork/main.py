#The time function is included to make stops between code so it is easier to read, the sys function is imported to enable the script termination for option X.
import time
import sys
#The layout list allows the programme to cross check if seats input by the user are valid. Passengers and seats are both empty lists that will have data appended to them for future usage in the code.
layout=["A1","B1","C1","D1","E1","F1","A2","B2","C2","D2","E2","F2","A3","B3","C3","D3","E3","F3","A4","B4","C4","D4","E4","F4","A5","B5","C5","D5","E5","F5"]
layout2=layout
monLayout=layout
tueLayout=layout
wedLayout=layout
thurLayout=layout
friLayout=layout
passengers=[]
seats=[]
takenSeats=[]
#The variables here are either used for checking the amount of occurred loops (eg the counters) or conditions.
condition="uhhh"
condition2="taken"
condition3="..."
chance=""
check=""
seat=""
dayCondition="herro"
dayCheck=0
counter=0
counter2=0
counter3=1
print("Welcome to MJC CineBooker")
time.sleep(1)
#The while loop allows a different type of file tobe opened based on the input
while dayCondition=="herro":
 day=input("Which day would you like to book for?: ")
 if day=="Monday":
   print("Valid")
   dayFile=open("Monday.txt","a")
   dayNum=1
 elif day=="Tuesday":
   print("Valid")
   dayFile=open("Tuesday.txt","a")
   dayNum=2
 elif day=="Wednesday":
   print("Valid")
   dayFile=open("Wednesday.txt","a")
   dayNum=3
 elif day=="Thursday":
   print("Valid")
   dayFile=open("Thursday.txt","a")
   dayNum=4
 elif day=="Friday":
   print("Valid")
   dayFile=open("Friday.txt","a")
   dayNum=5
 else:
   print("Invalid, please try again")
   dayCheck+=1
 dayCondition="hoi"
 if dayCheck==1:
   dayCondition="herro"
 else:
   time.sleep(0.1)  
 dayCheck=0
if dayNum==1:
 monLayout=layout
elif dayNum==2:
 tueLayout==layout 
elif dayNum==3:
 wedLayout==layout 
elif dayNum==4:
 thurLayout==layout 
else:
 friLayout==layout 
while condition=="uhhh":
 chance="x"
 #The user is given the ability to choose what they want to do
 print("\nWhat would you like to do?:")
 time.sleep(.5)
 print("A) Book a Seat")
 time.sleep(.5)
 print("B) Print the seating list")
 time.sleep(.5)
 print("C) Book for another day")
 time.sleep(.5)
 print("X) Quit the program (and save data in files)")
 print("Note ~ data is saved after confirming that it is the correct info")
 choice=input("Your choice: ")
 #In section A the display is printed out to give the user a visual layout so they can choose which seats they want
 if choice=="A":
   while chance!="N": 
     if dayNum==1:
       layout=monLayout
     elif dayNum==2:
       layout=tueLayout
     elif dayNum==3:
       layout=wedLayout
     elif dayNum==4:
       layout=thurLayout 
     else:
       layout=friLayout  
     check="x"
     #
     print("\n~BOOKING A SEAT~")
     print("\n*****************Screen******************")
     print("        [A]   [B]   [C]   [D]   [E]   [F]")
     print("\033[1;37;48m Row 1: \033[1;32;48m",layout[0],"  ",layout[1],"  ",layout[2],"  ",layout[3],"  ",layout[4],"  ",layout[5])
     print("\033[1;37;48m Row 2: \033[1;32;48m",layout[6],"  ",layout[7],"  ",layout[8],"  ",layout[9],"  ",layout[10],"  ",layout[11])
     print("\033[1;37;48m Row 3: \033[1;32;48m",layout[12],"  ",layout[13],"  ",layout[14],"  ",layout[15],"  ",layout[16],"  ",layout[17])
     print("\033[1;37;48m Row 4: \033[1;32;48m",layout[18],"  ",layout[19],"  ",layout[20],"  ",layout[21],"  ",layout[22],"  ",layout[23])
     print("\033[1;37;48m Row 5: \033[1;32;48m",layout[24],"  ",layout[25],"  ",layout[26],"  ",layout[27],"  ",layout[28],"  ",layout[29])  
     takenSeats.append(seat)
     while check!="Y":
       while condition2=="taken":
         seat=input("\033[1;37;48mWhich seat would you like to book: ")
         for checker in range(0,counter3):
           if seat==takenSeats[checker]:
             condition2="taken"
             print("That is occupied or invalid, please try another seat")
           else:
             condition2="vacant"
             print("Vacant")
             takenSeats.append(seat)
       condition2="taken"    
       name=input("What is the occupant's name: ")
       check=input(str(seat)+" "+name+"- is this the correct data? (Y/N) ")
       #
       if check=="Y":
         if dayNum==1:
           index=monLayout.index(seat)
           monLayout.pop(index)
           #
           monLayout.insert(index,"\033[1;31;48mXX\033[1;32;48m")
         elif dayNum==2:
           index=tueLayout.index(seat)
           tueLayout.pop(index)
           tueLayout.insert(index,"\033[1;31;48mXX\033[1;32;48m") 
         elif dayNum==3:
           index=wedLayout.index(seat)
           wedLayout.pop(index)
           wedLayout.insert(index,"\033[1;31;48mXX\033[1;32;48m") 
         elif dayNum==4:
           index=thurLayout.index(seat)
           thurLayout.pop(index)
           thurLayout.insert(index,"\033[1;31;48mXX\033[1;32;48m") 
         else:
           index=friLayout.index(seat)
           friLayout.pop(index)
           friLayout.insert(index,"\033[1;31;48mXX\033[1;32;48m")        
         seats.append(seat)
         passengers.append(name)
         dayFile.write(seat+"|"+name+"\n")
         dayFile.close()
         counter+=1
         if dayNum==1:
           dayFile=open("Monday.txt","a")
         elif dayNum==2:
           dayFile=open("Tuesday.txt","a")
         elif dayNum==3:
           dayFile=open("Wednesday.txt","a")
         elif dayNum==4:
           dayFile=open("Thursday.txt","a")
         else:
           dayFile=open("Friday.txt","a")        
       elif check=="N":
         counter3=+1
       else:
         print("Invalid, please re-enter information") 
       #The chance variable below allows the user to choose whether or not they want to book another seat
       while condition3=="...":
         chance=input("Would you like to book another seat (Y/N) ")
         if chance=="Y":
           time.sleep(.5)
           condition3="....."
         elif chance=="N":
           time.sleep(.5)
           condition3="....."
         else:
           print("Please try again") 
       condition3="..."
 #In section B ther is another choice that can be made by the user, the booked seats will be printed if B is chosen.
 elif choice=="B":
   print("\n~PRINTING Seating List~\n")
   print("Seat|Name")
   for num in range(counter):
     print(seats[counter2]+"|"+passengers[counter2])
     counter2+=1
   counter2=0
 # Section C allows the user to change the day they are currently booking for
 elif choice=="C":
   dayFile.close()     
   dayCondition="herro"
   while dayCondition=="herro":
     day=input("Which day would you like to book for?: ")
     if day=="Monday":
       print("Valid")
       dayFile=open("Monday.txt","a")
       dayNum=1
     elif day=="Tuesday":
       print("Valid")
       dayFile=open("Tuesday.txt","a")
       dayNum=2
     elif day=="Wednesday":
       print("Valid")
       dayFile=open("Wednesday.txt","a")
       dayNum=3
     elif day=="Thursday":
       print("Valid")
       dayFile=open("Thursday.txt","a")
       dayNum=4
     elif day=="Friday":
       print("Valid")
       dayFile=open("Friday.txt","a")
       dayNum=5
     else:
       print("Invalid, please try again")
       dayCheck+=1
     dayCondition="hoi"
     if dayCheck==1:
       dayCondition="herro"
     else:
       time.sleep(0.1)  
     dayCheck=0
     layout=["A1","B1","C1","D1","E1","F1","A2","B2","C2","D2","E2","F2","A3","B3","C3","D3","E3","F3","A4","B4","C4","D4","E4","F4","A5","B5","C5","D5","E5","F5"]
 #The last valid option is X which allows the user to quit either at the start or after another option.
 elif choice=="X":
   dayFile.close()
   sys.exit("You chose to quit the program")
 #The last outcome is an error message which only happens if the user inputs an invalid option, they get to try again as it the code is within a loop.
 else:
   print("Try again")