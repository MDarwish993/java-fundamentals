package inheritance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RestaurantTest {


    @Test public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Tasty", 4.0, 3);
        String expectedOutput = "Restaurant{name='Tasty', price=4.0, numberOfStars=3}";
        String actualOutput = restaurant.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testReviewToString() {
        Restaurant restaurant = new Restaurant("Yummy Delights", 4, 2);
        Review review = new Review("Delicious food and friendly staff!", "Carol", 5, restaurant);
        String expectedOutput = "Review{body='Delicious food and friendly staff!', author='Carol', numberOfStars=5}";
        String actualOutput = review.toString();
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testAddReviewAssociatesRestaurantAndReview() {
        Restaurant restaurant = new Restaurant("Taste Haven", 4, 2);
        Review review = new Review("Amazing flavors!", "Eve", 5, restaurant);
        assertEquals(restaurant, review.getRestaurant(), "Review should be associated with the correct restaurant");
        assertEquals(5, restaurant.getNumberOfStars(), "Restaurant stars should be updated after adding a review");
    }




}
