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
public class Main {

    public static void main(String[] args) {

        Destinatario d = new Destinatario("Itamar", "Senador da República", 'M', "itamarbernardo2013@gmail.com");
        Destinatario d1 = new Destinatario("Junior", "Senadora da República", 'F', "itamarbernardo2013@gmail.com");
        
        
        //-----------------------Deputados-------------------------------------------------------------------------
        Destinatario d3 = new Destinatario("Adalberto Cavalcanti", "Deputado Federal", 'M', "dep.adalbertocavalcanti@camara.leg.br");
        Destinatario d4 = new Destinatario("André de Paula", "Deputada Federal", 'F', "dep.andredepaula@camara.gov.br");
        Destinatario d6 = new Destinatario("Augusto Coutinho", "Deputado Federal", 'M', "dep.augustocoutinho@camara.leg.br");
        Destinatario d7 = new Destinatario("Betinho Gomes", "Deputado Federal", 'M', "dep.betinhogomes@camara.leg.br");
        Destinatario d8 = new Destinatario("Carlos Eduardo", "Deputada Federal", 'M', "dep.carloseduardocadoca@camara.leg.br");
        Destinatario d9 = new Destinatario("Creuza Pereira", "Deputada Federal", 'F', "dep.creuzapereira@camara.leg.br");
        Destinatario d10 = new Destinatario("Daniel Coelho", "Deputado Federal", 'M', "dep.danielcoelho@camara.leg.br");
        Destinatario d11 = new Destinatario("Danilo Cabral", "Deputado Federal", 'M', "dep.danilocabral@camara.leg.br");
        Destinatario d12 = new Destinatario("Eduardo da Fonte", "Deputado Federal", 'M', "dep.eduardodafonte@camara.leg.br");
        Destinatario d13 = new Destinatario("Fernando Monteiro", "Deputado Federal", 'M', "dep.fernandomonteiro@camara.leg.br");
        Destinatario d14 = new Destinatario("Gonzaga Patriota", "Deputado Federal", 'M', "dep.gonzagapatriota@camara.leg.br");
        Destinatario d15 = new Destinatario("Guilherme Coelho", "Deputado Federal", 'M', "dep.guilhermecoelho@camara.leg.br");
        
        Destinatario d16 = new Destinatario("Jarbas Vasconcelos", "Deputado Federal", 'M', "dep.jarbasvasconcelos@camara.leg.br");
        Destinatario d17 = new Destinatario("João Fernando Coutinho", "Deputado Federal", 'M', "dep.joaofernandocoutinho@camara.leg.br");
        Destinatario d18 = new Destinatario("Jorge Côrte Real", "Deputado Federal", 'M', "dep.jorgecortereal@camara.leg.br");
        Destinatario d19 = new Destinatario("Kaio Maniçoba", "Deputado Federal", 'M', "dep.kaiomanicoba@camara.leg.br");
        Destinatario d20 = new Destinatario("Luciana Santos", "Deputada Federal", 'F', "dep.lucianasantos@camara.leg.br");
        Destinatario d21 = new Destinatario("Marinaldo Rosendo", "Deputado Federal", 'M', "dep.marinaldorosendo@camara.leg.br");
        Destinatario d22 = new Destinatario("Pastor Eurico", "Deputado Federal", 'M', "dep.pastoreurico@camara.leg.br");
        Destinatario d23 = new Destinatario("Ricardo Teobaldo", "Deputado Federal", 'M', "dep.ricardoteobaldo@camara.leg.br");
        
        Destinatario d24 = new Destinatario("Severino Ninho", "Deputado Federal", 'M', "dep.severinoninho@camara.leg.br");
        Destinatario d25 = new Destinatario("Silvio Costa", "Deputado Federal", 'M', "dep.silviocosta@camara.leg.br");
        Destinatario d26 = new Destinatario("Tadeu Alencar", "Deputado Federal", 'M', "dep.tadeualencar@camara.leg.br");
        Destinatario d27 = new Destinatario("Wolney Queiroz", "Deputado Federal", 'M', "dep.wolneyqueiroz@camara.leg.br");
        Destinatario d28 = new Destinatario("Zeca Cavalcanti", "Deputado Federal", 'M', "dep.zecacavalcanti@camara.leg.br");
        
        //------------------------------Senadores------------------------------------------
        
        Destinatario d5 = new Destinatario("Armando Monteiro", "Senador da República", 'M', "armando.monteiro@senador.leg.br");
        Destinatario d29 = new Destinatario("Benedito de Lira", "Senador da República", 'M', "benedito.lira@senador.leg.br");
        Destinatario d30 = new Destinatario("Fernando Collor", "Senador da República", 'M', "fernando.collor@senador.leg.br");
        
        Destinatario d31 = new Destinatario("Humberto Costa", "Senador da República", 'M', "humberto.costa@senador.leg.br");
        Destinatario d32 = new Destinatario("Eunício Oliveira", "Senador da República", 'M', "eunicio.oliveira@senador.leg.br");
        Destinatario d33 = new Destinatario("José Pimentel", "Senador da República", 'M', "jose.pimentel@senador.leg.br");
        Destinatario d34 = new Destinatario("Tasso Jereissati", "Senador da República", 'M', "tasso.jereissati@senador.leg.br");
        Destinatario d35 = new Destinatario("Lídice da Mata", "Senador da República", 'F', "lidice.mata@senadora.leg.br");
        Destinatario d36 = new Destinatario("Otto Alencar", "Senador da República", 'M', "otto.alencar@senador.leg.br");
        
        
        
        List<Destinatario> deputados = new ArrayList<>();
        deputados.add(d);
        deputados.add(d1);
        deputados.add(d3);
        deputados.add(d4);
        deputados.add(d6);
        deputados.add(d7);
        deputados.add(d8);
        deputados.add(d9);
        deputados.add(d10);
        deputados.add(d11);
        deputados.add(d12);
        deputados.add(d13);
        deputados.add(d14);
        deputados.add(d15);
        deputados.add(d16);
        deputados.add(d17);
        deputados.add(d18);
        deputados.add(d19);
        deputados.add(d20);
        deputados.add(d21);
        deputados.add(d22);
        deputados.add(d23);
        deputados.add(d24);
        deputados.add(d25);
        deputados.add(d26);
        deputados.add(d27);
        deputados.add(d28);
        
        List<Destinatario> senadores = new ArrayList<>();
        senadores.add(d5);
        senadores.add(d29);
        senadores.add(d30);
        senadores.add(d31);
        senadores.add(d32);
        senadores.add(d33);
        senadores.add(d34);
        senadores.add(d35);
        senadores.add(d36);
        
        
        String cumprimentoM = "Exmo. sr. ";
        String cumprimentoF = "Exma. sr.a ";

        String mensagem = "\n Venho, por meio deste, solicitar materiais jurídicos que possam ser enviados para a minha residência para fins de estudo.\n"
                + "\n"
                + "Gostaria muito de receber a Constituição Federal (CF) atualizada assim como códigos e anteprojetos que estão em discussão no Congresso Nacional.\n"
                + "\n"
                + "Desde já agradeço a atenção,\n"
                + "Favor enviar confirmação de recebimento.\n"
                + "\n"
                + "Segue, logo abaixo, meus dados para envio.\n"
                + "\n"
                + "Nome: Itamar Bernardo da Silva Júnior\n"
                + "Endereço: Rua Padre João Clemente/131\n"
                + "Bairro: Centro\n"
                + "CEP: 55330-000\n"
                + "Cidade: Bom Conselho\n"
                + "Estado: PE";

        Controlador controlador = new Controlador();
        
        controlador.enviaEmails(deputados, cumprimentoM, cumprimentoF, mensagem); //Envia para todos os deputados
        controlador.enviaEmails(senadores, cumprimentoM, cumprimentoF, mensagem); //Envia para os senadores
        


    }

}
