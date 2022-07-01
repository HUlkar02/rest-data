package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.User;
import pdp.uz.homework2.entity.Warehouse;

@Projection(types = User.class)
public interface UserInfo {
    Long getId();

    String getName();

    String getPhoneNumber();

    String getCode();

    String getPassword();

    boolean isActive();
}
