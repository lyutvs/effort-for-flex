package com.example.koptudy.domain.notification.domain

import com.example.koptudy.domain.notification.domain.type.NotificationScope
import com.example.koptudy.domain.notification.domain.type.Topic
import com.example.koptudy.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Table(name = "`notificatoin`")
@Entity
class NotificationEntity (

    title: String,

    content: String,

    topic: Topic,

    notificationScope: NotificationScope,

    data: Long

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    @Length(max = 30)
    var content = content
        protected set

    @NotNull
    var topic = topic
        protected set

    @NotNull
    var notificationScope = notificationScope
        protected set

    @NotNull
    var data = data
        protected set
}