package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Input;
import pdp.uz.homework2.projection.InputInfo;
import pdp.uz.homework2.projection.InputProductInfo;

@RepositoryRestResource(path = "input",collectionResourceRel = "list",excerptProjection = InputInfo.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}