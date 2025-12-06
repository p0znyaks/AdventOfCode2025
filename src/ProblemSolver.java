import Day1SecretEntrance.DialSolverPart1;
import Day1SecretEntrance.DialSolverPart2;
import Day2GiftShop.InvalidIdsRecognizerPart1;
import Day3Lobby.MaxJoltageFinder;

public class ProblemSolver {
    public static void main(String[] args) {
        DialSolverPart1 dialSolverPart1 = new DialSolverPart1();
        DialSolverPart2 dialSolverPart2 = new DialSolverPart2();
        InvalidIdsRecognizerPart1 invalidIdsRecognizer = new InvalidIdsRecognizerPart1();
        MaxJoltageFinder maxJoltageFinder = new MaxJoltageFinder();

        System.out.println(maxJoltageFinder.maxJoltageFinder());

//        System.out.println(invalidIdsRecognizer.recognizeInvalidIds());
//        System.out.println(dialSolverPart1.solveDial());
//        System.out.println(dialSolverPart2.solveDial());


    }
}