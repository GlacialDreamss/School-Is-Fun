#The list is created which contains the words so a loop can be used to cycle through them easily.
sentence=["ASK","NOT","WHAT","YOUR","COUNTRY","CAN","DO","FOR","YOU","ASK","WHAT","YOU","CAN","DO","FOR","YOUR","COUNTRY" ]
error=0
#The user inputs the word they want to search for
decision=input("Which word would you like to search for: ")
#The word is changed to upper case to suit the list, making the program case insensitive
levelUp=decision.upper()
#The for loop is used as the number of cycles is a known value, it allows the word to be checked against each word in the list
for num in range(0,17):
  if levelUp==sentence[num]:
    print(decision+" is in position "+str(num+1))
    error+=1
#If the word does not appear then the error statement is output
if error==0:
  print(decision+" doesn't appear in the sentence")   