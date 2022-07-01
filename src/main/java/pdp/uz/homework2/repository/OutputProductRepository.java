package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.OutputProduct;
import pdp.uz.homework2.projection.OutputProductInfo;

@RepositoryRestResource(path = "outputProduct",collectionResourceRel = "list",excerptProjection = OutputProductInfo.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}