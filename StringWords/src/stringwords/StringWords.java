/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringwords;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class StringWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String str = in.nextLine();
        int count = 1;
        
        for (int i=0; i<str.length(); i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i-1) != ' ')) {
                count ++;
            }
        }
        System.out.println(count);
    }
    
}
