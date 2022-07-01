package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.InputProduct;
import pdp.uz.homework2.projection.InputProductInfo;

@RepositoryRestResource(path = "inputProduct",collectionResourceRel = "list",excerptProjection = InputProductInfo.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}