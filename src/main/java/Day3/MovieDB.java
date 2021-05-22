package Day3;

import java.time.LocalDate;
import java.util.Arrays;

public class MovieDB {

    Actor tomCruise = new Actor("Tom", "Cruise", 1000);
    Actor tomHanks = new Actor("Tom", "Hanks", 1100);
    Actor angelinaJolie = new Actor("Angelina", "Jolie", 1111);
    Actor bradPitt = new Actor("Brad", "Pitt", 1101);
    Actor juliaRobers = new Actor("Julia", "Robers", 1234);

    Director stevenSpielberg = new Director("Stever", "Spielberg", 1000);
    Director davidLynch = new Director("David", "Lynch", 1110);
    Director christianNolan = new Director("Christian", "Nolan", 1111);
    Director zackSlyther = new Director("Zack", "Slyther", 1101);
    Director jackSoe = new Director("Jack", "Soe", 1102);

    Movie rambo = new Movie("Rambo", LocalDate.of(2020, 5, 19),
            Arrays.asList(tomCruise, tomHanks, angelinaJolie) ,stevenSpielberg);
    Movie seven = new Movie("Seven", LocalDate.of(2021, 6, 18),
            Arrays.asList(tomCruise, bradPitt, juliaRobers) ,jackSoe);
    Movie titanic = new Movie("Titanic", LocalDate.of(1998, 7, 1),
            Arrays.asList(tomCruise, bradPitt, juliaRobers) ,davidLynch);
    Movie batman = new Movie("Batman", LocalDate.of(1999, 1, 1),
            Arrays.asList(tomCruise, bradPitt, angelinaJolie) ,christianNolan);
    Movie xmen = new Movie("X-men", LocalDate.of(1997, 2, 4),
            Arrays.asList(tomHanks, bradPitt, angelinaJolie) , zackSlyther);





}
