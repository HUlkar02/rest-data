package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.AttachmentContent;
import pdp.uz.homework2.projection.AttachmentContentInfo;
import pdp.uz.homework2.projection.CustomAddress;

@RepositoryRestResource(path = "attachmentContent",collectionResourceRel = "list",excerptProjection = AttachmentContentInfo.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
}