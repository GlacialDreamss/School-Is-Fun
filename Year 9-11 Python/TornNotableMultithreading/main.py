import random
name = input("What is your name: ")
score=0
for num in range(0,10):
  num1 = random.randint(0,20)
  num2 = random.randint(0,20)
  answer = num1 + num2
  question = int(input("What is "+str(num1)+"+"+str(num2)+"? "))
  if question == answer:
    print("Correct!")
    score+=1
  else:
    print("Incorrect")
print("You scored",score,"out of 10")