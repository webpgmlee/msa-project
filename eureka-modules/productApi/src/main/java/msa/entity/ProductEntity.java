package msa.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Product")
public class ProductEntity {
    @Id
    int id;
    String productName;
    int price;
    String imgPath;
}
