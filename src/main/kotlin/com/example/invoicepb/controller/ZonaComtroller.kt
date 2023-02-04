package com.example.invoicepb.controller

import ch.qos.logback.core.net.server.Client
import com.example.invoicepb.model.Zona
import com.example.invoicepb.service.ZonaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/zona")
class ZonaComtroller {

    @Autowired
    lateinit var zonaService: ZonaService

    @GetMapping
    fun list ():List<Zona>{
        return zonaService.list()
    }
    @GetMapping("/zona/{id}")
    fun listById(@PathVariable("id")id: Long): ResponseEntity<*> {
        return ResponseEntity(zonaService.findZonaById(id), HttpStatus.ACCEPTED)
    }

}