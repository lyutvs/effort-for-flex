package com.example.koptudy.domain.notification.domain

import com.example.koptudy.domain.user.domain.User
import lombok.AccessLevel
import lombok.NoArgsConstructor
import javax.persistence.*
import javax.validation.constraints.NotNull

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(NotificationListId::class)
@Table(name = "`notification_list`")
@Entity
class NotificationList (

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User,

    @Id
    @ManyToOne
    @JoinColumn(name = "notification_id")
    val notificationEntity: NotificationEntity,

    isRead: Boolean

) {

    @NotNull
    var isRead = isRead
        protected set

}
