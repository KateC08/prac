/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MultidimensionalArray;

/**
 *
 * @author HP
 */
public class MultidimensionalArray {
    public static void main(String[] args) {
        //2D Array
        int[][] num = {
	 {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
        };

        // Printing the 2D array using For loop
        System.out.println("Matrix: ");
        for (int i = 0; i < num.length; i++) {
              for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
              }
        System.out.println(); // Move to the next line after printing each row
        }

    }
}
