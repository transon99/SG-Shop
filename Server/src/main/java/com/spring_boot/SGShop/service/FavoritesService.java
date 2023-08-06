package com.spring_boot.SGShop.service;

import com.spring_boot.SGShop.modal.Favorites;
import com.spring_boot.SGShop.modal.User;

import java.util.List;

public interface FavoritesService {
    List<Favorites> getAllCommentOfAUser();

    User insertFavoritesForUser(Favorites favorites, Long id);

    String deleteFavorites(Long id);

}
