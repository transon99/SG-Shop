package com.spring_boot.SGShop.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String province;

    @Column(nullable = false)
    private String ward;

    @Column(nullable = false)
    private String houseNumber;

    @Column()
    private String street;

    @JsonIgnore
    @OneToOne(mappedBy = "address")
    private User user;
}
