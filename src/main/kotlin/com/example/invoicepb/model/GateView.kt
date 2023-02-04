package com.example.invoicepb.model

import java.sql.Time
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "gate_view")
class GateView {
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id:Long?= null
    var code :String? = null
    var description:String?= null
    var schedule:Time?=null
    @Column(name="canal_id")
    var canalId:Long?=null

    var canal:String?=null
}