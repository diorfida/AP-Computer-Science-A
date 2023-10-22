
/**
 * Encryption class.
 *
 * @author Domenic Iorfida
 * @version 3/5/21
 */
public class Encryption
{
    private static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static int key = 0;
    
    public static String cipherAlphabet()
    {
        String returnString = "";
        for(int i = 0; i < alphabet.length(); i ++)
        {
            int temp = i + key;
            if(temp >= 0 && temp < 26){
                returnString += alphabet.substring(temp, temp + 1);
            }
            else if(temp >= 26){
                temp -= 26;
                returnString += alphabet.substring(temp, temp + 1);
            }
        }
        return returnString;
    }
    
    public static String encrypt(String message)
    {
        message = message.trim();
        String enc = "";
        for(int i = 0; i < message.length(); i ++)
        {
            int shift = i + key;
            if(shift >= 0 && shift < message.length()){
                enc += message.substring(shift, shift + 1);
            }
            else if(shift >= message.length()){
                while(shift >= message.length())
                    shift -= message.length();
                enc += message.substring(shift, shift + 1);
            }
        }
        return enc;
    }
}
