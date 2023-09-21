package kf.monster.depot.notification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@ConditionalOnBean(WhatsAppNotificationService.class)
public class SmsNotificationService implements NotificationService
{

    @Override
    public void sendNotification(String message, UUID consumerId)
    {
        log.info("Sending sms notification to consumer " + consumerId + " :" + message);
    }
}
