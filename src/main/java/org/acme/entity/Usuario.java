package org.acme.entity;

import io.quarkus.runtime.annotations.RegisterForReflection;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@Entity
@RegisterForReflection
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_user")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtbl_user")
    public Integer id;
    @Column(name = "tbl_name")
    public String name;
    @Column(name = "tbl_lastname")
    public String lastname;
    @Column(name = "tbl_createat")
    public LocalDate createat;
}
