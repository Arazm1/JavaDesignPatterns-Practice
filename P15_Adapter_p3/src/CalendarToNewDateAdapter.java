package P15_Adapter_p3.src;

import java.util.Calendar;

//Adapter, translates between the two
public class CalendarToNewDateAdapter implements NewDateInterface {

    private Calendar calendar;

    public CalendarToNewDateAdapter(){
        calendar = Calendar.getInstance();
    }

    public void setDay(int day){
        calendar.set(Calendar.DAY_OF_MONTH, day);
    }

    public void setMonth(int month){
        calendar.set(Calendar.MONTH, month - 1);
    }

    public void setYear(int year){
        calendar.set(Calendar.YEAR, year);
    }

    public int getDay(){
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public int getMonth(){
        return calendar.get(Calendar.MONTH) +1;
    }

    public int getYear(){
        return calendar.get(Calendar.YEAR);
    }

    public void advanceDay(int days){
        calendar.add(Calendar.DAY_OF_MONTH, days);
    }
    
}
