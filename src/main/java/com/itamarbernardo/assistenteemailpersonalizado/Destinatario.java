/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itamarbernardo.assistenteemailpersonalizado;

/**
 *
 * @author ANAFLAVIA
 */
class Destinatario {
    
    private String nome;
    private String titulo; //Senador, Deputado, etc;
    private char sexo;
    private String email;

  
    public Destinatario(String nome, String titulo, char sexo, String email) {
        this.nome = nome;
        this.titulo = titulo;
        this.sexo = sexo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
