package ch08;

import ch08.InterfaceBundle.MusicPlayer;

public class MP3Player implements MusicPlayer {
    private boolean playBackState;  //현재 재생 상태
    private int playBackTime;          //재생시간

    public MP3Player() {
        this.playBackState = false;
        this.playBackTime = 0;
    }

    public int getPlayBackTime() {
        return playBackTime;
    }

    public boolean play() {
        System.out.println("MP3 음악을 재생합니다.");
        this.playBackState = true;
        while(playBackTime <= 10){
            this.playBackTime++;
        }return playBackState;
    }
    public boolean pause() {

        System.out.println("MP3 음악을 일시 정지 합니다.");
        this.playBackState = false;
        return playBackState;
    }
    public boolean stop() {
        System.out.println("MP3 음악을 정지합니다.");
        this.playBackState = false;
        this.playBackTime = 0;
        return playBackState;
    }
}
