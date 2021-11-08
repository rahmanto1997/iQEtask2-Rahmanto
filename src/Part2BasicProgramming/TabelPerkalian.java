package Part2BasicProgramming;

public class TabelPerkalian {
    private static void tabelPerkalian (Integer input){
    int hasil = 0;
        for(int i=1; i<=input; i++){
        for (int j=1; j<=input; j++){
            hasil = i*j;
            System.out.print(hasil+"\t");
        }
            System.out.println();
    }
    }

    public static void main(String[] args) {
        tabelPerkalian(9);
    }
}