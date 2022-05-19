public class Climate {
    
    public int time;
    public String day;

    Climate(int time, String day){
        this.time = time;
        this.day = day;
    }

    Climate(){}

    public void setDay(String day){
        this.day = day;
    }

    public String getDay(){
        return day;
    }


}
