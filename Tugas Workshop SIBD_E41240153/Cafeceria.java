/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cafeceria;
import java.util.Scanner;

public class Cafeceria {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("          CAFE CERIA          ");
            System.out.println("        ANEKA MINUMAN         ");
            System.out.println("-----------------------------");
            System.out.println(" SPECIAL MENU :");
            System.out.println(" 1. Soft drinks");
            System.out.println(" 2. Mix juice");
            System.out.println(" 3. Nescafe");
            System.out.println(" 4. Soda milk");
            System.out.println(" 5. Tea");
            System.out.println("-----------------------------");
            
            System.out.print("Masukkan nama pembeli: ");
            String namaPembeli = scanner.nextLine();
            
            System.out.print("Silahkan masukkan pilihan anda: ");
            int pilihan = scanner.nextInt();
            
            String minuman;
            switch (pilihan) {
                case 1:
                    minuman = "Soft drinks";
                    break;
                case 2:
                    minuman = "Mix juice";
                    break;
                case 3:
                    minuman = "Nescafe";
                    break;
                case 4:
                    minuman = "Soda milk";
                    break;
                case 5:
                    minuman = "Tea";
                    break;
                default:
                    minuman = "Pilihan tidak tersedia";
                    break;
            }
            
            if (pilihan >= 1 && pilihan <= 5) {
                System.out.println("Minuman yang anda pesan adalah " + minuman);
                System.out.println("Pesanan akan segera kami antar");
            }
            System.out.println("Terima Kasih " + namaPembeli + " telah berkunjung di Cafe Ceria");
        }
    }
}
