package com.example.koptudy.domain.notification.domain

import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.EqualsAndHashCode
import lombok.NoArgsConstructor
import java.io.Serializable

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@EqualsAndHashCode
class NotificationListId (

    notificationEntity: Long,

    user: Long
): Serializable {

    var notificationEntity = notificationEntity
        protected set

    var user = user
        protected set

}