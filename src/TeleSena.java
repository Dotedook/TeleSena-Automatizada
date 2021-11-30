public class TeleSena {

    private final static int valorVenda = 10;

    private int[] teleSenaUm;
    private int[] teleSenaDois;

    public TeleSena(){
        this.teleSenaUm = EventosAleatorios.novaTeleSena();
        this.teleSenaDois = EventosAleatorios.novaTeleSena();
    }


    public int[] getTeleSenaUm() {
        return this.teleSenaUm;
    }


    public int[] getTeleSenaDois() {
        return this.teleSenaDois;
    }


    public static int getValorVenda() {
        return valorVenda;
    }
}
