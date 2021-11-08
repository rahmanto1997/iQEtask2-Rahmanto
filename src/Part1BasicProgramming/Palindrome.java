package Part1BasicProgramming;

public class Palindrome {
    private static boolean palindrome(String value){
        String palindrome="";
        for (int i=value.length();i>0;i--){
            String teks = value.substring(i-1,i);
            palindrome+=teks;
        }
        if (value.equals(palindrome)){
            System.out.println("Input: "+value);
            System.out.println("Output: ");
            return true;
        }else{
            System.out.println("Input: "+value);
            System.out.println("Output: ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
    }
}