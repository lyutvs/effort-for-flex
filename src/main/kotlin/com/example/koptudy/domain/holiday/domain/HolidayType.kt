package com.example.koptudy.domain.holiday.domain

import com.example.koptudy.domain.company.domain.Company
import com.example.koptudy.global.entity.BaseTimeIdEntity
import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "`holiday_type`")
@Entity
class HolidayType(

    title: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    var company: Company

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

}