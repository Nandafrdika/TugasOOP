/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percabangan;
import java.util.Scanner;
/**
 *
 * @author Nanda Fredika
 * TGL : 2024 - 4 - 1
 */
public class tugas3 {
     public static void main(String[] args){
     Scanner tahunan = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan tahun (1900-2005): ");
            int year = tahunan.nextInt();

            if (year < 1900) {
                System.out.println("Maaf, tahun tersebut dibawah 1900");
            } else if (year > 2005) {
                System.out.println("Maaf, tahun tersebut diatas 2005");
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " adalah tahun kabisat");
                } else {
                    System.out.println(year + " bukan tahun kabisat");
                }
                break;
            }
        }

     
     }
    
}
