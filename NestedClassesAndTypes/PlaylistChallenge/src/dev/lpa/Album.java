package dev.lpa;

import java.util.ArrayList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;



    private class SongList {

        private ArrayList<Song> songs;

        public SongList(ArrayList<Song> songs) {
            this.songs = songs;
        }

        private boolean add (Song song) {
            if (songs.contains(song)) {
                return false;
            } else {
                this.songs.add(song);
                return true;
            }
        }

        private Song findSong (String title) {
            for (Song checkedSong : this.songs) {
                if (checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }

            return null;
            }

            private Song findSong (int trackNumber) {

                int index = trackNumber - 1;
                if ((index >= 0) && (index < this.songs.size())) {
                    return this.songs.get(index);
                }
                return null;
            }
        }
    }




