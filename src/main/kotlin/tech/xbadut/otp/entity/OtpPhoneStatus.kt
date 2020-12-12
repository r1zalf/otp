package tech.xbadut.otp.entity

import javax.persistence.*


@Entity
@Table(name="otpphonestatus")
data class OtpPhoneStatus(
    @Id
    val id: Long? = null,

    @Column(name = "name")
    val name: String? = null,
)