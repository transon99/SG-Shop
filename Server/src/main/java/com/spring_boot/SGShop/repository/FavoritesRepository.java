package com.spring_boot.SGShop.repository;

import com.spring_boot.SGShop.modal.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FavoritesRepository extends JpaRepository<Favorites,Long> {

}
