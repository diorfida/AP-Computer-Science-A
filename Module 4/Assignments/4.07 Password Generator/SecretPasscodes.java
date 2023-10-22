
/**
 * Program that generates a password based on user input.
 *
 * @author Domenic Iorfida
 * @version 10/26/20
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Random;
public class SecretPasscodes
{
    public static void main() throws IOException{
        Scanner in = new Scanner(System.in);
        File fileName = new File("passwords.txt");
        PrintWriter outFile = new PrintWriter(fileName);
        Scanner inFile = new Scanner(fileName);
        Random randNum = new Random();
        
        int userChoice = 0;
        int passwordLength = 0;
        String password = "";
        double randomVal = 0;
        
        System.out.println("Password Generator");
        System.out.println("===============================================================");
        System.out.println("  [1] Only Lowercase Letters");
        System.out.println("  [2] Lowercase Letters and Numbers");
        System.out.println("  [3] Lowercase Letters, Uppercase Letters, and Numbers");
        System.out.println("  [4] Symbols, Lowercase Letters, Uppercase Letters, and Numbers");
        System.out.println("  [5] Quit");
        System.out.println("===============================================================");
        
        while(userChoice != 5) { // initial stuff
            System.out.print("Enter Selection (1-5): ");
            userChoice = in.nextInt();
            if(userChoice < 1 || userChoice > 5){ // determine if the input is in bounds
                System.out.println("  Invalid option. Please try again.");
            }else if(userChoice != 5){ // inputs 1 - 4
                while(passwordLength < 6){ // get the password
                    System.out.print("Password Length (6 or more): ");
                    passwordLength = in.nextInt();
                    if(passwordLength < 6){ // determine in bounds
                        System.out.println("  Password Length too short. Please try again.");
                    }else{ // generate password
                        for(int counter = 0; counter < passwordLength; counter++){ // generator loop
                            if(userChoice == 1){
                                int temp = randNum.nextInt(26) + 97;
                                password = password + (char)temp;
                            }else if(userChoice == 2){
                                int temp1 = randNum.nextInt(10) + 48;
                                int temp2 = randNum.nextInt(26) + 97;
                                if(randNum.nextInt(2) == 0){
                                    password = password + (char)temp1;
                                }else{
                                    password = password + (char)temp2;
                                }
                            }else if(userChoice == 3){
                                int temp1 = randNum.nextInt(10) + 48;
                                int temp2 = randNum.nextInt(26) + 97;
                                int temp3 = randNum.nextInt(26) + 65;
                                int determine = randNum.nextInt(3);
                                if(determine == 0){
                                    password = password + (char)temp1;
                                }else if(determine == 1){
                                    password = password + (char)temp2;
                                }else{
                                    password = password + (char)temp3;
                                }
                            }else{
                                int temp = randNum.nextInt(93) + 33;
                                password = password + (char)temp;
                            }
                        }
                        outFile.println(password);
                        password = "";
                    }
                }
                passwordLength = 0;
            }
            System.out.println();
        }
        outFile.close();
        
        System.out.println("\nThank you for using the Pass Code Generator.\n");
        System.out.println("Here are your randomly generated codes:");
        
        for(int counter = 1; inFile.hasNextLine(); counter ++){
            String token = inFile.nextLine();
            System.out.println("  " + counter + "\t" + token);
        }
    }
}
