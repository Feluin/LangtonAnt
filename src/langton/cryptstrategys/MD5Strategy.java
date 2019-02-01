package langton.cryptstrategys;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Strategy implements ICryptStrategy{
    @Override
    public String encrypt(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            return CryptUtils.bytesToHex(md.digest());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
