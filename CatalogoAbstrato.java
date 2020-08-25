package dome.catalogo;

import dome.catalogo.midia.MidiaAbstrata;
import java.util.Vector;

public abstract class CatalogoAbstrato {
    protected Vector<MidiaAbstrata> lista;

    public CatalogoAbstrato() {
        lista = new Vector<MidiaAbstrata>();
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
            System.out.println("Lista vazia.\n");
        } else{
            while(i < lista.size()){
                System.out.println("ITEM " + (i + 1) + ":");
                lista.get(i).status();
                i++;
            }
        }
    }

    public MidiaAbstrata selecionar(String codigo) {
        int i = 0;
        boolean achou = false;
        while(!achou && i < lista.size()){
            if((lista.get(i)).getCodigo().equals(codigo)){
                achou = true;
            } else {
                i++;
            }
        }
        if(achou == true){
            System.out.println("Item encontrado!");
            return lista.get(i);
        } else {
            return null;
        }
    }
    
}
