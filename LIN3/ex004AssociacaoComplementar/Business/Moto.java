package LIN3.ex004AssociacaoComplementar.Business;

public class Moto extends Veiculo{
    
    public Moto(String nome, String fabricante, int ano) {
        super(nome, fabricante, ano);

    }
    
    protected boolean descansoAcionado;

    @Override
    public int acelerar(int velocidade){
        for (velocidade = 10; velocidade <= 180; velocidade += 10){
            System.out.println("\nAcelerando a moto \n" + velocidade);
        }
        return velocidade;
    }

    @Override
    public int desacelerar(int velocidade){
        for (velocidade = 180; velocidade >= 10; velocidade -= 10){
            System.out.println("\nDesacelerando a moto \n" + velocidade);
        }
        return velocidade;
    }

    @Override
    public int parar(int velocidade){ 
        if (velocidade == 0){
            System.out.println("\nA moto esta parado\n" + velocidade );
            this.descansoAcionado = true;
            System.out.println("E o descanso acionado   " + descansoAcionado);
        } else{
            this.descansoAcionado = false;
            System.out.println("O descanso foi desacionado  " + velocidade + "\n" + descansoAcionado  );
        }
        return velocidade;
}

    
}
