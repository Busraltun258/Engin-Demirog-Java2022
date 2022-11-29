package odev.entities;
//eğitmen bilgilerini yazdıık
public class Teachers {
    private int id;
    private String name;
    private String surname;
    private int profilePoint;
    private String gender;



    public Teachers(int id, String name, String surname, int profilePoint, String gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.profilePoint = profilePoint;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getProfilePoint() {
        return profilePoint;
    }

    public void setProfilePoint(int profilePoint) {
        this.profilePoint = profilePoint;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
