public class ControleTeleSena {

    private Pessoa[] participantes;
    private int quantGanhadores;
    private double premio;
    private double lucroSilvio;
    private double valorTotalVendas = 0;
    private Pessoa[] vencedores;
    private int[] teleSenaPremiada;
    private int numerosSorteados;
    private double ganhoPorVencedor;
    private int quantTeleSenasVendidas;

    public ControleTeleSena(){
        this.participantes = new Pessoa[20];
        popularParticipantes();
        setValorTotalVendas();
        this.premio = this.valorTotalVendas * 0.8;
        this.lucroSilvio = this.valorTotalVendas * 0.2;
        this.vencedores = new Pessoa[20];
        this.teleSenaPremiada = EventosAleatorios.teleSenaSorteio();
        this.numerosSorteados = 25;
        setTeleSenasVendidas();
    }

    public Pessoa[] getParticipantes() {
        return this.participantes;
    }

    public double getPremio() {
        return this.premio;
    }

    public double getLucroSilvio() {
        return this.lucroSilvio;
    }

    public double getValorTotalVendas() {
        return this.valorTotalVendas;
    }

    public Pessoa[] getVencedores() {
        return this.vencedores;
    }

    public int[] getTeleSenaPremiada() {
        return this.teleSenaPremiada;
    }

    public double getGanhoPorVencedor(){
        return this.ganhoPorVencedor;
    }

    public int getQuantGanhadores(){
        return this.quantGanhadores;
    }

    public int getQuantTeleSenasVendidas(){
        return this.quantTeleSenasVendidas;
    }
    
    public int getNumerosSorteados() {
    	return this.numerosSorteados;
    }

    private void popularParticipantes(){
        for(int i = 0; i < this.participantes.length; i++)
            this.participantes[i] = new Pessoa();
    }

    private void setValorTotalVendas(){
        for (Pessoa participante : this.participantes)
            this.valorTotalVendas += participante.getValorGasto();
    }

    public void sorteioTeleSena(){
        while (checkVencedor()){
            for (Pessoa participante : this.participantes) {
                for (int j = 0; j < participante.getTeleSenas().length; j++) {
                    boolean teleSenaUmGanhou = checkTeleSenaPremiada(participante.getTeleSenas()[j].getTeleSenaUm(), this.teleSenaPremiada, this.numerosSorteados);
                    boolean teleSenaDoisGanhou = checkTeleSenaPremiada(participante.getTeleSenas()[j].getTeleSenaDois(), this.teleSenaPremiada, this.numerosSorteados);
                    checkVenceu(teleSenaUmGanhou, teleSenaDoisGanhou, participante);
                }
            }
            this.numerosSorteados += 1;
        }
        setGanhoPorVencedor();
    }

    private boolean checkVencedor(){
        return this.vencedores[0] == null;
    }

    public boolean checkTeleSenaPremiada(int[] teleSenaParticipante, int[] teleSenaPremiada, int numerosSorteados){
        int quantNumerosIguais = 0;
        for(int k = 0; k < numerosSorteados; k++){
            if(EventosAleatorios.checkArrayContemNumero(teleSenaParticipante, teleSenaPremiada[k])) {
                quantNumerosIguais += 1;
            }
        }
        return quantNumerosIguais == 25;
    }

    private void checkVenceu(boolean teleSenaUm, boolean teleSenaDois, Pessoa participante){
        if(teleSenaUm) {
            adicionarNosVencedores(participante);
            this.quantGanhadores++;
        }
        if(teleSenaDois) {
            adicionarNosVencedores(participante);
            this.quantGanhadores++;
        }
    }

    private void adicionarNosVencedores(Pessoa participante) {
        for(int i = 0; i < this.vencedores.length; i ++){
            if (this.vencedores[i] == null) {
                this.vencedores[i] = participante;
                break;
            }
        }
    }


    public void imprimeTeleSena(int[] teleSena){
        for (int i : teleSena){
            System.out.print(i + " ");
        }
    }

    private void setGanhoPorVencedor(){
        this.ganhoPorVencedor = this.premio / this.quantGanhadores;
        setValorPremiacaoVencedores();
    }

    private void setValorPremiacaoVencedores() {
        for (Pessoa vencedor : this.vencedores) {
            if (vencedor != null) {
                vencedor.setValorPremiacao(this.ganhoPorVencedor);
            }
        }
    }

    public void imprimeVencedores(){
        for(int i = 0; i < this.vencedores.length; i++){
            if(this.vencedores[i] != null){
                System.out.println(i+1 + " - " + this.vencedores[i].getNome());
            }
        }
    }

    private void setTeleSenasVendidas(){
        for(Pessoa pessoa : this.participantes){
            this.quantTeleSenasVendidas += pessoa.getQuantTeleSenasCompradas();
        }
    }


}
