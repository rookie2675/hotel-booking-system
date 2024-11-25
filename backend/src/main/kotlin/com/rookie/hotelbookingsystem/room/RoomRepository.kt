package com.rookie.hotelbookingsystem.room

import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<RoomEntity, Long> {}
