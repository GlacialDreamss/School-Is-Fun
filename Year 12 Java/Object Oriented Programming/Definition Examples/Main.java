//Driver Class
public class Main {
    public static void main(String[] args) {
        Climate Spring = new Climate();
        Climate Summer = new Climate();
        Climate Autumn  = new Climate();
        Climate Winter = new Climate();

        Spring.setTime(1018);
        Spring.setDay("saturday");
        Spring.setDate(1);
        Spring.setMonth("may");

        Autumn.setTime(1620);
        Autumn.setDay("sunday");
        Autumn.setDate(24);
        Autumn.setMonth("november");

        System.out.println(Spring.toString());
        System.out.print(Autumn.toString());

    }
}
