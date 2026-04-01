Osa 1: Code Completion
Tehtävä 1 – Factory Method
```java
abstract class Dialog {
    abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
}

class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowsButton();  // Täydennä
    }
}
```

Tehtävä 2 – Abstract Factory
```java
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();  // Täydennä
    }
}
```
Tehtävä 3 – Composite

```java
interface Component {
    void display();
}

class Leaf implements Component {
    @Override
    public void display() {
        System.out.println("Leaf element");
    }
}

class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void display() {
        for (Component c : children) {
            c.display(); // Täydennä
        }
    }
}
```


Tehtävä 4 – Observer

```java
interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message); // Täydennä
    }
}
```

Tehtävä 5 – Singleton
```java
class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() { }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            return instance; // Täydennä
        }
        return instance;
    }
}
```

Tehtävä 6 – Decorator

```java
interface Coffee {
    double cost();
}

class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Täydennä
    }
}
```

Tehtävä 7 – State

```java
interface State {
    void doAction(Context context);
}

class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(new StopState());
    }
}


class Context {
    private State state;

    public void setState(State state) {
        this.state = state; // Täydennä
    }

    public State getState() {
        return state;
    }
}
```


Tehtävä 8 – Template Method

```java
abstract class FileProcessor {
    public final void processFile(String path) {
        openFile(path);
        readFile();
        parseFile();
        closeFile(); // Täydennä, sulje tiedosto
    }

    abstract void openFile(String path);
    abstract void readFile();
    abstract void parseFile();
    abstract void closeFile();
}
```

Tehtävä 9 – Strategy

```java
interface Strategy {
    int execute(int a, int b);
}

class AddStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b; // Täydennä, palauttaa summan
    }
}

class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        ___________________________; // Täydennä
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
```

Tehtävä 10 – Chain of Responsibility

```java
abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next; // Täydennä
    }

    abstract void handleRequest(int request);
}

class ConcreteHandler1 extends Handler {
    @Override
    void handleRequest(int request) {
        if (request < 10) {
            System.out.println("Handler1 handled " + request);
        } else if (next != null) {
            next.handleRequest(request); // Täydennä
        }
    }
}
```


Osa 2: Tosi / Epätosi

Factory Method pattern luo olioita ilman, että asiakas tietää niiden tarkkaa luokkaa.
# T

Abstract Factory tuottaa liittyviä olioita ilman, että asiakas tietää konkreettisia luokkia.
# T

Composite pattern ei salli komponenttien ryhmittelyä hierarkioihin.
# F

Observer pattern mahdollistaa tilan muutosten ilmoittamisen useille riippuvaisille olioille.
# T

Singleton-malli sallii useiden instanssien luomisen luokasta.
# F

Decorator pattern lisää toiminnallisuutta olioihin dynaamisesti.
# T

State pattern muuttaa olion käyttäytymistä sen sisäisen tilan perusteella.
# T

Template Method pattern pakottaa aliluokan yliajamaan koko algoritmin.
# F

Strategy pattern erottaa algoritmit kontekstiluokasta ja tekee ne vaihdettaviksi.
# T

Chain of Responsibility mahdollistaa pyynnön käsittelyn ketjussa useilla käsittelijöillä.
# T

Osa 3: Monivalinta

Mikä seuraavista EI ole Factory Method -patternin tarkoitus?
a) Delegoida olioiden luonti aliluokille
b) Luoda olioita asiakasluokasta käsin
c) Mahdollistaa helppo laajennettavuus
d) Pakottaa perintä
# B

Mikä komponentti Abstract Factoryssa yhdistää useita liittyviä olioita?
a) ConcreteFactory
b) Client
c) Product
d) Interface
# D

Mikä pattern mahdollistaa komponenttien hierarkisen yhdistämisen?
a) Composite
b) Decorator
c) Singleton
d) Strategy
# A

Mikä pattern on suunniteltu ilmoittamaan tila-muutoksista monille olioille?
a) Observer
b) State
c) Template Method
d) Chain of Responsibility
# A

Mikä pattern varmistaa, että luokasta on vain yksi instanssi?
a) Decorator
b) Singleton
c) Factory Method
d) Strategy
# B

Mikä pattern lisää toiminnallisuutta olioon dynaamisesti ilman perintää?
a) Decorator
b) Composite
c) State
d) Template Method
# A

Mikä pattern muuttaa olion käyttäytymistä sen tilan perusteella?
a) Strategy
b) State
c) Observer
d) Chain of Responsibility
# B

Mikä pattern määrittelee algoritmin rakenteen yliluokassa ja delegoi osia aliluokille?
a) Template Method
b) Strategy
c) State
d) Singleton
# A

Mikä pattern erottaa algoritmit kontekstista ja tekee ne vaihdettaviksi ajon aikana?
a) Strategy
b) Template Method
c) Decorator
d) Composite
# A

Mikä pattern sallii pyynnön käsittelyn ketjussa useilla käsittelijöillä, kunnes joku käsittelee sen?
a) Chain of Responsibility
b) Observer
c) Singleton
d) Factory Method
# A