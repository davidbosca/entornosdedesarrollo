/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_ud2;

/**
 *
 * @author David Boscá
 */
public class Exercise2_UD2 {

    static void piramide() {

        int i, j, k;
        for (k  = 1; i <= 3; i++) { //bucle que cuenta hasta 10

            for (i = 1; i <= 3 - k; i++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * (j - 1) + 1; j++) {
                System.out.print("*");
            }
            System.out.println(".");
        }
    }
}
