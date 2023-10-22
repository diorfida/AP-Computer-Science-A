
/**
 * Caesar Shift Tester class.
 *
 * @author Domenic Iorfida
 * @version 3/5/21
 */
import java.util.Scanner;
public class CaesarTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Caesar Shift Cipher Program\n");
        System.out.println("Alphabet Shift Cipher");
        
        askForShiftKey(in);
        
        System.out.println("\nEncrypted Alphabet with Key: (" + Encryption.key + ")");
        System.out.println(Encryption.cipherAlphabet());
        
        boolean quit = false;
        while(!quit){
            System.out.print("\nSelect 1 for encryption, 2 for decryption, or 3 to \nquit: ");
            int sel = in.nextInt();
            
            if(sel == 1){
                // encryption
                System.out.print("\nEnter a plaintext message to encrypt: ");
                String message = in.next();
                
                askForShiftKey(in);
                
                System.out.println("Encrypted Message:");
                System.out.println(Encryption.encrypt(message));
            }
            else if(sel == 2){
                // decryption
                System.out.print("\nEnter a plaintext message to decrypt: ");
                String message = in.next();
                
                askForShiftKey(in);
                
                System.out.println("Decrypted Message:");
                System.out.println(Decryption.decrypt(message));
            }
            else if(sel == 3)
                quit = true;
            else
                selectionBoundsError();
        }
        System.out.println("Program will now terminate.");
    }
    
    private static int askForShiftKey(Scanner in)
    {
        boolean keyIn = false;
        int key = 0;
        while(!keyIn){
            System.out.print("Please enter a shift key (0 - 25): ");
            key = in.nextInt();
            
            if(key >= 0 && key <= 25){
                Encryption.key = key;
                keyIn = true;
            }
            else
                selectionBoundsError();
        }
        return key;
    }
    
    private static void selectionBoundsError()
    {
        System.out.println("\nSelection not within bounds. Please try again.\n");
    }
}
