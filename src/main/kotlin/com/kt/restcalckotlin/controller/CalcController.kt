package com.kt.restcalckotlin.controller

import com.kt.restcalckotlin.service.CalcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CalcController(
    @Autowired
    val calcService: CalcService
) {

    @GetMapping
    fun index(): String{
        return "Welcome to the calculator app! To do calculations POST an array of two numbers to the following routes: /add, /subtract, /multiply, /divide."
    }

    @PostMapping("/add")
    fun add(@RequestBody nums: Array<Int>): Int {
        return calcService.add(nums[0], nums[1])
    }

    @PostMapping("/subtract")
    fun subtract(@RequestBody nums: Array<Int>): Int {
        return calcService.subtract(nums[0], nums[1])
    }

    @PostMapping("/multiply")
    fun multiply(@RequestBody nums: Array<Int>): Int {
        return calcService.multiply(nums[0], nums[1])
    }

    @PostMapping("/divide")
    fun divide(@RequestBody nums: Array<Int>): Double {
        return calcService.divide(nums[0], nums[1])
    }

}