package kf.monster.depot.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Profile("dev")
public class EmailNotificationService implements NotificationService
{

    @Override
    public void sendNotification(String message, UUID consumerId)
    {
        log.info("Sending email notification to consumer " + consumerId + " :" + message);
    }
}
