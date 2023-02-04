package com.example.invoicepb.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "zona")
class Zona {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    var code:String?= null
    var fullname:String?= null
    var description:String?= null
}