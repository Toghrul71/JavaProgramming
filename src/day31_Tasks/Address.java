package day31_Tasks;

public class Address {
    public int buildingNumber;
    public String street, city,state, zipCode;

    public Address(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';

    }
    public void Addresss(String address){
        address=buildingNumber+street+city+state+zipCode;
        System.out.println(address);
    }

}
