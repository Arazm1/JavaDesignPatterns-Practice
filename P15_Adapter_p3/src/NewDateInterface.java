package P15_Adapter_p3.src;

//Client Interface, what the Client expects to work with
public interface NewDateInterface {
    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);
    int getDay();
    int getMonth();
    int getYear();
    void advanceDay(int days);
    
}
