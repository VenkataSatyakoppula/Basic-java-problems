//CSE 1007 Java programming Excercise-1 

//problem 5 prime number within a range
import java.lang.Math;
import java.util.Scanner;
public class circular_prime {
    static int primenum(int num){
        if (num==1) {
            return 0;
        }
        if (num==2) {
            return 1;
        }else{
            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    return 0;
                }
            }
            return 1;
        }
    }
    static int cycle_number_by_one(int num,int count){
        return (int)Math.pow(10,count-1)*(num%10) + num/10;
    }
    static int cprime(int num){
        int count=0,res=0,temp=num;
        while (num>0) {
            res = res + num%10;
            num = num/10;
            count++;
        }
        int i=count,check_num=temp;
        while (i>0) {
            if (primenum(check_num)==0 ) {
                return 0;
            }
            check_num = cycle_number_by_one(check_num, count);
            i--;
        }
        return 1;
    }
    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        a = scan.nextInt();
        if (cprime(a)==1) {
            System.out.println("YES!");
        } else {
            System.out.println("NO!");
        }
        scan.close();
    }
}
