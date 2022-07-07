import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int staffAgeTotal = 0;
        int studentTempAge = 0;
        int studentOldIndex = 0;

        Person[] staff = new Person[3];
        LinkedList<Person> student = new LinkedList<Person>();
        
        
        for (int i = 0; i < 3; i++) {
            
            //Input values
            System.out.println("Enter staff name");
            String staffName = input.nextLine();

            System.out.println("Enter staff age");
            int staffAge  = Integer.parseInt(input.nextLine());

            System.out.println("Enter student name");
            String studentName = input.nextLine();

            System.out.println("Enter student age");
            int studentAge  = Integer.parseInt(input.nextLine());

            //Create object
            Person pStaff = new Person(staffName, staffAge);
            Person pStudent = new Person(studentName, studentAge);
            
            //Add to the array / linkedlist
            staff[i] = pStaff;
            student.add(pStudent);
            
            //Average total
            staffAgeTotal += staffAge;

            if (studentAge > studentTempAge) 
            {
              studentOldIndex = i;  
            }
            studentTempAge = studentAge;

        }
        
        int staffAgeAverage = staffAgeTotal / 3;

        System.out.println("Average staff age: "+staffAgeAverage+"\nOldest student: "+student.get(studentOldIndex).getName());
    }
}