package ch08;

import ch08.InterfaceBundle.MusicPlayer;

public class MusicTest {
    static void testMP3play(MusicPlayer m){
        boolean expectedPlayResult = true;
        boolean expectedPauseResult = false;
        boolean expectedStopResult = false;
        boolean actualPlayResult = m.play();
        boolean actualPauseResult = m.pause();
        boolean actualStopResult = m.stop();
        System.out.println("***********");
        if (actualPlayResult == expectedPlayResult){
            System.out.println("MP3 플레이 성공");
        }else{
            System.out.println("MP3 플레이 실패");
        }
        if (actualPauseResult == expectedPauseResult){
            System.out.println("MP3 일시정지 성공");
        }else{
            System.out.println("MP3 일시정지 실패");
        }
        if (actualStopResult == expectedStopResult){
            System.out.println("MP3 정지 성공");
        }else{
            System.out.println("MP3 정지 실패");
        }


    }

    static void testStreamingMusicPlay(MusicPlayer m) {
        boolean expectedStreaminMusicPlayResult = true;
        boolean expectedStreaminMusicPauseResult = false;
        boolean expectedStreaminMusicStopResult = false;
        boolean actualStreamingPlayResult = m.play();
        boolean actualStreamingPauseResult = m.pause();
        boolean actualStreamingStopResult = m.stop();

        System.out.println("***********");
        if (actualStreamingPlayResult == expectedStreaminMusicPlayResult){
            System.out.println("스트리밍 플레이 성공");
        }else{
            System.out.println("스트리밍 플레이 실패");
        }
        if (actualStreamingPauseResult == expectedStreaminMusicPauseResult){
            System.out.println("스트리밍 일시정지 성공");
        }else{
            System.out.println("스트리밍 일시정지 실패");
        }
        if (actualStreamingStopResult == expectedStreaminMusicStopResult){
            System.out.println("스트리밍 정지 성공");
        }else{
            System.out.println("스트리밍 정지 실패");
        }

    }


    public static void main(String[] args) {
        MusicPlayer m = new MP3Player();
        MusicPlayer s = new StreamingMusicPlayer();

        testMP3play(m);
        System.out.println("**********");
        testStreamingMusicPlay(s);

    }

}
