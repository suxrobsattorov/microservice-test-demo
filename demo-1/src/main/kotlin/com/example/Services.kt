package com.example

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

@FeignClient("demo2")
interface Demo2Service {

    @GetMapping
    fun hello(): String

    @PostMapping("/message/{id}")
    fun message(@PathVariable("id") id: Int): MessageDemo2Dto

}