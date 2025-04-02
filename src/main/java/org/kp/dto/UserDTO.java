package org.kp.dto;

import org.kp.enums.Category;
import java.time.LocalDateTime;

public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private Category role;
    private LocalDateTime registeredAt;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String email,
                   Category role, LocalDateTime registeredAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.registeredAt = registeredAt;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Category getRole() { return role; }
    public void setRole(Category role) { this.role = role; }
    public LocalDateTime getRegisteredAt() { return registeredAt; }
    public void setRegisteredAt(LocalDateTime registeredAt) { this.registeredAt = registeredAt; }
}