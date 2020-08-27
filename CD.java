package dome.catalogo.midia;

import java.util.Scanner;

public class CD extends MidiaAbstrata {
    private int numeroFaixas;
    private String responsavel;
    
    public CD() {
        super();
    }
    
    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
    public void status(){
        System.out.println("Tipo: CD");
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.responsavel);
        System.out.println("Número de faixas: " + this.numeroFaixas);
        System.out.println("Tempo de reprodução: " + this.tempoReproducao + " minutos");
        if(copiaReal){
            System.out.println("Cópia: É cópia real");
        } else {
            System.out.println("Cópia: Não é cópia real");
        }
        System.out.println("Comentário: " + this.comentario + "\n");
    }

    @Override
    public void inserirInformaçaoMidia() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do CD:");
        this.codigo = (scanner.nextLine());
        
        System.out.println("Digite o título do CD:");
        this.titulo = (scanner.nextLine());
        
        System.out.println("Digite o artista do CD:");
        this.responsavel = (scanner.nextLine());
        
        System.out.println("Digite um comentário para o CD: ");
        this.comentario = (scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do CD em minutos:");
        this.tempoReproducao = (scanner.nextFloat());
        
        System.out.println("Digite o número de faixas do CD:");
        this.numeroFaixas = (scanner.nextInt());

        System.out.println("A cópia que você possui é uma cópia física? (Digite true ou false): ");
        this.copiaReal = (scanner.nextBoolean());
    }
}
