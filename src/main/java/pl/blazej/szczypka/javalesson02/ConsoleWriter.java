package pl.blazej.szczypka.javalesson02;

public class ConsoleWriter extends CommonWriter {
    @Override
    public void write(String text) {
        System.out.println("This is console writer " + text);
    }
    public void console(String text) {

    }
    public void showWord(){
        System.out.println("fork");
    }
}
