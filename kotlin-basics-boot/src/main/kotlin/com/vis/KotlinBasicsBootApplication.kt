package com.vis

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication// annotation processing is shut down as there are no kapt execution in pom
open class KotlinBasicsBootApplication{
	companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(KotlinBasicsBootApplication::class.java, *args)
        }
    }
}


