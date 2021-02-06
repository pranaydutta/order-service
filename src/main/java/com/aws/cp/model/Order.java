package com.aws.cp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Order {

    private int id;
    private String name;
    private int quantity;
    private long price;


}
