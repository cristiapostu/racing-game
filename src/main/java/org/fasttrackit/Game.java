package org.fasttrackit;

public class Game {

    private Track[] tracks = new Track[10];

    Vehicle firstCompetitor;
    Vehicle secondCompeptitor;

    public void start() {
        addTracks();
        displayAvailableTracks();
    }

    private void addTracks() {
        Track track1 = new Track("Highway", 300);
        Track track2 = new Track("Seaside", 300);

        tracks[0] = track1;
        tracks[1] = track2;
    }

    private void displayAvailableTracks() {
        System.out.println("Available tracks");
        System.out.println(tracks[0].getName());
        System.out.println(tracks[1].getName());


    }

}
