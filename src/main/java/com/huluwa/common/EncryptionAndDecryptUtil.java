package com.huluwa.common;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @Author wuwenjie
 * @Date 2019/7/28 17:37
 * @Version 1.0
 **/
public class EncryptionAndDecryptUtil {

    /**
     * 加密
     *
     * @param str 明文
     * @return 密文
     */
    public static String Encryption(String str) {
        // 加密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("password");
        String newPassword = textEncryptor.encrypt(str);
        return newPassword;
    }

    /**
     * 解密
     *
     * @param str 密文
     * @return 明文
     */
    public static String Decrypt(String str) {
        // 解密
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword("password");
        String oldPassword = textEncryptor.decrypt(str);
        return oldPassword;
    }

}
