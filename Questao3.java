// Interface Component (Abstração do padrão Decorator)
interface Attack {
    void performAttack();
}

// Concrete Component (Ataque Básico)
class BasicAttack implements Attack {
    @Override
    public void performAttack() {
        System.out.println("Realizando ataque básico!");
    }
}

// Decorator (Poder)
abstract class PowerDecorator implements Attack {
    protected Attack decoratedAttack;

    public PowerDecorator(Attack decoratedAttack) {
        this.decoratedAttack = decoratedAttack;
    }

    @Override
    public void performAttack() {
        decoratedAttack.performAttack();
    }
}

// Concrete Decorators (Poderes Específicos)
class Power1 extends PowerDecorator {
    public Power1(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void performAttack() {
        super.performAttack();
        System.out.println("Adicionando poder 1 ao ataque!");
    }
}

class Power2 extends PowerDecorator {
    public Power2(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void performAttack() {
        super.performAttack();
        System.out.println("Adicionando poder 2 ao ataque!");
    }
}

class Power3 extends PowerDecorator {
    public Power3(Attack decoratedAttack) {
        super(decoratedAttack);
    }

    @Override
    public void performAttack() {
        super.performAttack();
        System.out.println("Adicionando poder 3 ao ataque!");
    }
}

// Cliente (Classe Principal)
public class Questao3 {
    public static void main(String[] args) {
        // Criando o ataque básico
        Attack basicAttack = new BasicAttack();

        // Adicionando poderes ao ataque em tempo de execução
        Attack poweredAttack = new Power3(new Power2(new Power1(basicAttack)));

        // Simulando a execução do jogo
        System.out.println("Executando ataque com poderes:");
        poweredAttack.performAttack();
    }
}
