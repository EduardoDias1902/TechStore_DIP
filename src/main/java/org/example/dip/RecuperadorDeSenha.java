package org.example.dip;

public class RecuperadorDeSenha {

    private Comunicador comunicador;

    public RecuperadorDeSenha(Comunicador comunicador){
        this.comunicador = comunicador;
    }
    public void recuperar(String email){
        String link = "http://techstore.com/reset?token=123";

        comunicador.enviar(
                "Clique no link para mudar senha:"+link
        );
    }
}
