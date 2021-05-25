import java.util.ArrayList;
import java.util.Scanner;

public class Loop2 {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Double[]> result = new ArrayList<Double[]>();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            double sum = 0;
            Double[] x = new Double[n];
            for (int j = 0; j < n; j++) {

                // x[j-1]=(double) 0;
                sum += (Math.pow(2, j) * b);
                x[j] = a + sum;
            }
            result.add(x);
        }
        for (Double[] xx : result) {
            for (Double doubles : xx) {
                System.out.print((int) Math.round(doubles) + " ");
            }
            System.out.println();

        }
        in.close();
    }
}