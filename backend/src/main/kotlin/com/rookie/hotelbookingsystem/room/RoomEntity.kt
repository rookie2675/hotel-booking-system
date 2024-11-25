package com.rookie.hotelbookingsystem.room

import com.rookie.hotelbookingsystem.booking.BookingEntity
import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class RoomEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        @Enumerated(EnumType.STRING) val type: RoomType,
        val number: String,
        @OneToMany(mappedBy = "room", cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        var bookings: List<BookingEntity> = mutableListOf()
) {}
