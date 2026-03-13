package org.example;

import org.example.dip.Comunicador;
import org.example.dip.RecuperadorDeSenha;
import org.example.dip.ServicoEmail;
import org.example.dip.ServicoSMS;

public class Main {
   public static void main(String[]arg){

       Comunicador email = new ServicoEmail();
       RecuperadorDeSenha recuperadorEmail =
               new RecuperadorDeSenha(email);

       recuperadorEmail.recuperar("cliente@techstore.com");

       Comunicador sms = new ServicoSMS();
       RecuperadorDeSenha recuperadorSMS =
               new RecuperadorDeSenha(sms);

       recuperadorSMS.recuperar("cliente@techstore.com");
   }
}