package com.example.invoicepb.service

import com.example.invoicepb.model.Zona
import com.example.invoicepb.repository.ZonaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class ZonaService {
    @Autowired
    lateinit var zonaRepository: ZonaRepository

    fun list():List<Zona>{
        return zonaRepository.findAll()
    }
    fun findZonaById(id: Long?):List<Zona>{
        return zonaRepository.findZona(id)
    }

    fun delate (id:Long?):Boolean?{
        zonaRepository.findById(id)?:
        throw Exception()
        zonaRepository.deleteById(id!!)
        return true
    }

    fun save(zona: Zona):Zona{
        try {
            zona.fullname?.takeIf { it.trim().isNotEmpty() }
                ?:throw Exception("Fullname blanco")
            return zonaRepository.save(zona)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun update(zona: Zona):Zona{
        try {
            zonaRepository.findById(zona.id)
                ?:throw Exception("El id ${zona.id} en zona no existente")
            return zonaRepository.save(zona)
        }
        catch (ex:java.lang.Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}