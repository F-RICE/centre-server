package com.hzdingmao.auth;

import com.hzdingmao.centre.security.annotation.EnableRyFeignClients;
import com.hzdingmao.centre.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 认证授权中心
 * 
 * @author dingmao
 */
@EnableRyFeignClients
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CentreAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CentreAuthApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ ______ _   _ _______ _____  ______\n" +
                " / ____|  ____| \\ | |__   __|  __ \\|  ____|\n" +
                "| |    | |__  |  \\| |  | |  | |__) | |__\n" +
                "| |    |  __| | . ` |  | |  |  _  /|  __|\n" +
                "| |____| |____| |\\  |  | |  | | \\ \\| |____\n" +
                " \\_____|______|_| \\_|  |_|  |_|  \\_\\______|\n");
    }
}
