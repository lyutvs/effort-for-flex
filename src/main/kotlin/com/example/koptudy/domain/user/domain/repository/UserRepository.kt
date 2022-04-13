package com.example.koptudy.domain.user.domain.repository

import com.example.koptudy.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long> {
}