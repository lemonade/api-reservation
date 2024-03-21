package com.twa.flights.com.twa.flights.api.reservation

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.actuate.info.InfoEndpoint
import org.springframework.boot.actuate.info.MapInfoContributor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.yaml.snakeyaml.Yaml

@Configuration
open class InfoEndpointConfiguration {

    companion object {
        private val log: Logger =
            LoggerFactory.getLogger(InfoEndpointConfiguration::class.java)
    }

    @Bean
    open fun infoEndpoint(): InfoEndpoint {
        val map: Map<*, *> = Yaml().loadAs(
            this.javaClass.classLoader.getResourceAsStream("app-info.yml"),
            Map::class.java
        )
        return InfoEndpoint(listOf(MapInfoContributor(map as Map<String, Any>)))
    }
}