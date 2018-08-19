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
    Klasse für den Fragenkatalog Topologien
    Alle Darstellungen für A4 Ausdruck zusammengerückt.
 */
package semesterarbeit_v2;

public class Topologien {

    // Gibt dem User eine kurze eigene Zusammenfassung über die
    // Topologien zurück.
    void detailiertTopologien() {

        System.out.println("Die Topologie eines Rechnernetzes "
                + "beschreibt die spezifische Anordnung");
        System.out.println("der Geräte und Leitungen, "
                + "welche das Rechnernetz bilden.");
        System.out.println("Die sechs bekanntesten "
                + "Topologien kurz erklärt.");

        System.out.println("Ring / Tokenring:");
        System.out.println("Eine im Kreis zusammengesetztes Netz. "
                + "Auch bekannt als Tokenring. ");
        System.out.println("Jede Station ist mit einer "
                + "weiteren Station im Kreis verbunden.");
        System.out.println("Fällt eine Leitung aus ist "
                + "die Verbindung gestört.");

        System.out.println("Mesh:");
        System.out.println("Die vermaschte Verbindung. Hier "
                + "herrscht etwas Anarchie könnte man sagen.");
        System.out.println("Die Clients sind untereinander in "
                + "keiner nachvollziehbaren Struktur zusammen verbunden.");
        System.out.println("Häufig sind wichtige Clients mit "
                + "meheren Verbindung abgedeckt dass ein Ausfall einen");
        System.out.println("geringen Impact hat.");

        System.out.println("Fullmesh");
        System.out.println("Das vollvermaschte Netzwerk. Jeder "
                + "Client hat eine Verbindung zu jedem Client.");
        System.out.println("Ein Ausfall einer Leitung hat somit "
                + "quasi keinen Impact zur Folge.");
        System.out.println("Ist aber mit abstand die Teuerste und "
                + "Aufwendigste Methode um ein Netzwerk betreiben.");

        System.out.println("Star:");
        System.out.println("Die Stern Topologie ist weit "
                + "verbeitet im WLAN Bereich.");
        System.out.println("Von einem Zentralen Knoten werden alle "
                + "Clients miteinenader verbunden.");
        System.out.println("Fällt eine Leitung oder Client aus, "
                + "so betrifft dies nur diesen einen Client.");
        System.out.println("Fällt aber der Knoten aus, so ist"
                + " das Ganze Netzwerk offline.");

        System.out.println("Line:");
        System.out.println("Die Line Topologie ist eine der "
                + "ältesten. Es gibt einen Start Client.");
        System.out.println("Dieser ist mit einem 2. Client verbunden. "
                + "Der 2. dann mit dem 3. Client und so weiter.");
        System.out.println("Der letzte Client ist dann auch wieder "
                + "der Erste. Wird heute so nicht mehr verwendet.");

        System.out.println("Tree:");
        System.out.println("Die verbreiteste Topologie. "
                + "Von einem Hauptknoten gehen die Verbindungen");
        System.out.println("wie Zweige eines Baumes auseinander. "
                + "Je weiter oben man ist, desto weniger fällt aus.");
        System.out.println("Fällt jedoch der Core / Hauptknoten "
                + "aus, so ist meistens das ganze Netzwerk offlnie.");

        System.out.println("Bus:");
        System.out.println("Das selbe wie Linie hat aber zu jedem "
                + "Client Verzweigungen, so das nicht jeder"
                + " angesprochen wird bei einer Abfrage. ");

    }
}
