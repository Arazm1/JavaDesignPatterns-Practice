package P3_Composite_p3.src;

public class Soldier extends Component{
    private String rank;

    public Soldier(String name, String rank){
        super(name);
        this.rank = rank;
    }

    @Override
    public void printData(){
        System.out.println(this.rank + " " + this.name);
    }

    @Override
    public void add(Component component){
        throw new UnsupportedOperationException("Not allowed in Leaf");
    }

    @Override
    public void remove(Component component){
        throw new UnsupportedOperationException("Not allowed in Leaf");
    }

    @Override
    public Component getChild(int index){
        throw new UnsupportedOperationException("Not allowed in Leaf");
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getRank(){
        return this.rank;
    }
    
}
