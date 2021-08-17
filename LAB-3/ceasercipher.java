import java.util.Scanner;

public class ceasercipher {
    static String cc_Encryption(String msg,int key){
        int ch[] = new int[msg.length()];
        int ascii = 0;
        for (int i = 0; i < msg.length(); i++) {
            ascii = (int)(msg.charAt(i))-97;
            ascii = 97 + (ascii + key) % 26;
            ch[i] = ascii;
        }
        String str ="";
        for(int i: ch){
            str += Character.toString((char)i);
        }
        return str;
    }
    static String cc_decryption(String msg,int key){
        int ch[] = new int[msg.length()];
        int ascii = 0;
        for (int i = 0; i < msg.length(); i++) {
            ascii = (int)(msg.charAt(i))-97;
            if((ascii-key)<0){
                ascii = 97 + (26+ascii - key) % 26;
            }else{
                ascii = 97 + (ascii - key) % 26;
            }
            ch[i] = ascii;
        }
        String str ="";
        for(int i: ch){
            str += Character.toString((char)i);
        }
        return str;
    }
    public static void main(String[] args) {
        int key;
        Scanner scan = new Scanner(System.in);
        System.out.println("************Ceaser-Cipher************");
        System.out.println("Enter the message = ");
        String str = scan.nextLine();
        while (true){
            System.out.println("Enter the key(0-25) = ");
            key = scan.nextInt();
            if (key>25 || key<0) {
                System.out.println("Error:Enter a valid key");
            }  else{
                break;
            } 
        }
        String cipher = cc_Encryption(str, key);
        System.out.println("Encrypted text = "+cipher);
        System.out.println("Decrypted text = "+cc_decryption(cipher, key));

        
        
    }
}
