package com.rookie.hotelbookingsystem.booking

import com.rookie.hotelbookingsystem.guest.UserEntity
import com.rookie.hotelbookingsystem.room.RoomEntity
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.time.LocalDate

@Entity
data class BookingEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        var startDate: LocalDate,
        var endDate: LocalDate,
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "room_id") var room: RoomEntity,
        @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "user_id") var user: UserEntity
) {}
