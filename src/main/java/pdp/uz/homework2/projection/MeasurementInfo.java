package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementInfo {
    Long getId();

    String getName();

    boolean isActive();
}
