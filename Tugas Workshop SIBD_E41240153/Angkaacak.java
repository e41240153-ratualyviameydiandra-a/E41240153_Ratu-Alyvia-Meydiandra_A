/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package angkaacak;
import java.util.Random;
import java.util.Scanner;

public class Angkaacak {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Masukkan jumlah angka acak yang ingin dibuat: ");
        int jumlah = scanner.nextInt();

        int[] angkaAcak = new int[jumlah];

        System.out.print("Deretan angka acak: ");
        for (int i = 0; i < jumlah; i++) {
            angkaAcak[i] = random.nextInt(100); 
            System.out.print(angkaAcak[i] + " ");
        }
        scanner.close(); 
    }
}  
