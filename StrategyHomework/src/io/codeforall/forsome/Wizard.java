package io.codeforall.forsome;

public class Wizard {
    String name;
    int life;

    public Wizard(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
