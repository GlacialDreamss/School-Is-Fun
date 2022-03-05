def length():
 word = input("Please enter a word: ")
 length = len(word)
 print(length)

def letter():
 word = input("Please enter a word: ")
 letter = list(word)
 print(letter[0])

def upper():
 word = input("Please enter a word: ")
 upperCase = word.upper()
 print(upperCase)

def reverse():
  word = input("Please enter a word: ")
  print(word[::-1])

decision = input("What would you like to do to your word.\nA) Length\nB) Letter\nC) Upper\nD) Reverse\nYour Option: ")
caps = decision.upper()

if caps == "A":
  length()
elif caps == "B":
  letter()
elif caps == "C":
  upper()
elif caps == "D":
  reverse()
else:
  print("Not an option, try again")