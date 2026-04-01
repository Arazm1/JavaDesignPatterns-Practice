package xExamPractice.QuizOnAll;

import java.util.*;

class Question {
    String question;
    String[] options;
    char correct;

    public Question(String question, String[] options, char correct) {
        this.question = question;
        this.options = options;
        this.correct = correct;
    }
}

public class MQ1 {

    public static void main(String[] args) {

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "Mikä seuraavista kuvaa design patternia parhaiten?",
                new String[]{
                        "A. Valmis koodikirjasto tiettyyn ongelmaan",
                        "B. Yleinen ratkaisu toistuvaan ohjelmistosuunnittelun ongelmaan",
                        "C. Ohjelmointikielen syntaksisääntö",
                        "D. Tietorakenteiden optimointialgoritmi"
                },
                'B'
        ));

        questions.add(new Question(
                "Miksi design patternit ovat kieliriippumattomia?",
                new String[]{
                        "A. Niitä voi käyttää vain Java- ja C++-kielissä",
                        "B. Ne kuvaavat periaatteita eikä tiettyä kooditoteutusta",
                        "C. Kaikki kielet toteuttavat ne samalla tavalla",
                        "D. Ne ovat osa UML-standardia"
                },
                'B'
        ));

        questions.add(new Question(
                "Mikä seuraavista on design patternien keskeinen hyöty ohjelmistokehityksessä?",
                new String[]{
                        "A. Automaattinen virheiden korjaus",
                        "B. Nopeampi käännösprosessi",
                        "C. Parempi koodin rakenne ja uudelleenkäytettävyys",
                        "D. Vähemmän muistinkäyttöä"
                },
                'C'
        ));

        questions.add(new Question(
                "Chain of Responsibility -mallissa pyyntö:",
                new String[]{
                        "A. Lähetetään aina kaikille objekteille samanaikaisesti",
                        "B. Käsitellään vain ensimmäisessä objektissa",
                        "C. Kulkee objektiketjun läpi kunnes joku käsittelee sen",
                        "D. Tallennetaan tietokantaan käsittelyä varten"
                },
                'C'
        ));

        questions.add(new Question(
                "Mikä seuraavista kuvaa loose couplingia?",
                new String[]{
                        "A. Luokat riippuvat vahvasti toisistaan",
                        "B. Luokat tietävät mahdollisimman vähän toisistaan",
                        "C. Kaikki luokat ovat yhdessä tiedostossa",
                        "D. Kaikki luokat käyttävät samaa globaalia muuttujaa"
                },
                'B'
        ));

        questions.add(new Question(
                "Mikä seuraavista kuvaa high cohesionia?",
                new String[]{
                        "A. Luokka tekee monia eri tehtäviä",
                        "B. Luokka keskittyy yhteen selkeään vastuuseen",
                        "C. Luokka käyttää mahdollisimman monta muuta luokkaa",
                        "D. Luokka sisältää paljon eri rajapintoja"
                },
                'B'
        ));

        questions.add(new Question(
                "Mikä SOLID-periaate tarkoittaa, että luokalla pitäisi olla vain yksi vastuu?",
                new String[]{
                        "A. Open/Closed Principle",
                        "B. Liskov Substitution Principle",
                        "C. Single Responsibility Principle",
                        "D. Dependency Inversion Principle"
                },
                'C'
        ));

        questions.add(new Question(
                "Mihin ryhmään Factory Method kuuluu GoF-patterneissa?",
                new String[]{
                        "A. Creational",
                        "B. Structural",
                        "C. Behavioral",
                        "D. Architectural"
                },
                'A'
        ));

        questions.add(new Question(
                "Mihin ryhmään Adapter kuuluu?",
                new String[]{
                        "A. Creational",
                        "B. Structural",
                        "C. Behavioral",
                        "D. Algorithmic"
                },
                'B'
        ));

        questions.add(new Question(
                "Mikä seuraavista kuvaa behavioral design patternien tarkoitusta?",
                new String[]{
                        "A. Objektien luominen",
                        "B. Luokkien yhdistäminen suuremmiksi rakenteiksi",
                        "C. Objektien välisen vuorovaikutuksen ja vastuiden määrittely",
                        "D. Käyttöliittymän rakentaminen"
                },
                'C'
        ));













        //Factory Method:
        questions.add(new Question(
    "Mihin design pattern -kategoriaan Factory Method kuuluu?",
    new String[]{
        "A. Structural",
        "B. Behavioral",
        "C. Creational",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on creational design patternien pääidea?",
    new String[]{
        "A. Parantaa algoritmien suorituskykyä",
        "B. Hallita objektien luomista joustavasti",
        "C. Yhdistää luokkia suuremmiksi rakenteiksi",
        "D. Hallita objektien välistä viestintää"
    },
    'B'
));

questions.add(new Question(
    "Mitä ongelmaa Factory Method erityisesti pyrkii vähentämään?",
    new String[]{
        "A. Monimutkaiset perintähierarkiat",
        "B. Liiallinen new-operaattorin käyttö sovelluskoodissa",
        "C. Tietokantayhteyksien määrä",
        "D. Käyttöliittymän riippuvuudet"
    },
    'B'
));

questions.add(new Question(
    "Factory Method -mallissa objektin luominen yleensä:",
    new String[]{
        "A. tapahtuu aina yhdessä globaalissa luokassa",
        "B. delegoidaan aliluokille",
        "C. tapahtuu aina konstruktorissa",
        "D. tehdään staattisilla metodeilla"
    },
    'B'
));

questions.add(new Question(
    "Factory Method -mallissa Abstract Product:",
    new String[]{
        "A. toteuttaa kaikki liiketoimintalogiikan metodit",
        "B. määrittelee rajapinnan, jonka concrete productit toteuttavat",
        "C. luo concrete product -objektit",
        "D. sisältää vain staattisia metodeja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Productia?",
    new String[]{
        "A. Luokka, joka määrittelee factory-metodin",
        "B. Luokka, joka toteuttaa abstraktin tuotteen rajapinnan",
        "C. Luokka, joka käyttää factory-metodia",
        "D. Luokka, joka hallitsee kaikkia objekteja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on Creatorin rooli Factory Method -mallissa?",
    new String[]{
        "A. Määrittelee rajapinnan factory-metodille",
        "B. Toteuttaa konkreettisen tuotteen",
        "C. Käsittelee käyttöliittymän",
        "D. Tallentaa tietokantayhteyden"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Creatoria?",
    new String[]{
        "A. Luokka, joka käyttää abstraktia tuotetta",
        "B. Luokka, joka määrittelee abstraktin rajapinnan",
        "C. Luokka, joka toteuttaa factory-metodin ja luo concrete productin",
        "D. Luokka, joka estää uusien objektien luomisen"
    },
    'C'
));

questions.add(new Question(
    "Miksi Factory Method on hyödyllinen frameworkeissa?",
    new String[]{
        "A. Framework voi päättää kaikki konkreettiset luokat etukäteen",
        "B. Framework voi käyttää abstraktioita ja antaa sovelluksen päättää konkreettiset toteutukset",
        "C. Framework poistaa tarpeen perinnälle",
        "D. Framework estää uusien luokkien lisäämisen"
    },
    'B'
));

questions.add(new Question(
    "Miksi Factory Method auttaa yhdistämään rinnakkaisia luokkahierarkioita?",
    new String[]{
        "A. Se yhdistää kaikki luokat yhdeksi luokaksi",
        "B. Se varmistaa, että oikea objekti luodaan vastaavalle luokalle",
        "C. Se estää perinnän käytön",
        "D. Se poistaa kaikki rajapinnat"
    },
    'B'
));









//Abstract Factory
questions.add(new Question(
    "Mihin design pattern -kategoriaan Abstract Factory kuuluu?",
    new String[]{
        "A. Structural",
        "B. Behavioral",
        "C. Creational",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Abstract Factory -patternin pääidea?",
    new String[]{
        "A. Luoda yksi globaali objekti koko ohjelmaan",
        "B. Luoda yksittäisiä objekteja satunnaisesti",
        "C. Luoda toisiinsa liittyvien objektien perheitä ilman että määritellään niiden konkreettisia luokkia",
        "D. Korvata kaikki konstruktorit"
    },
    'C'
));

questions.add(new Question(
    "Mikä seuraavista on tyypillinen käyttötilanne Abstract Factorylle?",
    new String[]{
        "A. Kun halutaan nopeampi algoritmi",
        "B. Kun järjestelmä tarvitsee eri tuoteperheitä, jotka kuuluvat yhteen",
        "C. Kun halutaan estää objektien luominen",
        "D. Kun halutaan käyttää vain yhtä luokkaa"
    },
    'B'
));

questions.add(new Question(
    "UI-esimerkissä (Motif vs PM) Abstract Factory varmistaa, että:",
    new String[]{
        "A. UI-komponentit luodaan satunnaisesti",
        "B. kaikki komponentit kuuluvat samaan tuoteperheeseen",
        "C. vain yksi komponentti luodaan",
        "D. komponentit luodaan ilman rajapintoja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Abstract Factoryn roolia?",
    new String[]{
        "A. Toteuttaa konkreettiset tuotteet",
        "B. Määrittelee metodit abstraktien tuotteiden luomiselle",
        "C. Käyttää tuotteita käyttöliittymässä",
        "D. Tallentaa tuotteet tietokantaan"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Factorya?",
    new String[]{
        "A. Se määrittelee rajapinnan tuotteen luomiselle",
        "B. Se toteuttaa abstraktin tehtaan ja luo tietyn tuoteperheen tuotteet",
        "C. Se toimii asiakkaana (client)",
        "D. Se sisältää vain staattisia metodeja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Abstract Productia?",
    new String[]{
        "A. Luokka joka luo tuotteet",
        "B. Rajapinta tai abstrakti luokka, jonka concrete product toteuttaa",
        "C. Luokka joka käyttää factorya",
        "D. Luokka joka sisältää tietokantayhteyden"
    },
    'B'
));

questions.add(new Question(
    "Miten Client käyttää tuotteita Abstract Factory -mallissa?",
    new String[]{
        "A. Suoraan concrete product -luokkien kautta",
        "B. Abstract factoryn ja abstract productien rajapintojen kautta",
        "C. Vain konstruktorien kautta",
        "D. Staattisten metodien kautta"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on Abstract Factory -patternin etu?",
    new String[]{
        "A. Se vähentää kaikkien luokkien määrää",
        "B. Se mahdollistaa uusien tuoteperheiden lisäämisen helposti",
        "C. Se estää perinnän käytön",
        "D. Se nopeuttaa algoritmien suoritusta"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on Abstract Factoryn mahdollinen haitta?",
    new String[]{
        "A. Se estää rajapintojen käytön",
        "B. Se voi lisätä luokkien määrää merkittävästi",
        "C. Se toimii vain käyttöliittymissä",
        "D. Se ei tue perintää"
    },
    'B'
));













//COMPOSITE
questions.add(new Question(
    "Mihin design pattern -kategoriaan Composite kuuluu?",
    new String[]{
        "A. Creational",
        "B. Behavioral",
        "C. Structural",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Composite-patterin pääidea?",
    new String[]{
        "A. Luoda useita tuoteryhmiä kerralla",
        "B. Yhdistää objektit hierarkkiseen, puumaisen rakenteeseen ja tarjota yhtenäinen rajapinta",
        "C. Hallita objektien luomista satunnaisesti",
        "D. Parantaa ohjelman suoritusnopeutta"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista EI ole Composite-patterin perusosista?",
    new String[]{
        "A. Leaf",
        "B. Composite",
        "C. Client",
        "D. Factory"
    },
    'D'
));

questions.add(new Question(
    "Mikä on Leafin rooli Composite-puussa?",
    new String[]{
        "A. Hallita muita komponentteja",
        "B. Toteuttaa Component-rajapinnan, mutta ei voi sisältää lapsia",
        "C. Tarjota abstrakti rajapinta tuotteille",
        "D. Delegoida objektien luonti aliluokille"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Composite-luokan rooli?",
    new String[]{
        "A. Luoda abstraktit tuotteet",
        "B. Yhdistää lapsikomponentit ja tarjota yhtenäinen rajapinta",
        "C. Kutsua käyttöliittymäkomponentteja satunnaisesti",
        "D. Toteuttaa vain add() ja remove() -metodit ilman toimintaa"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Clientin roolia Composite-patterissa?",
    new String[]{
        "A. Luoda concrete productit",
        "B. Käyttää komponentteja Component-rajapinnan kautta riippumatta siitä ovatko ne Leaf vai Composite",
        "C. Hallita muistinkäyttöä",
        "D. Luoda uusia rajapintoja"
    },
    'B'
));

questions.add(new Question(
    "Mikä on yksi tapa toteuttaa add(), remove(), getChild() Leaf-luokassa?",
    new String[]{
        "A. Siirtää metodit vain Composite-luokkaan",
        "B. Toteuttaa ne dummy-metodeina Leaf-luokassa (transparency)",
        "C. Poistaa kaikki rajapinnat",
        "D. Käyttää factory-metodia niiden luomiseen"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista korostaa safety-lähestymistapaa Child Managementissa?",
    new String[]{
        "A. Kaikki metodit ovat dummy-metodeja",
        "B. Metodit eivät ole Leaf-luokassa, vain Composite-luokassa",
        "C. Kaikki metodit ovat staattisia",
        "D. Client hallitsee kaikki add/remove -kutsut"
    },
    'B'
));

questions.add(new Question(
    "Mikä JavaFX-komponentti on esimerkki Composite-patterin käytöstä?",
    new String[]{
        "A. Label",
        "B. Button",
        "C. VBox",
        "D. Stage"
    },
    'C'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Composite-patterin hyötyä?",
    new String[]{
        "A. Jokainen komponentti tarvitsee oman rajapinnan",
        "B. Mahdollistaa hierarkkisten komponenttien käsittelyn yhtenäisesti",
        "C. Poistaa tarpeen perinnälle kokonaan",
        "D. Estää rekursiivisten kutsujen käytön"
    },
    'B'
));














//OBSERVER
questions.add(new Question(
    "Mihin design pattern -kategoriaan Observer kuuluu?",
    new String[]{
        "A. Creational",
        "B. Behavioral",
        "C. Structural",
        "D. Architectural"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Observer-patterin pääidea?",
    new String[]{
        "A. Hallita objektien luomista satunnaisesti",
        "B. Ilmoittaa kaikille kiinnostuneille havainnoijille, kun Subjectin tila muuttuu",
        "C. Yhdistää objektit puumaiseksi rakenteeksi",
        "D. Poistaa tarve rajapinnoille"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Subjectin roolia?",
    new String[]{
        "A. Toteuttaa ilmoituksen vastaanottavan metodin",
        "B. Hallitsee observerien kirjanpidon ja ilmoittaa muutoksista",
        "C. Toteuttaa kaikki liiketoimintalogiikan metodit",
        "D. Luodaan vain kerran ja pysyy staattisena"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Concrete Observerin rooli?",
    new String[]{
        "A. Määrittää abstraktin rajapinnan",
        "B. Toteuttaa update()-metodin ja hakee Subjectin tilan muutokset",
        "C. Luo Concrete Subject -objektit",
        "D. Hallitsee muistinkäyttöä Subjectin puolesta"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on push-mallin tunnusmerkki Observerissa?",
    new String[]{
        "A. Observers kysyvät itse Subjectin uuden tilan",
        "B. Observers saavat päivitetyn datan parametrina update()-metodissa",
        "C. Client kutsuu notifyAll() vain kerran",
        "D. Push-mallia ei voi toteuttaa Java-kielellä"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on pull-mallin tunnusmerkki?",
    new String[]{
        "A. Observers saavat kaikki muutokset valmiina parametrina",
        "B. Observers itse kysyvät uuden tilan Subjectilta update()-kutsun jälkeen",
        "C. Client ei koskaan kutsu notifyAll()",
        "D. Push-malli on tehokkaampi kuin pull-malli aina"
    },
    'B'
));

questions.add(new Question(
    "Miten Observer rekisteröidään Subjectiin Java-sovelluksessa?",
    new String[]{
        "A. ConcreteObserver luo uuden Subjectin konstruktorissa",
        "B. ConcreteObserver kutsuu Subjectin rekisteröintimetodia konstruktorissaan",
        "C. Subject kutsuu kaikkia Observer-rajapintoja automaattisesti ilman rekisteröintiä",
        "D. Observer-luokat eivät rekisteröidy, vaan Subject tietää ne etukäteen"
    },
    'B'
));

questions.add(new Question(
    "Mikä voi olla haaste Observer-patterin käytössä?",
    new String[]{
        "A. Observerien määrä ja ilmoitusten järjestys voivat aiheuttaa monimutkaisuutta",
        "B. Observer ei voi koskaan tarkistaa Subjectin tilaa",
        "C. Push-mallissa ei voi lähettää parametreja",
        "D. Observer toimii vain graafisissa käyttöliittymissä"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista EI ole tyypillinen Observer-patterin käyttötilanne?",
    new String[]{
        "A. Seurataan käyttöliittymän tietojen päivityksiä MVC-mallissa",
        "B. Tilauksen seuranta uutiskirjeessä",
        "C. Seurataan käyttäjän tilaa sosiaalisen median sovelluksessa",
        "D. Luodaan uusia olioita satunnaisesti"
    },
    'D'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Observer-patterin Java-implementation suositusta JDK 8 jälkeen?",
    new String[]{
        "A. Käytetään java.util.Observable/Observer ilman muutoksia",
        "B. Observer on yleensä rajapinta, ConcreteObserver toteuttaa update()-metodin",
        "C. Subject on aina abstrakti luokka",
        "D. Observer-luokat eivät rekisteröidy Subjectiin"
    },
    'B'
));














//SINGLETON
questions.add(new Question(
    "Mihin design pattern -kategoriaan Singleton kuuluu?",
    new String[]{
        "A. Structural",
        "B. Behavioral",
        "C. Creational",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Singleton-patterin pääidea?",
    new String[]{
        "A. Luoda useita samanaikaisia instansseja",
        "B. Varmistaa, että luokka luodaan vain kerran koko sovelluksen elinkaaren aikana",
        "C. Poistaa tarve rajapinnoille",
        "D. Delegoida objektien luonti aliluokille"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista EI ole Singletonin syy luoda vain yksi objekti?",
    new String[]{
        "A. Resurssien hallinta ja suorituskyky",
        "B. Globaalisti saavutettava yksittäinen hallintapiste",
        "C. Konsistenssi sovelluksen tilassa",
        "D. Poistaa tarve kapseloinnille kokonaan"
    },
    'D'
));

questions.add(new Question(
    "Miten new-operaattorin käyttö estetään Singleton-luokassa?",
    new String[]{
        "A. Muuttamalla luokan nimi",
        "B. Piilottamalla konstruktorit private-määreellä",
        "C. Käyttämällä abstraktia luokkaa",
        "D. Käyttämällä rajapintaa"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa getInstance()-metodin roolia?",
    new String[]{
        "A. Se kutsuu kaikkia konstruktoreita automaattisesti",
        "B. Se palauttaa olemassa olevan instanssin tai luo uuden tarvittaessa",
        "C. Se poistaa objektin käytöstä",
        "D. Se on vain dokumentaatio eikä tee mitään"
    },
    'B'
));

questions.add(new Question(
    "Mikä on thread-safety-haaste Singletonissa?",
    new String[]{
        "A. Instanssi luodaan useita kertoja eri säikeissä ilman synkronointia",
        "B. Instanssi ei koskaan luoda",
        "C. Instanssi voidaan käyttää vain yhdessä metodissa",
        "D. Instanssi on aina staattinen eikä voi kutsua metodeja"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista on Java-variantti Singletonin toteutuksesta?",
    new String[]{
        "A. Luoda instanssi aina getInstance()-kutsun yhteydessä ilman synchronisointia",
        "B. Käyttää enumia, joka takaa, että instanssi luodaan vain kerran",
        "C. Luoda uusi instanssi jokaisessa metodikutsussa",
        "D. Toteuttaa Singleton vain abstraktin luokan kautta"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on Singletonin haitta?",
    new String[]{
        "A. Poistaa kaiken perinnän",
        "B. Lisää globaalin tilan, voi johtaa tiukkaan kytkentään ja testaushaasteisiin",
        "C. Tehostaa sovelluksen muistinhallintaa automaattisesti",
        "D. Estää kaikkien metodien käytön"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on vaihtoehtoinen tapa luoda Singleton Java SE:ssä?",
    new String[]{
        "A. Luoda instanssi staattisesti luokan latauksen yhteydessä",
        "B. Käyttää vain abstraktia rajapintaa",
        "C. Luoda instanssi jokaisessa metodissa",
        "D. Poistaa kaikki konstruktorit"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Singletonin enum-toteutusta?",
    new String[]{
        "A. Enum luo uuden instanssin jokaisella metodikutsulla",
        "B. Enum takaa, että instanssi luodaan vain kerran, ja voi sisältää liiketoimintalogiikkaa",
        "C. Enum toimii vain graafisessa käyttöliittymässä",
        "D. Enum on yhtä kuin Concrete Factory"
    },
    'B'
));











//DECORATOR
questions.add(new Question(
    "Mihin design pattern -kategoriaan Decorator kuuluu?",
    new String[]{
        "A. Creational",
        "B. Behavioral",
        "C. Structural",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä ongelma Decorator-patteri ratkaisee?",
    new String[]{
        "A. Objektien satunnainen luonti",
        "B. Mahdollisuus lisätä useita lisäominaisuuksia yhdelle objektille ilman luokkien räjähdystä",
        "C. Estää useiden objektien luomisen",
        "D. Delegoi objektien luonti aliluokille"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Decoratorin perusidean?",
    new String[]{
        "A. Luo kaikki objektit staattisina metodeina",
        "B. Pakkaa perusobjektin toisen objektin sisälle ja lisää lisäominaisuuksia ketjutettavasti",
        "C. Poistaa tarpeen rajapinnoille",
        "D. Muuttaa objektin sisäistä tilaa suoraan"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista EI ole Decoratorin rooli?",
    new String[]{
        "A. Concrete Decorator",
        "B. Component",
        "C. Client",
        "D. Factory"
    },
    'D'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Componentia?",
    new String[]{
        "A. Perusobjekti, jota voidaan halutessa koristella yhdellä tai useammalla Decoratorilla",
        "B. Sisältää viittauksen koristeltavaan komponenttiin",
        "C. Lisäominaisuuksia tarjoava abstrakti luokka",
        "D. Käyttöliittymäkomponentti vain graafiseen esitykseen"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Decoratoria?",
    new String[]{
        "A. Toteuttaa Component-rajapinnan ja lisää toiminnallisuutta ennen tai jälkeen viittauksen komponentin metodin kutsun",
        "B. Hallitsee muistinhallintaa",
        "C. Luo Componentin konstruktorissa",
        "D. Poistaa Componentin metodit käytöstä"
    },
    'A'
));

questions.add(new Question(
    "Miten Decorator-patterissa käsitellään ketjutusta / nestingia?",
    new String[]{
        "A. Dekoraattorit voivat sisältää vain yhden Concrete Componentin",
        "B. Dekoraattorit voivat sisältää toisen Decoratorin tai Concrete Componentin, jolloin voidaan ketjuttaa tai sisäkkäistää",
        "C. Ketjutus estetään, koska se rikkoo rajapinnat",
        "D. Dekoraattorit ovat aina staattisia"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Decorator-patterin etu?",
    new String[]{
        "A. Perusobjektin sisäisiä toimintoja voidaan muuttaa suoraan",
        "B. Mahdollistaa dynaamisen lisätoiminnallisuuden lisäämisen ilman perintöä",
        "C. Poistaa tarvetta Component-rajapinnalle",
        "D. Vähentää luokkien määrää dramaattisesti"
    },
    'B'
));

questions.add(new Question(
    "Mikä Decorator-patterin rajoitus voi vaikeuttaa koodin ymmärtämistä?",
    new String[]{
        "A. Liian vähän metodeja",
        "B. Liikaa pieniä luokkia, ketjutettuja ja sisäkkäisiä dekorattoreita",
        "C. Yksi komponentti voi olla vain Concrete Component",
        "D. Decorator ei voi sisältää muita komponentteja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Decoratorin käyttötarkoitusta oikein?",
    new String[]{
        "A. Muuttaa objektin sisäisen tilan",
        "B. Muokata objektin esitystä / lisätä ominaisuuksia dynaamisesti",
        "C. Estää objektien luomisen",
        "D. Korvata koko Component-rajapinnan uudella luokalla"
    },
    'B'
));












//STATE

questions.add(new Question(
    "Mihin design pattern -kategoriaan State kuuluu?",
    new String[]{
        "A. Creational",
        "B. Structural",
        "C. Behavioral",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on State-patterin pääidea?",
    new String[]{
        "A. Varmistaa, että luokka luodaan vain kerran",
        "B. Kuvata objektin tila ja tilakohtainen käyttäytyminen eri aliluokissa",
        "C. Muokata objektin esitystä dynaamisesti",
        "D. Luoda objektien perusinstanssit ketjutettuna"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on trivial ratkaisu tilojen hallintaan, jota State-patteri parantaa?",
    new String[]{
        "A. Käyttää monimutkaisia if/else- tai switch/case -lauseita",
        "B. Luoda instanssi staattisesti",
        "C. Ketjuttaa dekorattoreita",
        "D. Käyttää abstraktia luokkaa vain konstruktorin piilottamiseen"
    },
    'A'
));

questions.add(new Question(
    "Miten tilan käyttäytyminen määritellään State-patterissa?",
    new String[]{
        "A. Kaikki metodit kirjoitetaan Context-luokkaan",
        "B. Kukin State-aliluokka toteuttaa tilakohtaiset metodit",
        "C. Tilat määritellään vain enum-arvoina",
        "D. Tilat ovat vakioita Context-luokassa"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Contextin roolia?",
    new String[]{
        "A. Toteuttaa kaikki tilakohtaiset metodit",
        "B. Hallitsee nykyisen tilan referenssiä ja tarjoaa rajapinnan klientille",
        "C. Luo Concrete State -objektit ja kutsuu notifyAll()",
        "D. Sisältää vain staattisia metodeja"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Concrete State?",
    new String[]{
        "A. Abstrakti luokka tilalle",
        "B. Tilakohtainen aliluokka, joka toteuttaa tilakohtaisen käyttäytymisen",
        "C. Luokka, joka hallitsee tilojen ketjutusta",
        "D. Rajapinta, joka määrittelee getterit ja setterit"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on etu State-patterissa verrattuna if/else-koodaukseen?",
    new String[]{
        "A. Tilat ja siirtymät tulevat eksplisiittisiksi ja helposti laajennettaviksi",
        "B. Kaikki logiikka yhdistetään Contextiin",
        "C. Tilat eivät tarvitse metodeja",
        "D. Tilojen lisääminen vaatii jokaisessa metodissa if/else-kutsuja"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista on State-patterin käytön periaate?",
    new String[]{
        "A. Client manipuloituu suoraan Concrete State -olioilla",
        "B. Client käyttää vain Context-luokkaa, ei suoraan tiloja",
        "C. Tilat eivät voi vaihtua ajon aikana",
        "D. Context ei pidä tilaviittausta"
    },
    'B'
));

questions.add(new Question(
    "Missä tilanteessa State-patteri on erityisen hyödyllinen?",
    new String[]{
        "A. Kun objektilla on vain yksi tila koko elinkaaren ajan",
        "B. Kun objektin tila voi muuttua ja käyttäytyminen riippuu tilasta, esim. FSM",
        "C. Kun luodaan monimutkaisia dekorattoreita",
        "D. Kun halutaan vain global singleton"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa State-olioiden luontia käytännössä?",
    new String[]{
        "A. Tilat luodaan vain Context-luokan konstruktorissa",
        "B. Tilat voidaan luoda ad hoc tai kerralla sovelluksen alussa",
        "C. Tilat eivät koskaan vaihdu ajon aikana",
        "D. Tilat ovat staattisia ja muuttumattomia"
    },
    'B'
));










//TEMPLATE METHOD
questions.add(new Question(
    "Mihin design pattern -kategoriaan Template Method kuuluu?",
    new String[]{
        "A. Creational",
        "B. Structural",
        "C. Behavioral",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Template Method -patterin pääidea?",
    new String[]{
        "A. Tarjota abstrakti luokka, joka sisältää algoritmin rakenteen ja kutsuu aliluokkien toteuttamia primitiivisiä operaatioita",
        "B. Estää useiden objektien luomisen",
        "C. Ketjuttaa dekorattoreita",
        "D. Toteuttaa FSM:n (Finite State Machine)"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista on Template Methodin etu?",
    new String[]{
        "A. Koodaa invariantit osat algoritmista vain kerran",
        "B. Pakottaa kaikki metodit staattisiksi",
        "C. Poistaa tarpeen perintöön",
        "D. Tekee jokaisesta metodista abstraktin"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista on Abstract Classin rooli Template Method -patterissa?",
    new String[]{
        "A. Sisältää Concrete Methodin, mutta ei template-metodia",
        "B. Määrittelee primitiiviset operatiot ja template-metodin",
        "C. Sisältää vain staattisia metodeja",
        "D. Toteuttaa kaikki aliluokkien metodit"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Concrete Classin roolia?",
    new String[]{
        "A. Tarjoaa aliluokkakohtaisen toteutuksen primitiivisille operaatioille tarpeen mukaan",
        "B. Toteuttaa FSM:n tilat",
        "C. Hallitsee globaalin singleton-instanssin",
        "D. Ketjuttaa dekorattoreita"
    },
    'A'
));

questions.add(new Question(
    "Mikä tarkoitetaan Inversion of Control -periaatteella Template Method -kontekstissa?",
    new String[]{
        "A. Aliluokka kutsuu superclassin metodeja",
        "B. Superclass kutsuu aliluokan metodeja, ei toisinpäin",
        "C. Kaikki metodit ovat staattisia",
        "D. Hook-metodit ovat abstrakteja ja pakottavat toteutuksen"
    },
    'B'
));

questions.add(new Question(
    "Mikä on hook-metodi?",
    new String[]{
        "A. Abstrakti metodi, joka pitää toteuttaa aliluokassa",
        "B. Primitiivinen operaatio, jolla on tyhjä toteutus superclassissa ja jonka voi halutessa ylikirjoittaa aliluokassa",
        "C. Staattinen metodi superclassissa",
        "D. Concrete Method, jota ei voi ylikirjoittaa"
    },
    'B'
));

questions.add(new Question(
    "Miten Template Method -patteri auttaa erilaisten tiedostotyyppien käsittelyssä?",
    new String[]{
        "A. Jokainen aliluokka sisältää kaikki metodit",
        "B. Template-metodi määrittelee algoritmin rakenteen, primitiiviset operatiot voidaan ylikirjoittaa aliluokissa, jolloin vältetään koodin duplikaatiota",
        "C. Jokaiselle tiedostotyypille luodaan erillinen if/else-lohko",
        "D. Käytetään vain staattisia metodeja"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on hyvä käytäntö Template Method -patterissa?",
    new String[]{
        "A. Minimoi abstraktit primitiiviset operaatiot, jotta aliluokkien koodaus ei ole työlästä",
        "B. Tee kaikki primitiiviset operaatiot abstrakteiksi",
        "C. Poista template-metodi",
        "D. Älä koskaan käytä hook-metodeja"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista EI ole Template Methodin piirre?",
    new String[]{
        "A. Algoritmin invariantit osat kirjoitetaan kerran superclassiin",
        "B. Hook-metodit mahdollistavat aliluokkien lisätoiminnallisuudet",
        "C. Aliluokat hallitsevat algoritmin kutsujärjestyksen",
        "D. Template-metodi on final, jotta sitä ei voi ylikirjoittaa"
    },
    'C'
));












//Strategy
questions.add(new Question(
    "Mihin design pattern -kategoriaan Strategy kuuluu?",
    new String[]{
        "A. Creational",
        "B. Structural",
        "C. Behavioral",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Strategy-patterin pääidea?",
    new String[]{
        "A. Tarjota abstrakti luokka, joka sisältää algoritmin rakenteen",
        "B. Ketjuttaa useita dekorattoreita objektin ympärille",
        "C. Erottaa algoritmit kontekstista ja mahdollistaa niiden vaihtamisen ajon aikana",
        "D. Varmistaa, että objekti luodaan vain kerran"
    },
    'C'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa Context-luokan roolia?",
    new String[]{
        "A. Sisältää algoritmin implementaation",
        "B. Delegoi metodikutsut Concrete Strategy -objekteille ja tarjoaa yhtenäisen käyttöliittymän",
        "C. Toteuttaa kaikki mahdolliset algoritmit itse",
        "D. Hallitsee FSM:n tilat"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista EI ole Strategy-patterin etu?",
    new String[]{
        "A. Välttää monimutkaisia if/else- tai switch-rakenteita algoritmien valinnassa",
        "B. Mahdollistaa algoritmien vaihtamisen ajon aikana",
        "C. Pakottaa kaikki algoritmit olemaan staattisia metodeja",
        "D. Tekee kontekstista agnostisen strategian toteutuksista"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Concrete Strategy -luokan rooli?",
    new String[]{
        "A. Toteuttaa algoritmin, joka on määritelty Strategy-rajapinnassa",
        "B. Delegoi metodit Contextille",
        "C. Ketjuttaa dekorattoreita",
        "D. Varmistaa, että vain yksi instanssi luodaan"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista erottaa Strategy- ja State-patterit?",
    new String[]{
        "A. Strategy vaihtaa algoritmia dynaamisesti, mutta havaittu käyttäytyminen pysyy samana; State muuttaa käyttäytymistä",
        "B. Strategy muuttaa käyttäytymistä, mutta State vaihtaa algoritmia",
        "C. Strategy ei käytä kontekstia, State käyttää hook-metodeja",
        "D. Ei eroa käytännössä, ovat identtisiä"
    },
    'A'
));

questions.add(new Question(
    "Miten Strategy DP vähentää koodin monimutkaisuutta?",
    new String[]{
        "A. Erottaa algoritmin kontekstista ja kapseloi sen Concrete Strategy -luokkiin",
        "B. Käyttää vain staattisia metodeja",
        "C. Pakottaa FSM:n toteutuksen",
        "D. Varmistaa singleton-instanssin"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista pitää paikkansa Strategy DP:stä?",
    new String[]{
        "A. Concrete Strategies ovat Contextin aliluokkia",
        "B. Context voi vaihtaa käytössä olevan strategian runtime-ajossa",
        "C. Context hallitsee FSM:n tilamuutokset",
        "D. Strategy DP ei salli asiakasta vaikuttaa valittuun algoritmiin"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Strategy-patterin potentiaalinen haitta?",
    new String[]{
        "A. Asiakkaan täytyy tietää saatavilla olevista strategioista",
        "B. Ei mahdollista algoritmien vaihtoa",
        "C. Kaikki metodit ovat abstrakteja",
        "D. Konteksti hallitsee tiloja"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista ei liity Strategy-patteriin?",
    new String[]{
        "A. Algoritmien kapselointi",
        "B. Concrete Strategy -luokat",
        "C. Context-luokka",
        "D. Hook-metodit template-metodissa"
    },
    'D'
));
















//Chain of Responsibility
questions.add(new Question(
    "Mihin design pattern -kategoriaan Chain of Responsibility kuuluu?",
    new String[]{
        "A. Creational",
        "B. Structural",
        "C. Behavioral",
        "D. Architectural"
    },
    'C'
));

questions.add(new Question(
    "Mikä on Chain of Responsibility -patterin pääidea?",
    new String[]{
        "A. Luoda vain yksi instanssi luokasta",
        "B. Ketjuttaa useita objektien käsittelijöitä, jolloin jokainen voi käsitellä tai välittää pyynnön eteenpäin",
        "C. Tarjota abstrakti luokka algoritmin rakenteelle",
        "D. Pakottaa algoritmit olemaan staattisia"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Handler-luokan rooli?",
    new String[]{
        "A. Toteuttaa käsittelylogiikan vain tietylle pyynnölle",
        "B. Tarjoaa yleisen rajapinnan kaikille käsittelijöille ja oletuskäsittelyketjun",
        "C. Luo Concrete Handlerit",
        "D. Varmistaa, että vain yksi instanssi luodaan"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista on Concrete Handlerin tehtävä?",
    new String[]{
        "A. Delegoi metodikutsut Contextille",
        "B. Toteuttaa käsittelymetodin ja päättää, käsitteleekö pyynnön vai välittääkö seuraavalle käsittelijälle",
        "C. Hallitsee FSM:n tilat",
        "D. Ketjuttaa dekorattoreita"
    },
    'B'
));

questions.add(new Question(
    "Mikä on Clientin rooli?",
    new String[]{
        "A. Rakentaa ja aloittaa käsittelyketjun lähettämällä pyynnön ensimmäiselle handlerille",
        "B. Toteuttaa käsittelymetodin",
        "C. Muuttaa handlerin parametrien arvot dynaamisesti",
        "D. Hallitsee FSM:n tilat"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista kuvaa exclusive handling -mallia?",
    new String[]{
        "A. Kaikki käsittelijät osallistuvat pyyntöön ja muokkaavat sen tulosta",
        "B. Jokainen handler joko käsittelee pyynnön kokonaan tai välittää sen seuraavalle",
        "C. Handlerit ketjutetaan hook-metodien avulla",
        "D. Pyyntö käsitellään vain kerran, eikä se koskaan etene ketjussa"
    },
    'B'
));

questions.add(new Question(
    "Mikä on collaborative handling?",
    new String[]{
        "A. Vain ensimmäinen handler käsittelee pyynnön",
        "B. Monet handlerit voivat osallistua käsittelyyn ja välittää pyynnön eteenpäin",
        "C. Handlerit ovat kaikki Concrete Strategy -aliluokkia",
        "D. Asiakas ei koskaan tiedä ketjua"
    },
    'B'
));

questions.add(new Question(
    "Mikä seuraavista pitää paikkansa parametrisoidusta handlerista?",
    new String[]{
        "A. Yksi handler-metodi ottaa parametrin määrittelemään käsiteltävän pyynnön tyypin",
        "B. Jokaiselle pyynnölle on oma käsittelijäluokka",
        "C. Handler ei koskaan välitä pyyntöä eteenpäin",
        "D. Client rakentaa ketjun yksitellen"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista on potentiaalinen ongelma Chain of Responsibility DP:ssä?",
    new String[]{
        "A. Käsittelyketjun oikea järjestys täytyy huolellisesti määritellä",
        "B. Context ei voi koskaan vaihtaa strategiaa",
        "C. Concrete Handlerit eivät saa välittää pyyntöä",
        "D. Kaikki handlerit ovat staattisia"
    },
    'A'
));

questions.add(new Question(
    "Mikä seuraavista EI liity Chain of Responsibility -patteriin?",
    new String[]{
        "A. Pyynnön välitys ketjussa",
        "B. Jokainen handler voi käsitellä tai delegoida pyynnön",
        "C. Singleton-instanssi hallitsee ketjun",
        "D. Client voi olla tietämätön siitä, kuka käsittelee pyynnön"
    },
    'C'
));



        Collections.shuffle(questions);

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.question);

            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Vastauksesi (A/B/C/D): ");
            char answer = scanner.next().toUpperCase().charAt(0);

            if (answer == q.correct) {
                System.out.println("Oikein!");
                score++;
            } else {
                System.out.println("Väärin! Oikea vastaus oli: " + q.correct);
            }
        }

        System.out.println("\nPisteesi: " + score + " / " + questions.size());
    }
}