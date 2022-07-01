package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Output;
import pdp.uz.homework2.projection.OutputInfo;
import pdp.uz.homework2.projection.OutputProductInfo;

@RepositoryRestResource(path = "output",collectionResourceRel = "list",excerptProjection = OutputInfo.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
}