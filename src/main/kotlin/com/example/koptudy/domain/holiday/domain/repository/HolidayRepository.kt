package com.example.koptudy.domain.holiday.domain.repository

import com.example.koptudy.domain.holiday.domain.Holiday
import org.springframework.data.jpa.repository.JpaRepository

interface HolidayRepository: JpaRepository<Holiday,Long> {
}