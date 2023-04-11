package vn.longbien.SpringTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import vn.longbien.SpringTutorial.ModelBean.Bikini;
import vn.longbien.SpringTutorial.ModelBean.Outfit;
import vn.longbien.SpringTutorial.ModelBean.Watch;

@SpringBootApplication
public class SpringTutorialApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringTutorialApplication.class, args);

		/*
			Demo @component
			Lấy bean ra
		 */
		Outfit outfit = context.getBean(Bikini.class);
		System.out.println("Instance: " + outfit);

		outfit.wear();

		/*
			Demo @Autowired
		*/
		Outfit outfit1 = context.getBean(Outfit.class);
		System.out.println("Output Instance: " + outfit);
		// xài hàm wear()
		outfit.wear();

		Watch watch = context.getBean(Watch.class);

		System.out.println("Girl Instance: " +watch);
		System.out.println("Girl Outfit: " + watch.outfit);
		watch.outfit.wear();
	}

}
