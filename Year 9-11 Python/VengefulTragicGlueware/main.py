hikerData=[]
distance=[]
avgDistance=[]
data=open("hikers.txt","r")
line=data.readline()
index=line.split(",")
for num in range(0,14):
 distance.append(index[1])
 distance.append(index[2])
 distance.append(index[3])
 average=(index[1]+index[2]+index[3]/3)
 avgDistance.append(average)
 hikerData.append(line)
 line=data.readline()
 index=line.split(",")
print("     |Name | 1| 2| 3| Avg|")
for num2 in range(0,14):
 print("Row "+str(num2+1)+"|"+hikerData[num2]+" "+avgDistance[num2])
