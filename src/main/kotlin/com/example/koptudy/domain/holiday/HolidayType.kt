package com.example.koptudy.domain.holiday

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.NotNull

class HolidayType(

    title: String

) {

    @NotNull
    @Length(max = 20)
    var title = title
        protected set

}