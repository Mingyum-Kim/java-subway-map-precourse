package subway.view;

import subway.domain.constants.LineCommand;
import subway.view.console.ConsoleReader;
import subway.view.console.ConsoleWriter;

public class LineView {
    private final ConsoleReader consoleReader;

    public LineView(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }

    public LineCommand enterFunction() {
        ConsoleWriter.printlnMessage("## 원하는 기능을 선택하세요.");
        return LineCommand.from(consoleReader.enterMessage());
    }

    public String enterStationName() {
        ConsoleWriter.printlnMessage("## 등록할 노선 이름을 입력하세요.");
        return consoleReader.enterMessage();
    }

    public void printFunctions() {
        ConsoleWriter.printlnMessage("## 노선 관리 화면");
        ConsoleWriter.printlnMessage("1. 노선 등록");
        ConsoleWriter.printlnMessage("2. 노선 삭제");
        ConsoleWriter.printlnMessage("3. 노선 조회");
        ConsoleWriter.printlnMessage("B. 돌아가기");
    }

}