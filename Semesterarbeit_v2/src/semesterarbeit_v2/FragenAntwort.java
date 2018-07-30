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
Hier wird der eigendliche Chatbot programmiert. Kommunikation
mit Fragen und Antworten.
 */
package semesterarbeit_v2;

import java.util.Scanner;

public class FragenAntwort {

    BinaerRechner bin1 = new BinaerRechner();
    private Scanner mEingabe = new Scanner(System.in);
    private String nameUser;
    private String wohlbefindenUser;
    private String chatUser;
    

    void frageName() {

        System.out.println("Zuerst mal Hallo von meiner Seite.");
        System.out.println("Mein Name ist Bigiwu-Bot.");
        System.out.println("Wie lautet dein Name?");
        nameUser = mEingabe.nextLine();

        System.out.println("Dein Name lautet also " + nameUser + ".");
        System.out.println("Naja meiner ist ja auch nicht besser...");

    }

    void frageWohlbefinden() {

        System.out.println("Wie geht es dir heute " + nameUser + "?");
        wohlbefindenUser = mEingabe.nextLine();
        String[] words = wohlbefindenUser.split(" ");

        /*
            positve + positive = positive
            positve + negative = negative
            negative + negative = positive
         */
        Boolean mood = true; // 1 will be negative, 0 will be positive
        String[] positives = new String[]{"gut", "ausgezeichnet"};
        String[] negatives = new String[]{"nicht", "schlecht"};

        for (String word : words) {
            for (String positive : positives) {
                if (word.contains(positive)) {
                    mood = mood ^ true;
                }
            }
            for (String negative : negatives) {
                if (word.contains(negative)) {
                    mood = mood ^ false;
                }
            }
        }

        if (mood == false) {
            // positive
            System.out.println("Gut zu hören " + nameUser + ". Mein Code hat keine Bugs also"
                    + " gehts mir gut. :) ");
        } else {
            //negative
            System.out.println("Schade aber auch das geht vorüber."
                    + " Think positiv :) ");
        }
        /*
        
        Boolean hasPositives;
        Boolean hasNegatives;
        
     
        
        for (String positive : positives) {
            hasPositives = wohlbefindenUser.contains(positive);
            if(hasPositives)
                break;
        }
        
        for (String negative : negatives) {
            hasNegatives = wohlbefindenUser.contains(negative);
            if(hasNegatives)
                break;
        }
                    System.out.println("Das freut mich zu hören!");
                System.out.println("Mein Code hat keine Bugs also"
                        + " gehts mir auch gut.");
                break;
  
        
         */

 /*  switch (wohlbefindenUser) {
            case "gut":
            case "Gut":
            case "Sehr gut": 
            case "sehr gut":{
                System.out.println("Das freut mich zu hören!");
                System.out.println("Mein Code hat keine Bugs also"
                        + " gehts mir auch gut.");
                break;
            }
            case "schlecht":{
                System.out.println("Schade denk einfach an etwas positives"
                        + " wie z.B. Security updates. :) ");
                break;
                
            }
            
        }*/
    }

    void chatPartner() {

        System.out.println("So an die Arbeit!");
        System.out.println("Ich kann dir diverse Fragen"
                + " zum Thema Netzwerk beantworten.");
        System.out.println("Wie kann ich dir helfen?");
        System.out.println("Ich kann dir auch ein Auflistung mit den mir"
                + " bekannten Themen geben.");
        System.out.println("Sag dafür nur Thema.");

        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binrechnerArray = new String[]{"umrechnen", "binaer", "binär", "dezimal"};
        String[] subnetingArray = new String[]{"Subnetz", "IP", "IP Adresse", "Gateway", "Broadcast"};
        String[] themaArray = new String[]{"thema"};

        for (String word : words) {
            for (String binrechner : binrechnerArray) {
                if (word.contains(binrechner)) {
                    System.out.println("Sehr gut, zum Thema Binaer und"
                            + " und Dezimalrechner kann ich dir Auskunft"
                            + " geben.");
                }
            }
            for (String subrechner : subnetingArray) {
                if (word.contains(subrechner)) {
                    System.out.println("Aber sicher doch. Ich kann dir mit"
                            + " einem Subnetz und IP Rechner aushelfen.");
                }
            }

            for (String thema : themaArray) {
                if (word.contains(thema)) {
                    System.out.println("Alles klar.");
                    

                }
            }
        }

    }
}
