package subway.view;

import subway.domain.constants.RouteCommand;
import subway.view.console.ConsoleReader;
import subway.view.console.ConsoleWriter;

public class RouteView {
    private final ConsoleReader consoleReader;

    public RouteView(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }

    public void printFunctions() {
        ConsoleWriter.printlnMessage("## 구간 관리 화면");
        ConsoleWriter.printlnMessage("1. 구간 등록");
        ConsoleWriter.printlnMessage("2. 구간 삭제");
        ConsoleWriter.printlnMessage("B. 돌아가기");
    }

    public RouteCommand enterFunction() {
        ConsoleWriter.printlnMessage("## 원하는 기능을 선택하세요.");
        return RouteCommand.from(consoleReader.enterMessage());
    }
}
