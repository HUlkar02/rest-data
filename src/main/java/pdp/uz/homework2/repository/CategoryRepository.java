package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Category;
import pdp.uz.homework2.projection.CategoryInfo;
import pdp.uz.homework2.projection.CustomAddress;

@RepositoryRestResource(path = "category",collectionResourceRel = "list",excerptProjection = CategoryInfo.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}