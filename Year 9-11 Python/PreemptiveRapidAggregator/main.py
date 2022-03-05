#The list is created through the user inputting how many words there are and typing in the sentence.
words=int(input("How many words are there in your sentence?: "))
error=0
sentence=[]
for num in range(0,words):
  word=input("Enter a word from your sentence: ")
  upper=word.upper()
  sentence.append(upper)
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