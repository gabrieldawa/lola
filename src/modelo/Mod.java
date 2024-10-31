package modelo;

import java.util.ArrayList;

public class Mod extends Game{
    Mod(){
        super();
    }
    Mod(String name, String developer, String publisher, String cover, String genre, int iD, int rating,
            int downloads, int size, int gametime, boolean windows, boolean mac, boolean linux, boolean controller,
            ArrayList<Mod> mods, ArrayList<Review> reviews, String torrent){
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
}
