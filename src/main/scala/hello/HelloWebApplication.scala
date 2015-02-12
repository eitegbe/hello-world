package hello

import org.springframework.context.annotation._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.SpringApplication

/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author Emeka Itegbe
 * @since 1.0
 */
@EnableAutoConfiguration
object HelloWebApplication {

	def main(args: Array[String]) {
	   SpringApplication.run(classOf[HelloConfig]);
	}
}
