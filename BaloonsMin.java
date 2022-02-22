import java.util.Scanner;

public class BaloonsMin {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int i1 = 0; i1 < t; i1++) {
            int[][] c = new int[1][2];

            for (int p = 0; p < 2; p++) {
                c[0][p] = s.nextInt();
            }

            int flat = 0;
            if (c[0][0] > c[0][1]) {
                flat++;
            }
            System.out.println(flat);
            int n = s.nextInt();
            int[][] a = new int[n][2];
            int count1 = 0, count2 = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    a[i][j] = s.nextInt();
                }
                if (a[i][0] == 1)
                    count1++;
                if (a[i][1] == 1)
                    count2++;
            }
            System.out.println(count1);
            System.out.println(count2);
            if (flat == 1) {
                if (count1 > count2) {
                    System.out.println((c[0][1] * count1) + (c[0][0] * count2));
                } else {
                    System.out.println((c[0][0] * count1) + (c[0][1] * count2));
                }
            } else {
                if (count1 > count2) {
                    System.out.println((c[0][1] * count2) + (c[0][0] * count1));
                } else {
                    System.out.println((c[0][1] * count1) + (c[0][0] * count2));
                }
            }

        }
        s.close();
    }
}
