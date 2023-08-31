package com.hzdingmao.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hzdingmao.centre.security.annotation.EnableCustomConfig;
import com.hzdingmao.centre.security.annotation.EnableRyFeignClients;
import com.hzdingmao.centre.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author dingmao
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class CentreSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CentreSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ ______ _   _ _______ _____  ______\n" +
                " / ____|  ____| \\ | |__   __|  __ \\|  ____|\n" +
                "| |    | |__  |  \\| |  | |  | |__) | |__\n" +
                "| |    |  __| | . ` |  | |  |  _  /|  __|\n" +
                "| |____| |____| |\\  |  | |  | | \\ \\| |____\n" +
                " \\_____|______|_| \\_|  |_|  |_|  \\_\\______|\n");
    }
}
