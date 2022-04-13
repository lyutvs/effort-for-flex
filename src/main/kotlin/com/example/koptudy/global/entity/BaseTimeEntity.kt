package com.example.koptudy.global.entity

import lombok.Getter
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass
import javax.validation.constraints.NotNull

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseTimeEntity {

    @CreatedDate
    @NotNull
    var createdAt: LocalDateTime = LocalDateTime.now()

}
