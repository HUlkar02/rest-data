package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.*;

import java.sql.Date;
import java.util.List;

@Projection(types = OutputProduct.class)
public interface OutputProductInfo {
    Long getId();

    int getAmount();

    double getPrice();

    List<ProductInfo> getProducts();

    OutputInfo getOutput();



}
