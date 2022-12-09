package videoclub;

public class VideoClub {

    public static void main(String[] args) {
        PhysicalFormat movie1 = new PhysicalFormat("11", "Dunkerque", 4000, "Belico", "vhs");
        DigitalFormat movie2 = new DigitalFormat("22", "El Resplandor", 5000, "Terror", 1800);
        
        ClassVideoClub vc = new ClassVideoClub();
        
        vc.addMovie(movie1);
        vc.addMovie(movie2);
        
        System.out.println("--------LISTADO--------");
        vc.listOfMovie();
        System.out.println("----------------");
        
        vc.countExpensiveMovies();
        vc.countPhysicalMovies();
        
        vc.deleteMovie("11");
        System.out.println("--------ELIMINADO--------");
        vc.listOfMovie();
        System.out.println("----------------");
        
        //System.out.println(movie1.toString());
        //System.out.println(movie2.toString());
        
    }
}
