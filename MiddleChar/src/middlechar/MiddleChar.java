/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middlechar;
import java.util.Scanner;
/**
 *
 * @author nick
 */
public class MiddleChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        String str = in.nextLine();
        
        if (str.length()%2==0)
            System.out.println(str.substring(str.length()/2-1, str.length()/2+1));
        else
            System.out.println(str.substring(str.length()/2, str.length()/2+1));
    }
    
}