/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anush
 */
public class Employee {

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    int id,age, level;
    long contact;
    String name, gender, team, position, Startdt, photo, email;
    
    public Employee(){
       this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return Startdt;
    }

    public void setDate(String Startdt) {
        this.Startdt = Startdt;
    }
    
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    
    public Employee(int id, String name, int age, String gender, String Startdt, int level, String team, String position, long contact,String email, String photo){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Startdt=Startdt;
        this.level=level;
        this.team=team;
        this.position=position;
        this.contact=contact;
        this.email = email;
        this.photo = photo;
    }
}
