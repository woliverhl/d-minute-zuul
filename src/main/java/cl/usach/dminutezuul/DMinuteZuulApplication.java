package cl.usach.dminutezuul;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableDiscoveryClient
@Controller
@EnableZuulProxy
public class DMinuteZuulApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DMinuteZuulApplication.class).web(true).run(args); 
	}
}
