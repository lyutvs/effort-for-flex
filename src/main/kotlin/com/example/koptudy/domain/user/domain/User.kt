package com.example.koptudy.domain.user.domain

import org.hibernate.annotations.NaturalId
import javax.persistence.*

@Entity
data class User (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @NaturalId
    val email: String,

    @Column(nullable = false)
    val name: String,

    @Column(nullable = false)
    val password: String
)
