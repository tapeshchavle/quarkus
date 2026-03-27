package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTO {
    private  String name;
    private int age;
    private String location;
}
