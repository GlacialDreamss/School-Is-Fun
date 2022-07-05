public class Person {
    //Attributes
    private String name;
    private int age;

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    //Constructors
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person() {

    }
}
