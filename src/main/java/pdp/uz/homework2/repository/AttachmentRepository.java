package pdp.uz.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.homework2.entity.Attachment;
import pdp.uz.homework2.projection.AttachmentInfo;

@RepositoryRestResource(path = "attachment",collectionResourceRel = "list",excerptProjection = AttachmentInfo.class)
public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}