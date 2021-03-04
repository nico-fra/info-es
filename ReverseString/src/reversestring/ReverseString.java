/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String str = in.nextLine(), revStr = "";
        
        for (int i = str.length()-1; 0<=i; i--) {
            revStr += str.charAt(i);
        }
        System.out.println(revStr);
    }
    
}
