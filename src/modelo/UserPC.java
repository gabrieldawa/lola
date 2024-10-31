package modelo;

import java.util.ArrayList;

public class UserPC {
    private String owner, name, OS;
    private int hdSize;
    private ArrayList<Game> games = new ArrayList<>();
    private ArrayList<Mod> mods = new ArrayList<>();

    public String getOwner() {
        return owner;
    }public void setOwner(String owner) {
        this.owner = owner;
    }
    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getOS() {
        return OS;
    }public void setOS(String oS) {
        OS = oS;
    }
    public int getHdSize() {
        return hdSize;
    }public void setHdSize(int hdSize) {
        this.hdSize = hdSize;
    }
    public ArrayList<Game> getGames() {
        return games;
    }public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
    public ArrayList<Mod> getMods() {
        return mods;
    }public void setMods(ArrayList<Mod> mods) {
        this.mods = mods;
    }

    UserPC(){
        super();
    }
    UserPC(String owner, String name, String oS, int hdSize, ArrayList<Game> games, ArrayList<Mod> mods) {
        this.owner = owner;
        this.name = name;
        OS = oS;
        this.hdSize = hdSize;
        this.games = games;
        this.mods = mods;
    }

    
    
}
