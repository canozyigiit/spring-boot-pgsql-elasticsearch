package com.springbootwirhpostgresql.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
@Document(indexName = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @Field(name="first_name", type= FieldType.Text)
    private String firstName;

    @Column(name = "last_name")
    @Field(name="last_name", type= FieldType.Text)

    private String lastName;
}
