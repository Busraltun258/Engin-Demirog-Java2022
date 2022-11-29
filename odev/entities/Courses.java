package odev.entities;

//kurs bilgilerini yazıcaz.
public class Courses {
    private int id;
    private String name;
    private String clock;
    private int price;

    //contructor newlendiği zaman çalışması için

    public Courses() {

    }

    public Courses(int courseId, String name, String clock, int price) {
        this.id = courseId;
        this.name = name;
        this.clock = clock;
        this.price = price;
    }

    public int getCourseId() {
        return id;
    }

    public void setCourseId(int courseId) {
        this.id = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
