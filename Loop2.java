import java.util.Scanner;

public class Loop2 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++){
                Double[] x = new Double[n];
                // x[j-1]=(double) 0;
                if(j==0){
                    x[j]=a+(Math.pow(2, j)*b);
                }else{
                    x[j]=a+(Math.pow(2, j)*b)+x[j-1];
                }
                System.out.print(x[i]);

            }
        }
        
        in.close();
    }
}
