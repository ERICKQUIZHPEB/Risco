package com.example.invoicepb.repository

import com.example.invoicepb.model.Canal
import com.example.invoicepb.model.Zona
import org.springframework.stereotype.Repository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface CanalRepository: JpaRepository<Canal, Long> {
    fun findById(id: Long?): Canal?

    //@Query(nativeQuery = true)
    //fun findZona(@Param("id") id:Long?):List<Canal>
}