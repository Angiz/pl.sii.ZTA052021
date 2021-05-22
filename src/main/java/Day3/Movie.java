package Day3;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    public String title;
    public LocalDate dateOfPremiere;
    public List<Actor> listOfActors;
    public Director director;

    public Movie(String title, LocalDate dateOfPremiere, List<Actor> listOfActors, Director director) {
        this.title = title;
        this.dateOfPremiere = dateOfPremiere;
        this.listOfActors = listOfActors;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDateOfPremiere() {
        return dateOfPremiere;
    }

    public void setDateOfPremiere(LocalDate dateOfPremiere) {
        this.dateOfPremiere = dateOfPremiere;
    }

    public List<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(List<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }
}
