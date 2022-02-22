import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        if(arr[n-1]%10==0) System.out.println("Yes");
        else System.out.println("No");
        s.close();
    }
}
