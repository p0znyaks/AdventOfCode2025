import Day1SecretEntrance.DialSolverPart1;
import Day1SecretEntrance.DialSolverPart2;
import Day2GiftShop.InvalidIdsRecognizer;

public class ProblemSolver {
    public static void main(String[] args) {
        DialSolverPart1 dialSolverPart1 = new DialSolverPart1();
        DialSolverPart2 dialSolverPart2 = new DialSolverPart2();
        InvalidIdsRecognizer invalidIdsRecognizer = new InvalidIdsRecognizer();

        System.out.println(invalidIdsRecognizer.recognizeInvalidIds());
//        System.out.println(dialSolverPart1.solveDial());
//        System.out.println(dialSolverPart2.solveDial());


    }
}