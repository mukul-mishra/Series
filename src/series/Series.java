package series;
//printing series (a + 2^0 * b),(a + 2^1 * b)........
import java.util.Scanner;
import java.lang.Math;
public class Series {
    public static void main(String []argh){

        double s = 0.0;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++) {
                for(int k=0;k<=j;k++) {
                    s = s + Math.pow(2,k) * b;
                }
                double m = a + s;
                System.out.print((int) m + " ");
                m=0.0;
                s=0.0;
            }
            System.out.print("\n");
        }
        in.close();
    }
}
