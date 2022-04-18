package com.example.koptudy.domain.holiday

import com.example.koptudy.domain.holiday.domain.Holiday
import org.hibernate.validator.constraints.Length
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull

class HolidayType(

    title: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "holiday_id")
    var holiday: Holiday

) {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

}