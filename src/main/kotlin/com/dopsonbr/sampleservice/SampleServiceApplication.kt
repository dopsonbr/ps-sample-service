package com.dopsonbr.sampleservice

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@EnableAutoConfiguration
@SpringBootApplication
class SampleServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SampleServiceApplication::class.java, *args)
}

@RestController
class HelloRest {

    @RequestMapping(value = "/hello")
    fun hello(): String {
        return "hello power spring"
    }
}