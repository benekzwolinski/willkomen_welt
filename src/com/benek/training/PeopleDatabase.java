package com.benek.training;

import com.benek.training.enums.Sex.Sex;
import com.benek.training.pojo.Person;

import java.util.GregorianCalendar;

public class PeopleDatabase {
 public static void main(String[] args) {
  Person krystynaPawlowicz = new Person();
  krystynaPawlowicz.setName("Krystyna");
  krystynaPawlowicz.setLastName("Pawlowicz");
  krystynaPawlowicz.setSex(Sex.Female);
  GregorianCalendar calendar = new GregorianCalendar(1964, 2, 2);
  krystynaPawlowicz.setBirthDate(calendar.getTime());

  krystynaPawlowicz.setName("siurek");

  System.out.println(krystynaPawlowicz.toString());
 }

}
