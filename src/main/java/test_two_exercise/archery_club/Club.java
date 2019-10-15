package test_two_exercise.archery_club;

import test_two_exercise.archery_club.archers.Archer;

import java.util.*;

public class Club {
    private String name;
    private String address;
    private String trainer;
    private Archer[] archers;
    private int freePlaces;
    private int juniorCount;
    private int seniorCount;
    private int veteranCount;

    public Club(String name, String address, String trainer, int places) {
        setName(name);
        setAddress(address);
        setTrainer(trainer);
        this.archers = new Archer[places];
        this.freePlaces = places;
    }

    private void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    private void setAddress(String address) {
        if (address != null && !address.isEmpty()) {
            this.address = address;
        }
    }

    private void setTrainer(String trainer) {
        if (trainer != null && !trainer.isEmpty()) {
            this.trainer = trainer;
        }
    }

    public void addArcher(Archer archer) {
        if (archer != null && freePlaces > 0 && this.archers != null) {
            this.archers[archers.length - freePlaces] = archer;
            this.freePlaces--;
        } else {
            System.out.println("There are not free spaces in the club!");
        }
    }

    public void startTournament() {
        printContestants();
        shootArrows();
        showStatistics();
    }

    private void printContestants() {
        // sort archers by name and increase the tournaments of each archer by 1
        System.out.println("ARCHERS IN THE COMPETITION:");
        sortArchersByName();
        for (int i = 0; i < this.archers.length - this.freePlaces; i++) {
            archers[i].printArcherInfo();
            archers[i].increaseTournamentsByOne();
        }
    }

    private void shootArrows() {
        for (int i = 0; i < archers.length - freePlaces; i++) {
            archers[i].shoot();
        }
    }

    private void showStatistics() {
        printCategoryWinner();
        printAvgPoints();
        printPrecisestArcher();
        printMostIncapableArcher();
        printWomenByAccuracy();
        printMenWithCarbonBowsByYearsExperience();
    }

    private void sortArchersByName() {
        //Bubble sort
        for (int i = 0; i < archers.length - freePlaces - 1; i++) {
            for (int j = 0; j < archers.length - freePlaces - i - 1; j++) {
                if (archers[j].getName().compareTo(archers[j + 1].getName()) > 0) {
                    Archer temp = archers[i];
                    archers[i] = archers[j + 1];
                    archers[j + 1] = temp;
                }
            }
        }
    }

    private void printCategoryWinner() {
        String juniorWinnerName = null;
        String seniorWinnerName = null;
        String veteranWinnerName = null;

        int juniorMaxPoints = 0;
        int seniorMaxPoints = 0;
        int veteranMaxPoints = 0;

        for (Archer archer : this.archers) {

            switch (archer.getArcherType()) {
                case "Junior":
                    this.juniorCount++;
                    if (archer.getPoints() > juniorMaxPoints) {
                        juniorMaxPoints = archer.getPoints();
                        juniorWinnerName = archer.getName();
                    }
                    break;
                case "Senior":
                    this.seniorCount++;
                    if (archer.getPoints() > seniorMaxPoints) {
                        seniorMaxPoints = archer.getPoints();
                        seniorWinnerName = archer.getName();
                    }
                    break;
                case "Veteran":
                    this.veteranCount++;
                    if (archer.getPoints() > veteranMaxPoints) {
                        veteranMaxPoints = archer.getPoints();
                        veteranWinnerName = archer.getName();
                    }
                    break;
            }
        }

        System.out.println(String.format("Junior Winner: %s%nSenior Winner: %s%nVeteran Winner: %s",
                juniorWinnerName, seniorWinnerName, veteranWinnerName));
    }

    private void printAvgPoints() {
        double juniorAvgPoints = findPointsSumOfCategory("Junior") / this.juniorCount;
        double seniorAvgPoints = findPointsSumOfCategory("Senior") / this.seniorCount;
        double veteranAvgPoints = findPointsSumOfCategory("Veteran") / this.veteranCount;

        System.out.println(
                String.format("Junior Average Points: %.3f%n" +
                                "Senior Average Points: %.3f%n" +
                                "Veteran Average Points: %.3f",
                        juniorAvgPoints, seniorAvgPoints, veteranAvgPoints));
    }

    private double findPointsSumOfCategory(String type) {
        return Arrays.stream(this.archers)
                .filter(a -> a.getArcherType().equalsIgnoreCase(type))
                .mapToDouble(e -> (double) e.getPoints()).sum();
    }

    private void printPrecisestArcher() {
        Archer precisestArcher = null;
        double percentageTens = 0;

        for (int i = 0; i < this.archers.length - freePlaces; i++) {
            if (archers[i].getTensPercentage() > percentageTens) {
                percentageTens = archers[i].getTensPercentage();
                precisestArcher = archers[i];
            }
        }

        System.out.println(String.format("Precisest Archer: %s, Percentage of Tens: %.2f%%",
                precisestArcher.getName(), percentageTens));
    }

    private void printMostIncapableArcher() {
        Archer a = null;
        int numberOfMissedShoots = 0;

        for (int i = 0; i < this.archers.length - freePlaces; i++) {
            if (archers[i].getMissedShoots() > numberOfMissedShoots) {
                numberOfMissedShoots = archers[i].getMissedShoots();
                a = archers[i];
            }
        }

        System.out.println(String.format("Most Incapable Archer: %s, Number of Missed Shoots: %d",
                a.getName(), numberOfMissedShoots));
    }

    private void printWomenByAccuracy() {
        System.out.println("Women Ranking by Points:");
        for (int i = 0; i < archers.length - freePlaces; i++) {
            for (int j = 0; j < archers.length - i - 1; j++) {
                if (archers[j].getPoints() < archers[j + 1].getPoints()) {
                    Archer temp = archers[j];
                    archers[j] = archers[j + 1];
                    archers[j + 1] = temp;
                }
            }
        }

        double maxPoints = archers[0].getPoints();
        for (int i = 0; i < archers.length - freePlaces; i++) {
            if (archers[i].getGender().equalsIgnoreCase("female")) {
                double percentagePoints = archers[i].getPoints() / maxPoints * 100;
                System.out.println(String.format("Archer: %s, Points Percentage: %.2f",
                        archers[i].getName(), percentagePoints));
            }
        }
    }

    private void printMenWithCarbonBowsByYearsExperience() {
        for (int i = 0; i < this.archers.length - freePlaces; i++) {
            for (int j = 0; j < this.archers.length - i - 1; j++) {
                if (archers[j].getExperience() < archers[j + 1].getExperience()) {
                    Archer temp = archers[j];
                    archers[j] = archers[j + 1];
                    archers[j + 1] = temp;
                }
            }
        }

        System.out.println("Men with Carbon Bows Ranking by Experience:");
        for (int i = 0; i < archers.length - freePlaces; i++) {
            if (archers[i].getBow().getBowType().equalsIgnoreCase("Carbon")) {
                System.out.println(String.format("Archer: %s, Experience: %d",
                        archers[i].getName(), archers[i].getExperience()));
            }
        }
    }
}