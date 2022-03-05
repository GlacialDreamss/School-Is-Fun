#Variables are created to store data in the .txt file separately
hikerData=[]
distance=[]
avgDistance=[]
#The .txt file is opened and read...
data=open("hikers.txt","r")
#A line of the data is saved in the variable and the list is split up through the commas, data between commas becomes separate indicies
line=data.readline()
index=line.split(",")
for num in range(0,14):
 #The data is appended to different lists and the average is calculated for the extra row
 distance.append(index[1])
 distance.append(index[2])
 distance.append(index[3])
 average=(int(index[1])+int(index[2])+int(index[3]))/3
 #The average is then rounded to make the output neater
 rounded=round(average)
 avgDistance.append(rounded)
 hikerData.append(line)
 #Another line of the .txt file is read for the next cycle in the loop
 line=data.readline()
 index=line.split(",")
#The file is closed as it is no longer needed
data.close()
#The array is created and data is printed
print("     |Name | 1| 2| 3|")
for num2 in range(0,14):
 print("Row "+str(num2+1)+"|"+hikerData[num2]+"Average: "+str(avgDistance[num2]))
avgDistance.sort()
print(avgDistance)