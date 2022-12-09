package videoclub;

import java.util.ArrayList;

public class ClassVideoClub {
    private ArrayList<Movie> listMovie = new ArrayList<Movie>();
    
    // Metodo para agregar peliculas a la coleccion
    public void addMovie(Movie movie){
        this.listMovie.add(movie);
    }
    
    
    // Metodo para listar peliculas
    public void listOfMovie(){
        for(Movie m:this.listMovie){
            System.out.println(m.toString());
        }
    }
    
    
    // Metodo para eliminar peliculas
    public void deleteMovie(String code){
        for(Movie m:this.listMovie){
            if(m.getCode().equals(code)){
                this.listMovie.remove(m);
                return;
            }
        }
    }
    
    
    // Metodo para contar peliculas caras
    public void countExpensiveMovies(){
        int count = 0;
        for(Movie m: this.listMovie){
            if(m.getAmount() > 29990){
                count++;
            }
        }
        System.out.println("La cantidad de peliculas caras es de: "+count);
    }
    
    
    // Metodo para contar peliculas caras
    public void countPhysicalMovies(){
        int count = 0;
        for(Movie m: this.listMovie){
            if(m instanceof PhysicalFormat){
                count++;
            }
        }
        System.out.println("La cantidad de peliculas fisicas es de: "+count);
    }
}
