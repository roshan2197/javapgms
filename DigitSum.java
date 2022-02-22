import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0,t=n;
        for(int i=0;i<n;i++){
            t/=10;
            sum+=t;
            n%=10;
            
        }
        s.close();
    }
}
