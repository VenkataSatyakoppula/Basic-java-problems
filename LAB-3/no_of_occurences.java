import java.util.Scanner;


public class no_of_occurences {
    public static void main(String[] args) {
        int k=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string = ");
        String str = scan.nextLine();
        System.out.println("Enter the sub-string = ");
        String substr = scan.nextLine();
        // System.out.println(noSpaceStr);
        scan.close();
        for (int i = 0; i < str.length()-1; i++) {
            if(str.indexOf(substr,i)==i){
                System.out.println("At index = "+i);
                k++;
            }
        }
        System.out.printf("no.of Occurences = %d\n",k);
        

        
    }
}
