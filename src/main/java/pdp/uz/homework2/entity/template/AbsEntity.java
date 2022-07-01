package pdp.uz.homework2.entity.template;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.MappedSuperclass;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class AbsEntity extends AbsLong {
 
    private String name;

    public AbsEntity(Long id, String name) {
        super(id);
        this.name = name;
    }

}
