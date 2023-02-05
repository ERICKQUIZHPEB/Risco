package com.example.invoicepb.repository

import com.example.invoicepb.model.Gate
import com.example.invoicepb.model.Zona
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface GateRepository: JpaRepository<Gate, Long> {
    fun findById(id: Long?): Gate?
   // @Query(nativeQuery = true)
    //fun findGate(@Param("id") id:Long?):List<Gate>
}