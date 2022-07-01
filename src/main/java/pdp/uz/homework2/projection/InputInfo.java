package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Input;

import java.sql.Date;
import java.util.List;

@Projection(types = Input.class)
public interface InputInfo {
    Long getId();

    Date getDate();

    String getFactureNumber();

    String getCode();

    WarehouseInfo getWarehouse();

    SupplierInfo getSupplier();

    List<CurrencyInfo> getCurrencies();


}
