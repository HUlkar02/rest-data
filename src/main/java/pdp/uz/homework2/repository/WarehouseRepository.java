package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Warehouse;
import pdp.uz.homework2.projection.WarehouseInfo;

@RepositoryRestResource(path = "warehouse",collectionResourceRel = "list",excerptProjection = WarehouseInfo.class)
public interface WarehouseRepository extends JpaRepository<Warehouse, Long> {
}