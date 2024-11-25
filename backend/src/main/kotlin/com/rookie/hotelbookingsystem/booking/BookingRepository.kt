package com.rookie.hotelbookingsystem.booking

import org.springframework.data.jpa.repository.JpaRepository

interface BookingRepository : JpaRepository<BookingEntity, Long> {}
