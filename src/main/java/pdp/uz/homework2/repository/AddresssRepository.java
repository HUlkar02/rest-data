package pdp.uz.homework2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import pdp.uz.homework2.entity.Addresss;
import pdp.uz.homework2.projection.CustomAddress;

@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = CustomAddress.class)
public interface AddresssRepository extends JpaRepository<Addresss, Integer> {

    @RestResource(path = "byName")
    public Page<Addresss> findAllByCity(@Param("city") String city, Pageable pageable);

}