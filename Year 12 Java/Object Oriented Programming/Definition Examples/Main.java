//Driver Class
public class Main {
    public static void main(String[] args) {
        Climate Spring = new Climate();
        Climate Summer = new Climate();
        Climate Autumn  = new Climate();
        Climate Winter = new Climate();

        Spring.setDay("tuesday"); 
        Spring.setTime(1018);
        System.out.println(Spring.getDay());
    }
}
