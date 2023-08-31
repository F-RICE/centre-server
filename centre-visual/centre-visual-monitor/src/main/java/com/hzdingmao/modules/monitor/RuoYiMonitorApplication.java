package com.hzdingmao.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author dingmao
 */
@EnableAdminServer
@SpringBootApplication
public class RuoYiMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(RuoYiMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  _____ ______ _   _ _______ _____  ______\n" +
                " / ____|  ____| \\ | |__   __|  __ \\|  ____|\n" +
                "| |    | |__  |  \\| |  | |  | |__) | |__\n" +
                "| |    |  __| | . ` |  | |  |  _  /|  __|\n" +
                "| |____| |____| |\\  |  | |  | | \\ \\| |____\n" +
                " \\_____|______|_| \\_|  |_|  |_|  \\_\\______|\n");
    }
}
