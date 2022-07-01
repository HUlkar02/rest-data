package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.*;

import java.sql.Date;
import java.util.List;

@Projection(types = InputProduct.class)
public interface InputProductInfo {
    Long getId();

    int getAmount();

    double getPrice();

    Date getExpireDate();

    List<ProductInfo> getProducts();

    InputInfo getInput();

}
