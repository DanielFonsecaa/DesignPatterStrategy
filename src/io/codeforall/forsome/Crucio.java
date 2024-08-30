package io.codeforall.forsome;

public class Crucio extends AbstractSpell {
    public Crucio(Wizard wizard) {
        super(wizard);
    }

    @Override
    public void cast() {
        System.out.println("Crucio");
        wizard.setLife(wizard.getLife() - 20);
        System.out.println(wizard.getLife());

    }
}
