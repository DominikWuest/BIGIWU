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
    WICHTIG: ES MUSS GOOGLE CHROME AUF DEM PC INSTALLIERT SEIN UND
    DER RECHNER MUSS EIN WINDOWS VERWENDEN. 
    Haben uns für Google Chrome entschieden, da dieses stabil
    funktioniert und fast jeder dieses Programm verwendet.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class NoMatch {

    // Initialisiere Variabeln
    private String question;
    private String sucheAntwort;
    private Scanner mEingabe = new Scanner(System.in);

    void noMatchGoogle(String question) {

        // alte eingegeben Frage wird gemerkt und übergeben
        this.question = question;

        // Ausgabe für User
        System.out.println("Ich habe deine Eingabe leider "
                + "nicht verstanden.");
        System.out.println("Du kannst gerne es nochmals probieren, "
                + "oder ich starte Google Search für dich.");
        System.out.println("Suche starten oder nochmals eingeben?");

        // Arrays und Eingabe initalisieren
        sucheAntwort = mEingabe.nextLine();
        // Splittet in einzelne Wörter. Erkennt auch Sonderzeichzen nach dem 
        // Wort z.b. Netzwerk? wird korrekt als Netzwerk erkannt.
        // REGEX \\W+
        String[] words = sucheAntwort.split("\\W+");

        // Geht mit der Funktion FunktionArray durch die einzelnen Wörter
        // Findet er ein passendes Wort im Array führt 
        // er die Aktion aus. 
        // Arrays mit möglichen Antowrten sind in der Klasse 
        // StringArrays definiert.
        
        // Falls nochmals
        if (FunktionArray.uebereinstimungen(words, StringArrays.nochmalsArray)) {
            System.out.println("Dann nochmals.");
            // Falls Google gestartet werden soll
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.googleArray)) {
            System.out.println("Ich starte die Google Suche.");
            try {
                Thread.sleep(3000); // Sleep für 3 Sekunden damit User
                // Zeit zum lesen hat
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            //String question = alte Eingabe vom User im Bot die er
            // nicht beantworten Konnte da nicht im Array. Abstände
            // werden durch ein plus ersetzt
            question = question.replace(' ', '+');

            try {

                // Startet Google Chrome auf dem PC
                // Gibt selber die Frage ein und bestätigt diese
                Runtime.getRuntime().exec(new String[]{"cmd", "/c",
                    "start chrome https://www.google.com/search?q="
                    + question});
            } catch (Exception e) {

            }
        }
    }
}
