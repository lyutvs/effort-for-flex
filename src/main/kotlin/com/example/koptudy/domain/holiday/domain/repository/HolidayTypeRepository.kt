package com.example.koptudy.domain.holiday.domain.repository

import com.example.koptudy.domain.holiday.domain.HolidayType
import org.springframework.data.jpa.repository.JpaRepository

interface HolidayTypeRepository: JpaRepository<HolidayType, Long> {
}