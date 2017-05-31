/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itamarbernardo.assistenteemailpersonalizado;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;

/**
 *
 * @author ANAFLAVIA
 */
public class Controlador {

    
    public Controlador() {
     
    }
    
    public void enviaEmails(List<Destinatario> destinatarios, String cumprimentoM, String cumprimentoF, String mensagem){
        
        String mensagemFinal;
        Email e = new Email();

        System.out.println(e.verificarConexao());
        
        if (e.verificarConexao() == true) {
            for (Destinatario des : destinatarios) {
                if (des.getSexo() == 'M') {
                    mensagemFinal = cumprimentoM + " " + des.getNome() + ", " + des.getTitulo() + ", \n" + mensagem;
                    System.out.println(mensagemFinal);
                } else {
                    mensagemFinal = cumprimentoF + " " + des.getNome() + ", " + des.getTitulo() + "\n" + mensagem;
                    System.out.println(mensagemFinal);
                }

                try {
                    e.sendEmail(des.getEmail(), des.getNome(), "Importante", mensagemFinal);
                    
                    System.out.println(des.getNome() + "\n" + des.getEmail());
                    
                } catch (EmailException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        } else {
            System.out.println("Não há conexão com a internet");
        }

    }
    
    
}
