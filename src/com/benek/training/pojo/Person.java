package com.benek.training.pojo;

import com.benek.training.enums.Sex.Sex;

import java.util.Date;

public class Person {
    private String name;
    private String lastName;
    private Date birthDate;
    private Sex sex;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name.equals("siurek") || name.equals("dupa")) {
            System.out.println("Bardzo kurwa smieszne");
        } else {
            this.name = name;
        }
    }
    // if test logiczny, instrukcja warunkowa  > doczytaj   !!!
    // else "w przeciwnym wypadku wykonaj inny blok kodu"
        /* prawda = 1 falsz = 0
        NO ! !1=0 !0=1
        AND &&
        1 AND 0 = 0
        0 AND 0 = 0
        1 AND 1 = 1
        OR ||
        1 OR 0 = 1
        0 OR 1 = 1
        1 OR 1 = 1
        0 OR 0 = 0
         */


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                '}';
    }
}
