public class Climate {
    
    private int time;
    private String day;

    Climate(int time, String day){
        this.time = time;
        this.day = day;
    }

    Climate(){}
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
