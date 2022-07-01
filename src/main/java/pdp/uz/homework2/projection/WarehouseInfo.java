package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Warehouse;

import java.util.List;

@Projection(types = Warehouse.class)
public interface WarehouseInfo {
    Long getId();

    String getName();

    boolean isActive();

    List<UserInfo> getUsers();

}
