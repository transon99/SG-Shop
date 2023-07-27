package com.spring_boot.SGShop.Repository.Impl;

import com.spring_boot.SGShop.Modal.Favorites;
import com.spring_boot.SGShop.Repository.FavoritesRepository;
import jakarta.persistence.EntityManager;

public class FavoritesRepoImpl extends BaseRepoImpl<Favorites, Long> implements FavoritesRepository {

    public FavoritesRepoImpl(Class<Favorites> domainClass, EntityManager em) {
        super(domainClass, em);
    }
}
