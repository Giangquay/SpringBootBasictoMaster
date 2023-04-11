package vn.longbien.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import vn.longbien.SpringTutorial.ModelBean.*;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);

		/*
			Demo @component
			Lấy bean ra
		 */

		/*
			Demo @Autowired
		*/
		Girl girl = context.getBean(Girl.class);
		girl.outfit.wear();
		Boy boy = context.getBean(Boy.class);
		boy.outfit.wear();
	}

}
