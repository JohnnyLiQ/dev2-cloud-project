package mel.mjj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liq
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@MapperScan(basePackages = "mel.mjj.*.mapper")
public class MjjServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MjjServiceApplication.class, args);
    }
}
