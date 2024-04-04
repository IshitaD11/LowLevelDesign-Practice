package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Comparator_Comparable;

import java.util.Iterator;

public class MovieIterator implements Iterator<Movie>{
    MovieList list;
    int currIdx;

    MovieIterator(MovieList ml){
        this.list = ml;
        this.currIdx = 0;
    }

    public boolean hasNext(){
        return currIdx<list.movieList.size();
    }

    public Movie next(){
        Movie curr = list.movieList.get(currIdx);
        System.out.println("inside Iterator" + currIdx);
        currIdx++;
        return curr;
    }
}
