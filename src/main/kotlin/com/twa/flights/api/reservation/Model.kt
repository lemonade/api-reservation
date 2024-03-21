package com.twa.flights.com.twa.flights.api.reservation

import kotlinx.serialization.*

@Serializable
data class ReservationCreateReq (
    val passengers: List<Passenger>,
    val contact: Contact,

    @SerialName("itineraryId")
    val itineraryID: String
)

@Serializable
data class Reservation (
    val id: Long,
    val passengers: List<Passenger>,
    val contact: Contact,

    @SerialName("itineraryId")
    val itineraryID: String
)

@Serializable
data class Contact (
    val telephone: String,
    val email: String
)

@Serializable
data class Passenger (
    val type: PassengerType,
    val gender: Gender,
    val birth: String,
    val nationality: String,
    val firstName: String,
    val lastName: String,
    val document: Document
)

@Serializable
data class Document (
    val number: String,
    val type: DocumentType,
    val expiration: String
)

enum class PassengerType {
    ADULT,
}

enum class Gender {
    MALE, FEMALE
}

enum class DocumentType {
    PASSPORT
}