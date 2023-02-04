package com.example.invoicepb.repository

import com.example.invoicepb.model.CanalView
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface CanalViewRepository: JpaRepository<CanalView, Long> {
    fun findById(id: Long?): CanalView?

}