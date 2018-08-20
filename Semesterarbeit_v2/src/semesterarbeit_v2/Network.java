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
    Klasse für den Fragenkatalog Netzwerk
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class Network {

    // Gibt dem User eine kurze eigene Zusammenfassung über das Thema
    // Netzwerk zurück.
    void detaliertNetwork(NameUser nameUser1) {
        System.out.println("Eine generelle kurze Erklärung?");
        System.out.println("Aber sicher doch " + 
                nameUser1.getNameUser() + ".");
        System.out.println("Generells über Netzwerke.");
        System.out.println("Das Internet ist nichts weiter als ein "
                + "gigantisches Netzwerk.");
        System.out.println("Dieses Verbindet die ganze Welt miteinander.");
        System.out.println("Ein Netzwerk wird grob gesagt in ca. "
                + "4 Klassen eingestuft.");
        System.out.println("LAN, MAN, WAN, GAN");
        System.out.println("Local Area Network: Heimnetzwerk oder kleines "
                + "Unternehmensnetzwerk");
        System.out.println("Metropolian Area Network: Ein Netzwerk welches "
                + "ca. über 10 km reicht.");
        System.out.println("Wide Area Network: Wie MAN aber mit einer "
                + "weiteren geografischen Ausbreitung.");
        System.out.println("WANs erstrecken sich über Länder oder "
                + "sogar Kontinente.");
        System.out.println("Globale Area Networks: Verbindetet mehere WANs "
                + "miteinander. Hier kommen auch Satiliten zum Einsatz.");
        System.out.println("Netzwerke dienen dazu, Clients oder andere "
                + "Netzwerke miteinander zu verbinden.");
        System.out.println("Sie sind der Grundstein für die Kommunikation "
                + "wie wir sie heute kennen und nutzen.");
    }

}
