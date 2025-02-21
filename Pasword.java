import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import java.util.Base64;
public class Pasword{

 

    // Function to encrypt a password
    public static String encrypt(String password) throws Exception {
        // decode the base64 encoded string
        byte[] decodedKey = Base64.getDecoder().decode("KumAvRCWZv+d/MVguXLUb2WuA3U2PNReRiedgArPAss=");
        // rebuild key using SecretKeySpec
        SecretKey key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES"); 
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedPassword = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedPassword);
    }

    // Function to decrypt a password
    public static String decrypt(String encryptedPassword ) throws Exception {
        // decode the base64 encoded string
        byte[] decodedKey = Base64.getDecoder().decode("KumAvRCWZv+d/MVguXLUb2WuA3U2PNReRiedgArPAss=");
        // rebuild key using SecretKeySpec
        SecretKey key = new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES"); 
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        byte[] decryptedPassword = cipher.doFinal(decodedBytes);
        return new String(decryptedPassword);
    }
}
