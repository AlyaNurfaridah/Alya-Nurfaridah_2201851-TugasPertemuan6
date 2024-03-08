/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method3;

/**
 *
 * @author HP
 */

/*Buatlah method prosedur atau fungsi algoritma dalam bahasa Java, yang membaca
panjang (integer) tiga buah sisi sebuah segitiga, a, b, dan c, yang dalam hal ini a <= b <=
c, lalu menentuka apakah ketiga sisi tersebut membentuk segitiga siku – siku, segitiga
lancip, atau segitiga tumpul (Petunjuk gunakan hukum Phytagoras).*/

import java.util.Scanner;

public class Method3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan panjang sisi a:");
        int a = input.nextInt();
        
        System.out.println("Masukkan panjang sisi b:");
        int b = input.nextInt();
        
        System.out.println("Masukkan panjang sisi c:");
        int c = input.nextInt();
        
        // Mengurutkan sisi segitiga a <= b <= c
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        
        // Menentukan jenis segitiga
        if (a * a + b * b == c * c) {
            System.out.println("Segitiga Siku-siku");
        } else if (a * a + b * b < c * c) {
            System.out.println("Segitiga Tumpul");
        } else {
            System.out.println("Segitiga Lancip");
        }
        
        input.close();
    }
}
