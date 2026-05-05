package P18_Prototype_p4.src;

public abstract class Shape implements Prototype, Cloneable {

    protected String type;

    public String getType() {
        return this.type;
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}