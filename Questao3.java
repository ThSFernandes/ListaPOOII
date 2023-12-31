
interface Ataque {
    void realizarAtaque();
}


class AtaqueBasico implements Ataque {
    @Override
    public void realizarAtaque() {
        System.out.println("Realizando ataque básico!");
    }
}


abstract class DecoradorPoder implements Ataque {
    protected Ataque ataqueDecorado;

    public DecoradorPoder(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    @Override
    public void realizarAtaque() {
        ataqueDecorado.realizarAtaque();
    }
}


class Poder1 extends DecoradorPoder {
    public Poder1(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public void realizarAtaque() {
        super.realizarAtaque();
        System.out.println("Adicionando poder 1 ao ataque!");
    }
}

class Poder2 extends DecoradorPoder {
    public Poder2(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public void realizarAtaque() {
        super.realizarAtaque();
        System.out.println("Adicionando poder 2 ao ataque!");
    }
}

class Poder3 extends DecoradorPoder {
    public Poder3(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public void realizarAtaque() {
        super.realizarAtaque();
        System.out.println("Adicionando poder 3 ao ataque!");
    }
}


