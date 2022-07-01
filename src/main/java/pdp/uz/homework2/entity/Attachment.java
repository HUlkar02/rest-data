package pdp.uz.homework2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pdp.uz.homework2.entity.template.AbsEntity;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attachment extends AbsEntity {

    private Integer size;

    private String contentType;
}
