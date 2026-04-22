package dev.lucasvargas.PooJava.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Fisica"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio) {
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static TipoCliente tipoClientePorRelatorio(String nomeRelatorio){
        for (TipoCliente tipoCliente : values()){
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)){
                return tipoCliente;
            }
        }
        return null;
    }

    public String getNomeRelatorio(){
        return this.nomeRelatorio = nomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }
}
