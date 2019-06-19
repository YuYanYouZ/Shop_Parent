package com.qfedu.common.config;

import java.util.HashMap;
import java.util.Map;

public class ProjectConfig {
    /** 初始积分  新用户 */
    public static final int INITNEWSCORE = 50;
    /** 有效期 新增 */
    public static final int INITNEWSEXPIRE = 30;
    /** 有效期 签到 */
    public static final int NEWSEXPIRE = 365;

    /** 第一次签到送30积分 */
    public static final int NEWSCORE = 30;
    /** 购物车上限  商品个数  */
    public static final int CARTMAXGOODS = 200;

    //Redis信息
    public static final String REDISHOST="39.105.95.99";
    public static final int REDISPORT=6379;
    public static final String REDISPASS="813812060";

    //Redis常用的key的设置
    /** 记录手机号一分钟只能发一次 smspre:180515990152 key   */
    public static final String SMSPRELIMIT="smspre:";

    /** 记录手机号一天只能发20条 smsday:18515990152 */
    public static final String SMSPREDAY="smsday:";
    public static final String SMSCODE="smscode:";
    /** 记录令牌 有效期30分钟 */
    public static final String TOKENJWT="jwt:";
    /** 记录手机号对应的令牌 有效期30分钟     */
    public static final String TOKENPHONE="user:";
    /** uc：手机号 次数  10分钟  */
    public static final String USERLOGINCOUNT="uc:";
    /** 手机号 所有冻结的手机号   */
    public static final String USERSD="userfreeze:";
    /** 记录每天签到的uid   usign:phone   */
    public static final String SIGNKEY="usign:ljb";





    public static final String TOKENHEAD="usertoken";


    /** 短信配置 */
    public static final String SMSKEY="3893a20277fee704c72e2fa4dff7a3ce";
    public static final String SMSTEMPID="165755";

    /** 邮箱相关配置 */
    public static final String EMAIL="lx_teach@163.com";
    public static final String EMAILPASS="java168";
    public static final String EMAILHOST="smtp.163.com";

    public static Map<Integer,String> projects;
    static {
        projects=new HashMap<>();
        projects.put(10001,"邻家邦");

    }

    /** 激活地址 */
    public static final String ACTIVEURL="";
    /** 只用在激活码上的密文 */
    public static final String AESKEYACTIVECODE="Sr766D1d0ir+q61J2ho7rQ==";

    /** 密码加密 采用RSA */
    public static final String PASSRSAPUB="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAIPcObwNMNMsOpJB6XUt7/MyQ0croXAQ7pBxqnnY5yTmHf48Yz+0o9310xPTm3n6NvKB66QKAtsc18ULrkgznSkCAwEAAQ==";
    public static final String PASSRSAPRI="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAg9w5vA0w0yw6kkHpdS3v8zJDRyuhcBDukHGqedjnJOYd/jxjP7Sj3fXTE9Obefo28oHrpAoC2xzXxQuuSDOdKQIDAQABAkAl64xS7zwuTpbdfsUDpN1PhBHjAsIfd08UDQwolF8MthIuXtVc3epw7au+x1RUMcsY+Ve4O/6erU2XVw40uOCxAiEA0XsiqRf+BPFoqPje3TqdXfRuSj9hjRTYrKDTkRz7nvUCIQChJGYwmoADQCrQXpXIUavGXBQ+73Cprgj/PvEfFkk85QIhALHA9gFcTX1uR+wR+jLpeP1v22J/c8yeYtnhQoWBfXY9AiB8/jHyE3Wmj9hl5mhCiO84HuZpZus6As/hxV3dIjlO7QIgYEYa9iYf4c6xT/++OxrD9/aH+v3VSnyDccHSrms1/f8=";

    /** JWT的签名算法 */
    public static final String JWTSIGN="SHA256";
    /** 令牌有效期 */
    public static final int JWTTIME=30;
    public static final String JWTKEY="qfjava_ljb";


    /** 资源文件的前缀 */
    //public static final String JWTKEY="qfjava_ljb";


}
