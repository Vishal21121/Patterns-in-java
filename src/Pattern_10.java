//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
import java.util.Scanner;
public class Pattern_10 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int k = i;k<=n;k++){
                System.out.print(" ");
            }
            for(int j=2*i;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
