package vn.longbien.SpringTutorial.ModelBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Watch {


    @Autowired
    public  Outfit outfit;

    public Watch(Outfit outfit) {
        this.outfit = outfit;
    }
}
