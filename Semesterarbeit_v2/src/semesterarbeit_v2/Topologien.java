/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterarbeit_v2;

/**
 *
 * @author gima
 */
public class Topologien {
    
    void detailiertTopologien (){
        
        System.out.println("Die Topologie eines Rechnernetzes beschreibt die "
                + "spezifische Anordnung der Geräte und Leitungen, die das "
                + "Rechnernetz bilden.");
        System.out.println("Die sechs bekanntesten Topologien kurz erklärt.");
        System.out.println("Ring / Tokenring:");
        System.out.println("Eine im Kreis zusammengesetztes Netz.  Auch bekannt als Tokenring. "
                + "Jede Station ist mit einer weiteren Station im Kreis verbunden. "
                + "Fällt eine Leitung aus ist die Verbindung gestört. ");
        System.out.println("Mesh:");
        System.out.println("Die vermaschte Verbindung. Hier herscht etwas Anarchie könnte man sagen. "
                + "Die Clients sind untereinander in keiner nachvollziehbaren Struktur zusammen verbunden. "
                + "Häufig sind wichtige Clients mit meheren Verbindung abgedeckt dass ein Ausfall einen "
                + "geringen Impact hat.");
        System.out.println("Fullmesh");
        System.out.println("Das vollvermaschte Netzwerk. Jeder Client hat eine Verbindung zu jedem Client. "
                + "Ein ausfall einer Leitung hat somit quasi keinen Impact zur "
                + "Folge. Ist aber mit abstand die Teuerste und Aufwendigste "
                + "Methode um ein Netzwerk betreiben.");
        System.out.println("Star:");
        System.out.println("Die Stern Topologie ist weit verbeitet im WLAN Bereich. "
                + "Von einem Zentralen Knoten werden alle Clients miteinenader verbunden. "
                + "Fällt eine Leitung oder Client aus, so betrifft dies nur diesen einen Client. "
                + "Fällt aber der Knoten aus, so ist das Ganze Netzwerk offline.");
        System.out.println("Line:");
        System.out.println("Die Line Topologie ist eine der ältesten. Es gibt einen Start Client. "
                + "Dieser ist mit einem 2. Client verbunden. Der 2. dann mit dem 3. Client und so weiter. "
                + "Der letzte Client ist dann auch wieder der Erste. Wird heute so nicht mehr verwendet. ");
        System.out.println("Tree:");
        System.out.println("Die verbreiteste Topologie. Von einem Hauptknoten "
                + "gehen die Verbindungen wie Zweige eines Baumes auseinander. Je weiter oben man ist, desto weniger fällt aus."
                + " Fällt jedoch der Core / Hauptknoten aus, so ist meistens das ganze Netzwerk offlnie.");
        System.out.println("Bus:");
        System.out.println("Das selbe wie Linie hat aber zu jedem Client Verzweigungen, so das nicht jeder angesprochen wird bei einer Abfrage. ");
        System.out.println("Veraltet und wird nicht mehr benötigt.");
        
                
        
    }
    
}
