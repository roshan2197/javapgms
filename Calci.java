import java.util.Scanner;

public class Calci {
    static void simpleCal(int a,int b,char ch){
        switch(ch){
            case '+':System.out.println("Add "+(a+b)); break;
            case '-':System.out.println("Sub "+(a-b)); break;
            case '*':System.out.println("Mul "+(a*b)); break;
            case '/':System.out.println("Div "+(a/b)); break;
            case '%':System.out.println("Mod "+(a%b)); break;
        }
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        char ch=s.next().charAt(0);
        simpleCal(a,b,ch);
        s.close();
    }
}
