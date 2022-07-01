package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.Attachment;

@Projection(types = Attachment.class)
public interface AttachmentInfo {
    Long getId();

    String getName();

    Integer getSize();

    String getContentType();
}
