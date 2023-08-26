package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;

    public Review(String body, String author, int numberOfStars, Object object ) {
        setBody(body);
        setAuthor(author);
        setNumberOfStars(numberOfStars);

        if(object.getClass()== Restaurant.class){
            this.restaurant=(Restaurant) object;
            restaurant.addReview(this);
        } else if (object.getClass()== Shop.class) {
            this.shop=(Shop) object;
            shop.addReview(this);
        } else if (object.getClass()== Theater.class) {
            this.theater=(Theater) object;
            theater.addReview(this);
        }


    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
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
        if (numberOfStars>=0 && numberOfStars<=5){
            this.numberOfStars = numberOfStars;
        }else {
            this.numberOfStars = 0;
        }
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
