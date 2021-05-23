package Day3;

import java.time.LocalDate;
import java.util.List;

public class Movie {

    public String title;
    public LocalDate dateOfPremiere;
    public List<Person> listOfStaff;

    public Movie(String title, LocalDate dateOfPremiere, List<Person> listOfStaff) {
        this.title = title;
        this.dateOfPremiere = dateOfPremiere;
        this.listOfStaff = listOfStaff;
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

    public List<Person> getListOfStaff() {
        return listOfStaff;
    }

    public void setListOfStaff(List<Person> listOfStaff) {
        this.listOfStaff = listOfStaff;
    }



    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", dateOfPremiere=" + dateOfPremiere +
                ", listOfActors=" + listOfStaff +
                '}';
    }
}
