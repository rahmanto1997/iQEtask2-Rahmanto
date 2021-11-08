package Part2BasicProgramming;

public class DrawXYZ {

    public static void drawxyz (Integer input){
        int x = 0;
        for (int i=0; i<input; i++){
            for (int j=0; j<input; j++) {
                x = x + 1;
                if (x % 3 == 0) {
                    System.out.print("X ");
                } else {
                    if (x % 2 == 0) {
                        System.out.print("Z ");
                    } else {
                        System.out.print("Y ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        drawxyz(3);
        drawxyz(5);
        drawxyz(1);
    }
}