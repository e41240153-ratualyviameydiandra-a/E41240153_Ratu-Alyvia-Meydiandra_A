/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promobelanja;
import java.util.Scanner;

public class PromoBelanja {
      public static void main(String[] args) {
          try (Scanner input = new Scanner(System.in)) {
              System.out.println("===============================================");
              System.out.println("           Kharisma Agung Plaza < KAP >        ");
              System.out.println("             Promo Belanja Berhadiah            ");
              System.out.println("   Khusus Pembelian 5 Barang Pertama            ");
              System.out.println("     Dengan harga minimum Rp 10000,00           ");
              System.out.println("===============================================");
          
              System.out.print("Masukkan nama pembeli: ");
              String nama = input.nextLine();
              
              int totalHarga = 0;
              
              for (int i = 1; i <= 5; i++) {
                  System.out.print("Masukkan harga barang ke-" + i + " : ");
                  totalHarga += input.nextInt();
              }
             
              System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);
             
              if (totalHarga >= 10000) {
                  System.out.println("Selamat...");
                  System.out.println("Anda mendapat hadiah 1 buah mug cantik");
              }
              
              System.out.println("===============================================");
              System.out.println("                 Terima Kasih                  ");
              System.out.println("  Anda sudah belanja di Kharisma Agung Plaza");
          }
    }
}
