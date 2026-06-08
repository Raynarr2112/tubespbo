package com.ecotukar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private String username;
    private String password;
    private String name;
    private String email;
    private String role; // CUSTOMER, COURIER, ADMIN
    private String avatar;
    private String address;
    private String joined;
    private int points;
    private int ewalletBalance;

    public User() {}

    public User(String username, String password, String name, String email, String role, String avatar, String address, String joined, int points, int ewalletBalance) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.role = role;
        this.avatar = avatar;
        this.address = address;
        this.joined = joined;
        this.points = points;
        this.ewalletBalance = ewalletBalance;
    }

    // Constructor lama (untuk kompatibilitas dengan EcoTukarService sebelum kita bersihkan)
    public User(String username, String name, String email, String role, String avatar, String address, String joined, int points, int ewalletBalance) {
        this.username = username;
        this.password = "123456"; // Default password
        this.name = name;
        this.email = email;
        this.role = role;
        this.avatar = avatar;
        this.address = address;
        this.joined = joined;
        this.points = points;
        this.ewalletBalance = ewalletBalance;
    }

    public User(String username, String name, String email, String role, String avatar, String address, String joined, int points) {
        this(username, name, email, role, avatar, address, joined, points, 0);
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getJoined() { return joined; }
    public void setJoined(String joined) { this.joined = joined; }

    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }

    public int getEwalletBalance() { return ewalletBalance; }
    public void setEwalletBalance(int ewalletBalance) { this.ewalletBalance = ewalletBalance; }

    public void addPoints(int amount) {
        this.points += amount;
    }
}
