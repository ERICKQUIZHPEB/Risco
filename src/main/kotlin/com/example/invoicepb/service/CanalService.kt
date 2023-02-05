package com.example.invoicepb.service

import com.example.invoicepb.model.Canal
import com.example.invoicepb.model.CanalView
import com.example.invoicepb.repository.CanalRepository
import com.example.invoicepb.repository.CanalViewRepository
import com.example.invoicepb.repository.ZonaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CanalService {
    @Autowired
    lateinit var canalRepository: CanalRepository
    @Autowired
    lateinit var zonaRepository: ZonaRepository
    @Autowired
    lateinit var canalViewRepository: CanalViewRepository

    fun list():List<Canal>{
        return canalRepository.findAll()
    }

    fun listWithZona():List<CanalView>{
        return canalViewRepository.findAll()
    }


   // fun findZonaById(id: Long?):List<Canal>{
     //   return canalRepository.findZona(id)
    //}

    fun delete (id:Long?):Boolean?{
        canalRepository.findById(id)?:
        throw Exception()
        canalRepository.deleteById(id!!)
        return true
    }

    fun save(canal: Canal):Canal{
        try {
            zonaRepository.findById(canal.zoneId)
                ?:throw Exception("El id ${canal.zoneId} de zona no existente")
            return canalRepository.save(canal)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(canal: Canal):Canal{
        try {
            canalRepository.findById(canal.id)
                ?:throw Exception("El id ${canal.id} en canal no existente")
            return canalRepository.save(canal)
        }
        catch (ex:java.lang.Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}