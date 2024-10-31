package modelo;

import java.util.ArrayList;

public class User {
    private String name, email, password; //notnull
    private int ID;
    private String dob, bio; //optional
    private ArrayList<Game> games = new ArrayList<>();
    private ArrayList<Mod> mods = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }public void setPassword(String password) {
        this.password = password;
    }
    public int getID() {
        return ID;
    }public void setID(int iD) {
        ID = iD;
    }
    public String getDob() {
        return dob;
    }public void setDob(String dob) {
        this.dob = dob;
    }
    public String getBio() {
        return bio;
    }public void setBio(String bio) {
        this.bio = bio;
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
    public ArrayList<Review> getReviews() {
        return reviews;
    }public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    User(){
        super();
    }
    public User(String name, String email, String password, int iD, String dob, String bio, ArrayList<Game> games,
            ArrayList<Mod> mods, ArrayList<Review> reviews) {
        this.name = name;
        this.email = email;
        this.password = password;
        ID = iD;
        this.dob = dob;
        this.bio = bio;
        this.games = games;
        this.mods = mods;
        this.reviews = reviews;
    }
} 
