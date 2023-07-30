package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.Modal.Comment;
import com.spring_boot.SGShop.Modal.Favorites;
import com.spring_boot.SGShop.Repository.FavoritesRepository;
import com.spring_boot.SGShop.Service.CommentService;
import com.spring_boot.SGShop.Service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/favorites")
public class FavoritesController {
    @Autowired
    FavoritesService favoritesService;

    @PostMapping("/{id}")
    public ResponseEntity<?> insertFavoritesForStudent(@RequestBody Favorites favorites, @PathVariable Long id) {
        return ResponseEntity.ok(favoritesService.insertFavoritesForUser(favorites,id));
    }
}
