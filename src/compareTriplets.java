import java.util.Scanner;

/**
 * Created by abdurrahmanjun on 7/13/17.
 */
public class compareTriplets {

//    5 6 7 <-input
//    3 6 10 <-input
//    1 1 <-output

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] result = new int[2];
        int[] a = new int[3];
        int[] b = new int[3];
        a[0] = a0;a[1] = a1;a[2] = a2;
        b[0] = b0;b[1] = b1;b[2] = b2;

        for (int i = 0; i < 3; i++) {
            if (a[i]>b[i]) {
                result[0] = result[0] + 1;
            } else if (a[i]<b[i]) {
                result[1] = result[1] + 1;
            } else {
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");

    }
}
