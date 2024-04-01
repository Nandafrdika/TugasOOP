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
public class tugas1 {
    public static void main(String[] args){
    
        Scanner sans = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double max = Double.MIN_VALUE;

        System.out.println("Masukkan minimal 10 nilai:");

        while (count < 10) {
            System.out.print("Input nilai ke-" + (count + 1) + ": ");
            double input = sans.nextDouble();
            sum += input;
            if (input > max) {
                max = input;
            }
            count++;
        }

        double min = sum / count;

        System.out.println("Nilai rata-rata: " + min);
        System.out.println("Nilai terbesar: " + max);
    }
    
}
