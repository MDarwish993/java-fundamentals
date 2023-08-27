package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements AddReviewMethod{
    private String name;
    private String description;
    private  double price;
    private  int numberOfStars;
    private List<Review> reviews;
    public Shop(String name, String description, double price, int numberOfStars) {
        setName(name);
        setDescription(description);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
