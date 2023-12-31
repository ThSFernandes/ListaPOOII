// Interface Componente
interface Renderable {
    String render();
    String text();
}

// Componente Concreto
class BasicWord implements Renderable {
    private String content;

    public BasicWord(String content) {
        this.content = content;
    }

    public String render() {
        return content;
    }

    public String text() {
        return content;
    }
}

// Decorador
class TextDecorator implements Renderable {
    protected Renderable component;

    public TextDecorator(Renderable component) {
        this.component = component;
    }

    public String render() {
        return "";
    }

    public String text() {
        return "";
    }
}

// Decoradores Concretos
class BoldDecorator extends TextDecorator {
    public BoldDecorator(Renderable component) {
        super(component);
    }

    public String render() {
        return "<b>" + component.render() + "</b>";
    }

    public String text() {
        return "<b>" + component.text() + "</b>";
    }
}

class ItalicDecorator extends TextDecorator {
    public ItalicDecorator(Renderable component) {
        super(component);
    }

    public String render() {
        return "<i>" + component.render() + "</i>";
    }

    public String text() {
        return "<i>" + component.text() + "</i>";
    }
}

class UnderlineDecorator extends TextDecorator {
    public UnderlineDecorator(Renderable component) {
        super(component);
    }

    public String render() {
        return "<u>" + component.render() + "</u>";
    }

    public String text() {
        return "<u>" + component.text() + "</u>";
    }
}

// Cliente
public class Questao2 {
    public static void main(String[] args) {
        Renderable normalWord = new BasicWord("normal");
        Renderable boldWord = new BoldDecorator(new BasicWord("negrito"));
        Renderable italicWord = new ItalicDecorator(new BasicWord("itálico"));
        Renderable underlineWord = new UnderlineDecorator(new BasicWord("sublinhado"));

        // Renderizando e exibindo as palavras
        System.out.println(normalWord.render() + " " + normalWord.text());
        System.out.println(boldWord.render() + " " + boldWord.text());
        System.out.println(italicWord.render() + " " + italicWord.text());
        System.out.println(underlineWord.render() + " " + underlineWord.text());
    }
}
