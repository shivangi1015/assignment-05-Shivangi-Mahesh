package com.knoldus
/**
  * Created by knoldus on 1/2/17.
  */
import java.sql._

class ScalaJdbcConnect {
  Class.forName("org.postgresql.Driver")

  val conn: Connection =
    DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres")


  if (conn != null) {
    val st: Statement = conn.createStatement()
  //  val rs: ResultSet = st.executeQuery("select * from Employee")
    //    try{}
  /*  while (rs.next()) {
      println(rs.getString("name"))
      */

    def insert(actors: Actors):Boolean = {

      actors match {
        case Employee(id,name,address,phone,deptid,projid)  =>if(st.executeUpdate(s"insert into values($id,$name,$address,$phone,$deptid,$projid)")> 0) true else false
        case Department(deptid,dname) => if(st.executeUpdate(s"insert into values($deptid,$dname)") > 0) true else false
        case Project(id,pname,deptid,clientid) => if(st.executeUpdate(s"insert into values($id,$pname$deptid,$clientid)")  > 0) true else false
        case Client(clientid,projectid,cname,address)=>if( st.executeUpdate(s"insert into values($clientid,$projectid$cname,$address)") > 0) true else false
        case _ => false
      }
    }


    st.close()
    conn.close()

  }
}
