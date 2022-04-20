package com.example.koptudy.domain.holiday.domain

import com.example.koptudy.domain.holiday.domain.type.Substitute
import com.example.koptudy.global.entity.BaseTimeIdEntity
import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Length
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Table(name = "`holiday`")
@Entity
class Holiday(

    title: String,

    startDateAt: LocalDate,

    endDateAt: LocalDate,

    substitute: Substitute,

    isReturn: Boolean
): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

    @NotNull
    var startDateAt = startDateAt
        protected set

    @NotNull
    var endDateAt = endDateAt
        private set

    @NotNull
    @ColumnDefault("NONE")
    @Enumerated(EnumType.STRING)
    var substitute = substitute
        protected set

    @NotNull
    @ColumnDefault("0")
    var isReturn = isReturn
        protected set

}