package com.example.demo.requests;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    @JsonProperty("firstName")
    String firstName;
    @JsonProperty("lastName")
    String lastName;

}