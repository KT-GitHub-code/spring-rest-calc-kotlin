package com.kt.restcalckotlin.service

import org.springframework.stereotype.Service

@Service
class CalcService {

    fun add(a: Int, b: Int): Int {
        return a+b
    }

    fun subtract(a: Int, b: Int): Int {
        return a-b
    }

    fun multiply(a: Int, b: Int): Int {
        return a*b
    }

    fun divide(a: Int, b: Int): Double {
        return (a.toDouble() / b.toDouble())
    }

}