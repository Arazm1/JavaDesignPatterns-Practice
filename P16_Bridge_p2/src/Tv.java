package P16_Bridge_p2.src;

public class Tv implements Device {

    private boolean isTvOn;
    private int volume;
    private int channel;

    public Tv(){
        this.isTvOn = false;
        this.volume = 0;
        this.channel = 1;
    }

    public boolean isEnabled(){
        return this.isTvOn;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getChannel(){
        return this.channel;
    }


    public void enable(){
        this.isTvOn = true;
    }

    public void disable(){
        this.isTvOn = false;
    }

    //Refine
    public void setVolume(int percent){
        this.volume = percent;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }

    


    
}
