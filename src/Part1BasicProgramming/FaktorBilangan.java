package Part1BasicProgramming;
import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {
        System.out.println("Masukkan angka");
        Scanner b = new Scanner(System. in );
        int bilangan = b.nextInt();
        System.out.println("Faktor-faktor Bilangannya:");
        int tambah = 0;
        for (int z = 1; z <= bilangan; z++) {
            tambah++;
            if (bilangan % tambah == 0) {
                System.out.println(tambah+ " ");
            }
        }
    }
}