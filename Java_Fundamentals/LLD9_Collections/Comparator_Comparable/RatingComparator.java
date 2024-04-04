package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Comparator_Comparable;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie>{

    public int compare(Movie m1,Movie m2){
        return (int)(m1.getRating()-m2.getRating());
    }
    
}
