package io.codeforall.forsome;

public class Avara extends AbstractSpell{
    public Avara(Wizard wizard) {
        super(wizard);
    }

    @Override
    public void cast() {
        System.out.println("heh hehehe Harry Porra is dead");
        wizard.setLife(0);
        System.out.println(wizard.getLife());

    }
}
