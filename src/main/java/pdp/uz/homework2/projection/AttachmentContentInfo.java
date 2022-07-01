package pdp.uz.homework2.projection;

import org.springframework.data.rest.core.config.Projection;
import pdp.uz.homework2.entity.AttachmentContent;

@Projection(types = AttachmentContent.class)
public interface AttachmentContentInfo {
    Long getId();

    Integer getBytes();

    AttachmentInfo getAttachment();

}
