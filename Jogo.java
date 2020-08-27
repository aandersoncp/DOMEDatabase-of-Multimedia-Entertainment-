package dome.catalogo.midia;

import java.util.Scanner;

public class Jogo extends MidiaAbstrata {
    private int numeroJogadores;

    public Jogo() {
        super();
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
    
    @Override
    public void status(){
        System.out.println("Tipo: JOGO");
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Tempo de reprodução: " + this.tempoReproducao + " minutos");
        if(copiaReal){
            System.out.println("Cópia: É cópia real");
        } else {
            System.out.println("Cópia: Não é cópia real");
        }
        System.out.println("Número de jogadores suportados: " + this.numeroJogadores + " jogadores");
        System.out.println("Plataforma: " + this.comentario  + "\n");
    }
    
    @Override
    public void inserirInformaçaoMidia() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do JOGO:");
        this.codigo = (scanner.nextLine());
        
        System.out.println("Digite o título do JOGO:");
        this.titulo = (scanner.nextLine());
        
        System.out.println("Digite a plataforma do JOGO: ");
        this.comentario = (scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do JOGO em minutos:");
        this.tempoReproducao = (scanner.nextFloat());
        
        System.out.println("Digite o número de jogadores suportados:");
        this.numeroJogadores = (scanner.nextInt());
        
        System.out.println("A cópia que você possui é uma cópia física? (Digite true ou false): ");
        this.copiaReal = (scanner.nextBoolean());
    }
}
