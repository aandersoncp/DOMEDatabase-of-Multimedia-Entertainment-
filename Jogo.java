package dome.catalogo.midia;

public class Jogo extends MidiaAbstrata{
    private int numeroJogadores;
    
    public Jogo() {
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNumeroJogadores(int numeroJogadores) {
        this.numeroJogadores = numeroJogadores;
    }
    
    public void status(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Tempo de reprodução: " + this.tempoReproducao + " minutos");
        if(copiaReal){
            System.out.println("Cópia: É Cópia real");
        } else {
            System.out.println("Cópia: Não é cópia real");
        }
        System.out.println("Número de jogadores suportados: " + this.numeroJogadores + " jogadores");
        System.out.println("Plataforma: " + this.comentario  + "\n");
    }
}
