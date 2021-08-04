import java.util.Scanner;
//CSE 1007 Java programming Excercise-1 

//problem 2 3-types of patterns
public class patterns {
    static void  pattern1(int limit){
        int j=0,i=0;

        for(i=0;i<limit;i++){
            for(j=0;j<limit;j++){
                if(j<=i){
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
    static void  pattern2(int limit){
        int j=0,i=0;
        for(i=0;i<limit;i++){
            for(j=0;j<limit;j++){
                if(j>=limit-i-1){
                    System.out.print("* ");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    static void  pattern3(int limit){
        int j=0,i=0,temp=limit/2;
        for(i=0;i<limit;i++){
            for(j=0;j<limit;j++){
                if (temp<=limit-i-1) {
                    if(j>=limit-i-1){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    } 
                }else{
                    if(j>=i){
                        System.out.print("* ");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the limit for patterns = ");
        n = scan.nextInt();
        System.out.println("Pattern-1");
        pattern1(n);
        System.out.println("Pattern-2");
        pattern2(n);
        System.out.println("Pattern-3");
        pattern3(n);
        scan.close();

    }
}
