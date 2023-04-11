package vn.longbien.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutorialApplication.class, args);
		//FileSystemXmlApplicationContext sẽ tìm kiếm tệp XML trong hệ thống tệp
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/applicationContext.xml");
		ExampleBean exampleBean = context.getBean(ExampleBean.class);
		exampleBean.getMessage();
	}

}
