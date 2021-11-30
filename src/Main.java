public class Main {


    public static void main(String[] args){
        ControleTeleSena controleTeleSena = new ControleTeleSena();

        System.out.println("Bem-vindo ao sorteio da TeleSena do Silvio Santo!! Edi��o n�mero: 475");
        dormir(2);

        System.out.println("Nesta edi��o temos 20 participantes.");
        dormir(2);

        Pessoa[] participantes = controleTeleSena.getParticipantes();
        for(int i = 0; i < participantes.length; i++){
            System.out.println(i+1 + " - " + participantes[i].getNome());
            dormir(1);
        }

        System.out.println("Antes de realizarmos o sorteio, vamos � algumas informa��es essenciais.");
        dormir(2);
        System.out.println("Na edi��o 475 da TeleSena do Silvio Santos tivemos;");
        dormir(2);
        System.out.println(controleTeleSena.getQuantTeleSenasVendidas() + " TeleSenas vendidas!");
        dormir(3);
        System.out.println("Totalizando R$ " + controleTeleSena.getValorTotalVendas() + " de vendas!");
        dormir(3);
        System.out.println("O Lucro do S�lvio Santos foi de R$ " + controleTeleSena.getLucroSilvio());
        dormir(3);
        System.out.println("O valor total do pr�mio � de R$ " + controleTeleSena.getPremio());
        dormir(3);

        System.out.println("Vamos realizar o sorteio!");
        dormir(2);
        controleTeleSena.sorteioTeleSena();
        
        System.out.println("Foram sorteados " + controleTeleSena.getNumerosSorteados() + " n�meros!");
        dormir(2);

        if(controleTeleSena.getQuantGanhadores() > 1){
            System.out.println("A Edi��o 475 da TeleSena tem " + controleTeleSena.getQuantGanhadores() + " ganhadores!!!");
        }else {
            System.out.println("A Edi��o 475 da TeleSena tem " + controleTeleSena.getQuantGanhadores() + " ganhador!!!");
        }
        dormir(2);

        if(controleTeleSena.getQuantGanhadores() > 1){
            System.out.println("O pr�mio a ser dividido por estes ganhadores ser� de R$ " + controleTeleSena.getGanhoPorVencedor());
            dormir(2);
            System.out.println("Agora o momento que todos esperavam, os ganhadores da TeleSena edi��o 475 s�o");
        }else {
            System.out.println("O pr�mio que este ganhador levar� para casa sozinho ser� de R$ " + controleTeleSena.getGanhoPorVencedor());
            dormir(2);
            System.out.println("Agora o momento que todos esperavam, o ganhador(a) da TeleSena edi��o 475 �");
        }
        dormir(2);

        for (int i = 0; i < controleTeleSena.getVencedores().length; i++){
            if(controleTeleSena.getVencedores()[i] != null) {
                System.out.println(i + 1 + " - " + controleTeleSena.getVencedores()[i].getNome());
                dormir(1);
            }
        }

        System.out.println("Obrigado pela sua aten��o!!");

        System.out.println("Trabalho feito por: Eduardo Augusto Kuhn");

    }


    public static void dormir(int segundos){
        try{
            Thread.sleep(segundos * 1000);
        }catch(Exception e){}
    }

}
