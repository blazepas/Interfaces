package pl.blazej.szczypka.javalesson02;

public class MainWriter {
    public static void main(String[] args) {
        CommonWriter consoleWriter = new ConsoleWriter();
        CommonWriter whiteBoardWriter = new WhiteBoardWriter();
        ConsoleWriter consoleWriterMain = new ConsoleWriter();

        consoleWriter.write("Hi");
        //consoleWriter.console("Hi console");
        whiteBoardWriter.write("Bye");
        consoleWriterMain.showWord();
    }
}
