package vn.longbien.SpringTutorial.Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vn.longbien.SpringTutorial.ConnectDataBase.AppConfiguration;
import vn.longbien.SpringTutorial.ConnectDataBase.DatabaseConnector;


@SpringBootApplication
@ComponentScan("vn.longbien.SpringTutorial.*")
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class,args);

		DatabaseConnector databaseConnector = context.getBean(DatabaseConnector.class);
		databaseConnector.connect();
	}

}
