package vn.longbien.SpringTutorial.ModelBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    public Outfit outfit;

    public Boy(@Qualifier("watch")Outfit outfit)
    {
        this.outfit=outfit;
    }
}
