package com.example.jpademo.entity;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student extends Base{
    private String firstName;
    private String lastName;
    private String email;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
