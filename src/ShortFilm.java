
public class ShortFilm extends Film{
    
    private String filmGenre, releaseDate, writers;
    
    // I did it like that because this constructor takes 10 attributes and writing them in a single line is getting harder to read
    public ShortFilm(String filmId, 
                     String filmTitle,
                     String language,
                     String directorsOfFilm,
                     String runtime, 
                     String country,
                     String cast,
                     String filmGenre,
                     String releaseDate,
                     String writers) {
        
        super(filmId, filmTitle, language, directorsOfFilm, runtime, country, cast);
        this.filmGenre = filmGenre;
        this.releaseDate = releaseDate;
        this.writers = writers;
        super.filmType = "ShortFilm";
    }

    public String getFilmGenre() {
        return filmGenre;
    }

    public void setFilmGenre(String filmGenre) {
        this.filmGenre = filmGenre;
    }
    
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getWriters() {
        return writers;
    }

    public void setWriters(String writers) {
        this.writers = writers;
    }

}
