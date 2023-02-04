package com.example.invoicepb.repository

import com.example.invoicepb.model.GateView
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository

@Repository
interface GateViewRepository: JpaRepository<GateView, Long> {
    fun findById(id: Long?): GateView?

}