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
    Zeigt die Möglichkeiten Dez -> Bin und Bin -> Dez an und user kann
    auswählen, welche er verwenden möchte.
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class BinRechnerMenu {

    //Initialisiere Scanner und Variabeln
    private Scanner mEingabe = new Scanner(System.in);
    private String chatUser;
    BinaerRechner bin1 = new BinaerRechner();

    void binrechnerMenu(NameUser nameUser1) {

        System.out.println("Sehr gut, zum Thema Binaer und"
                + " Dezimalrechner kann ich dir Auskunft"
                + " geben " + nameUser1.getNameUser() + ".");

        // Sagt dem User dass es 2 verschiedene Modi gibt.
        System.out.println("Für den Binärrechner gibt es 2 Modi.");
        System.out.println("Einmal von Binär nach Dezimal und "
                + "Dezimal zu Binär.");
        System.out.println("Welchen darf ich für dich starten?");
        System.out.println("Binaer oder Dezimal?");

        // Initialisiere Eingabe
        chatUser = mEingabe.nextLine();
        // Splittet in einzelne Wörter. Erkennt auch Sonderzeichzen nach dem 
        // Wort z.b. Netzwerk? wird korrekt als Netzwerk erkannt.
        // REGEX \\W+
        String[] words = chatUser.split("\\W+");

        // Geht mit der Funktion FunktionArray durch die einzelnen Wörter
        // Findet er ein passendes Wort führt er die Aktion aus
        // Arrays mit möglichen Antowrten sind in der Klasse 
        // StringArrays definiert.
        if (FunktionArray.uebereinstimungen(words, StringArrays.binDezArray)) {
            System.out.println("Ich starte für dich den Binär zu "
                    + "Dezimal-Rechner");
            bin1.bintoDezRechner();
        } else if (FunktionArray.uebereinstimungen(words, StringArrays.dezBinArray)) {
            System.out.println("Ich starte für dich den Dezimal zu "
                    + "Binär-Rechner");
            bin1.deztoBinRechner();
        }

    }

}
