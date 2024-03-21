package com.twa.flights.com.twa.flights.api.reservation

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/")
@RestController
class ReservationController {

    @PostMapping
    fun create(@RequestBody req: ReservationCreateReq): ResponseEntity<Any> {
        if (req.itineraryID.isEmpty()) {
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }
        return ResponseEntity(null, HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Reservation {
        return Reservation(id, emptyList(), Contact("", ""), "")
    }
}