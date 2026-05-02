package P15_Adapter_p3.src;

public class Main {
    public static void main(String[] args){

        NewDateInterface newCalendar = new CalendarToNewDateAdapter();


        newCalendar.setDay(2);
        newCalendar.setMonth(5);
        newCalendar.setYear(2026);

        System.out.println("Original date:");
        System.out.println("Day: " + newCalendar.getDay());
        System.out.println("Month: " + newCalendar.getMonth());
        System.out.println("Year: " + newCalendar.getYear());

        System.out.println("Advancing by 3 Weeks.. \n");
        newCalendar.advanceDay(21);


        System.out.println("3 Weeks later..");
        System.out.println("Day: " + newCalendar.getDay());
        System.out.println("Month: " + newCalendar.getMonth());
        System.out.println("Year: " + newCalendar.getYear());


    }
}