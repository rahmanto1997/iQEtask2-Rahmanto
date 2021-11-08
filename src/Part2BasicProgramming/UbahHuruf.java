package Part2BasicProgramming;

public class UbahHuruf {
    private static String ubahHuruf(String input) {
        String[] alpha = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                                    "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                                    "u", "v", "w", "x", "y", "z"};
        Integer indexAlpha; // tampungan index final
        String output = ""; // tampungan output
        for (int i = 0; i < input.length(); i++) {      // looping input
            for (int j = 0; j < alpha.length; j++) {    // looping array alfabet
                if(input.substring(i, i+1).equalsIgnoreCase(alpha[j])) {
                    indexAlpha = j+10;
                    if(indexAlpha > 25) {
                        indexAlpha = indexAlpha - 26;
                    }
                    output = output + alpha[indexAlpha];
                }
            }
            if(input.substring(i, i+1).equals(" ")) {   // ngecek spasi
                output = output + " ";
            }
        }
        return output.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(ubahHuruf("SEPULSA OKE"));
        System.out.println(ubahHuruf("ALTERRA ACADEMY"));
        System.out.println(ubahHuruf("INDONESIA"));
        System.out.println(ubahHuruf("GOLANG"));
        System.out.println(ubahHuruf("PROGRAMMER"));
    }
}