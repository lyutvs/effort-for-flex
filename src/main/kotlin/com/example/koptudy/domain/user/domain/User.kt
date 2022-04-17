package com.example.koptudy.domain.user.domain

import com.example.koptudy.domain.user.domain.type.Authority
import com.example.koptudy.domain.user.domain.type.Sex
import com.example.koptudy.global.entity.BaseTimeIdEntity
import com.example.koptudy.infrastructure.s3.DefaultImage
import org.hibernate.annotations.ColumnDefault
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.NaturalId
import org.hibernate.validator.constraints.Length
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Table
import javax.validation.constraints.NotNull

@Table(name = "`user`")
@DynamicInsert
@Entity
class User (

    email: String,

    accountId: String,

    name: String,

    password: String,

    profileImageUrl: String,

    profileBackGroundColor: String,

    sex: Sex,

    birthday: Long,

    introduce: String,

    authority: Authority,

    appDeviceToken: String,

    webDeviceToken: String

): BaseTimeIdEntity() {

    @NotNull
    @NaturalId
    @Length(max = 64)
    var email = email
        protected set

    @NotNull
    @Length(max = 13)
    var name = name
        protected set

    @NotNull
    @Length(max = 64)
    var password = password
        protected set

    @NotNull
    @Length(max = 50)
    var accountId = accountId
        protected set

    @NotNull
    @ColumnDefault(DefaultImage.USER_PROFILE_IMAGE)
    var profileImageUrl = profileImageUrl
        protected set

    @NotNull
    @Enumerated(EnumType.STRING)
    var sex = sex
        protected set

    @NotNull
    @Length(max = 8)
    var birthday = birthday
        protected set

    @NotNull
    @Length(max = 8)
    var introduce = introduce
        protected set

    @NotNull
    @Length(max = 7)
    var profileBackGroundColor = profileBackGroundColor
        protected set

    @NotNull
    @Enumerated(EnumType.STRING)
    var authority = authority
        protected set

    @Length(max = 64)
    var appDeviceToken = appDeviceToken
        protected set

    @Length(max = 64)
    var webDeviceToken = webDeviceToken
        protected set

}
