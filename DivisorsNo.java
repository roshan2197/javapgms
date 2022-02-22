import java.util.Scanner;

public class DivisorsNo{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] a= new int[1][3];
        for(int i=0;i<3;i++){
            a[0][i]=s.nextInt();
        }
        s.close();
        int count=0;
        for(int i=a[0][0];i<a[0][1]+1;i++){
            if(i%a[0][2]==0) count++;
        }
        System.out.println(count);
    }
}