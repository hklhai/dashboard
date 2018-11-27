package com.hxqh.dashboard.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by Ocean lin on 2018/11/27.
 * AES加密算法
 * 加密用的Key 可以用26个字母和数字组成，最好不要用保留字符，虽然不会错，至于怎么裁决，个人看情况而定
 * 此处使用AES-128-CBC加密模式，key需要为16位。
 *
 * @author Ocean lin
 */
public class AesUtils {
    /**
     * Logger for this class
     */
    private static final Logger logger = Logger.getLogger(AesUtils.class);

    public static final String IV = "0807060504030201";

    private static final String KEY = "abcdefghijkmlnhh";

    /**
     * 加密
     *
     * @param sSrc
     * @return
     * @throws Exception
     */
    public static String Encrypt(String sSrc ) throws Exception {
        byte[] raw = KEY.getBytes();

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        //"算法/模式/补码方式"
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        //使用CBC模式，需要一个向量iv，可增加加密算法的强度
        IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes());
        //此处使用BAES64做转码功能，同时能起到2次
        return Base64.encodeBase64String(encrypted);
    }


    /**
     * 解密
     *
     * @param sSrc
     * @return
     * @throws Exception
     */
    public static String Decrypt(String sSrc) throws Exception {
        byte[] raw = KEY.getBytes("ASCII");

        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(IV.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        //先用bAES64解密
        byte[] encrypted1 = Base64.decodeBase64(sSrc);
        try {
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original);
            return originalString;
        } catch (Exception e) {
            logger.info(e.toString());
            return null;
        }
    }

}
