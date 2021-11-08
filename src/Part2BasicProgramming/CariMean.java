package Part2BasicProgramming;

public class CariMean {
    private static float Mean(float[] numbers){
        float total = 0;
        for (int i=0; i< numbers.length;i++){
            total = total+numbers[i];
        }
        return total/ numbers.length;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(Mean(value));
    }
}