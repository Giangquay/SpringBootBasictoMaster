package vn.longbien.SpringTutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleBean {
    @Autowired
    @Qualifier("main")
    private  String message;
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Your Message: " + message);
    }
}
