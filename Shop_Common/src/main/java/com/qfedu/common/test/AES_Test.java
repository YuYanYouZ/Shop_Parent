package com.qfedu.common.test;

import com.qfedu.common.util.EncryptionUtil;

import java.util.Map;

public class AES_Test {
    public static void main(String[] args) {
        Map<String, String> map = EncryptionUtil.createRSAKey();
        String pass="123456";
        System.out.println(map);

        String mw=EncryptionUtil.RSAEnc(map.get(EncryptionUtil.PRIVATEKEY), pass);
        System.out.println("密文："+mw);
        System.out.println("明文："+EncryptionUtil.RSADec(map.get(EncryptionUtil.PUBLICKEY), mw));

    }


}
