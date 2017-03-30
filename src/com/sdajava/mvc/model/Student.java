package com.sdajava.mvc.model;

/**
 * Created by lukas on 30.03.2017.
 */
public class Student {

    public String rollNo;
    public String name;
    public String lastname;
    public String address;
    public String telephone;
    public int age;

    public Student(Builder builder) {
        rollNo = builder.rollNo;
        name = builder.name;
        lastname = builder.lastname;
        address = builder.address;
        telephone = builder.telephone;
        age = builder.age;
    }


    public static final class Builder {
        private String rollNo;
        private String name;
        private String lastname;
        private String address;
        private String telephone;
        private int age;

        public Builder() {
        }

        public Builder rollNo(String val) {
            rollNo = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder lastname(String val) {
            lastname = val;
            return this;
        }

        public Builder address(String val) {
            address = val;
            return this;
        }

        public Builder telephone(String val) {
            telephone = val;
            return this;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
