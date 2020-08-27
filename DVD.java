package dome.catalogo.midia;

import java.util.Scanner;

public class DVD extends MidiaAbstrata {
    private String responsavel;
    
    public DVD() {
        super();
    }
    
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
    
    @Override
    public void status(){
        System.out.println("Tipo: DVD");
        System.out.println("Código: " + this.codigo);
        System.out.println("Título: " + this.titulo);
        System.out.println("Diretor: " + this.responsavel);
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
        
        System.out.println("Digite o código do DVD:");
        this.codigo = (scanner.nextLine());
        
        System.out.println("Digite o título do DVD:");
        this.titulo = (scanner.nextLine());
        
        System.out.println("Digite o diretor do DVD:");
        this.responsavel = (scanner.nextLine());
        
        System.out.println("Digite um comentário para o DVD:");
        this.comentario = (scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do DVD em minutos:");
        this.tempoReproducao = (scanner.nextFloat());
        
        System.out.println("A cópia que você possui é uma cópia física?(Digite true ou false)");
        this.copiaReal = (scanner.nextBoolean());
    }
}
