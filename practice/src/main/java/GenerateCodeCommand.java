public class GenerateCodeCommand implements Command{

    private final GridModel model;

    public GenerateCodeCommand(GridModel model){
        this.model = model;
    }

    @Override
    public void execute(){
        String code = model.generateJavaCode();
        System.out.println("Generated JAVA CODE");
        System.out.println(code);
    }
    
}
