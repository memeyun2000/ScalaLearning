package main.scala.database

import java.sql.{Connection, DriverManager}

/**
  * Created by Administrator on 2016/9/26.
  */
object ConnectToDatabase {
  def main(args: Array[String]): Unit = {
    println("Connect to Database")

    val url = "jdbc:db2://localhost:50000/awpdb"

    Class.forName("com.ibm.db2.jcc.DB2Driver")
    val conn = DriverManager.getConnection(url,"awpsj","awpsj")

    try {
      val stat = conn.prepareStatement("select username from t00_user")
      val rs = stat.executeQuery()

      while(rs.next()) {
        val name = rs.getString("username")
        println(name)
      }


    } finally {
      conn.close()
    }
  }
}
