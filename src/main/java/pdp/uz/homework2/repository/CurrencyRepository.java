package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Currency;
import pdp.uz.homework2.projection.CurrencyInfo;

@RepositoryRestResource(path = "currency",collectionResourceRel = "list",excerptProjection = CurrencyInfo.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}