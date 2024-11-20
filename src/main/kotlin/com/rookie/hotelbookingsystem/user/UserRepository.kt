package com.rookie.hotelbookingsystem.user

import com.rookie.hotelbookingsystem.guest.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>
