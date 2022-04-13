package com.example.koptudy.global.entity

import lombok.Getter
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.MappedSuperclass

@Getter
@MappedSuperclass
abstract class BaseTimeIdEntity: BaseTimeEntity() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null

}
