package xExamPractice.QuizOnAll.JavaQuiz;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class DesignPatternQuiz1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        String[][] questionsArray = {
            {"Factory Method luo objekteja ilman, että sen tarvitsee tietää tarkkaa konkreettista luokkaa.", "T"},
            {"Factory Method on sama asia kuin Singleton.", "F"},
            {"Factory Method sopii tilanteisiin, joissa halutaan aliluokkien päättävän, mitä olioita luodaan.", "T"},
            {"Abstract Factory tarjoaa rajapinnan perheelle liittyviä objekteja ilman, että luodaan konkreettisia luokkia.", "T"},
            {"Abstract Factory sopii hyvin tilanteeseen, jossa tarvitaan vain yksi instanssi tiettyä luokkaa.", "F"},
            {"Abstract Factory ja Factory Method ovat täysin identtisiä.", "F"},
            {"Composite mahdollistaa yksittäisten objektien ja kokoelmien käsittelyn yhtenäisesti.", "T"},
            {"Composite mallissa kaikki komponentit ovat aina erilaisia, eikä niillä ole yhteistä rajapintaa.", "F"},
            {"Compositea käytetään usein puumaisissa rakenteissa.", "T"},
            {"Observer-malli mahdollistaa tilan muutosten automaattisen ilmoittamisen useille riippuvaisille oliolle.", "T"},
            {"Observer-mallissa muutokset kohteeseen täytyy tarkistaa manuaalisesti.", "F"},
            {"Observer ja Mediator ovat täysin sama malli.", "F"},
            {"Singleton varmistaa, että luokasta on olemassa vain yksi instanssi.", "T"},
            {"Singleton-mallia käytetään aina, kun tarvitaan useita samanaikaisia instansseja.", "F"},
            {"Singleton voi olla hyödyllinen globaaleille resursseille, kuten tietokantayhteydelle.", "T"},
            {"Decorator mahdollistaa olioiden käyttäytymisen laajentamisen dynaamisesti ilman perintää.", "T"},
            {"Decorator muuttaa alkuperäisen olion luokkaa pysyvästi.", "F"},
            {"Decorator ja Adapter ovat sama malli.", "F"},
            {"State-malli mahdollistaa olion käyttäytymisen muuttuvan sisäisen tilan mukaan.", "T"},
            {"State-malli vaatii aina ulkopuolisen olion hallitsemaan tilaa.", "F"},
            {"State-malli auttaa usein koodaamaan tilakoneita selkeämmin.", "T"},
            {"Template Method määrittelee algoritmin rakenteen yläluokassa ja aliluokat voivat muokata tiettyjä vaiheita.", "T"},
            {"Template Method muuttaa algoritmin logiikkaa täysin ilman perintää.", "F"},
            {"Template Method tukee koodin uudelleenkäyttöä ja standardointia.", "T"},
            {"Strategy mahdollistaa algoritmien vaihtamisen ajon aikana.", "T"},
            {"Strategy pakottaa kaikki algoritmit käyttämään samaa luokkaa.", "F"},
            {"Strategy ja State-malli ovat täysin identtisiä.", "F"},
            {"Chain of Responsibility sallii useiden olioiden käsitellä pyynnön ketjussa.", "T"},
            {"Chain of Responsibility pakottaa aina kaikki oliot käsittelemään pyynnön.", "F"},
            {"Chain of Responsibility vähentää kytkentöjä pyynnön lähettäjän ja käsittelijöiden välillä.", "T"}
        };

        // Convert array to list and shuffle
        ArrayList<String[]> questions = new ArrayList<>();
        Collections.addAll(questions, questionsArray);
        Collections.shuffle(questions);

        System.out.println("Design Pattern True/False Quiz! (Random Order)");
        System.out.println("Vastaa T (true) tai F (false).");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("\nKysymys " + (i + 1) + ": " + questions.get(i)[0]);
            System.out.print("Vastauksesi (T/F): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals(questions.get(i)[1])) {
                System.out.println("Oikein!");
                score++;
            } else {
                System.out.println("Väärin. Oikea vastaus: " + questions.get(i)[1]);
            }
        }

        System.out.println("\nPisteesi: " + score + "/" + questions.size());
        scanner.close();
    }
}