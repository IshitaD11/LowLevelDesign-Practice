package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Comparator_Comparable;


public class Movie implements Comparable<Movie>{

    private double rating;
    private int year;
    private String name;

    Movie(double rating, int year, String name){
        this.rating=rating;
        this.year=year;
        this.name = name;
    }

    // natural ordering by year
    @Override
    public int compareTo(Movie o) {
        return this.year-o.year;
    }

    public int getYear(){
        return this.year;
    }

    public double getRating(){
        return this.rating;
    }

    public String getName(){
        return this.name;
    }
    
    // public Iterator<Movie> iterator(){
    //     return new MovieIterator(this);
    // }
}
