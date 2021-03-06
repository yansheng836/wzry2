package xyz.yansheng.wzry2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 爬取王者荣耀英雄皮肤壁纸。
 *
 * @author yansheng
 * @date 2020/09/24
 */
@SpringBootApplication
@MapperScan("xyz.yansheng.wzry2.dao")
public class Wzry2Application {

    public static void main(String[] args) {
        SpringApplication.run(Wzry2Application.class, args);
    }

}
