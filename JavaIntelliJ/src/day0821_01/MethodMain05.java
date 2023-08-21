package day0821_01;

public class MethodMain05 {
    public static void main(String[] args) {
        int[] iSum= {10,20,100,200,90,70};
        System.out.println(sumArray(iSum));
    }

    @org.jetbrains.annotations.Contract(pure = true)
    public static int sumArray(int[] Array) {
        int sum = 0;
        for (int i = 0; i < Array.length; i++) {
            sum += Array[i];
        }
        return sum;
    }
}
