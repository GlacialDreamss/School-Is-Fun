def login():
  check = 1
  checker=2
  while checker==2:
    if check == "yes":
      checker=1
      return user
    else:
      user = input("Please enter your name: ")
      passw = int(input("Please enter your passcode: "))
      alias = input("Please enter your nickname: ")
      print(user,passw,alias)
      check = input("Is this information correct? (yes/no)\n")
      check = check.lower()
login()