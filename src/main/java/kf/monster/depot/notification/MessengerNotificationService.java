package kf.monster.depot.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Profile("!stage")
public class MessengerNotificationService implements NotificationService
{

    @Override
    public void sendNotification(String message, UUID consumerId)
    {
        log.info("Sending messenger notification to consumer " + consumerId + " :" + message);
    }
}
