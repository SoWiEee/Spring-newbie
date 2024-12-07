package org.example.springnewbie;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    public String name;
    public String email;
    public String passwd;     // MD5
    public User(String name, String email, String passwd) {
        this.name = name;
        this.email = email;
        this.passwd = passwd;
    }

    // getter & setter
    public String getEmail() { return email; }
    public String getName() { return name; }
    public String getPasswd() { return passwd; }

    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }

    public static String hashPasswd(String passwd) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(passwd.getBytes());
        byte[] digest = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
