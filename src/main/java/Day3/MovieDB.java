package Day3;

import net.bytebuddy.asm.Advice;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class MovieDB {

    public static List<Movie> movieLibrary = new ArrayList<>();

    public static void display() {
        movieData();
        int i = 0;
        while (i==0){
            int option = getOption();
            switch (option) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    searchByTitle();
                    break;
                case 3:
                    printByDates();
                    break;
                case 4:
                    searchByActor();
                    break;
                case 5:
                    showCosts();
                    break;
                default:
                    i++;
                    System.out.println("Wrong choice");
            }
        }


    }

    public static void showCosts() {
        System.out.println("Write titel of the movie.");
        Scanner scanner5 = new Scanner(System.in);
        String title = scanner5.nextLine();
        double movieBudget = 0;

        for (Movie m: movieLibrary) {
            if (m.getTitle().equals(title)) {
                for (Person staff: m.getListOfStaff()) {
                    movieBudget += staff.getSalary();
                }
            }
        }
        System.out.println("Budget: "+movieBudget);
    }

    public static void printByDates() {
        System.out.println("Print movie for dates");
        Scanner scanner3 = new Scanner(System.in);

        //My version
        System.out.print("Start date in format YYYY-MM-DD: ");
        LocalDate startDate = LocalDate.parse(scanner3.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.print("End date in format YYYY-MM-DD: ");
        LocalDate endDate = LocalDate.parse(scanner3.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        //Course version
        //Start
//        System.out.print("Start year: ");
//        int startYear = scanner3.nextInt();
//        System.out.print("Start month: ");
//        int startMonth = scanner3.nextInt();
//        System.out.print("Start day: ");
//        int startDay = scanner3.nextInt();
//
//        //End
//        System.out.print("End year: ");
//        int endYear = scanner3.nextInt();
//        System.out.print("End month: ");
//        int endMonth = scanner3.nextInt();
//        System.out.print("End day: ");
//        int endDay = scanner3.nextInt();

//        LocalDate startDate = LocalDate.of(startYear, startMonth, startDay);
//        LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);

        for (Movie m: movieLibrary) {
            if (m.getDateOfPremiere().isAfter(startDate) && m.getDateOfPremiere().isBefore(endDate)
                    || m.getDateOfPremiere().isEqual(startDate) || m.getDateOfPremiere().isEqual(endDate)) {
                System.out.println(m);
            }
        }

    }

    public static void addMovie() {
        movieData();
        System.out.println("Add movie");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner1.nextLine();
        System.out.print("Date of Premiere: ");
        LocalDate dateOfPremiere = LocalDate.parse(scanner1.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        //movieLibrary.add(new Movie(title, dateOfPremiere, Arrays.asList()))
    }

    public static void searchByActor() {
        System.out.println("Provide actor's name or surname");
        Scanner scanner4 = new Scanner(System.in);
        String userActor = scanner4.nextLine();

        for (Movie m: movieLibrary) {
            for (Person staff: m.listOfStaff) {
                if (staff.getSurname().equals(userActor) || staff.getName().equals(userActor)) {
                    if (staff instanceof Actor) { //!!!
                        System.out.println(m.getTitle());
                    }
                }
            }
        }
    }

    public static void searchByTitle() {
        System.out.println("Search movie by name");
        Scanner scanner2 = new Scanner(System.in);
        String userTitle = scanner2.nextLine();

        for (Movie movie: movieLibrary) {
            if (movie.getTitle().equals(userTitle)) {
                System.out.println(movie);
            }
        }
    }

    public static void movieData() {
        Person tomCruise = new Actor("Tom", "Cruise", 1000);
        Person tomHanks = new Actor("Tom", "Hanks", 1100);
        Person angelinaJolie = new Actor("Angelina", "Jolie", 1111);
        Person bradPitt = new Actor("Brad", "Pitt", 1101);
        Person juliaRobers = new Actor("Julia", "Roberts", 1234);

        Person stevenSpielberg = new Director("Stever", "Spielberg", 1000);
        Person davidLynch = new Director("David", "Lynch", 1110);
        Person christianNolan = new Director("Christian", "Nolan", 1111);
        Person zackSlyther = new Director("Zack", "Slyther", 1101);
        Person jackSoe = new Director("Jack", "Soe", 1102);

        Movie rambo = new Movie("Rambo", LocalDate.of(2020, 5, 19),
                Arrays.asList(tomCruise, tomHanks, angelinaJolie ,stevenSpielberg));
        Movie seven = new Movie("Seven", LocalDate.of(2021, 6, 18),
                Arrays.asList(tomCruise, bradPitt, juliaRobers ,jackSoe));
        Movie titanic = new Movie("Titanic", LocalDate.of(1998, 7, 1),
                Arrays.asList(tomCruise, bradPitt, juliaRobers ,davidLynch));
        Movie batman = new Movie("Batman", LocalDate.of(1999, 1, 1),
                Arrays.asList(tomCruise, bradPitt, angelinaJolie ,christianNolan));
        Movie xmen = new Movie("X-men", LocalDate.of(1997, 2, 4),
                Arrays.asList(tomHanks, bradPitt, angelinaJolie , zackSlyther));


        Collections.addAll(movieLibrary, rambo, seven, titanic, batman, xmen);
    }

    public static int getOption() { //Crtl+ Alt + M
        System.out.println("Menu:\n" +
                "1. Add movie\n" +
                "2. Search movie by name\n" +
                "3. Print movie for dates\n" +
                "4. Check in which movies played a particular actor\n" +
                "5. How much costs creating a particular movie");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


}
