package model;

import java.util.Objects;

public class User {
    private String firstName, lastName, postalAddress, emailAddress, password, district, subDistrict;
    private int IDNum, phoneContact;
    private char gender;

    // Empty constructors
    public User(){}

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPostalAddress() {
        return postalAddress;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public String getPassword() {
        return password;
    }
    public String getDistrict() {
        return district;
    }
    public String getSubDistrict() {
        return subDistrict;
    }
    public int getIDNum() {
        return IDNum;
    }
    public int getPhoneContact() {
        return phoneContact;
    }
    public char getGender() {
        return gender;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }
    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }
    public void setPhoneContact(int phoneContact) {
        this.phoneContact = phoneContact;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // equals() and hashCodes()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getIDNum() == user.getIDNum() && getPhoneContact() == user.getPhoneContact() && getGender() == user.getGender() && getFirstName().equals(user.getFirstName()) && getLastName().equals(user.getLastName()) && getPostalAddress().equals(user.getPostalAddress()) && getEmailAddress().equals(user.getEmailAddress()) && getPassword().equals(user.getPassword()) && getDistrict().equals(user.getDistrict()) && getSubDistrict().equals(user.getSubDistrict());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getPostalAddress(), getEmailAddress(), getPassword(), getDistrict(), getSubDistrict(), getIDNum(), getPhoneContact(), getGender());
    }

    // toString()

    @Override
    public String toString() {
        return "User[" +
                "firstName: " + firstName + '\'' +
                ", lastName: " + lastName + '\'' +
                ", postalAddress: " + postalAddress + '\'' +
                ", emailAddress: " + emailAddress + '\'' +
                ", password: " + password + '\'' +
                ", district: " + district + '\'' +
                ", subDistrict: " + subDistrict + '\'' +
                ", IDNum: " + IDNum +
                ", phoneContact: " + phoneContact +
                ", gender: " + gender +
                ']';
    }
}
