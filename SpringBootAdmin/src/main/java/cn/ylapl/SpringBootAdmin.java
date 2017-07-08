/**
 * Company
 * Copyright (C) 2004-2017 All Rights Reserved.
 */
package cn.ylapl;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * @author yangle
 * @version $Id SeleniumMontitoring.java, v 0.1 2017-01-21 下午5:18 yangle Exp $$
 */
@SpringBootApplication
@EnableScheduling
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableAdminServer
@EnableDiscoveryClient
public class SpringBootAdmin {

    public static void main(String arg[]) {

        SpringApplication.run(SpringBootAdmin.class, arg);
    }

//    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
//        KeyPairGenerator keygen = KeyPairGenerator.getInstance("RSA");
//        keygen.initialize(512);
//        KeyPair kp = keygen.generateKeyPair();
//        RSAPrivateKey privateKey = (RSAPrivateKey)kp.getPrivate();
//        RSAPublicKey publicKey = (RSAPublicKey)kp.getPublic();
//        System.out.println("KEY:\n" + bytesToHexString(publicKey.getEncoded()) + "\n");
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(Cipher.ENCRYPT_MODE,privateKey);
//        System.out.println("RESULT:\n" + bytesToHexString(cipher.doFinal("ilanyu".getBytes())) + "\n");
//    }
//
//    private static String bytesToHexString(byte[] src){
//        StringBuilder stringBuilder = new StringBuilder("");
//        if (src == null || src.length <= 0) {
//            return null;
//        }
//        for (byte aSrc : src) {
//            int v = aSrc & 0xFF;
//            String hv = Integer.toHexString(v);
//            if (hv.length() < 2) {
//                stringBuilder.append(0);
//            }
//            stringBuilder.append(hv);
//        }
//        return stringBuilder.toString();
//    }

}
