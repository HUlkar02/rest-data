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
@Entity(name = "inputs")
public class Input extends AbsLong {

    private Date date;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Warehouse warehouse;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Supplier supplier;

    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<Currency> currencies;

    private String factureNumber;

    private String code;

}
