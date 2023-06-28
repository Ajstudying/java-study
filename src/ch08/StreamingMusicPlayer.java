package ch08;

import ch08.InterfaceBundle.MusicPlayer;

public class StreamingMusicPlayer implements MusicPlayer {

    private boolean streamingPlayBackState;
    private int streamingPlayBackTime;

    public StreamingMusicPlayer() {
        this.streamingPlayBackState = false;
        this.streamingPlayBackTime = 0;
    }
    public int getStreamingPlayBackTime() {
        return streamingPlayBackTime;
    }

    public boolean play() {
        System.out.println("스트리밍 음악을 재생합니다.");
        this.streamingPlayBackState = true;
        while(streamingPlayBackTime <= 10){
            this.streamingPlayBackTime++;
        }return streamingPlayBackState;
    }
    public boolean pause() {
        System.out.println("스트리밍 음악을 일시 정지 합니다.");
        this.streamingPlayBackState = false;
        return streamingPlayBackState;
    }
    public boolean stop() {
        System.out.println("스트리밍 음악을 정지합니다.");
        System.out.println("MP3 음악을 정지합니다.");
        this.streamingPlayBackState = false;
        this.streamingPlayBackTime = 0;
        return streamingPlayBackState;
    }
}
