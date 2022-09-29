package com.kt.restcalckotlin.repository

import com.kt.restcalckotlin.model.Calculation
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CalculationRepository : CrudRepository<Calculation, Long> {
}