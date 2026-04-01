package P3_Composite_p5.src;

public class Course extends Component{

    private String instructor;
    private int credits;

    public Course(String name, String instructor, int credits){
        super(name);
        this.instructor = instructor;
        this.credits = credits;
    }

    public void printData(){
        System.out.println("Course: " + this.name + ", instructor: " + this.instructor + ", credits: " + this.credits);
    }

    @Override
    public void add(Component component){
        throw new UnsupportedOperationException("Now allows on leaf");
    }

    @Override
    public void remove(Component component){
        throw new UnsupportedOperationException("Not allowed on leaf");
    }

    @Override
    public Component getChild(int index){
        throw new UnsupportedOperationException("Not allowed on leaf");
    }
    
}
