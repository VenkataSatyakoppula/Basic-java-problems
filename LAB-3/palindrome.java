import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        int flag=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string = ");
        String str = scan.nextLine();
        char ch[] = str.toCharArray();
        scan.close();
        for (int i = 0; i < (str.length())/2; i++) {
            if (ch[i]!=ch[str.length()-i-1]) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Given string is not a Palindrome");
        }else{
            System.out.println("Given string is a Palindrome");
        }
    }
}
