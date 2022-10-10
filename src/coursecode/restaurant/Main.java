package org.fasttrackit.restaurant;

import java.util.List;

import static org.fasttrackit.restaurant.RestaurantType.*;

public class Main {
    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService(List.of(
                new Restaurant("KFC", "Oradea", FUSION, 3),
                new Restaurant("Pizza Hut", "Cluj Napoca", MEDITERRANEAN, 4),
                new Restaurant("Marty", "Oradea", GREEK, 5),
                new Restaurant("Mesopotamia", "Oradea", FUSION, 4)
        ));

        System.out.println(restaurantService.getRestaurantsFromCity("Oradea"));
        System.out.println(restaurantService.getRestaurantsFromCity(null));

        System.out.println(restaurantService.getRestaurantsOfType(FUSION));
        System.out.println(restaurantService.getRestaurantsOfType(null));

        System.out.println(restaurantService.mapRestaurantToType());

        System.out.println(restaurantService.mapToType());

        System.out.println(restaurantService.getFromCityOfTypeWithMaxRating("Oradea", MEDITERRANEAN));
    }
}
