package com.kt.restcalckotlin.service

import com.kt.restcalckotlin.model.Calculation
import com.kt.restcalckotlin.model.Operation
import com.kt.restcalckotlin.repository.CalculationRepository
import org.springframework.stereotype.Service

@Service
class CalcService(var calculationRepository: CalculationRepository) {

    fun add(a: Int, b: Int): Int {
        val calculation = Calculation()
        calculation.a = a
        calculation.b = b
        calculation.operation = Operation.ADD
        val result = a+b
        calculation.result = result.toDouble()

        saveCalculation(calculation)

        return result
    }

    fun subtract(a: Int, b: Int): Int {
        val calculation = Calculation()
        calculation.a = a
        calculation.b = b
        calculation.operation = Operation.SUBTRACT
        val result = a-b
        calculation.result = result.toDouble()

        saveCalculation(calculation)

        return result
    }

    fun multiply(a: Int, b: Int): Int {
        val calculation = Calculation()
        calculation.a = a
        calculation.b = b
        calculation.operation = Operation.MULTIPLY
        val result = a*b
        calculation.result = result.toDouble()

        saveCalculation(calculation)

        return result
    }

    fun divide(a: Int, b: Int): Double {
        val calculation = Calculation()
        calculation.a = a
        calculation.b = b
        calculation.operation = Operation.DIVIDE
        val result = (a.toDouble() / b.toDouble())
        calculation.result = result

        saveCalculation(calculation)

        return result
    }

    fun saveCalculation(calculation: Calculation): Calculation {
        return calculationRepository.save(calculation)
    }

    fun getCalculationsList(): List<Calculation>? {
        val calculations: List<Calculation> = calculationRepository.findAll() as List<Calculation>
        return calculations
    }

}