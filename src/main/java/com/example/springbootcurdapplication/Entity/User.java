package com.example.springbootcurdapplication.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="app-user")
public class User {
    @Id
    @GeneratedValue
    private int id ;
    private String name;
    private String address;
    
}
