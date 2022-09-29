package com.kt.restcalckotlin.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Calculation {

    @Id
    @GeneratedValue
    var id: Long? = null

    var a: Int = 0
    var b: Int = 0
    var operation: Operation? = null
    var result: Double = 0.0
}
