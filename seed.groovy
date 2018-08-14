import groovy.grape.Grape
@Grab('mysql:mysql-connector-java:5.1.46')
@GrabConfig(systemClassLoader = true)
 
import groovy.sql.Sql

Sql.withInstance("jdbc:mysql://localhost:3306/re_stat?useSSL=false", "tyler","12345", "com.mysql.jdbc.Driver") { sql ->

}