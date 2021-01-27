/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es116;

/**
 *
 * @author nick
 */
public class Es116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int n = 100;
        float[] arr = new float[n], newarr = new float[n];
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * (10+10)-10);
            if (i>0) {
                if (arr[i-1] < arr[i])
                    newarr[i] = arr[i] * -1;
                else if (arr[i-1] > arr[i])
                    newarr[i] = arr[i] * 2;
            } else
                newarr[0] = arr[0];
            System.out.println(newarr[i]);
        }
    }
    
}
