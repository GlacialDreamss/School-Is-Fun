import time
import random
import sys

#Variables/Lists

noom = 3
check = 3
check2 = 0
check3 = 0
cycle = 0
count = 0
p1Cards = []
p2Cards = []
leaderboard = []
leaderboard2D = []
#The cards are all in one list then shuffled below
cards = ["Red,1","Red,2","Red,3","Red,4","Red,5","Red,6","Red,7","Red,8","Red,9","Red,10","Black,1","Black,2","Black,3","Black,4","Black,5","Black,6","Black,7","Black,8","Black,9","Black,10","Yellow,1","Yellow,2","Yellow,3","Yellow,4","Yellow,5","Yellow,6","Yellow,7","Yellow,8","Yellow,9","Yellow,10"
]

random.shuffle(cards)

#Program Begins
random.shuffle(cards)
while True:
  if check == "yes":
    break
  else:
    user = input("Player 1 please enter your account name: ")
    user2 = input("Player 2 please enter your account name: ")
    for num in range(0,3):
      try:     
        passw = int(input("Player 1, please enter the passcode for your account: "))
        passw2 = int(input("Player 2, please enter the passcode for your account: "))
      except ValueError:
        print("Not an integer, please try again") 
        noom = noom - 1
        print(str(noom)+" tries remaining") 
        if num == 2:
          sys.exit("You have failed to enter an integer too many times...")  
      else:
        break
    pog = "\nPlayer 1:\nAccount Name: "+user+"\nPassword: "+str(passw)+"\n\nPlayer 2:\nAccount Name: "+user2+"\nPassword: "+str(passw2)
    print(pog)
    check = input("Is this information correct? (yes/no)\n")
    check = check.lower()
#The account file is opened and split so people can be authenticated by checking input against the list
file = open("accounts.txt","r")
line = file.readline()
split = line.split(",")

passw = str(passw)
passw2 = str(passw2)

#The for loops authenticate each variable by only fulfilling the condition to break the loop when both users have been authenticated
for a in range(1,13):
  for b in range(0,5):
    if a == 1:
      if split[b].strip() == user:
        if split[b+1].strip() == passw:
          print(user+" Authenticated")
          check2 = 1
          break
  for c in range(0,5):
    if a == 2: 
      if split[c].strip() == user2:
        if split[c+1].strip() == passw2:
          print(user2+" Authenticated")
          check3  = 1
    if check2 + check3 == 2:
      break     
file.close()

#Game Begins
print("*~*~*~*~*~*~*~*~*~*~*~*~*~")
print("*~*~*~*~Card Game*~*~*~*~*")
print("*~*~*~*~*~*~*~*~*~*~*~*~*~")

#Players are allowed to enter an alias to be referred to during the game 
player1 = input("Player 1, please enter your username: ")
player2 = input("Player 2, please enter your username: ")

#The while loop only ends when the card file has been emptied
while cards != []:
  cycle += 1
  print("\nRound "+str(cycle))
  card1 = cards.pop(0)
  card2 = cards.pop(0)
  print(player1+" draw: "+card1+"\n"+player2+" draw: "+card2)
  winCards = card1+card2
  splitCard1 = card1.split(",")
  splitCard2 = card2.split(",")
  #The code that determines each round's winner is a compilation of if statements which when fulfilled will allow either player 1 or 2 to gain a point. 
  if splitCard1[0] == splitCard2[0]:
    if splitCard1[1] == splitCard2[1]:
      print("Draw, both players keep their cards")
      time.sleep(1)
    elif splitCard1[1] >= splitCard2[1]:
      print("\n"+player1+" wins Round "+str(cycle)) 
      time.sleep(1)
    else:
      print("\n"+player2+" wins Round "+str(cycle))
      time.sleep(1) 
  else:
    #This section is for if the cards are of different colours
    if splitCard1[0] == "Red":
      if splitCard2[0] == "Black":
        print(player1+" wins Round "+str(cycle))
        time.sleep(1)
        p1Cards.append(winCards)    
    if splitCard1[0] == "Black":
      if splitCard2[0] == "Red":
        print(player2+" wins Round "+str(cycle))
        time.sleep(1)
        p2Cards.append(winCards)   
    if splitCard1[0] == "Red":
      if splitCard2[0] == "Yellow":
        print(player2+" wins Round "+str(cycle))
        time.sleep(1)
        p2Cards.append(winCards)   
    if splitCard1[0] == "Yellow":
      if splitCard2[0] == "Red":
        print(player1+" wins Round "+str(cycle))
        time.sleep(1)
        p1Cards.append(winCards)                 
    if splitCard1[0] == "Black":
      if splitCard2[0] == "Yellow":
        print(player1+" wins Round "+str(cycle))
        time.sleep(1)
        p1Cards.append(winCards)     
    if splitCard1[0] == "Yellow":
      if splitCard2[0] == "Black":
        print(player2+" wins Round "+str(cycle))
        time.sleep(1)
        p2Cards.append(winCards)     

#The winner is the declared based on the number of cards each user has compared to each other
if len(p1Cards) >= len(p2Cards):
  cardTotal = len(p1Cards)*2
  print("\nPlayer 1 wins with "+str(cardTotal)+" cards")
  score = player1+","+str(cardTotal)+"\n"
else:
  cardTotal = len(p2Cards)*2
  print("\nPlayer 2 wins with "+str(cardTotal)+" cards")  
  score = player2+","+str(cardTotal)+"\n"

#The number of lines in the file is counted
fileLength = len(open("winners.txt").readlines( ))

winners = open("winners.txt","a")
winners.write(score)
winners.close()

winners = open("winners.txt","r")
for d in range(0,fileLength):
  line = winners.readline()
  line = line.strip()
  leaderboard.append(line)
winners.close()

leaderboardLength = len(leaderboard)
for e in range(0,leaderboardLength):
  user = [leaderboard[e]]
  leaderboard2D.append(user)
sortedLeaderboard = sorted(leaderboard2D, key = lambda x:0, reverse = True)

leaders = open("leaderboard.txt","w")
for f in range(0,5):
  leaders.write(str(sortedLeaderboard[f]))
  leaders.write("\n")
leaders.close()