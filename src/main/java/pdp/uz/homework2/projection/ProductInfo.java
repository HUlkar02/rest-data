package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Category;
import pdp.uz.homework2.entity.Product;
import pdp.uz.homework2.entity.Warehouse;
import pdp.uz.homework2.projection.AttachmentInfo;
import pdp.uz.homework2.projection.CategoryInfo;
import pdp.uz.homework2.projection.MeasurementInfo;

import java.util.List;
@Projection(types = Product.class)
public interface ProductInfo {
    Long getId();

    String getName();

    String getCode();

    boolean isActive();

    CategoryInfo getCategory();

    List<AttachmentInfo> getPhotos();

    MeasurementInfo getMeasurement();

}
