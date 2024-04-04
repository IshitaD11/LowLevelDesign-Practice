package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class MovieList implements Iterable<Movie>{
    List<Movie> movieList;

    MovieList(){
        movieList = new ArrayList<>();
    }

    public void add(Movie newMv){
        movieList.add(newMv);
    }

    public void sort(){
        Collections.sort(movieList);
    }

    public void sort(Comparator<Movie> comp){
        Collections.sort(movieList,comp);
    }

    @Override
    public Iterator<Movie> iterator() {
        System.out.println("inside Iterable" + movieList.size());
        return new MovieIterator(this);
    }
   
    
}
