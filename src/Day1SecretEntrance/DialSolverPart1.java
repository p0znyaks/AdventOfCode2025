package Day1SecretEntrance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DialSolverPart1 {
    int dialPointer = 50;
    int counter = 0;
    int distance;

    List<String> rotations;

    Character direction;

    public int solveDial() {
        try {
            rotations = Files.readAllLines(Paths.get("src/Day1SecretEntrance/input.txt"));

            for (String rotation : rotations) {;
                direction = rotation.charAt(0);
                distance = Integer.parseInt(rotation.substring(1));

                if (direction.equals('R')) {
                    dialPointer = (dialPointer + distance) % 100;
                } else {
                    dialPointer = (dialPointer - distance) % 100;
                }
                if (dialPointer == 0) counter++;
            }
        } catch (IOException e) {
            e.getStackTrace();
        }

        return counter;
    }
}