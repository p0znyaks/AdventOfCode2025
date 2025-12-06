package Day2GiftShop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvalidIdsRecognizerPart1 {
    long sum;

    public long recognizeInvalidIds() {
        try {
            String[] ranges = Files.readString(Paths.get("src/Day2GiftShop/input.txt")).split(",");

            for (String range : ranges) {
                String[] parts = range.split("-");

                long start = Long.parseLong(parts[0]);
                long end = Long.parseLong(parts[1]);

                for (; start <= end; start++) {
                    String numberStr = String.valueOf(start);

                    if (numberStr.length() % 2 != 0) {
                    } else {
                        int half = numberStr.length() / 2;
                        String firstHalf = numberStr.substring(0, half);
                        String secondHalf = numberStr.substring(half);
                        if ((firstHalf.equals(secondHalf)) && numberStr.charAt(0) != '0') {
                            sum += start;
                        }
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file", e);
        }

        return sum;
    }
}