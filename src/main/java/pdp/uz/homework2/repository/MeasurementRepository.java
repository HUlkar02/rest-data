package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Measurement;
import pdp.uz.homework2.projection.MeasurementInfo;

@RepositoryRestResource(path = "measurement",collectionResourceRel = "list",excerptProjection = MeasurementInfo.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}