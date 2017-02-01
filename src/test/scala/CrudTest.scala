/**
  * Created by knoldus on 1/2/17.
  */
package com.knoldus

import org.scalatest.FunSuite
import com.knoldus.ScalaJdbcConnect
class CrudTest extends FunSuite {

  val obj=new ScalaJdbcConnect
/*
  test("Testing insert"){
    assert(obj.insert(Employee(102,"Mahesh","ghazipur","986453523",1002,2))==true)
  }

  test("Testing insert"){
    assert(obj.insert(Employee(103,"Nancy","krishnaNagar","986453523",1003,3))==true)
  }

  test("Testing insert"){
    assert(obj.insert(Employee(104,"Rahul","ghazipur","986453523",1004,4))==true)
  } */
  val emp = new Employee(102,"Mahesh","ghazipur","986453523",1002,2)
 val dept=new Department(201,"Sales")
 val proj=new Project(1002,"Hotel Management",201,111)
 val client=new Client(123,1007,"Shivangi","107 Amritsar")

  test("testing insert") {
    assert(obj.insert(emp)==true)
   assert(obj.insert(dept)==true)
   assert(obj.insert(proj)==true)
   assert(obj.insert(client)==true)
   
  }
 }

