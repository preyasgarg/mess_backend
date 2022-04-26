package com.example.model;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@ToString
@Entity
@Table
public class Messtime {

    @Id
    private Integer id;
    private Float breakfastin;
    private Float breakfastout;
    private Float lunchin;
    private Float lunchout;
    private Float dinnerin;
    private Float dinnerout;
}
