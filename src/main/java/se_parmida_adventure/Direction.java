package se_parmida_adventure;

import java.util.Scanner;

public class Direction {
    boolean running = true;
    Scanner scanner = new Scanner(System.in);

    public Direction(boolean running) {
        this.running = running;
    }

    public void chooseDirection() {
        printWelcomeMenu();
        townCentre();
        while (running) {
            System.out.println("go north");
            System.out.println("go south");
            System.out.println("go east");
            System.out.println("go west");
            System.out.println("go to town");
            System.out.println("quit");


            String userInput = scanner.nextLine();

            switch (userInput) {
                case "go north" -> north();
                case "go south" -> south();
                case "go east" -> east();
                case "go west" -> west();
                case "go to town" -> townCentre();
                case "quit" -> running = false;
                default -> System.out.println("Wrong input");

            }
        }

    }

    // Konstanter
    private static final String NORTH = "west";
    private static final String SOUTH = "south";
    private static final String EAST = "east";
    private static final String WEST = "west";
    private static final String TOWN_CENTRE = "town centre";
    private static final String START = "start";
    private static String currentLocation = START;



    // Methoder
    private void townCentre() {
        System.out.println("You are in the Town Centre, where do you want to go now?");
        if (!currentLocation.equals(TOWN_CENTRE)){
            System.out.println("You can choose which direction you want to go");
            currentLocation = TOWN_CENTRE;
        }
        else {
            System.out.println("You cant go to Town Centre");
        }
    }

    private void printWelcomeMenu(){
        System.out.println("Welcome to the Game!");
    }

   private void north(){
        if (currentLocation.equals(TOWN_CENTRE)){
            System.out.println("You are facing the north side, where do you want to go now?");
            currentLocation = NORTH;
        }
        else {
            System.out.println("You cant move this direction, you have to go back to town centre");
        }
    }

   private void south(){
        if (currentLocation.equals(TOWN_CENTRE)){
            System.out.println("You are facing the south side, where do you want to go now?");
            currentLocation = SOUTH;
        }
        else {
            System.out.println("You cant move this direction, you have to go back to town centre");
        }
    }

   private void east(){
        if (currentLocation.equals(TOWN_CENTRE)){
            System.out.println("You are facing the east side, where do you want to go now?");
            currentLocation = EAST;
        }
        else {
            System.out.println("You cant move this direction, you have to go back to town centre");
        }
    }

   private void west(){
        if (currentLocation.equals(TOWN_CENTRE)){
            System.out.println("You are facing the west side, where do you want to go now?");
            currentLocation = WEST;
        }
        else {
            System.out.println("You cant move this direction, you have to go back to town centre");
        }
    }
}
