package com.solvd.airport.mainclasses.users;

import com.solvd.airport.enums.GenderType;
import java.text.DateFormat;

public abstract class Person {

    private String surname;
    private String name;
    private long dni;
    private Enum<GenderType> gender;
    private String phoneNumber;
    private String passport;
    private DateFormat dateOfBirth;
    private int age;

    public Person() {
    }

    public Person(String surname, String name, String passport, long dni, Enum<GenderType> gender, String phoneNumber,
            DateFormat dateOfBirth, int age) {
        this.surname = surname;
        this.name = name;
        this.dni = dni;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.passport = passport;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Enum<GenderType> getGender() {
        return gender;
    }

    public void setGender(Enum<GenderType> gender) {
        this.gender = gender;
    }

    public String getSurname() {

        return this.surname;
    }

    public void setSurname(String name) {

        this.name = name;
    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public long dni() {

        return this.dni;

    }

    public void dni(long dni) {

        this.dni = dni;
    }

    public Enum<GenderType> getGenderType() {
        return gender;
    }

    public void setGenderType(Enum<GenderType> genderType) {
        this.gender = genderType;
    }

    public String getPassport() {

        return this.passport;
    }

    public void setPassport(String passport) {

        this.passport = passport;
    }

    public String getPhoneNumber() {

        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public DateFormat getDateOfBirth() {

        return this.dateOfBirth;
    }

    public void setDateOfBirth(DateFormat dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void IPassAdultL() {

    }

    public String toString() {
        return "Name: " + getName() + "\n" +
                "Passport number: " + getPassport() + "\n" +
                "Age: " + getAge() + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (dateOfBirth == null) {
            if (other.dateOfBirth != null)
                return false;
        } else if (!dateOfBirth.equals(other.dateOfBirth))
            return false;
        if (dni != other.dni)
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (passport == null) {
            if (other.passport != null)
                return false;
        } else if (!passport.equals(other.passport))
            return false;
        if (phoneNumber == null) {
            if (other.phoneNumber != null)
                return false;
        } else if (!phoneNumber.equals(other.phoneNumber))
            return false;
        if (surname == null) {
            if (other.surname != null)
                return false;
        } else if (!surname.equals(other.surname))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
        result = prime * result + (int) (dni ^ (dni >>> 32));
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((passport == null) ? 0 : passport.hashCode());
        result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
        result = prime * result + ((surname == null) ? 0 : surname.hashCode());
        return result;
    }

}