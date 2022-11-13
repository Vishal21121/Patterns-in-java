import java.util.Scanner;

//*****
// ****
//  ***
//   **
//    *
public class Pattern_7 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the row number:");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            for(int k = 1;k<=i-1;k++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
