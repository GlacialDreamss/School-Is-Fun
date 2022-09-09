import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int staffAgeTotal = 0;
        
        Person[] staff = new Person[3];
        LinkedList<Person> student = new LinkedList<Person>();
        
        for (int i = 0; i < 3; i++) {
            
            //Input values
            System.out.println("Enter name");
            String staffName = input.nextLine();

            System.out.println("Enter age");
            int staffAge  = Integer.parseInt(input.nextLine());

            System.out.println("Enter name");
            String studentName = input.nextLine();

            System.out.println("Enter age");
            int studentAge  = Integer.parseInt(input.nextLine());
            
            //Create object
            Person pStaff = new Person(staffName, staffAge);
            Person pStudent = new Person(studentName, studentAge);
            
            //Add to the array / linkedlist
            staff[i] = pStaff;
            student.add(pStudent);
            
            //Average total
            staffAgeTotal += staffAge;

            //Oldest student
            if (i = 1){
                if () {
                    
                }   
            } 
            
        }
        
        int staffAgeAverage = staffAgeTotal / 3;
        System.out.println();
    }
}