interface Renderizavel {
    String renderizar();
    String texto();
}

class PalavraBasica implements Renderizavel {
    private String conteudo;

    public PalavraBasica(String conteudo) {
        this.conteudo = conteudo;
    }

    public String renderizar() {
        return conteudo;
    }

    public String texto() {
        return conteudo;
    }
}

class DecoradorTexto implements Renderizavel {
    protected Renderizavel componente;

    public DecoradorTexto(Renderizavel componente) {
        this.componente = componente;
    }

    public String renderizar() {
        return "";
    }

    public String texto() {
        return "";
    }
}

class DecoradorNegrito extends DecoradorTexto {
    public DecoradorNegrito(Renderizavel componente) {
        super(componente);
    }

    public String renderizar() {
        return "<b>" + componente.renderizar() + "</b>";
    }

    public String texto() {
        return "<b>" + componente.texto() + "</b>";
    }
}

class DecoradorItalico extends DecoradorTexto {
    public DecoradorItalico(Renderizavel componente) {
        super(componente);
    }

    public String renderizar() {
        return "<i>" + componente.renderizar() + "</i>";
    }

    public String texto() {
        return "<i>" + componente.texto() + "</i>";
    }
}

class DecoradorSublinhado extends DecoradorTexto {
    public DecoradorSublinhado(Renderizavel componente) {
        super(componente);
    }

    public String renderizar() {
        return "<u>" + componente.renderizar() + "</u>";
    }

    public String texto() {
        return "<u>" + componente.texto() + "</u>";
    }
}
