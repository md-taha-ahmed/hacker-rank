import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String args[]) {
        int i;
        String[] s = new String[3];
        int[] x = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (i = 0; i < 3; i++) {
            s[i] = sc.next();
            x[i] = sc.nextInt();        }
        for (i = 0; i < 3; i++) {
            int length = 0;
            length = 15;
            System.out.println(length);
            System.out.printf("%-" + length + "s", s[i]);
            System.out.printf("%03d%n", x[i]);
        }
        System.out.println("================================");
    }
}
