import slick.jdbc.H2Profile.api._
import scala.concurrent.Await
import scala.concurrent.duration._
import com.typesafe.config.ConfigFactory

object DatabaseExample extends App {

  val config = ConfigFactory.load("application.conf")

  // Configuración de la conexión a la base de datos
  val db = Database.forConfig("slick.db", config)

  // Acción de consulta sin definir explícitamente la estructura de la tabla
  val queryAction = sql"SELECT * FROM proveedores".as[(Int,String,String,String,String,
    String, String, String, String, String, String)]

  // Ejecuta la acción de consulta y espera a que se complete
  val queryResultFuture = db.run(queryAction)

  // Imprime los resultados (o maneja los errores)
  val queryResult = Await.result(queryResultFuture, Duration.Inf)
  queryResult.foreach(println)

  // Cierra la base de datos cuando hayas terminado
  db.close()
}