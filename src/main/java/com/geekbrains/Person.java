package com.geekbrains;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phonenumber;
    private int salary;
    private int age;

    public Person(String fio, String position, String email, String phonenumber, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }

    public void infoAboutPerson(){
        System.out.println("ФИО: " + fio + " Должность: " + position +
                " Email: " + email + " Номер телефона: " + phonenumber +
                " Зарплата: " + salary + " Возраст: " + age);
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
