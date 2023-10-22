
/**
 * Decryption class.
 *
 * @author Domenic Iorfida
 * @version 3/8/21
 */
public class Decryption
{
    private static int key = Encryption.key;
    
    public static String decrypt(String message)
    {
        message = message.trim();
        String dec = "";
        for(int i = 0; i < message.length(); i ++)
        {
            int shift = i - key;
            if(shift >= 0 && shift < message.length()){
                dec += message.substring(shift, shift + 1);
            }
            else if(shift < 0){
                while(shift < 0)
                    shift += message.length();
                dec += message.substring(shift, shift + 1);
            }
        }
        return dec;
    }
}
