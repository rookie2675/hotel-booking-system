package com.rookie.hotelbookingsystem

import com.rookie.hotelbookingsystem.room.RoomDTO
import com.rookie.hotelbookingsystem.room.RoomEntity
import com.rookie.hotelbookingsystem.room.RoomRepository
import org.springframework.stereotype.Service

@Service
class RoomService(private val repository: RoomRepository) {

    fun getAll(): Collection<RoomDTO> {
        return repository.findAll().stream().map { room: RoomEntity -> RoomDTO(room) }.toList()
    }
}
