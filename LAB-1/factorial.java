
import java.util.Scanner;
public class factorial {
    public static void main(String arg[]){
        int a,i,res=1;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        scan.close();
        for(i=1;i<=a;i++){
            res = res*i;
        }
        System.out.println("Factorial of"+a+"="+res);
       
    }
}