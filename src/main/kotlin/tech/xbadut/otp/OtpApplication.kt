package tech.xbadut.otp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@SpringBootApplication
@EnableScheduling
class OtpApplication

fun main(args: Array<String>) {
	runApplication<OtpApplication>(*args)


}

@RestController
class HelloSpringBootController {
	@RequestMapping(value = ["/"])
	fun helloSpringBoot() = "Rizal ganteng"
}
