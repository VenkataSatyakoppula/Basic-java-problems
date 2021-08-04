import java.util.Scanner;
//CSE 1007 Java programming Excercise-1 

//problem 1 prime number within a range
public class prime {
    //function takes a single number checks if prime or not if(prime)->1 else->0 
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
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the range for prime numbers = ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            if (primenum(i)==1) {
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
        scan.close();
    }
}
