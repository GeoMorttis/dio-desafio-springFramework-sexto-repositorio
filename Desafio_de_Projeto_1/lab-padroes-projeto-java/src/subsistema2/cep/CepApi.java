package subsistema2.cep;

public class CepApi {
    private static final CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Jundiaí";
    }
    public String recuperarEstado(String cep) {
        return "SP";
    }
}
