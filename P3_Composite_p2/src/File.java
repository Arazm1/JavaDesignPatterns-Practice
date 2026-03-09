package P3_Composite_p2.src;

public class File extends Component{

    public File(String name){
        super(name);
    }

    @Override
    public void add(Component component){
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public void remove(Component component){
        throw new UnsupportedOperationException("Not supported in leaf.");
    }

    @Override
    public Component getChild(int index) {
        throw new UnsupportedOperationException("Not supported in leaf.");
    }
    
}
