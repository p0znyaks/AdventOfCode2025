package Day1SecretEntrance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DialSolverPart2 {
    private int dialPointer = 50;
    private int counter = 0;

    public int solveDial() {
        try {
            List<String> commands = Files.readAllLines(Paths.get("src/Day1SecretEntrance/input.txt"));

            for (String command : commands) {
                char direction = command.charAt(0);
                int distance = Integer.parseInt(command.substring(1));

                for (int i = 0; i < distance; i++) { // смотрим сколько раз за поворот был пересечён ноль
                    if (direction == 'R') {
                        dialPointer = (dialPointer + 1) % 100;
                    } else {
                        dialPointer = (dialPointer - 1 + 100) % 100;
                    }
                    if (dialPointer == 0) counter++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file", e);
        }

        return counter;
    }
}