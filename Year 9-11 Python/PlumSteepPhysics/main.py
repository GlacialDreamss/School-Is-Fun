logicGate = input("Enter logic gate: ")
input1 = int(input("Enter first input: "))
input2 = int(input("Enter second input: "))
e=logicGate.upper()
if e == "OR":
  if (input1==0 and input2==0):
    print("Result: 0")
  if (input1==1 and input2==1):
    print("Result: 1")  
  if (input1==1 and input2==0):
    print("Result: 1")
  if (input1==0 and input2==1):
    print("Result: 1")  
elif e == "AND":
  if (input1==0 and input2==0):
    print("Result: 0")
  if (input1==1 and input2==1):
    print("Result: 1")  
  if (input1==1 and input2==0):
    print("Result: 0")
  if (input1==0 and input2==1):
    print("Result: 0") 
elif e == "NOT":
  if (input1==0):
    print("Result: 1") 
  if (input1==1):
    print("Result: 0")   
else:
  print("Incorrect input")