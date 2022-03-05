#A list is created to hold the days so they can output later
days=["Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"]
temperatures=[]
condition="."
day=0
#A while loop allows input to be appeded to the empty list so it can be compared to later
while condition!="x":
 day+=1
 temp=int(input("What is the temperature ("+str(day)+") "))
 temperatures.append(temp)
 if day==7:
   condition="x"
 else:
   print(".")
#def allows a custom subroutine to be created
def maximum():
 sortedTemp=sorted(temperatures)
 print(sortedTemp)
 maxTemp=sortedTemp.pop(6)
 if maxTemp==temperatures[0]:
   print(days[0]+" "+str(maxTemp))
 elif maxTemp==temperatures[1]:
   print(days[1]+" "+str(maxTemp))
 elif maxTemp==temperatures[2]:
   print(days[2]+" "+str(maxTemp))
 elif maxTemp==temperatures[3]:
   print(days[3]+" "+str(maxTemp))
 elif maxTemp==temperatures[4]:
   print(days[4]+" "+str(maxTemp))
 elif maxTemp==temperatures[5]:
   print(days[5]+" "+str(maxTemp))
 else:
   print(days[6]+" "+str(maxTemp))  
#The subroutine is then run 
maximum()

 