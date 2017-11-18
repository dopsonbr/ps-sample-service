package com.dopsonbr.sampleservice

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication

@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@EnableAutoConfiguration
@SpringBootApplication
class SampleServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(SampleServiceApplication::class.java, *args)
}
