package com.twa.flights.com.twa.flights.api.reservation

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class ReservationService {
    companion object {
        private val log: Logger = LoggerFactory.getLogger(ReservationService::class.java)
    }

    fun saveReservation(req: ReservationCreateReq): Reservation? {
        log.info("(saveReservation) req: ${req}")
        return null
    }

    fun getReservationById(id : String): Reservation? {
        log.info("(getReservationById) id: ${id}")
        return null
    }
}