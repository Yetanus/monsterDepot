package kf.monster.depot.notification;

import java.util.UUID;

public interface NotificationService {

    void sendNotification(String message, UUID consumerId);
}
