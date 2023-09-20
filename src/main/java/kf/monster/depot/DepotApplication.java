package kf.monster.depot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class DepotApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepotApplication.class, args);
	}

	//Method will print in logs all registered beans
	@EventListener
	public void onApplicationEvent(ApplicationReadyEvent event)
	{
		String[] allBeanNames = event.getApplicationContext().getBeanDefinitionNames();
		for (String beanName: allBeanNames)
		{
			log.info(beanName);
		}
	}

}
