package models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "worker")
public class Worker {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name= "name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCoordinates_x() {
        return coordinates_x;
    }

    public void setCoordinates_x(double coordinates_x) {
        this.coordinates_x = coordinates_x;
    }

    public double getCoordinates_y() {
        return coordinates_y;
    }

    public void setCoordinates_y(double coordinates_y) {
        this.coordinates_y = coordinates_y;
    }

    public LocalDate getCreationdDate() {
        return creationdDate;
    }

    public void setCreationdDate(LocalDate creationdDate) {
        this.creationdDate = creationdDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOrganizationFullName() {
        return organizationFullName;
    }

    public void setOrganizationFullName(String organizationFullName) {
        this.organizationFullName = organizationFullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "coordinates_x")
    private double coordinates_x;
    @Column(name = "coordinates_y")
    private double coordinates_y;
    @Column(name = "creation_date")
    private LocalDate creationdDate;
    @Column(name = "salary")
    private int salary;
    @Column(name = "start_date")
    private LocalDate startDate;
    @Column(name ="end_date")
    private LocalDateTime endDate;
    @Column(name="position")
    private String position;

    @Column(name="organization_fullname")
    private String organizationFullName;
    @Column(name ="username" )
    private String userName;

}
