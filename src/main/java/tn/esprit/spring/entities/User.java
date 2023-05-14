package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("idUser")
    private Long IDUser;
    @Column(nullable = false, unique = true, length = 50)
    @JsonProperty("username")
    private String UserName;
    @Column(nullable = false, unique = true)
    @JsonProperty("email")
    private String Email;
    @Column(nullable = false)
    @JsonProperty("nom")
    private String Nom;
    @Column(nullable = false)
    @JsonProperty("prenom")
    private String Prenom;
    @Column(nullable = false)
    @JsonProperty("age")
    private int Age;
}