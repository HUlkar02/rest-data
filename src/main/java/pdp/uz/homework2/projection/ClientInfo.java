package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Client;
import pdp.uz.homework2.entity.Currency;
import pdp.uz.homework2.entity.Output;
import pdp.uz.homework2.entity.Warehouse;

import java.sql.Date;
import java.util.List;

@Projection(types = Client.class)
public interface ClientInfo {
    Long getId();

    String getName();

    String getPhoneNumber();

    OutputInfo getOutput();


}
