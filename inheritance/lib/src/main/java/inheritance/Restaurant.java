package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements AddReviewMethod{
    private String name;
    private double price;
    private  int numberOfStars;
    private List<Review> reviews;
    public Restaurant(String name, double price, int numberOfStars) {
        setName(name);
        setPrice(price);
        setNumberOfStars(numberOfStars);
        this.reviews=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        if (numberOfStars>=0 && numberOfStars<=5){
            this.numberOfStars = numberOfStars;
        }else {
            this.numberOfStars = 0;
        }


    }

    public void addReview(Review review) {
        reviews.add(review);
        updateStars();
    }

    private void updateStars() {
        int totalStars = 0;
        for (Review review : reviews) {
            totalStars += review.getNumberOfStars();
        }
        numberOfStars = totalStars / reviews.size();
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", numberOfStars=" + getNumberOfStars() +
                '}';
    }
}
