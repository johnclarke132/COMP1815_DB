import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.asJdbcDriver
import com.zaxxer.hikari.HikariDataSource

class DDBB {

    companion object {
        private fun getSqlDriver(path: String = "src/main/resources/lecturer.sqlite"): SqlDriver {
            val ds = HikariDataSource()
            ds.jdbcUrl = "jdbc:sqlite:" + path
            ds.driverClassName = "org.sqlite.JDBC"
            ds.username = ""
            ds.password = ""
            return ds.asJdbcDriver()
        }

    }
}

// this is for testing.
fun main() {


}