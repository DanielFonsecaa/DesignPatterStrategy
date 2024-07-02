package io.codeforall.forsome;

public abstract class AbstractSpell implements Spell{

    Wizard wizard;

    public AbstractSpell(Wizard wizard) {
        this.wizard = wizard;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
