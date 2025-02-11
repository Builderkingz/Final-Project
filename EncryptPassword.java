import java.util.Base64;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class EncryptPassword {

    private static final String ENCRYPTION_KEY = "0123456789abcdef"; // 16-byte key for AES

    public static void main(String[] args) {
        try {
            // Define the password to encrypt
            String password = "Tonyisstupid";

            // Encrypt the password
            String encryptedPassword = encryptPassword(password);

            // Display the encrypted password
            System.out.println("Encrypted password (Base64 encoded): " + encryptedPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // AES Encryption
    public static String encryptPassword(String password) throws Exception {

        // Create a Cipher instance for AES encryption
        Cipher cipher = Cipher.getInstance("AES");

        // Create a secret key from the predefined key
        SecretKeySpec key = new SecretKeySpec(ENCRYPTION_KEY.getBytes(), "AES");

        // Initialize the cipher in encryption mode with the key
        cipher.init(Cipher.ENCRYPT_MODE, key);

        // Encrypt the password
        byte[] encryptedBytes = cipher.doFinal(password.getBytes());

        // Encode the encrypted bytes using Base64 and return the result
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }
}
