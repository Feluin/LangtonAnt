package langton.cryptstrategys;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1Strategy implements ICryptStrategy {
    @Override
    public String encrypt(String password) {
        try {

            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            sha1.update(password.getBytes());
            return CryptUtils.bytesToHex(sha1.digest());
        }
        catch(NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
