/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterarbeit_v2;

import java.util.Scanner;

/**
 *
 * @author Marek
 */
public class BinRechnerMenu {
    
    //Initialisiere Scanner und Variabeln
    private Scanner mEingabe = new Scanner(System.in);
    private String chatUser;
    BinaerRechner bin1 = new BinaerRechner();
    
    void binrechnerMenu() {

        System.out.println("Für den Binärrechner gibt es 2 Modi.");
        System.out.println("Einmal von Binär nach Dezimal und Dezimal zu"
                + " Binär.");
        System.out.println("Welchen darf ich für dich starten? Binaer oder Dezimal?");
        chatUser = mEingabe.nextLine();
        String[] words = chatUser.split(" ");
        String[] binDezArray = new String[]{"binaer"};
        String[] dezBinArray = new String[]{"dezimal"};

        for (String word : words) {
            for (String binDezRechner : binDezArray) {
                if (word.contains(binDezRechner)) {
                    System.out.println("Ich starte für dich den Binär zu "
                            + "Dezimal Rechner");
                    bin1.bintoDezRechner();
                }
            }
            for (String dezBinRechner : dezBinArray) {
                if (word.contains(dezBinRechner)) {
                    System.out.println("Ich starte für dich den Dezimal zu "
                            + "Binär Rechner");
                    bin1.deztoBinRechner();
                }
            }
        }

    }
    
}
