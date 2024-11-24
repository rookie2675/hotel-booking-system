package com.rookie.hotelbookingsystem.services

import com.rookie.hotelbookingsystem.booking.BookingEntity
import com.rookie.hotelbookingsystem.booking.BookingRepository
import com.rookie.hotelbookingsystem.guest.UserEntity
import com.rookie.hotelbookingsystem.room.RoomEntity
import com.rookie.hotelbookingsystem.room.RoomRepository
import com.rookie.hotelbookingsystem.room.RoomType
import com.rookie.hotelbookingsystem.user.UserRepository
import jakarta.annotation.PostConstruct
import java.time.LocalDate
import org.springframework.stereotype.Service

@Service
class DataInitializer(
        private val userRepository: UserRepository,
        private val roomRepository: RoomRepository,
        private val bookingRepository: BookingRepository
) {

    @PostConstruct
    fun init() {

        val room1 = RoomEntity(1L, RoomType.SINGLE, "101")
        val room2 = RoomEntity(2L, RoomType.DOUBLE, "102")
        val room3 = RoomEntity(3L, RoomType.SUITE, "103")

        if (roomRepository.count() == 0L) {
            roomRepository.saveAll(listOf(room1, room2, room3))
        }

        val user1 = UserEntity(1L)

        if (userRepository.count() == 0L) {
            userRepository.save(user1)
        }

        if (bookingRepository.count() == 0L) {
            bookingRepository.saveAll(
                    listOf(
                            BookingEntity(
                                    1L,
                                    LocalDate.of(2024, 12, 1),
                                    LocalDate.of(2024, 12, 8),
                                    room1,
                                    UserEntity(1L)
                            )
                    )
            )
        }
    }
}
