package com.leqtr.todolistdemo2.repository;

import com.leqtr.todolistdemo2.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

    @Query("SELECT n FROM Notification n WHERE n.userNoti.id = :userId ORDER BY n.createdOn DESC")
    List<Notification> getNotificationsById(long userId);

}
