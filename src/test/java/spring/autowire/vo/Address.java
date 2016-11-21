package spring.autowire.vo;

/**
 * Created by yanglikun on 2016/10/24.
 */
public class Address {

    private String city;

    private String road;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Address{");
        sb.append("city='").append(city).append('\'');
        sb.append(", road='").append(road).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
