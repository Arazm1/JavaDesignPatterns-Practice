package P2_Abstract_Factory_p2.src;

// Abstract products
interface Window {
    void draw();
}

interface ScrollBar {
    void scroll();
}

// Concrete products for Motif
class MotifWindow implements Window {
    // Toteuta draw-metodi
    @Override
    public void draw(){
        System.out.println("Motif Window drawn");
    }
}

class MotifScrollBar implements ScrollBar {
    // Toteuta scroll-metodi
    @Override
    public void scroll(){
        System.out.println("Motif Scroll");
    }
}

// Concrete products for PM
class PMWindow implements Window {
    // Toteuta draw-metodi
    @Override
    public void draw(){
        System.out.println("PM Window drawn");
    }
}

class PMScrollBar implements ScrollBar {
    // Toteuta scroll-metodi
    @Override
    public void scroll(){
        System.out.println("PM Scrollbar scrolled.");
    }
}

// Abstract factory
interface UIFactory {
    Window createWindow();
    ScrollBar createScrollBar();
}

// Concrete factories
class MotifFactory implements UIFactory {
    // Toteuta createWindow ja createScrollBar
    @Override
    public Window createWindow(){
        return new MotifWindow();
    }

    @Override
    public ScrollBar createScrollBar(){
        return new MotifScrollBar();
    }
}

class PMFactory implements UIFactory {
    // Toteuta createWindow ja createScrollBar
    @Override
    public Window createWindow(){
        return new PMWindow();
    }

    @Override
    public ScrollBar createScrollBar(){
        return new PMScrollBar();
    }
}

// Client
public class AbstractFactoryP2 {
    public static void main(String[] args) {
        UIFactory factory1 = new MotifFactory();
        Window w1 = factory1.createWindow();
        ScrollBar s1 = factory1.createScrollBar();
        w1.draw();
        s1.scroll();

        UIFactory factory2 = new PMFactory();
        Window w2 = factory2.createWindow();
        ScrollBar s2 = factory2.createScrollBar();
        w2.draw();
        s2.scroll();
    }
}
