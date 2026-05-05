package P18_Prototype_p4.src;

public class ConcretePrototype implements Prototype, Cloneable {

    private String type;

    public ConcretePrototype(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}