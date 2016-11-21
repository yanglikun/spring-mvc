package spring.autowire.vo;

/**
 * Created by yanglikun on 2016/10/24.
 */
public class User {

    private String name;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }
}
