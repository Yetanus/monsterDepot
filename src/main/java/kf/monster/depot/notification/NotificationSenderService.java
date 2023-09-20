package kf.monster.depot.notification;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class NotificationSenderService
{
    private final List<NotificationService> notificationServices;

    public NotificationSenderService(List<NotificationService> notificationServices)
    {
        this.notificationServices = notificationServices;
    }

    public void sendNotification(String message, UUID customerId)
    {
        notificationServices.forEach(notificationService -> notificationService.sendNotification(message, customerId));
    }
}
