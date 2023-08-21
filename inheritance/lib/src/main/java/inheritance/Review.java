package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;
    private Restaurant restaurant;

    public Review(String body, String author, int numberOfStars,Restaurant restaurant) {
        setBody(body);
        setAuthor(author);
        setNumberOfStars(numberOfStars);
        this.restaurant=restaurant;

        restaurant.addReview(this);

    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + getBody() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", numberOfStars=" + getNumberOfStars() +
                '}';
    }
}
