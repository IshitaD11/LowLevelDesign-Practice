package LowLevelDesign.Java_Fundamentals.LLD9_Collections.Comparator_Comparable;

public class Client {
    
    public static void main(String[] args) {
        MovieList list = new MovieList();
        list.add(new Movie(4.5,2022,"ABC"));
        list.add(new Movie(2.5,2023,"EFG"));

        list.sort();
        
        for(Movie mv:list){
            System.out.println(mv.getName()+"-"+mv.getRating()+"-"+mv.getYear());
        }

        // System.out.println(list);

        System.out.println("-------------------------------------------------");

        // Collections.sort(list,new RatingComparator());
        list.sort(new RatingComparator());

        for(Movie mv:list){
            System.out.println(mv.getName()+"-"+mv.getRating()+"-"+mv.getYear());
        }

        // System.out.println(list);

    }
    
    
}
