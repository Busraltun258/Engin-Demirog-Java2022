package odev.core.loging;

public class DataBaseLoger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("DataBase e loglandı: " + data);
    }
}
