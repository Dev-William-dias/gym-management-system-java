package model.entities;

import javafx.scene.image.Image;

public class Client {
    
    private Integer id;
    private Image potho;
    private String name;
    private String age;
    private String sex;
    private String contact;
    private String registration;
    private String status;
    private String email;
    private String emergencyContact;
    
    private String responsibleName;
    private String responsibleContact;
    
    private String plan;
    private Double value;
    private String lastPayment;

    public Client(String name, String age, String sex, String contact, String registration, String status, String email, String emergencyContact, String plan, Double value) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.contact = contact;
        this.registration = registration;
        this.status = status;
        this.email = email;
        this.emergencyContact = emergencyContact;
        this.plan = plan;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Image getPotho() {
        return potho;
    }

    public void setPotho(Image potho) {
        this.potho = potho;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsibleContact() {
        return responsibleContact;
    }

    public void setResponsibleContact(String responsibleContact) {
        this.responsibleContact = responsibleContact;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getLastPayment() {
        return lastPayment;
    }

    public void setLastPayment(String lastPayment) {
        this.lastPayment = lastPayment;
    }
    
}
