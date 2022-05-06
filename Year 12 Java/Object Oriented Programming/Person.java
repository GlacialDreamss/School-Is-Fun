class Person { //Object Class - helps to create objects
    //Multiple Object Classes
    
    //Private attributes - variables 
    private String name;
    private Int age;
    
    //Setter method - sets the value of the attributes
    public void setName(String name){
        this.name = name; //"this" is a keyword to show that the variable is from the same class
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    } 

    public int getAge(){
        return age
    }
    
    
}
