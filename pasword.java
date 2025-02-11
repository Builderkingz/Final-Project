import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;
public class pasword{

    // Function to generate a random AES key
    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // 128-bit AES key
        return keyGenerator.generateKey();
    }

    // Function to encrypt a password
    public static String encrypt(String password, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedPassword = cipher.doFinal(password.getBytes());
        return Base64.getEncoder().encodeToString(encryptedPassword);
    }

    // Function to decrypt a password
    public static String decrypt(String encryptedPassword, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedPassword);
        byte[] decryptedPassword = cipher.doFinal(decodedBytes);
        return new String(decryptedPassword);
    }

    public static void main(String[] args) {
        try {
            // Generate a key
            SecretKey key = generateKey();

            // Original password
            String password = "my";

            // Encrypt the password
            String encryptedPassword = encrypt(password, key);
            System.out.println("Encrypted password: " + encryptedPassword);

            // Decrypt the password
            String decryptedPassword = decrypt(encryptedPassword, key);
            System.out.println("Decrypted password: " + decryptedPassword);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
