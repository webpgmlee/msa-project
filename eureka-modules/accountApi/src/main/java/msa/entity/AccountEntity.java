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
@Table(name = "Account")
public class AccountEntity {
    @Id
    String acctNo;
    String userId;
    int balance;
    String bank;
}
