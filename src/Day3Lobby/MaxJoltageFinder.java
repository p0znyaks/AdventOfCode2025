package Day3Lobby;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MaxJoltageFinder {
    int result = 0;

    public int maxJoltageFinder() {
        try {
            List<String> banks = Files.readAllLines(Paths.get("src/Day3Lobby/input.txt"));

            for (String bank : banks) {
                result += findMaxJoltage(bank);
            }

        } catch (IOException e) {
            throw new RuntimeException("Failed read file", e);
        }

        return result;
    }

    public int findMaxJoltage(String bank) {
        char[] digits = bank.toCharArray();
        int max = 0;

        for (int i = 0; i < digits.length - 1; i++) {
            int tens = digits[i] - '0';
            int maxOnes = 0;

            for (int j = i + 1; j < digits.length; j++) {
                int ones = digits[j] - '0';
                maxOnes = Math.max(maxOnes, ones);
            }

            max = Math.max(max, tens * 10 + maxOnes);
        }

        return max;
    }
}