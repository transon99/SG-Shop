package com.spring_boot.SGShop.service.ServiceImpl;

import com.spring_boot.SGShop.modal.Favorites;
import com.spring_boot.SGShop.modal.User;
import com.spring_boot.SGShop.repository.FavoritesRepository;
import com.spring_boot.SGShop.repository.UserRepository;
import com.spring_boot.SGShop.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesServiceImpl implements FavoritesService {
    @Autowired
    FavoritesRepository favoritesRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Favorites> getAllCommentOfAUser() {
        return null;
    }

    @Override
    public User insertFavoritesForUser(Favorites favorites, Long id) {
        User userFound = userRepository.findById(id).get();
        userFound.getFavorites().add(favorites);
        favoritesRepository.save(favorites);
        return userFound;
    }


    @Override
    public String deleteFavorites(Long id) {
        return null;
    }
}
