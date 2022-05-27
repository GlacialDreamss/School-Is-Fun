//Main Class
public class Climate {
    
    private int time;
    private int day;
    private String date;
    private String month;
    
    //Climate
    Climate(int time, String day){
        this.time = time;
        this.date = date;
    }
    Climate(){}
    @Override
    public String toString() { 
        return "Day [Day = "+ day +", Time = "+ time +"]";
    }

    //Day
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }

    //Time
    public void setTime(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }

}
