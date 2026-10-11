package practice13.task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public void parseStringWithSplit(String fullAddress) {
        String[] parts = fullAddress.split(",");
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    public void parseStringWithTokenizer(String fullAddress) {
        StringTokenizer st = new StringTokenizer(fullAddress, ",.;");
        this.country = st.nextToken().trim();
        this.region = st.nextToken().trim();
        this.city = st.nextToken().trim();
        this.street = st.nextToken().trim();
        this.house = st.nextToken().trim();
        this.building = st.nextToken().trim();
        this.apartment = st.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Страна: " + country + "\n" +
                "Регион: " + region + "\n" +
                "Город: " + city + "\n" +
                "Улица: " + street + "\n" +
                "Дом: " + house + "\n" +
                "Корпус: " + building + "\n" +
                "Квартира: " + apartment + "\n";
    }

}
