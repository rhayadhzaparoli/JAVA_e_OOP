package LIN3.ex004Atividade.Business;

public  class Veiculo {
    private String nome;
    private String fabricante;
    private int ano;
    private int velocidade;

    

    public String getNome() {
        return nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public Veiculo(String nome, String fabricante, int ano) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.ano = ano;
        this.velocidade = 0;
    }

    public void acelerar() {
        if (velocidade < 180) { 
            velocidade += 5;
            System.out.println("\nVelocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Velocidade máxima atingida: " + velocidade + " km/h");
        }
    }

    public void desacelerar() {
        if (velocidade > 0) {
            velocidade -= 5;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O veículo já está parado.");
        }
    }

    public void parar() {
        velocidade = 0;
        System.out.println("O veículo parou.");
    }}