package com.example.invoicepb.repository

import org.springframework.stereotype.Repository
import com.example.invoicepb.model.Zona
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

@Repository
interface ZonaRepository: JpaRepository<Zona, Long> {
    fun findById(id: Long?): Zona?
   // @Query(nativeQuery = true)
    //fun findZona(@Param("id") id:Long?):List<Zona>
}