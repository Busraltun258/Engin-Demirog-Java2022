package odev.core.loging;

public class FileLoger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("FileLoger a loglandı: " + data);
    }
}
