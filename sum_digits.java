//CSE 1007 Java programming Excercise-1 

//problem 4 prime number within a range
import java.util.Scanner;
public class sum_digits {
    static int sum_of_digits(int num){
        int res=0;
        while (num>0) {
            res = res + num%10;
            num = num/10;
        }
        if (res>=10) {
            return sum_of_digits(res);
        }else{
            return res;
        }
        
    }
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number= ");
        a = scan.nextInt();
        scan.close();
        System.out.println(sum_of_digits(a));    
    }
}
