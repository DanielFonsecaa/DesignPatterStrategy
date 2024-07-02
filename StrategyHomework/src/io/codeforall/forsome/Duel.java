package io.codeforall.forsome;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Duel {

    Wizard wizard;
    Prompt prompt;
    MenuInputScanner menu;
    Map<Integer, Spell> spellMap;

    public Duel() {
        this.wizard = new Wizard("HarryPorra", 100);
        this.prompt = new Prompt(System.in, System.out);
        this.spellMap = buildMap();
        this.menu = buildMenu();

    }


    private Map<Integer,Spell> buildMap() {
        Map<Integer,Spell> spells = new HashMap<>();

        spells.put(1,new Crucio(wizard));
        spells.put(2,new Avara(wizard));
        spells.put(3, new Imperiu(wizard));
        spells.put(4,new Leviosaaaa(wizard));

        return spells;
    }


    public MenuInputScanner buildMenu() {
        String[] options = spellMap.keySet().stream()
                .map(nr -> spellMap.get(nr).toString())
                .collect(Collectors.toList())
                .toArray(new String[spellMap.size()]);


        MenuInputScanner menu = new MenuInputScanner(options);
        menu.setMessage("Choose which spell");
        menu.setError("Choose a fucking spell");
        return menu;
    }

    public void start(){
        while(true){
            int choice = prompt.getUserInput(menu);
            spellMap.get(choice).cast();
            if(wizard.getLife() == 0){
                System.out.println("GAME OVER");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Duel duel = new Duel();
        duel.start();
    }
}
