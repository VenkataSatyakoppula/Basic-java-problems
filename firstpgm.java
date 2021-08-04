import java.util.Scanner;
public class firstpgm {
    public static void main(String arg[]){
        System.out.println("hello");
        int a=10,b=20;
        System.out.println("Addition is="+(a+b));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a,b integers");
        a = scan.nextInt();
        b = scan.nextInt();
        scan.close();
        System.out.println("Addition is="+(a+b));
        int i,n=5;
        for(i=0;i<n;i++){
            System.out.println(i);
        }
    }
}