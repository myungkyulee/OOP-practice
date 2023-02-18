package subway.view;

public class OutputView {
    public static void printError(String errorMessage) {
        System.out.println("[ERROR] " + errorMessage);
    }

    public static void printMainScreen() {
        System.out.println("## 메인 화면\n1. 경로 조회\nQ. 종료\n");
    }

    public static void printSelectFunctionMessage() {
        System.out.println("## 원하는 기능을 선택하세요.");
    }

    public static void printStandardPath() {
        System.out.println("\n## 경로 기준\n1. 최단 거리\n2. 최소 시간\nB. 돌아가기\n");
    }

    public static void printSelectDepartureStationMessage() {
        System.out.println("\n## 출발역을 입력하세요.");
    }

    public static void printSelectArrivalStationMessage() {
        System.out.println("\n## 도착역을 입력하세요.");
    }

    public static void printResult() {
        System.out.println("\n## 조회 결과\n");


        System.out.println();
    }
}
