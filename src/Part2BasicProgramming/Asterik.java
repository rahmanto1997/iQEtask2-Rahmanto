package Part2BasicProgramming;
public class Asterik {
    private static void playWithAsterik (Integer input){
        for (int t=1; t<=input; t++){
            System.out.print("@");
            for (int s=t; s<=input; s++){
                System.out.print("$");
            }
            for (int b=1; b<=(t*1); b++){
                System.out.print("* ");
            }
            System.out.println();
            }
    }

    public static void main(String[] args) {
        playWithAsterik(5);
    }
}