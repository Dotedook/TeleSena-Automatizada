public class Pessoa {

    private String nome;
    private TeleSena[] teleSenas;
    private double valorGasto;
    private double valorPremiacao = 0;

    public Pessoa(){
        this.nome = EventosAleatorios.sorteiaNome();
        this.teleSenas = new TeleSena[EventosAleatorios.sorteiaVinte()];
        criarTeleSenas();
        this.valorGasto = TeleSena.getValorVenda() * this.teleSenas.length;
    }


    private void criarTeleSenas(){
        for (int i = 0; i < this.teleSenas.length; i ++){
            this.teleSenas[i] = new TeleSena();
        }
    }


    public double getValorPremiacao() {
        return this.valorPremiacao;
    }


    public String getNome() {
        return this.nome;
    }


    public TeleSena[] getTeleSenas() {
        return this.teleSenas;
    }


    public void setValorPremiacao(double valorPremiacao) {
        this.valorPremiacao = valorPremiacao;
    }


    public double getValorGasto(){
        return this.valorGasto;
    }


    public int getQuantTeleSenasCompradas(){
        return this.teleSenas.length;
    }
}
