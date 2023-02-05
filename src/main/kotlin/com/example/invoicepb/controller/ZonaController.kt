package com.example.invoicepb.controller

import com.example.invoicepb.model.Zona
import com.example.invoicepb.service.ZonaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/zona")
class ZonaController {

    @Autowired
    lateinit var zonaService: ZonaService

    @GetMapping
    fun list ():List<Zona>{
        return zonaService.list()
    }
   // @GetMapping("/zona/{id}")
    //fun listById(@PathVariable("id")id: Long): ResponseEntity<*> {
      //  return ResponseEntity(zonaService.findZonaById(id), HttpStatus.ACCEPTED)
    //}
    @DeleteMapping("/delete/{id}")
    fun delate (@PathVariable("id") id: Long):Boolean?{
        return zonaService.delate(id)
    }
    @PostMapping
    fun save(@RequestBody @Valid zona: Zona):ResponseEntity<Zona>?{
        return ResponseEntity(zonaService.save(zona), HttpStatus.ACCEPTED)
    }


}