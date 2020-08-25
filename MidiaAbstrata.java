package dome.catalogo.midia;

public abstract class MidiaAbstrata {
    protected String codigo;
    protected String titulo;
    protected float tempoReproducao;
    protected boolean copiaReal;
    protected String comentario;
    
    public MidiaAbstrata() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getTempoReproducao() {
        return tempoReproducao;
    }

    public void setTempoReproducao(float tempoReproducao) {
        this.tempoReproducao = tempoReproducao;
    }

    public boolean getCopiaReal() {
        return copiaReal;
    }

    public void setCopiaReal(boolean copiaReal) {
        this.copiaReal = copiaReal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
   
    public abstract void status();
    
}
