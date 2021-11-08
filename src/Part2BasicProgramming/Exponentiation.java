package Part2BasicProgramming;

public class Exponentiation {
    private static int pangkat(int a, int b){
        int bilangan = a;
        for(int i=1; i<b; i++){
            bilangan = bilangan *a; //
        }
        System.out.println("Input a="+a+", b="+b);
        System.out.print("Output: ");
        return bilangan;
    }
    public static void main(String[] args) {
        System.out.println(pangkat(2,3));
        System.out.println(pangkat(5,3));
        System.out.println(pangkat(10,2));
        System.out.println(pangkat(2,5));
        System.out.println(pangkat(7,3));
    }
}