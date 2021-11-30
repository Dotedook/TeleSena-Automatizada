public class EventosAleatorios {


    public static int[] novaTeleSena(){
        int[] teleSena = new int[25];
        for (int i = 0; i < teleSena.length; i++){
            int numeroSorteado = (int)(Math.random() * 60 + 1);
            while (checkArrayContemNumero(teleSena, numeroSorteado)){
                numeroSorteado = (int)(Math.random() * 60 + 1);
            }
            teleSena[i] = numeroSorteado;
        }
        return teleSena;
    }


    public static int[] teleSenaSorteio(){
        int[] teleSena = new int[60];
        for (int i = 0; i < teleSena.length; i++){
            int numeroSorteado = (int)(Math.random() * 60 + 1);
            while (checkArrayContemNumero(teleSena, numeroSorteado)){
                numeroSorteado = (int)(Math.random() * 60 + 1);
            }
            teleSena[i] = numeroSorteado;
        }
        return teleSena;
    }


    public static boolean checkArrayContemNumero(int[] arrayInt, int numero){
        for (int j : arrayInt) {
            if (j == numero)
                return true;
        }
        return false;
    }


    public static String sorteiaNome() {
        return sorteiaPrimeiroNome() + " " + sorteiaSobrenome();
    }


    private static String sorteiaPrimeiroNome(){
        String[] nomes = {"Maria", "José", "Antônio", "João", "Francisco" ,"Ana" ,"Luiz" ,"Paulo" ,"Carlos" ,"Manoel"
                ,"Pedro" ,"Francisca" ,"Marcos" ,"Raimundo" ,"Sebastião" ,"Antônia" ,"Marcelo" ,"Jorge" ,"Márcia"
                ,"Geraldo" ,"Adriana" ,"Sandra" ,"Luis" ,"Fernando" ,"Fabio" ,"Roberto" ,"Márcio" ,"Edson" ,"André"
                ,"Sérgio" ,"Josefa" ,"Patrícia" ,"Daniel" , "Rodrigo", "Rafael", "Joaquim", "Vera", "Ricardo", "Eduardo", "Terezinha"};
        return nomes[sorteiaQuarenta() - 1];
    }


    private static String sorteiaSobrenome(){
        String[] sobrenomes = {"Silva", "Santos", "Oliveira", "Souza", "Rodrigues", "Ferreira", "Alves", "Ramos"
                ,"Pereira", "Lima", "Gomes", "Costa", "Ribeiro", "Martins", "Carvalho", "Almeida", "Lopes", "Soares", "Vieira"
                , "Barbosa", "Rocha", "Nascimento", "Andrade", "Moreira", "Nunes", "Marques", "Machado", "Mendes", "Freitas", "Cardoso"};
        return sobrenomes[sorteiaTrinta() - 1];
    }


    public static int sorteiaVinte() {
        return (int)(Math.random() * 20 + 1);
    }


    public static int sorteiaTrinta(){
        return (int)(Math.random() * 30 + 1);
    }


    public static int sorteiaQuarenta(){
        return (int)(Math.random() * 40 + 1);
    }


}
