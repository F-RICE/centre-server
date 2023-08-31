package com.hzdingmao.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author dingmao
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CentreGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CentreGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ ______ _   _ _______ _____  ______\n" +
                " / ____|  ____| \\ | |__   __|  __ \\|  ____|\n" +
                "| |    | |__  |  \\| |  | |  | |__) | |__\n" +
                "| |    |  __| | . ` |  | |  |  _  /|  __|\n" +
                "| |____| |____| |\\  |  | |  | | \\ \\| |____\n" +
                " \\_____|______|_| \\_|  |_|  |_|  \\_\\______|\n");
    }
}
