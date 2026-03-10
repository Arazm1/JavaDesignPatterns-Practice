Osa 1 – Patternin tunnistaminen (monivalinta)
Tehtävä 1

Kirjastossa on metodi:

createTransport(type)

Se palauttaa:

Truck

Ship

Train

Kutsuva koodi käyttää vain rajapintaa Transport.

Mikä pattern?

a) Strategy
b) Factory Method
c) Decorator
d) Observer

# B


Tehtävä 2

Ohjelma tukee Dark theme ja Light theme.

Molemmissa pitää luoda yhteensopivat komponentit:

Button

Menu

Scrollbar

Kaikki komponentit pitää olla samasta teemasta.

Mikä pattern?

a) Factory Method
b) Abstract Factory
c) Template Method
d) Strategy

# B

Tehtävä 3

Luokka sisältää metodin:

attach(observer)
detach(observer)
notify()

Kun tila muuttuu, kaikki observerit saavat ilmoituksen.

Mikä pattern?

a) Observer
b) Strategy
c) State
d) Decorator

# A

Tehtävä 4

Objekti vaihtaa toimintaansa:

LoggedOutState
LoggedInState
LockedState

Sama objekti käyttäytyy eri tavalla tilasta riippuen.

Mikä pattern?

a) Strategy
b) State
c) Template Method
d) Singleton

# B


Tehtävä 5

Objekti välittää pyynnön seuraavalle käsittelijälle jos se ei itse käsittele sitä.

Handler → Handler → Handler

Mikä pattern?

a) Observer
b) Strategy
c) Chain of Responsibility
d) Decorator

# C


Osa 2 – Patternin idea
Tehtävä 6

Selitä lyhyesti:

Decorator pattern

mikä ongelma se ratkaisee

milloin sitä käytetään

# Decorator is when an object should have extended decorative functionality of two or more subclasses simultaneously.

# Decorator on suunnittelumalli, jollaobjektin toiminnallisuutta voidaan lisätä dynaamisesti ilman, että alkuperäistä luokkaa muutetaan.
# Toisin sanoen, uusi luokka ottaa olemassa olevan objectin sisäänsä ja lisää siihen lisätoimintoja.

# Ratkaisee ongelman, jossa jouduttaisiin tekemään useampi aliluokka, kun halutaan eri yhdistelmiä ominaisuuksista. Esim:
```java
Coffee
CoffeeWithSugar
CoffeeWithMilkAndSugar
```
# Decorator ratkaisee tämän siten, että lisätään kerroksia aiemman olemassa olevan objectin päälle.


Tehtävä 7

Selitä:

State vs Strategy

Mikä niiden keskeinen ero on?

# Strategy
- Kun halutaan että object voi käyttää eri algoritmeja ja algoritmi voidaan vaihtaa.
# Esim maksutapa.
- Ajatuksena on se, että miten jokin tehdään.


# State
- Objecktin käyttäytyminen muuttuu sen sisäisen tilan mukaan. Tarkoituksena on mallintaa objektin eri tiloja. Toiminta riippuu siitä, missä tilassa se on.
# Esim pelit, joissa on Leveleitä.
-Ajatuksena: Missä tilassa objekti on.

# Lyhyesti
Strategy patternissa vaihdetaan eri algoritmeja tai toimintatapoja, kun taas State patternissa objektin käyttäytyminen muuttuu sen sisäisen tilan mukaan.

Tehtävä 8

Selitä lyhyesti:

Composite pattern

mikä rakenne sillä mallinnetaan

milloin sitä käytetään

# Composite key idea is where objects are organized in tree-like structure.
You have a:
- Composite 
    - which can include other Composites and Leafs
- Leaf
    - Which cannot include Composites or Leafs.

# Is a good design pattern when you wish to simulate a structure e.g. military structure, company structure.
Leafs can be employees while Composites can be organizations.


Tehtävä 9

Selitä:

Template Method

mikä sen perusidea on

# Template Method is basically where you have an Abstract Class that gives a final method. Inside that method, you have a bunch of method calls.
Methods within the final method can be overridden in subclasses that extends the abstract class.

Example usage:
- A filehandler where you open the file, handle bunch stuff and close the file. 



Osa 3 – Use case -tunnistus
Tehtävä 10

Graafinen editori sisältää:

Shape

Circle

Rectangle

Group (voi sisältää muita Shape-objekteja)

Kaikkia käsitellään samalla tavalla:

draw()
move()

Mikä pattern sopii?

Perustele.
# Composite
The shapes are Leaf and Group is Composite. Leafs can be within Group.



Tehtävä 11

Järjestelmässä on vain yksi konfiguraatio-olio, jota kaikki komponentit käyttävät.

Mikä pattern?

Perustele lyhyesti.
# Singleton
Ensures a class has only one instance and provides a global access point to it.


Tehtävä 12

Verkkokaupassa maksutapoja on useita:

CreditCard

PayPal

ApplePay

Algoritmi vaihtuu maksutavan mukaan, mutta rajapinta on sama.

Mikä pattern?
# Strategy.
Sallii eri algoritmeja ohjelman aikana sekä ohjelma voi vaihtaa algoritmia ajonaikana.



Tehtävä 13

Sovellus käsittelee virheitä seuraavassa järjestyksessä:

UI handler
Service handler
Database handler

Jos ensimmäinen ei käsittele virhettä, se välitetään seuraavalle.

Mikä pattern?
# Chain of Responsibility
Virheenkäsittely välitetään aina seuraavalle käsittelijälle, jos ehdot eivät täyty.
Toisin sanoen ketjutetaan käsittelijöitä, kunnes joku hoitaa asian.



Osa 4 – Code completion

Täydennä puuttuva design pattern -logiikka.

Tehtävä 14 – Singleton

Täydennä puuttuva koodi.

```java
class Database {

    private static Database instance;

    private Database() {}

    public static synchronized Database getInstance() {

        if(instance == null) {
            instance = new Database();
        }

        return instance;
    }
}
```

Tehtävä 15 – Observer

Täydennä notify-metodi.

```java
class Subject {

    List<Observer> observers;

    void notifyObservers() {
        for(Observer o : observers) {
            o.update(this);
        }
    }
}
```
Tehtävä 16 – Strategy

```java
Täydennä käyttö.

class PaymentContext {

    PaymentStrategy strategy;

    void pay(int amount) {
        strategy.pay(amount);
    }
}
```


Tehtävä 17 – Template Method

Täydennä abstract-metodit.

```java
abstract class DataProcessor {

    final void process() {
        readData();
        processData();
        saveData();
    }

    abstract void readData();
    abstract void processData();
    abstract void saveData();
}
```
Osa 5 – Tosi / Epätosi

Kirjoita TOSI tai EPÄTOSI.

Tehtävä 18

Strategy pattern kapseloi algoritmeja eri luokkiin.
# T

Tehtävä 19

Singleton sallii useita instansseja jos niitä pyydetään eri luokista.
# F

Tehtävä 20

Composite pattern mahdollistaa yksittäisten objektien ja objektiryhmien käsittelyn samalla tavalla.
# T

Tehtävä 21

Observer pattern vaatii, että observerit kysyvät jatkuvasti subjectilta onko tila muuttunut.
# F

Tehtävä 22

Template Method määrittelee algoritmin rungon yliluokassa.
# T

Tehtävä 23

Decorator pattern muuttaa objektin luokan ajon aikana.
# F