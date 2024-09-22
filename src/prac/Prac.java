/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prac;

/**
 *
 * @author HP
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Input
        String[] names = {"Katelyn", "Katel", "keyt"};
        
        //Output
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("~~~~~~~");
        
        //process to print all the values of the array
        for(int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ", ");
        }
    }
    
}
