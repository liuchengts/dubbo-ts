package dubbo.test.provider;

import dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboTestProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboTestProviderApplication.class, args);
	}
}
