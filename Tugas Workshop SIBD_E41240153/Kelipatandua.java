/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelipatandua;

public class Kelipatandua {
    public static void main(String[] args) {
        System.out.println("      Do_While");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("================================");

        int angka = 1;

        do {
            System.out.print(angka + " ");
            angka *= 2;
        } while (angka <= 100);
    }
}
