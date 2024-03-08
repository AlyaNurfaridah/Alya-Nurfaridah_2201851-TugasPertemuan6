/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method1;

/**
 *
 * @author HP
 */
/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, menampilkan
bilangan dari satu sampai dengan n, dimana n diinput dari alat masukan, n>=1.*/

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (n >= 1): ");
        int n = input.nextInt();
        
        if (n < 1) {
            System.out.println("Masukkan nilai n yang valid (n >= 1)");
        } else {
            tampilanAngka(n);
        }
    }
    
    public static void tampilanAngka(int n) {
        System.out.println("Bilangan dari 1 sampai " + n + " adalah:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
