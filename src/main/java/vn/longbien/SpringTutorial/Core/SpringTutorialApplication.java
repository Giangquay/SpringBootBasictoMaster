package vn.longbien.SpringTutorial.Core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import vn.longbien.SpringTutorial.Model.Girl;
import vn.longbien.SpringTutorial.Other.OtherGirl;

@SpringBootApplication(scanBasePackages = "vn.longbien.SpringTutorial.*")
//@ComponentScan("vn.longbien.SpringTutorial.*")
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class,args);
		try {
			Girl girl = context.getBean(Girl.class);
			System.out.println("Bean: " + girl.toString());
		} catch (Exception e) {
			System.out.println("Bean Girl không tồn tại");
		}

		try {
			OtherGirl otherGirl = context.getBean(OtherGirl.class);
			if (otherGirl != null) {
				System.out.println("Bean: " + otherGirl.toString());
			}
		} catch (Exception e) {
			System.out.println("Bean Girl không tồn tại");
		}
	}

}
