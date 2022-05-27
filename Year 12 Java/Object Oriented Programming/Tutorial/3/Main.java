//Driver Class
public class Main {
    public static void main(String[] args){
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.setName("Kaiye");
        t1.setSchool("WGS");
        t2.setName("Richard");
        t2.setSchool("DGS");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        

    }
}
