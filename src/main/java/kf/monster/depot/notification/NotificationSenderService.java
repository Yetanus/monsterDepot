package kf.monster.depot.notification;

import org.springframework.stereotype.Service;

@Service
public class NotificationSenderService
{
    private final NotificationService notificationService;

    public NotificationSenderService(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }
}
