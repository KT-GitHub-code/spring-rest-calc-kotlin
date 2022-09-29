package com.kt.restcalckotlin

import com.kt.restcalckotlin.model.Calculation
import com.kt.restcalckotlin.repository.CalculationRepository
import com.kt.restcalckotlin.service.CalcService
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalcServiceTest {

    val calculationRepository: CalculationRepository  = mockk()
    // val calculationRepository  = mockk<CalculationRepository>()

    val calcServiceTest = CalcService(calculationRepository)

    @Test
    fun whenGetCalculationsList_thenReturnCalculationsList(){

        val expected = List<Calculation>(1){ Calculation() }
        every { calculationRepository.findAll() } returns expected

        val list = calcServiceTest.getCalculationsList()

        assertEquals(expected, list)
    }

}