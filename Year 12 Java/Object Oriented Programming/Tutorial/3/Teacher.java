//Object Class
public class Teacher {

    //private attributes
    private String name;
    private static String school; //Static makes the variable static

    //Getters
    public String getName() {
        return name;
    }
    public String getSchool() {
        return school;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    
    //toString() parses as a string
    @Override
    public String toString(){
        return "Teacher [name = "+ name +",  school = "+ school +"]";
    }
}