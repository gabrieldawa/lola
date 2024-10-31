package modelo;

import java.util.ArrayList;

public class Game {
    protected String name, developer, publisher, cover, genre;
    protected int ID, rating, downloads, size, gametime;
    protected boolean Windows, Mac, Linux, Controller;
    protected ArrayList<Mod> mods = new ArrayList<>();
    protected ArrayList<Review> reviews = new ArrayList<>();
    protected String torrent;

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getDeveloper() {
        return developer;
    }public void setDeveloper(String developer) {
        this.developer = developer;
    }
    public String getPublisher() {
        return publisher;
    }public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getCover() {
        return cover;
    }public void setCover(String cover) {
        this.cover = cover;
    }
    public String getGenre() {
        return genre;
    }public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getID() {
        return ID;
    }public void setID(int iD) {
        ID = iD;
    }
    public int getRating() {
        return rating;
    }public void setRating(int rating) {
        this.rating = rating;
    }
    public int getDownloads() {
        return downloads;
    }public void setDownloads(int downloads) {
        this.downloads = downloads;
    }
    public int getSize() {
        return size;
    }public void setSize(int size) {
        this.size = size;
    }
    public int getGametime() {
        return gametime;
    }public void setGametime(int gametime) {
        this.gametime = gametime;
    }
    public boolean isWindows() {
        return Windows;
    }public void setWindows(boolean Windows) {
        this.Windows = Windows;
    }
    public boolean isMac() {
        return Mac;
    }public void setMac(boolean Mac) {
        this.Mac = Mac;
    }
    public boolean isLinux() {
        return Linux;
    }public void setLinux(boolean Linux) {
        this.Linux = Linux;
    }
    public boolean isController() {
        return Controller;
    }public void setController(boolean Controller) {
        this.Controller = Controller;
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
    public String getTorrent() {
        return torrent;
    }public void setTorrent(String torrent) {
        this.torrent = torrent;
    }

    Game(){
        super();
    }
    
    Game(String name, String developer, String publisher, String cover, String genre, int iD, int rating,
            int downloads, int size, int gametime, boolean windows, boolean mac, boolean linux, boolean controller,
            ArrayList<Mod> mods, ArrayList<Review> reviews, String torrent) {
        this.name = name;
        this.developer = developer;
        this.publisher = publisher;
        this.cover = cover;
        this.genre = genre;
        this.ID = iD;
        this.rating = rating;
        this.downloads = downloads;
        this.size = size;
        this.gametime = gametime;
        this.Windows = windows;
        this.Mac = mac;
        this.Linux = linux;
        this.Controller = controller;
        this.mods = mods;
        this.reviews = reviews;
        this.torrent = torrent;
    }

    public String toString(){
        return "0";
    }
}