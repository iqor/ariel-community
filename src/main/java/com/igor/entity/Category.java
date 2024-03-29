package com.igor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "category")
@Setter @Getter
public class Category implements Serializable {


    @Id
    @GeneratedValue
    private Integer id;

    private String name;


}
