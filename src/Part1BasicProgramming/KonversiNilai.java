package Part1BasicProgramming;

public class KonversiNilai {
    public static void main(String[] args) {
        // input
        int studentScore = 80;

        // Process: Your Solution Code Here
        if(studentScore>=80 && studentScore<=100){
            System.out.println("Anda Mendapatkan Nilai A");
        }
        else if(studentScore>=65 && studentScore<=79){
            System.out.println("Anda Mendapatkan Nilai B+");
        }
        else if(studentScore>=50 && studentScore<=64){
            System.out.println("Anda Mendapatkan Nilai B");
        }
        else if(studentScore>=35 && studentScore<=49){
            System.out.println("Anda Mendapatkan Nilai C");
        }
        else if(studentScore>=0 && studentScore<=34){
            System.out.println("Anda Mendapatkan Nilai D");
        }
        else {
            System.out.println("Nilai Invalid");
        }
        // Output
        // Nilai A
    }
}