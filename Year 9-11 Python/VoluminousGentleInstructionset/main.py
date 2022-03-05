import time
#The appmakers.txt file is opened and read using r
data=open("appmakers.txt","r")
women=[]
records=""
counter=0
counter2=0
num1=1
num3=3
num4=4
#The while loop allows all the people who fit the condition to be output
for num0 in range (0,50):
 #A line of the text file saved within the records variable
 records=data.readline()
 #The data between each of the commas is saved in each index in the list index
 index=records.split(",")
 #Each component required is saved within a variable
 fname=index[0]
 sname=index[1]
 age=int(index[2])
 email=index[3]
 gender=index[4]
 appName=index[5]
 #The conditions are checked and data is output through the if statement
 if gender=="Female" and age<18:
   women.append(fname)
   women.append(sname)
   women.append(age)
   women.append(email)
   women.append(appName)
   counter+=1
 else:
   time.sleep(0.01)
data.close()
num0=0
#The while loop allows the women list to be output using less lines
while counter2 != 17:
 print(women[num0],women[num1],"\nApp:",women[num4],"Email:",women[num3])
 counter2+=1
 num0+=5
 num1+=5
 num3+=5
 num4+=5
print("We will need to cater for "+str(counter)+" female app makers under the age of 18")
