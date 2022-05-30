public class Weather extends Climate{

    class Descriptors{
        
    }

    public void setTime(int time){
        System.out.print("Enter a new value to change the time");
        int newTime = Integer.parseInt(input.nextLine());
        time = newTime;
    }
}
