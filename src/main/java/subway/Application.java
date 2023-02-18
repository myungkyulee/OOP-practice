package subway;

import subway.domain.PathService;

import java.util.Scanner;

import static subway.view.OutputView.*;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        PathService pathService = new PathService();
        // TODO: 프로그램 구현
        while (true) {
            printMainScreen();
            String input = scanner.next();
            if (input.equals("Q")) {
                return;
            }
            printStandardPath();
            printSelectFunctionMessage();
            input = scanner.next();
            if (input.equals("1")) {
                printSelectDepartureStationMessage();
                String departureStation = scanner.next();
                printSelectArrivalStationMessage();
                String arrivalStation = scanner.next();
                // 로직 수행
                pathService.getShortestDistance(departureStation, arrivalStation);
                System.out.println("\n최단 거리 구함\n");


            } else if (input.equals("2")) {
                printSelectDepartureStationMessage();
                String departureStation = scanner.next();
                printSelectArrivalStationMessage();
                String arrivalStation = scanner.next();
                // 로직 수행
                System.out.println("\n최소 시간 구함\n");
            } else if (input.equals("B")) {
                continue;
            }
        }


    }


}
