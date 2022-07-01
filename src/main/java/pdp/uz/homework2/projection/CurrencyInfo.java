package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyInfo {
    Long getId();

    String getName();

    boolean isActive();
}
