import java.time.LocalDate;
import java.util.Locale;

public class Student {
    private String name, surname;
    private LocalDate birthday;
    private int scientePoints;
    private int lifePoints;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void learn(LocalDate from, LocalDate to)
    {

    }

    public void party(LocalDate from, LocalDate to)
    {
        lifePoints++;
    }

    public boolean isGoodStudent()
    {
        return lifePoints > scientePoints;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getScientePoints() {
        return scientePoints;
    }

    public void setScientePoints(int scientePoints) {
        this.scientePoints = scientePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}
