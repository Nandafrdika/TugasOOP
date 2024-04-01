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
public class tugas2 {
     public static void main(String[] args){
     
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int bulat = angka.nextInt();

        System.out.print("Masukkan bilangan pangkat: ");
        int pangkat = angka.nextInt();

        double hasil = Math.pow(bulat, pangkat);

        System.out.println(bulat + " pangkat " + pangkat + " = " + hasil);

     
     }
    
}
