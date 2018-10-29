package com.nanobytes.crud.controller

import com.nanobytes.crud.models.Person
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

/**
 * Controller for person endpoints
 * @author Daniel Córdova A.
 */
@Controller("\${micronaut.server.context-path}/person")
class PersonController {

    @Post("/")
    fun postPerson(@Body person: Person) {

    }

    @Get("/")
    fun getAllPersons() {

    }

    @Get("/{id}")
    fun getPersonById(id: Int) {

    }
}