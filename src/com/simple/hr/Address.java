package com.simple.hr;

public class Address {
    private String street;
    private String city;
    private String province;
    private String zipCode;

    public Address(String st, String cty, String prov, String zip){
        this.street = st;
        this.city = cty;
        this.province = prov;
        this.zipCode = zip;
    }

    public void getAddress(){
        System.out.println(
                "Street: " + street
                +"\nCity: " + city
                +"\nProvince: " + province
                +"\nZip: " + zipCode
        );
    }
}
