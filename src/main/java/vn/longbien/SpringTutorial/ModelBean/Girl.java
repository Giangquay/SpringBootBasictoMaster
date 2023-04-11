package vn.longbien.SpringTutorial.ModelBean;

import jakarta.annotation.Priority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    public Outfit outfit;
    // Đánh dấu để Spring inject một đối tượng Outfit vào đây
    public Girl(@Qualifier("bikini") Outfit outfit) {
        // Spring sẽ inject outfit thông qua Constructor đầu tiên
        // Ngoài ra, nó sẽ tìm Bean có @Qualifier("naked") trong context để ịnject
        this.outfit = outfit;
    }
}
