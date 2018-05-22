// import groovy.sql.Sql
// import java.sql.*
// import com.mysql.jdbc.*
import org.apache.commons.text.WordUtils

String test = "waddup ma dude"
println test
println WordUtils.capitalizeFully(test)
// def mysqlJar = 
// new File('.').eachFile(FILES) {
//     println it.name
// }
// scriptDir = new File(getClass().protectionDomain.codeSource.location.path).parent
// println scriptDir
// println "open jar file"
// URL url = new URL('file:' + scriptDir + '/mysqlconnect.jar');
// def mysqlJarURL = mysqlJar.toURI().toURL()
// println mysqlJarURL
// def myurl = new URL('file:var/lib/jenkins/workspace/base/mysqlconnect.jar')
// println myurl
// InputStream stream = streamFileFromWorkspace('/var/lib/jenkins/workspace/base/mysqlconnect.jar')
// this.class.classLoader.rootLoader.addURL(myurl)
println "classpath loaded"
// hudson.FilePath workspace = hudson.model.Executor.currentExecutor().getCurrentWorkspace()
// println workspace

Class.forName('com.mysql.jdbc.Driver')

// def sql = Sql.newInstance('jdbc:mysql://10.20.20.66:3306/re_fsbo_front', 'tyler', 'dz77GAi7980', 'com.mysql.jdbc.Driver')

// sql.eachRow('SELECT Instance, Group_ID, Robot_Name FROM re_fsbo_init LIMIT 50') { row ->
//     println "${row.Instance}, ${row.Group_ID}, ${row.Robot_Name}"

// }