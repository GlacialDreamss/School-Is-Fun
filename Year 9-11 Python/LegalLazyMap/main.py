import time

passcode=0 
pullUps=[]
pressUps=[]
condition="x"
condition2="x"
num2 = 0

while passcode != "1234":
  passcode=input("Please enter the passcode: ")
  if passcode != "1234":
    print("Please try again")
print("Welcome to the Gym Database")
print("Here are your options:")
print("A - See data in press up order")
print("B - See data in pull up order")
print("C - Exit program")

file=open("gymclub.txt","r")
for num in range(0,12):
  line=file.readline()
  split=line.split(",")
  pullUps.append(int(split[2]))
pullUps.sort(reverse=True)
file.close()

file=open("gymclub.txt","r")
for num in range(0,12):
  line=file.readline()
  split=line.split(",")
  pressUps.append(int(split[1]))
pressUps.sort(reverse=True)
file.close()

file = open("gymclub.txt","r")
index=file.readline()
split=index.split(",")
checker = " "

while condition=="x":
  choice=input("Your choice: ")
  if choice == "A":  
    print("\nName                 Press Ups                 Pull Ups")
    while condition == "x":
      if pressUps[num2] == int(split[1]): 
        file = open("gymclub.txt","r")
        num2 += 1
        print("%-25s%1d%25d"%(split[0],int(split[1]),int(split[2])))
        file.close()
        checker = "yes"
        if num2 == 12:
          condition = "z"
        else:
          time.sleep(0)
      else:
        time.sleep(0)
      if checker == "yes":
        file = open("gymclub.txt","r")
      else:
        time.sleep(0)
      checker  = "no"
      index = file.readline()
      split=index.split(",")  
 
  if choice == "a":
    print("\nName                 Press Ups                 Pull Ups")
    while condition == "x":
      if pressUps[num2] == int(split[1]): 
        file = open("gymclub.txt","r")
        num2 += 1
        print("%-25s%1d%25d"%(split[0],int(split[1]),int(split[2])))
        file.close()
        checker = "yes"
        if num2 == 12:
          condition = "z"
        else:
          time.sleep(0)
      else:
        time.sleep(0)
      if checker == "yes":
        file = open("gymclub.txt","r")
      else:
        time.sleep(0)
      checker  = "no"
      index = file.readline()
      split=index.split(",")   

  if choice == "B":
    print("\nName                 Press Ups                 Pull Ups")
    while condition == "x":
      if pullUps[num2] == int(split[2]): 
        file = open("gymclub.txt","r")
        num2 += 1
        print("%-25s%1d%25d"%(split[0],int(split[1]),int(split[2])))
        file.close()
        checker = "yes"
        if num2 == 12:
          condition = "z"
        else:
          time.sleep(0)
      else:
        time.sleep(0)
      if checker == "yes":
        file = open("gymclub.txt","r")
      else:
        time.sleep(0)
      checker  = "no"
      index = file.readline()
      split=index.split(",")   
  
  if choice == "b":
    if pullUps[num2] == int(split[2]): 
      file = open("gymclub.txt","r")
      num2 += 1
      print("%-25s%1d%25d"%(split[0],int(split[1]),int(split[2])))
      file.close()
      checker = "yes"
      if num2 == 12:
        condition = "z"
      else:
        time.sleep(0)
    else:
      time.sleep(0)
    if checker == "yes":
      file = open("gymclub.txt","r")
    else:
      time.sleep(0) 
    checker  = "no"
    index = file.readline()
    split=index.split(",")   

  if choice == "C":
    quit("You chose to exit the program")
  if choice == "c":
    quit("You chose to exit the program")
  
  if condition == "x":
    print("Please try again")