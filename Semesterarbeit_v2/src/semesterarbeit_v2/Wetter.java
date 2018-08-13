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
public class Wetter {

    void detailiertWetter() {

        System.out.println("Da ich auf deinem Notebook gefangen bin, starte ich für dich eine Suche bei Google.");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        String question = "Wetter heute";

        question = question.replace(' ', '+');

        try {
            Runtime.getRuntime().exec(new String[]{"cmd", "/c", "start chrome https://www.google.com/search?q=" + question});
        } catch (Exception e) {

        }
    }

}
