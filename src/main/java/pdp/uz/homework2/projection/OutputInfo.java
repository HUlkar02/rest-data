package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Output;
import pdp.uz.homework2.entity.OutputProduct;
import pdp.uz.homework2.entity.User;
import pdp.uz.homework2.entity.Warehouse;
import pdp.uz.homework2.projection.ClientInfo;
import pdp.uz.homework2.projection.CurrencyInfo;

import java.sql.Date;
import java.util.List;

@Projection(types = Output.class)
public interface OutputInfo {
    Long getId();

    Date getDate();

    String getFactureNumber();

    String getCode();

    WarehouseInfo getWarehouse();

    List<ClientInfo> getClients();

    List<CurrencyInfo> getCurrencies();



}
