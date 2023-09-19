package kf.monster.depot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Arrays;

@SpringBootApplication
public class DepotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepotApplication.class, args);
	}

	//Method will print in logs all registered beans
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event)
	{
		Arrays.stream(event.getApplicationContext().getBeanDefinitionNames()).forEach(System.out::println);
	}

}
