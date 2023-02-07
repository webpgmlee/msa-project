package msa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Buy")
public class PaymentEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String userId;
    int productId;
}
