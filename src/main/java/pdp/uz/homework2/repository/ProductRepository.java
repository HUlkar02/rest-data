package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.projection.ProductInfo;
import pdp.uz.homework2.entity.Product;

@RepositoryRestResource(path = "product",collectionResourceRel = "list",excerptProjection = ProductInfo.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}