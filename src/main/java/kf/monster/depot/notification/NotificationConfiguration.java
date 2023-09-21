package kf.monster.depot.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificationConfiguration
{
    @Bean
    public NotificationController notificationController()
    {
        return new NotificationController();
    }

    @Bean
    public NotificationRepository notificationRepository()
    {
        return new NotificationRepository();
    }
}
