package videoclub;

// --------------------------------------------
// Clase abstracta Pelicula que implementa ICalculable
// --------------------------------------------
public abstract class Movie implements ICalculable {
    private String code;
    private String title;
    private int amount;
    private String genre;

    public Movie(String code, String title, int amount, String genre) {
        this.code = code;
        this.title = title;
        this.amount = amount;
        this.genre = genre;
    }

    public Movie() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" + "code=" + code + ", title=" + title + ", amount=" + amount + ", genre=" + genre + '}';
    }
    
    
    // Metodo abstracto para obtener clasificacion
    public abstract void getClassification();
}
