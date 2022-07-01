package pdp.uz.homework2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pdp.uz.homework2.entity.template.AbsLong;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class InputProduct extends AbsLong {

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Product> products;

    private int amount;

    private double price;

    private Date expireDate;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Input input;


}
