package com.rookie.hotelbookingsystem.room

data class RoomDTO(val id: Long, val type: RoomType, val number: String) {
    constructor(entity: RoomEntity) : this(entity.id, entity.type, entity.number)
}
