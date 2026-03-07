package P10_CoR_p2.src;

public abstract class Handler {

    private Handler nextHandler;

    public void processFeedback(Message message){
        if(nextHandler != null){
            nextHandler.processFeedback(message);
        }
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    
    }   
}