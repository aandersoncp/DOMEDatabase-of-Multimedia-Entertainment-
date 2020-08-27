package dome.catalogo;

import dome.catalogo.midia.CD;
import dome.catalogo.midia.DVD;
import dome.catalogo.midia.Jogo;
import dome.catalogo.midia.MidiaAbstrata;
import java.util.Vector;

public class CatalogoMidia {
    protected Vector<MidiaAbstrata> lista;
    
    public CatalogoMidia() {
        lista = new Vector<MidiaAbstrata>();
    }
    
    public void inserirInformacao(MidiaAbstrata midia) {
        midia.inserirInformaçaoMidia();
        lista.add(midia); 
    }
    
    public MidiaAbstrata consultar(String titulo) {
        int i = 0;
        boolean achou = false;
        while(!achou && i < lista.size()){
            if((lista.get(i)).getTitulo().equals(titulo)){
                achou = true;
            } else {
                i++;
            }
        }
        if(achou == true){
            return lista.get(i);
        } else {
            return null;
        }
    }

    public void listar() {
        int i = 0;
        if(lista.isEmpty()){
            System.out.println("Catálogo vazio.\n");
        } else{
            System.out.println("------ LISTA ------\n");
            while(i < lista.size()){
                System.out.println("ITEM " + (i + 1) + ":");
                lista.get(i).status();
                i++;
            }
        }
    }
    
    public void remover(String titulo) {
        lista.remove(consultar(titulo));
    }
    
    public void listarEspecifica(String tipo){
        int i = 0;
        if(lista.isEmpty()){
            System.out.println("\nCatálogo vazio.\n");
        } else{
            int j = 0;
            switch (tipo) {
                case "CD":
                    System.out.println("\n---- LISTA DE CDs ----\n");
                    while(i < lista.size()){
                        if(lista.get(i) instanceof CD){
                            System.out.println("ITEM " + (i + 1) + ":");
                            lista.get(i).status();
                            j++;
                        }
                        i++;
                    }
                    if(j == 0){
                        System.out.println("\nNão há CDs!\n");
                    }
                            break;
                case "DVD":
                    System.out.println("\n---- LISTA DE DVDs ----\n");
                    while(i < lista.size()){
                        if(lista.get(i) instanceof DVD){
                            System.out.println("ITEM " + (i + 1) + ":");
                            lista.get(i).status();
                            j++;
                        }
                        i++;
                    }
                    if(j == 0){
                        System.out.println("\nNão há DVDs!\n");
                    }
                    break;
                default:
                    System.out.println("\n---- LISTA DE JOGOs ----\n");
                    while(i < lista.size()){
                        if(lista.get(i) instanceof Jogo){
                            System.out.println("ITEM " + (i + 1) + ":");
                            lista.get(i).status();
                            j++;
                        }
                        i++;
                    }   
                    if(j == 0){
                        System.out.println("\nNão há JOGOS!\n");
                    }
                    break;
            }
            
        }
    }

}
