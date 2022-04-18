package com.example.koptudy.domain.company.domain

import com.example.koptudy.domain.user.domain.User
import com.example.koptudy.global.entity.BaseTimeIdEntity
import com.example.koptudy.infrastructure.s3.DefaultImage
import org.hibernate.annotations.ColumnDefault
import org.hibernate.validator.constraints.Length
import java.time.LocalDate
import javax.persistence.*
import javax.validation.constraints.NotNull

@Table(name = "`company`")
@Entity
class Company(

    name: String,

    profileImageUrl: String,

    phoneNumber: String,

    establishAt: LocalDate,

    address: String,

    registrationNumber: String,

    seal: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    var user: User

): BaseTimeIdEntity() {

    @NotNull
    @Length(max = 30)
    var name = name
        protected set

    @NotNull
    @ColumnDefault(DefaultImage.COMPANY_PROFILE_IMAGE)
    var profileImageUrl = profileImageUrl
        protected set

    @NotNull
    @Length(max = 11)
    var phoneNumber = phoneNumber
        protected set

    @NotNull
    var establishAt = establishAt
        protected set

    @NotNull
    @Length(max = 93)
    var address = address
        protected set

    @NotNull
    @Length(max = 20)
    var registrationNumber = registrationNumber
        protected set

    @NotNull
    var seal = seal
        protected set

}