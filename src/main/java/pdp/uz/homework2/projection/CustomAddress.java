package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Addresss;

@Projection(types = Addresss.class)
public interface CustomAddress {

    Integer getId();

    String getCity();

    String getStreet();
}
