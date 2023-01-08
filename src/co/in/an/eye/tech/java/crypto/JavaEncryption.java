package co.in.an.eye.tech.java.crypto;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

public class JavaEncryption {
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException {
        IvParameterSpec spec = getIvSecureRandom("AES");
        String key = "Nathes";
        SecretKeySpec keySpec = getKey(key);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, spec);
            byte[] sumeet = cipher.doFinal("Sumeet_M_Nathe".getBytes());
            System.out.println("Encrypted Value : " + new String(sumeet));

            Cipher cipher1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher1.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(spec.getIV()));

            byte[] originalVal = cipher1.doFinal(sumeet);
            System.out.println("Original Val : " + new String(originalVal));

        } catch (InvalidKeyException | InvalidAlgorithmParameterException | BadPaddingException |
                 IllegalBlockSizeException e) {
            throw new RuntimeException(e);
        }
    }


    private static IvParameterSpec getIvSecureRandom(String algorithm) throws NoSuchAlgorithmException, NoSuchPaddingException {
        SecureRandom random = SecureRandom.getInstanceStrong();
        byte[] iv = new byte[Cipher.getInstance(algorithm).getBlockSize()];
        random.nextBytes(iv);
        return new IvParameterSpec(iv);
    }

    private static SecretKeySpec getKey(String key) {
        int keyLength = 256;
        byte[] keyBytes = new byte[keyLength / 8];
        Arrays.fill(keyBytes, (byte) 0x0);
        byte[] passwordBytes = key.getBytes(StandardCharsets.UTF_8);
        int length = Math.min(passwordBytes.length, keyBytes.length);
        System.arraycopy(passwordBytes, 0, keyBytes, 0, length);
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        return keySpec;
    }
}
