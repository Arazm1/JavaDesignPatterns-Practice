package P6_Decorator_p6.src;

//BasicPrinter
public class ConcreateComponent implements Component {

    @Override
    public void send(String message){
        System.out.println(message);
    }
    
}
