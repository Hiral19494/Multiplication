/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author Admin
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Multiplication();
    }

    private static void Multiplication() {
        int n, c;
        for (n = 1; n <= 12; n++) {
            System.out.println("\nTable of " + n);
            for (c = 1; c <= 12; c++) {
                System.out.println(n + "*" + c + " = " + (n * c));
            }
        }
    }
}
