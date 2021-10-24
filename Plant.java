import java.time.LocalDate;
import java.time.Period;

public class Plant {

    private int id;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private String healthStatus;
    private String plantType;
    private String name;
    private String color;
    private String size;

    public Plant(int birthYear, int birthMonth, int birthDay, String healthStatus, String plantType, String name, String color, String size) {
        this.id = (int) (100000 * Math.random());
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.healthStatus = healthStatus;
        this.plantType = plantType;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public String toString() { //will printed if you print a plant object
        return name + " is " + age() + " Its horoscope is " + generateHoroscope() + ". Its health status is " + healthStatus + ". Its plant type is " + plantType + ". Its color is " + color + " and its size is " + size + ".";
    }

    private String age() {
        String month = "" + birthMonth;
        if (birthMonth < 10) {
            month = "0" + birthMonth;
        }
        String day = "" + birthDay;
        if (birthDay < 10) {
            day = "0" + birthDay;
        }
        String date = birthYear + "-" + month + "-" + day;
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.parse(date);
        Period per = Period.between(birthDate, today);
        return per.getYears() + " years, " + per.getMonths() + " months, and " + per.getDays() + " days old.";
    }

    private String generateHoroscope() {
        int dateCode = birthMonth * 100 + birthDay; //Jan 3 becomes 103, Dec 15 becomes 1215
        if (dateCode >= 120 && dateCode <= 218) {
            return "Aquarius";
        } else if (dateCode <= 320) {
            return "Pisces";
        } else if (dateCode <= 419) {
            return "Aries";
        } else if (dateCode <= 520) {
            return "Taurus";
        } else if (dateCode <= 621) {
            return "Gemini";
        } else if (dateCode <= 722) {
            return "Cancer";
        } else if (dateCode <= 822) {
            return "Leo";
        } else if (dateCode <= 922) {
            return "Virgo";
        } else if (dateCode <= 1023) {
            return "Libra";
        } else if (dateCode <= 1121) {
            return "Scorpius";
        } else if (dateCode <= 1221) {
            return "Sagittarius";
        } else {
            return "Capricorn";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}