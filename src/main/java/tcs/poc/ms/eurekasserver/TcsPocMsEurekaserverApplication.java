package tcs.poc.ms.eurekasserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class TcsPocMsEurekaserverApplication {
	 
	public static void main(String[] args) {
		SpringApplication.run(TcsPocMsEurekaserverApplication.class, args);
	}
	
}
