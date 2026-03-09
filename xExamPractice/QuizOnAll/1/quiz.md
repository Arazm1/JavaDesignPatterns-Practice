Koeharjoittelu – Design Patterns
Osa 1 – Patternin tunnistaminen

Tehtävä 1

Järjestelmässä on luokka, joka palauttaa erilaisia objekteja ilman että kutsuva koodi tietää tarkkaa luokkaa. Metodi palauttaa esimerkiksi Car, Bike tai Truck riippuen parametrista.

Kysymys:
Mikä design pattern sopii tähän?

a) Strategy
b) Factory Method
c) Observer
d) Decorator
# B

Tehtävä 2

GUI-kirjasto tukee eri käyttöjärjestelmiä (Windows, macOS, Linux). Jokaiselle käyttöjärjestelmälle täytyy luoda yhteensopiva joukko komponentteja: Button, Checkbox, Menu.

Kaikki komponentit pitää luoda samasta perheestä.

Kysymys:
Mikä design pattern sopii tähän?

a) Abstract Factory
b) Singleton
c) State
d) Template Method
# D
# CORRECT: A

Tehtävä 3

Luokalla on vain yksi instanssi koko ohjelmassa, ja kaikki muut luokat hakevat sen globaalisti.

Kysymys:
Mikä design pattern?

a) Factory Method
b) Singleton
c) Strategy
d) Observer
# B

Tehtävä 4

Objektiin lisätään uusia toimintoja ajon aikana ilman että alkuperäistä luokkaa muutetaan. Esimerkiksi:

Coffee
Coffee + Milk
Coffee + Milk + Sugar

Kysymys:
Mikä design pattern?

a) Decorator
b) Composite
c) Strategy
d) State
# A

Tehtävä 5

Objekti vaihtaa käyttäytymistään sisäisen tilansa mukaan. Esimerkiksi:

Document
Draft -> Moderation -> Published

Kysymys:
Mikä pattern?

a) State
b) Strategy
c) Observer
d) Chain of Responsibility
# A

Osa 2 – Patternin idea

Tehtävä 6

Selitä lyhyesti:

Mikä on Observer patternin pääidea?
# To notify the dependents automatically when one object changes the state.

Milloin sitä käytetään?
# When you wish to Notify the View should be updated as the Model has been modified.
# An example is when you wish to notify Subscribers of a Youtube channel that a new video was uploaded.

Tehtävä 7

Selitä ero:

Factory Method

Abstract Factory

# CORRECT:
## Factory Method
## - Create one object
## - Decision done in subclass
```java
createProduct();
```

## Abstract Factory
## - Create object families
## Multiple compatible objects.
```java
createButton();
createCheckbox();
createMenu();
```


Tehtävä 8

Mikä on Strategy patternin tarkoitus?

# When you wish to implement multiple algorithms to your program, you can use the Strategy Pattern as it allows the client to choose an algorithm from the options. 
# An example of this would be Payment process. You can have multiple payment options (e.g. Credit Card, Giftcard, cash).

Valitse paras kuvaus.

a) Lisätä toimintoja objektiin ajon aikana
b) Kapseloida vaihtuvia algoritmeja eri luokkiin
c) Mahdollistaa yhden globaalin instanssin
d) Luoda objektiperheitä
# B

Tehtävä 9

Mikä seuraavista kuvaa parhaiten Template Method -patternia?

a) Luokka antaa algoritmin rungon, mutta aliluokat toteuttavat osia siitä
b) Luokka valitsee algoritmin ajon aikana
c) Luokka luo uusia objekteja
d) Luokka lähettää tapahtumia kuuntelijoille
# A

Osa 3 – Soveltaminen

Tehtävä 10

Sinulla on tiedostojärjestelmä:

Folder voi sisältää

tiedostoja

muita kansioita

Kaikkia pitäisi pystyä käsittelemään samalla tavalla (size(), print()).

Kysymys:
Mikä design pattern sopii parhaiten?

Selitä miksi.
# Composite.
# Composite allows you to have Composite and Leaf. Both can have same methods, but only Composite can include Composites and Leafs, while leaf cannot include anything.

Tehtävä 11

Web-sovelluksessa käyttäjät voivat kirjautua sisään eri tavoilla:

Google login

Facebook login

Email login

Kirjautumisalgoritmi vaihtelee, mutta rajapinta on sama.

Kysymys:

Mikä pattern sopii?
# Strategy


Tehtävä 12

Järjestelmässä virheenkäsittely toimii ketjuna:

Handler1 -> Handler2 -> Handler3

Jokainen käsittelijä voi:

käsitellä pyynnön

tai välittää sen eteenpäin

Kysymys:
Mikä pattern?
# Chain of Responsibility

Osa 4 – Tunnista pattern koodista

Tehtävä 13

class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

Mikä design pattern tämä on?
# Singleton

Tehtävä 14

interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {...}

class PayPalPayment implements PaymentStrategy {...}

Mikä pattern?
# Strategy

Tehtävä 15

abstract class Game {

    final void play() {
        initialize();
        startPlay();
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
}


Mikä pattern?
# Template Method