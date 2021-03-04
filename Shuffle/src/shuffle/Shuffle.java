/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shuffle;

/**
 *
 * @author nick
 */
public class Shuffle {

    /**
     * @param args the command line arguments
     */
    public String shuffle( String s )
    {
        StringBuffer result = new StringBuffer( s );
        int n = result.length();
        Random rand = new Random();
        while ( n > 1 )
        {
            int randomPoint = rand.nextInt( n );
            char randomChar = result.charAt( randomPoint );
            result.setCharAt( n-1, randomChar );
            n--;
        }
        return result.toString();
    }
    
}
