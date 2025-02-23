/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilangangenap;

import java.util.Scanner;

public class Bilangangenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal: ");
        int batasawal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasakhir = input.nextInt();
        System.out.println("Bilangan genap dari " + batasawal + " sampai " + batasakhir + ":");

        for (int i = batasawal; i <= batasakhir; i++) {
            if (i % 2 == 0) { 
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
