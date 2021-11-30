public class Main {


    public static void main(String[] args){
        ControleTeleSena controleTeleSena = new ControleTeleSena();

        System.out.println("Bem-vindo ao sorteio da TeleSena do Silvio Santo!! Edição número: 475");
        dormir(2);

        System.out.println("Nesta edição temos 20 participantes.");
        dormir(2);

        Pessoa[] participantes = controleTeleSena.getParticipantes();
        for(int i = 0; i < participantes.length; i++){
            System.out.println(i+1 + " - " + participantes[i].getNome());
            dormir(1);
        }

        System.out.println("Antes de realizarmos o sorteio, vamos à algumas informações essenciais.");
        dormir(2);
        System.out.println("Na edição 475 da TeleSena do Silvio Santos tivemos;");
        dormir(2);
        System.out.println(controleTeleSena.getQuantTeleSenasVendidas() + " TeleSenas vendidas!");
        dormir(3);
        System.out.println("Totalizando R$ " + controleTeleSena.getValorTotalVendas() + " de vendas!");
        dormir(3);
        System.out.println("O Lucro do Sílvio Santos foi de R$ " + controleTeleSena.getLucroSilvio());
        dormir(3);
        System.out.println("O valor total do prêmio é de R$ " + controleTeleSena.getPremio());
        dormir(3);

        System.out.println("Vamos realizar o sorteio!");
        dormir(2);
        controleTeleSena.sorteioTeleSena();
        
        System.out.println("Foram sorteados " + controleTeleSena.getNumerosSorteados() + " números!");
        dormir(2);

        if(controleTeleSena.getQuantGanhadores() > 1){
            System.out.println("A Edição 475 da TeleSena tem " + controleTeleSena.getQuantGanhadores() + " ganhadores!!!");
        }else {
            System.out.println("A Edição 475 da TeleSena tem " + controleTeleSena.getQuantGanhadores() + " ganhador!!!");
        }
        dormir(2);

        if(controleTeleSena.getQuantGanhadores() > 1){
            System.out.println("O prêmio a ser dividido por estes ganhadores será de R$ " + controleTeleSena.getGanhoPorVencedor());
            dormir(2);
            System.out.println("Agora o momento que todos esperavam, os ganhadores da TeleSena edição 475 são");
        }else {
            System.out.println("O prêmio que este ganhador levará para casa sozinho será de R$ " + controleTeleSena.getGanhoPorVencedor());
            dormir(2);
            System.out.println("Agora o momento que todos esperavam, o ganhador(a) da TeleSena edição 475 é");
        }
        dormir(2);

        for (int i = 0; i < controleTeleSena.getVencedores().length; i++){
            if(controleTeleSena.getVencedores()[i] != null) {
                System.out.println(i + 1 + " - " + controleTeleSena.getVencedores()[i].getNome());
                dormir(1);
            }
        }

        System.out.println("Obrigado pela sua atenção!!");

        System.out.println("Trabalho feito por: Eduardo Augusto Kuhn");

    }


    public static void dormir(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch(Exception e){}
    }

}
