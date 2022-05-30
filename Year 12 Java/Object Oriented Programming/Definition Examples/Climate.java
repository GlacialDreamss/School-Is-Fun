import java.util.*;
//Object Class
public class Climate extends Forecast {
    Scanner input = new Scanner(System.in); 
    
    private int time;
    private int date; //Date is numerical data
    private String day; //Day is the name of the actual day, e.g. Monday
    private String month;
    
    //Abstract
    @Override
    public void intensity(){
        System.out.print("What is the intensity of the forecast?");
    }

    //Climate
    Climate(){}
    Climate(int time, String day){
        this.time = time;
        this.day = day;
    }
    @Override
    public String toString() { 
        return time +", "+ day +" "+ date +" "+month;
    }

    //Time
    public void setTime(int time){
        this.time = time;
    }
    public int getTime(){
        return time;
    }

    //Date
    public void setDate(int date){
        this.date = date;
    }
    public int getDate(){
        return date;
    }

    //Month
    public void setMonth(String month){
        this.month = month;
    }
    public String getMonth(){
        return month;
    }

    //Day
    public void setDay(String day){
        this.day = day;
    }
    public String getDay(){
        return day;
    }
}
