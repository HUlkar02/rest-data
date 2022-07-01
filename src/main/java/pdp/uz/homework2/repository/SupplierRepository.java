package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.projection.SupplierInfo;
import pdp.uz.homework2.entity.Supplier;
@RepositoryRestResource(path = "supplier",collectionResourceRel = "list",excerptProjection = SupplierInfo.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}