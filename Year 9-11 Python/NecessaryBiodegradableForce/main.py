#The users.txt file is created as it does not currently exist, it is opened to be written to
users=open("users.txt","w")
cycle=""
num=0
#The while loop allows the user to input data multiple times until they decide not to
while cycle != "xxx":
 name=input("Enter your name: ")
 surname=input("Enter your surname: ")
 age=input("Enter your age: ")
 cycle=input("Are you done (xxx if you are): ")
 #The data in the variables in () are written to the .txt file 
 users.write(name+","+surname+","+str(age)+",\n")
 num+=1
#The file is closed... 
users.close()
#And then reopened to be read instead or written to
users2=open("users.txt","r")
cycle="."
fnames=[]
snames=[]
num3=0
#For loop allows code to run a set number of times
for num2 in range(num):
 data=users2.readline()
 #Each comma in the current line of codebeing read separates the data into indicies
 index=data.split(",")
 age=int(index[2])
 #The if statement causes data to be printed based on whether or now it meets a condition
 if age>=16:
   fnames.append(index[0])
   snames.append(index[1])
   print(fnames[num3],snames[num3])
   num3+=1
#The users.txt file is finally closed
users.close()
