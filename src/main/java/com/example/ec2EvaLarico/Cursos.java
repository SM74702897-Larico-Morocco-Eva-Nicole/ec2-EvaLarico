package com.example.ec2EvaLarico;

//import jakarta.annotation.Generated;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;

//@Entity
//@Table(name="cursos")
public class Cursos {
    //@Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private Integer creditos;

    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getCreditos(){
        return creditos;
    }
    public void setCreditos(Integer creditos){
        this.creditos = creditos;
    }

}
