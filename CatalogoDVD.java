package dome.catalogo;

import dome.catalogo.midia.MidiaAbstrata;
import dome.catalogo.midia.DVD;
import java.util.Scanner;
import java.util.Vector;

public class CatalogoDVD extends CatalogoAbstrato {
    
    public CatalogoDVD() {
        super();
    }
    
    public void inserirInformacao() {
        DVD dvd = new DVD();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o código do DVD:");
        dvd.setCodigo(scanner.nextLine());
        
        System.out.println("Digite o título do DVD:");
        dvd.setTitulo(scanner.nextLine());
        
        System.out.println("Digite o diretor do DVD:");
        dvd.setResponsavel(scanner.nextLine());
        
        System.out.println("Digite um comentário para o DVD:");
        dvd.setComentario(scanner.nextLine());
        
        System.out.println("Digite o tempo de reprodução do DVD em minutos:");
        dvd.setTempoReproducao(scanner.nextFloat());
        
        System.out.println("A cópia que você possi é uma cópia física?(Digite true ou false)");
        dvd.setCopiaReal(scanner.nextBoolean());
        
        lista.add(dvd);
    }

    public void remover(String codigo) {
        lista.remove((DVD) selecionar(codigo));
    }
}