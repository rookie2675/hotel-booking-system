package com.rookie.hotelbookingsystem.room

import com.rookie.hotelbookingsystem.RoomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("api/v1/room")
class RoomController(private val service: RoomService) {

    @GetMapping("/get-all")
    fun getAll(): Collection<RoomDTO> {
        return service.getAll()
    }
}
