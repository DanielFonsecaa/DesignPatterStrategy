package io.codeforall.forsome;

public class Imperiu extends AbstractSpell{
    public Imperiu(Wizard wizard) {
        super(wizard);
    }

    @Override
    public void cast() {
        System.out.println(wizard.getName() + " cannot move");
    }
}
