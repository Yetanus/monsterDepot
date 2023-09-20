package kf.monster.depot.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class MessengerNotificationService implements NotificationService
{

    @Override
    public void sendNotification(String message, UUID consumerId)
    {
        log.info("Sending messenger notification to consumer " + consumerId + " :" + message);
    }
}
