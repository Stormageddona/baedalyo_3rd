package com.green.beadalyo.gyb.restaurant.repository;

import com.green.beadalyo.gyb.model.Restaurant;
import com.green.beadalyo.jhw.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long>
{

    Optional<Restaurant> findTop1ByUser(User user);
    Optional<Restaurant> findTop1BySeq(Long seq);

    Restaurant findRestaurantByUser(User user);
    Restaurant findRestaurantBySeq(Long seq);
}
