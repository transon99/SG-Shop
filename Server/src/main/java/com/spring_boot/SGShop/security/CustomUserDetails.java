package com.spring_boot.SGShop.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spring_boot.SGShop.Modal.Address;
import com.spring_boot.SGShop.Modal.Comment;
import com.spring_boot.SGShop.Modal.Favorites;
import com.spring_boot.SGShop.Modal.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomUserDetails implements UserDetails {
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    @JsonIgnore
    private String password;
    private LocalDate birthday;
    private String phoneNumber;
    private Address address;
    private Comment comment;
    private Favorites favorites;
    private Collection<? extends GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    //Chuyển User -> UserDetail
    public static CustomUserDetails mapUsersToUserDetail(User user){
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole().name());
        return new CustomUserDetails(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                user.getBirthday(),
                user.getPhoneNumber(),
                user.getAddress(),
                user.getComment(),
                user.getFavorites(),
                authority
        );
    };
    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}