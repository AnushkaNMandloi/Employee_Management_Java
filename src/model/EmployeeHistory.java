/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anush
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    
    public Employee addNewEmployee(){
        Employee emp = new Employee();
        history.add(emp);
        return emp;
    }

    public void deleteEmployee(int num) {
        history.remove(num);
    }
    
    public int getLength(){
        return history.size();
    }

    public void updateData(int objnum, int id, String name, int age, String gender, String Startdt, int level, String team, String position, long contact, String email, String photo) {
        history.get(objnum).setId(id);
        history.get(objnum).setName(name);
        history.get(objnum).setAge(age);
        history.get(objnum).setGender(gender);
        history.get(objnum).setDate(Startdt);
        history.get(objnum).setLevel(level);
        System.out.println("level: " + level);
        history.get(objnum).setTeam(team);
        history.get(objnum).setPosition(position);
        history.get(objnum).setContact(contact);
        history.get(objnum).setEmail(email);
        history.get(objnum).setPhoto(photo);
        for(Employee h: history){
            System.out.println(h.getId());
            System.out.println(h.getName());
            System.out.println(h.getAge());
            System.out.println(h.getGender());
            System.out.println(h.getDate());
            System.out.println(h.getLevel());
            System.out.println(h.getTeam());
            System.out.println(h.getPosition());
            System.out.println(h.getContact());
            System.out.println(h.getEmail());
            System.out.println(h.getPhoto());
        }
    }
}
