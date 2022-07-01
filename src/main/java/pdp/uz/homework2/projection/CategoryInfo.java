package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Category;

@Projection(types = Category.class)
public interface CategoryInfo {

    Long getId();

    String getName();

    boolean isActive();

    CategoryInfo getParentCategoryId();


}
