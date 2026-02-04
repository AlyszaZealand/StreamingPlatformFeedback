package com.example.streamingplatformfeedback.model;

public class Favorite {
    private int userId;
    private int movieId;

    public Favorite(int userId, int movieId, int movieid){
        this.userId = userId;
        this.movieId = movieId;
    }



    public int getUserId(){
        return userId;
    }
    public void setUserID(int userId){
    this.userId = userId;
    }



    public int getMovieId(){
        return movieId;
    }
    public void setMovieId(int movieId){
        this.movieId = movieId;
    }



    @Override
    public String toString(){
        return "User (" + userId + ") favorite Movies (" + movieId + ")";
    }
}
