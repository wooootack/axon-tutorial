package org.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

import org.axonframework.axonserver.connector.AxonServerConnectionManager

@SpringBootApplication
@ConfigurationPropertiesScan
open class AxonTutorialApplication


fun main(args: Array<String>) {
    runApplication<AxonTutorialApplication>(*args)
}