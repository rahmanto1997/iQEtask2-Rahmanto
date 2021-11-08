package Part1BasicProgramming;
import java.util.Scanner;

public class FaktorBilangan_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System. in );
        System.out.println("Masukkan angka");
        int bilangan = a.nextInt();
        System.out.println("Faktor-faktor Bilangannya:");
        for (int z = bilangan; z > 0; z--) {
            if (bilangan % z == 0) {
                System.out.println(z+ " ");
            }
        }
    }
}