package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Client;
import pdp.uz.homework2.projection.ClientInfo;

@RepositoryRestResource(path = "client",collectionResourceRel = "list",excerptProjection = ClientInfo.class)
public interface ClientRepository extends JpaRepository<Client, Long> {
}