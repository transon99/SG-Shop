package com.spring_boot.SGShop.Modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthday;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "address_id",referencedColumnName = "id")
    private Address address;
//    @ManyToMany
//    private Role role;
    @OneToMany(mappedBy = "user")
    private List<Comment> comment;
}
