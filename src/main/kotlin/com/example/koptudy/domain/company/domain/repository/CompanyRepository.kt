package com.example.koptudy.domain.company.domain.repository

import com.example.koptudy.domain.company.domain.Company
import org.springframework.data.jpa.repository.JpaRepository

interface CompanyRepository: JpaRepository<Company, Long> {
}