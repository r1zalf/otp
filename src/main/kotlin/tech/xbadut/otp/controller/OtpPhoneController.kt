package tech.xbadut.otp.controller

import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message
import com.twilio.rest.api.v2010.account.MessageCreator
import com.twilio.type.PhoneNumber
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import tech.xbadut.otp.model.OtpPhoneResponse
import tech.xbadut.otp.service.OtpPhoneService


@RestController
class OtpPhoneController(
    val otpPhoneService: OtpPhoneService
) {

    @GetMapping(
        value = ["api/otp/{phone}"]
    )
    fun requestOtp(@PathVariable("phone") phone: String): OtpPhoneResponse {
        return otpPhoneService.requestCodeOtp(phone)
    }

    @GetMapping(
        value = ["api/otp/{phone}/{code}"]
    )
    fun validateOtp(
        @PathVariable("phone") phone: String,
        @PathVariable("code") code: Int,
    ): OtpPhoneResponse {
        return otpPhoneService.validationCodeOtp(phone, code)
    }


    @GetMapping(
        value = ["api/sms/{phone}/{sms}"]
    )
    fun reqSMS(
        @PathVariable("phone") phone: String,
        @PathVariable("sms") sms: String,
    ): Message {
        Twilio.init(
            "ACeb2d933f9ffdff4f4c790b27a84e7768",
            "4e52f9aa115520ee9c3903fa74e0a752",
        )

        return MessageCreator(
            PhoneNumber("+$phone"),
            PhoneNumber("+19293252759"),
            sms
        ).create()
    }
}