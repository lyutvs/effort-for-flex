package com.example.koptudy.domain.holiday.domain

import com.example.koptudy.domain.holiday.domain.type.Substitute
import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Length
import java.time.LocalDate
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.validation.constraints.NotNull

class Holiday(

    title: String,

    startDateAt: LocalDate,

    endDateAt: LocalDate,

    substitute: Substitute,

    isReturn: Boolean
) {

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