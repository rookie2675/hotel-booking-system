package com.rookie.hotelbookingsystem.services

import com.rookie.hotelbookingsystem.room.RoomEntity
import com.rookie.hotelbookingsystem.room.RoomRepository
import com.rookie.hotelbookingsystem.room.RoomType
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service

@Service
class DataInitializer(private val roomRepository: RoomRepository) {

    @PostConstruct
    fun init() {
        if (roomRepository.count() == 0L) {
            roomRepository.saveAll(
                    listOf(
                            RoomEntity(1L, RoomType.SINGLE, 1),
                            RoomEntity(2L, RoomType.DOUBLE, 2),
                            RoomEntity(3L, RoomType.SUITE, 3)
                    )
            )
        }
    }
}
