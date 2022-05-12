class Ford extends Car{
    public static void main(String[] args) {
        Car c1 = new Car(); //Object
        c1.model("Fiesta");
        honk();
        super.honk();
    }

    public void honk() {
        System.out.println("Nut");
    }
}
