package com.example.invoicepb.controller

import com.example.invoicepb.model.Canal
import com.example.invoicepb.service.CanalService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid


@RestController
@RequestMapping("/canal")
class CanalController {
    
    @Autowired
    lateinit var canalService: CanalService
    

    @GetMapping
    fun list ():List<Canal>{
        return canalService.list()
    }
    //@GetMapping("/canal/{id}")
    //fun listById(@PathVariable("id")id: Long): ResponseEntity<*> {
      //  return ResponseEntity(canalService.findZonaById(id), HttpStatus.ACCEPTED)
    //}
    @GetMapping("/zona")
    fun listWithZona ():ResponseEntity<*>{
        return ResponseEntity(canalService.listWithZona(), HttpStatus.OK)
    }

    @PostMapping
    fun save(@RequestBody @Valid canal: Canal):ResponseEntity<Canal>?{
        return ResponseEntity(canalService.save(canal), HttpStatus.ACCEPTED)
    }


}