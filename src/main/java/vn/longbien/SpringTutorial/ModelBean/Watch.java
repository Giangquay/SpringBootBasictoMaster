package vn.longbien.SpringTutorial.ModelBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("watch")
public class Watch implements Outfit{

    @Override
    public void wear() {
        System.out.println("Rolex");
    }
}
