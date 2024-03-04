package jpabook.jpashopv2.domain;

import lombok.Getter;

//내장타입일때 제거해도 됨
//@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    protected  Address() {
        
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
