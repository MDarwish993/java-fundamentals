package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater {

    private String name;
    private  int numberOfStars;
    private List<String>movies;
    private List<Review>reviews;

    public Theater(String name,int numberOfStars) {
        setName(name);
        setNumberOfStars(numberOfStars);
        this.movies=new ArrayList<>();
        this.reviews=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie (String movie) {
        movies.remove(movie);
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
        return "Theater{" +
                "name='" + name + '\'' +
                ", numberOfStars=" + numberOfStars +
                '}';
    }
}

