package com.rookie.hotelbookingsystem.guest

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class UserEntity(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long,
) {}
