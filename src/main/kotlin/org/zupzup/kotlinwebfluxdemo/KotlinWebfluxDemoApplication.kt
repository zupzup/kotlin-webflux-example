package org.zupzup.kotlinwebfluxdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.WebApplicationType
import org.springframework.boot.SpringApplication



@SpringBootApplication
class KotlinWebfluxDemoApplication

fun main(args: Array<String>) {
    val app = SpringApplication(KotlinWebfluxDemoApplication::class.java)
    app.webApplicationType = WebApplicationType.REACTIVE
    app.run(*args)
}
