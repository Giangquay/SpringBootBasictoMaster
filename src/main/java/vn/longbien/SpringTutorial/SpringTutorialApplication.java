package vn.longbien.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import vn.longbien.SpringTutorial.ModelBean.*;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		System.out.println("> Trước khi IoC Container được khởi tạo");
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);
		System.out.println("> Sau khi IoC Container được khởi tạo");

		Girl girl = context.getBean(Girl.class);
		System.out.println("> Trước khi IoC Container destroy Girl");
		((ConfigurableApplicationContext ) context).getBeanFactory().destroyBean(girl);
		System.out.println("> Sau khi IoC Container destroy Girl");
	}

}
