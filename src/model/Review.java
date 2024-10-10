package model;

public class Review {
    private int uID, gID, rating;
    private String title, body;

    public int getuID() {
        return uID;
    }public void setuID(int uID) {
        this.uID = uID;
    }
    public int getgID() {
        return gID;
    }public void setgID(int gID) {
        this.gID = gID;
    }
    public int getRating() {
        return rating;
    }public void setRating(int rating) {
        this.rating = rating;
    }
    public String getTitle() {
        return title;
    }public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }public void setBody(String body) {
        this.body = body;
    }

    Review(){
        super();
    }
    public Review(int uID, int gID, int rating, String title, String body) {
        this.uID = uID;
        this.gID = gID;
        this.rating = rating;
        this.title = title;
        this.body = body;
    }
    
    
}
