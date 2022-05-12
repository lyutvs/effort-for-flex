package com.example.koptudy.domain.holiday.domain

import com.example.koptudy.global.entity.BaseIdEntity
import javax.persistence.EmbeddedId
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "`holiday_list`")
@Entity
class HolidayList(

    holidayListId: HolidayListId

) {

    @EmbeddedId
    var holidayListId = holidayListId
        protected set

}