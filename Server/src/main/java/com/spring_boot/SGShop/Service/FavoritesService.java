package com.spring_boot.SGShop.Service;

import com.spring_boot.SGShop.Modal.Comment;
import com.spring_boot.SGShop.Modal.Favorites;
import com.spring_boot.SGShop.Modal.User;

import java.util.List;
import java.util.Optional;

public interface FavoritesService {
    List<Favorites> getAllCommentOfAUser();

    User insertFavoritesForUser(Favorites favorites, Long id);

    String deleteFavorites(Long id);

}
