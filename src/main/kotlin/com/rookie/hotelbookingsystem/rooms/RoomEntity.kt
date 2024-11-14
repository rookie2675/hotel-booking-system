package com.rookie.hotelbookingsystem.rooms

import RoomType
import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class RoomEntity(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        @Enumerated(EnumType.STRING) val type: RoomType,
        val number: Int,
)
