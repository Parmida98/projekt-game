package se_parmida_adventure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Direction direction = new Direction(true);
        direction.chooseDirection();

    }
}
