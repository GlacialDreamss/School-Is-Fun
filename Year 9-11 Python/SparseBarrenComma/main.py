data=[]
weights=[]
file = open("MagicMushrooms.csv","r")
print("Mushroom Weight Cooking")
print("************************************")
for num in range(0,10):
 index=file.readline()
 splitIndex=index.split(",")
 print(index)
 data.append(index)
 weights.append(splitIndex[1])
 weights.sorted(reverse=True)
print(weights)