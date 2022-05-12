package com.example.koptudy.domain.holiday.domain.repository

import com.example.koptudy.domain.holiday.domain.HolidayList
import com.example.koptudy.domain.holiday.domain.HolidayListId
import org.springframework.data.jpa.repository.JpaRepository

interface HolidayListRepository: JpaRepository<HolidayList, HolidayListId> {
}