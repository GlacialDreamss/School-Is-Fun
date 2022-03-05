#The time functon is included to make stops between code so it is easier to read, the sys function is imported to enable the sript termination for option X. 
import time
import sys
#The layout list allows the programme to cross check if seats input by the user are valid. Passengers and seats are both empty lists that will have data appended to them for futue usage in the code.
layout=["A1","B1","C1","D1","E1","A2","B2","C2","D2","E2","A3","B3","C3","D3","E3","A4","B4","C4","D4","E4"]
passengers=[]
seats=[]
#The cariables here are either used for checking the eamount of occurred loops (eg the counters) or conditions.
condition="uhhh"
chance=""
check=""
counter=0
counter2=0
print("Welcome to SnakeAir")
time.sleep(1)
#The while loop allows the same processes to repeat, in this case it allows for multiple decisions to be made in one running of the code. 
while condition=="uhhh":
 chance="x"
 print("What would you like to do:")
 time.sleep(1)
 print("A) Book a Seat")
 time.sleep(.5)
 print("B) Print the passenger list")
 time.sleep(.5)
 print("X) Quit the program")
 choice=input("Your choice: ")
 #The if, elif and else statements are used to run different lines of code based on the users choice.
 if choice=="A":
   while chance!="N":
     check="x"
     #In this section of the code colour codes are used to enable easier usage. Green signifies vacant seats while red XX shows booked seats. Sections of the layout list are used through indexes in the code. It is also contained in a while loop so it can be repeated and multiple seats can be booked.
     print("\n~BOOKING A SEAT~")
     print("\nHere is the seat array")
     print("    [A]    [B]    [C]    [D]    [E]")
     print("\033[1;37;48m[1] \033[1;32;48m",layout[0],"   ",layout[1],"   ",layout[2],"   ",layout[3],"   ",layout[4])
     print("\033[1;37;48m[2] \033[1;32;48m",layout[5],"   ",layout[6],"   ",layout[7],"   ",layout[8],"   ",layout[9])
     print(" \033[1;37;48m                 Aisle                ")
     print("\033[1;37;48m[3] \033[1;32;48m",layout[10],"   ",layout[11],"   ",layout[12],"   ",layout[13],"   ",layout[14])
     print("\033[1;37;48m[4] \033[1;32;48m",layout[15],"   ",layout[16],"   ",layout[17],"   ",layout[18],"   ",layout[19])
     while check!="Y":
       seat=input("\033[1;37;48mWhich seat would you like to book: ")
       name=input("What is the passenger's name: ")
       check=input(str(seat)+" "+name+"- is this the correct data?(Y/N)")
     #Once the user has booked seats, the .pop and .append functions are used to alter the contents of the lists layout, seats and passengers. This changes the data output in the above loop.
     index=layout.index(seat)
     layout.pop(index)
     #the next line replaces the selected seat with a red XX in order to show the seat is occupied.
     layout.insert(index,"\033[1;31;48mXX\033[1;32;48m") 
     seats.append(seat) 
     passengers.append(name)
     counter+=1
     #The chance variable below allows the user to choose whether or not they want to book another seat 
     chance=input("Would you like to book another seat (Y/N)")
 #This next section is another choice that can be made by the user, the passenger array will be printed if B is chosen.  
 elif choice=="B":
   print("\n~PRINTING THE ARRAY~\n")
   print("Seat|Name")
   for num in range(counter):
     print(seats[counter2]+"|"+passengers[counter2])
     counter2+=1
 #The last valid option is X which allows the user to quit either at the start or after another option.
 elif choice=="X":
   sys.exit("You chose to quit the program") 
 #The last outcome is an error message which only happens if the user inputs an invalid option, they get to try again as it the code is within a loop.
 else:
   print("Try again")

