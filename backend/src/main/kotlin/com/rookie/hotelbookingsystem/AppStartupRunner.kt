package com.rookie.hotelbookingsystem

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component

@Component
class AppStartupRunner : CommandLineRunner {

    @Autowired lateinit var applicationContext: ApplicationContext

    override fun run(vararg args: String) {
        val beanNames = applicationContext.beanDefinitionNames
        beanNames.sorted().forEach { println(it) }
    }
}
