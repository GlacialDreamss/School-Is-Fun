class Main{ //Driver Class - class with the main method
    //Only 1 driver class per project
    public static void main(String[] args) {
        //Object Creation - create instances of a class
        //Either the just created or provided with arguments
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person("Yemi",45);
        
        //The other instances are give arguments
        p1.setName("Alex");
        p2.setName("Demi");
        p1.setAge(84);
        p2.setAge(23);

        //The objects are output
        System.out.println(p3.getAge());
        System.out.println(p1.getName()+", "+p2.getAge());
        
        /*
        Objects - p1, p2
        Alex, Demi, 84, 23  - Object attributes
        */
    }
}