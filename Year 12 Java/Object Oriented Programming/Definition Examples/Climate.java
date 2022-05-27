//Main Class
public class Climate {
    
    private int time;
    private int date;
    private String day;
    private String month;
    
    //Climate
    Climate(int time, String day){
        this.time = time;
        this.day = day;
    }
    Climate(){}
    @Override
    public String toString() { 
        return "Day [Day = "+ day +", Time = "+ time +"]";
    }

    //Day
    public void setDay(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }

    //Time
    public void setTime(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }

}
