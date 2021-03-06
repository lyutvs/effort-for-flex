package com.example.koptudy.domain.holiday.domain

import java.io.Serializable
import javax.persistence.*

@Embeddable
class HolidayListId(

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "holiday_id")
    var holiday: Holiday,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "holiday_type_id")
    var holidayType: HolidayType

): Serializable