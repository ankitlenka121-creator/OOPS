import java.util.ArrayList;

class Movie {
    String title;
    String director;
    String actor;
    ArrayList<String> reviews;

    
    Movie(String title, String director, String actor) {
        this.title = title;
        this.director = director;
        this.actor = actor;
        reviews = new ArrayList<>();
    }

    
    void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: " + review);
    }

    
    void removeReview(String review) {
        if (reviews.remove(review)) {
            System.out.println("Review removed: " + review);
        } else {
            System.out.println("Review not found.");
        }
    }

    
    void display() {
        System.out.println("\nMovie Details:");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actor: " + actor);

        System.out.println("Reviews:");

        for (String review : reviews) {
            System.out.println(review);
        }
    }
}

public class MovieDemo {
    public static void main(String[] args) {

        Movie m = new Movie(
                "3 Idiots",
                "Rajkumar Hirani",
                "Aamir Khan"
        );

        m.addReview("Excellent Movie");
        m.addReview("Very Inspirational");

        m.display();

        m.removeReview("Very Inspirational");

        m.display();
    }
}