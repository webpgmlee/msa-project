package msa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "User")
public class UserEntity {
    @Id
    @Column(length = 50, nullable = false, unique = true)
    String id;

    @Column(length = 100, nullable = false)
    String password;
}
