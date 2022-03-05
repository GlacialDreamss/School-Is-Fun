subjectList=[]
sortedSubjectList=[]
gradeList=[]
subjectGrade=[]
gradeList=[]
gradeList2=[]
revisionTimes=[]
checker="Y"

#The file is opened to be readand the data required is taken and sorted.
file=open("HelpMeStudy.txt","r")
for num in range(0,11):
 line=file.readline()
 index=line.split(",")
 subjectList.append(index[0])
 gradeList.append(int(index[1]))
 gradeList2.append(int(index[1]))
 subjectString=[int(gradeList[num]),subjectList[num]]
 subjectGrade.append(subjectString)

#The file is then closed and lists are reversed to sort them from highest to lowest.
file.close()
gradeList.sort(reverse=True)
subjectGrade.sort(reverse=True)

#The strings from the sorted list are taken so they can be used for output in the right order.
for num in range(0,11):
 splitList=subjectGrade[num]
 sortedSubjectList.append(splitList[1])
 splitList=[]

#The revision times are determined through the grades acting as a condition for the if statement
for num2 in range(0,11):
 if gradeList2[num2]==9:
   revisionTimes.append(10)
 elif gradeList2[num2]==8:
   revisionTimes.append(20)
 elif gradeList2[num2]==7:
   revisionTimes.append(20)
 else:
   revisionTimes.append(30)

#The interface for the programme is below, both questions and their output are managed here (as well as whether or not the person decides to quit.) Formatting is used to make the data output look presentable
while checker!="N":
 decision=input("Do you want to:\nA) See your grades from high to low\nB) Work out your study times\n")
 if decision=="A":
   print("*Current Grades*")
   print("Subject                      Grade")
   for num3 in range(0,11):
     print("%-20s%10d"%(sortedSubjectList[num3],gradeList[num3]))
 elif decision=="B":
   print("*Study Time Recommendation*")
   print("Subject                     Time")
   for num4 in range(0,11):
     print("%-20s%10d"%(subjectList[num4],revisionTimes[num4]))
 else:
    print("*INVALID*") 
 checker=input("\nDo you want to continue (Y/N)\n")