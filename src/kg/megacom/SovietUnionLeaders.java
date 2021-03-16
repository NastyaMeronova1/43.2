package kg.megacom;

public class SovietUnionLeaders implements Comparable<SovietUnionLeaders> {
    private String name;
    private String country;
    private int yearStart;
    private int yearEnd;

    public SovietUnionLeaders(String name, String country, int yearStart, int yearEnd) {
        this.name = name;
        this.country = country;
        this.yearStart = yearStart;
        this.yearEnd = yearEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearStart() {
        return yearStart;
    }

    public void setYearStart(int yearStart) {
        this.yearStart = yearStart;
    }

    public int getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(int yearEnd) {
        this.yearEnd = yearEnd;
    }

    @Override
    public String toString() {
        return "SovietUnionLeaders{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", yearStart=" + yearStart +
                ", yearEnd=" + yearEnd +
                '}';
    }

    @Override
    public int compareTo(SovietUnionLeaders o) {
        return this.name.compareTo(o.name);
    }
}
