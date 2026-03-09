package P3_Composite_p2.src;

public class Main {
    public static void main(String[] args) {
        

        Component folder1 = new Folder("Folder1");

        Component file1 = new File("Image1.png");
        Component file2 = new File("Chrome");
        Component file3 = new File("Discord");

        folder1.add(file1);
        folder1.add(file2);
        folder1.add(file3);

        folder1.printData();
    }
}