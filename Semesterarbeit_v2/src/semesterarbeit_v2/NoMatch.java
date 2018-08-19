/*
    Semesterarbeit "Objektorientierter Chatbot" 
    Schule:     ABB Technikerschule Baden
    Semester:   4
    Klasse:     B18-if4.1
    Authoren:
                Dominik Wüst
                Andri Binda
                Marek Giesen
    
 */
 /*
    Falls der Bot kein Wort findet, welches in einem Array steht, 
    Fragt er nach ob der User nochmals was eingeben will oder eine Google 
    Search gestartet werden soll.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class NoMatch {

    private String question;
    private String sucheAntwort;
    private Scanner mEingabe = new Scanner(System.in);

    void noMatchGoogle(String question) {

        this.question = question;

        System.out.println("Ich habe deine Eingabe leider "
                + "nicht verstanden.");
        System.out.println("Du kannst gerne es nochmals probieren, "
                + "oder ich starte Google Search für dich.");
        System.out.println("Suche starten oder nochmals eingeben?");

        sucheAntwort = mEingabe.nextLine();
        String[] words = sucheAntwort.split(" ");

        String[] nochmalsArray = new String[]{"nochmals", "vertippt",
            "noch", "mal", "typo", "normal", "bot", "eingeben"};
        String[] googleArray = new String[]{"google", "suche",
            "internet", "search", "starten"};

        if (Utilities.uebereinstimungen(words, nochmalsArray)) {
            System.out.println("Dann nochmals.");
        } else if (Utilities.uebereinstimungen(words, googleArray)) {
            System.out.println("Ich starte die Google Suche.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            //String question = "Wetter heute";
            question = question.replace(' ', '+');

            try {
                Runtime.getRuntime().exec(new String[]{"cmd", "/c", 
                "start chrome https://www.google.com/search?q=" 
                + question});
            } catch (Exception e) {

            }
        }
        
    }

}
