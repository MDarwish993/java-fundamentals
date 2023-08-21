package inheritance;

public class Restaurant {
    private String name;
    private double price;
    private  int numberOfStars;

    public Restaurant(String name, double price, int numberOfStars) {
        setName(name);
        setPrice(price);
        setNumberOfStars(numberOfStars);
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

    public void addReview(Review review){
        this.numberOfStars = review.getNumberOfStars();
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
