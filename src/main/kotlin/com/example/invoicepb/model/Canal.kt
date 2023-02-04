package com.example.invoicepb.model

import java.sql.Time
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "canal")
class Canal {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    var description:String?= null
    @Column(name="num_gate")
    var numGate:Long?=null
    var schedule:Time?=null
    @Column(name="zona_id")
    var zoneId:Long?=null
}