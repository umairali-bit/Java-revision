package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;

    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {

        if (findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong, durationOfSong));
            return true;
        }
        return false;
    }

    private Song findSong(String titleOfSong) {

        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(titleOfSong)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        int index = trackNumber - 1;
        if ((index > 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList){

        Song checkedSong = findSong(titleOfSong);

        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song '" + titleOfSong + "' is not in this album");
        return false;
    }


}
