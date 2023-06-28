package Shooting;

import java.awt.*;
import javax.swing.JFrame;

public class FrameMake {
    public static void main(String[] args) {
        FrameMakeSub fms = new FrameMakeSub();

    }
}

//프레임을 만들기 위한 클래스
class FrameMakeSub extends JFrame{ //프레임을 만들기 위한 클래스
    int frameWidth = 800; //생성할 프레임의 넓이
    int frameHeight = 600; //생성할 프레임의 높이
    Toolkit tk = Toolkit.getDefaultToolkit();
    //이미지를 불러오기 위한 툴킷
    Image meImg = tk.getImage("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\f15k.png");
    //f15k 라는 비행기 이미지를 불러옴.

    FrameMakeSub() { //프레임 만들기
        init(); // 프레임에 들어갈 컴포넌트 세팅 메소드
        start();
        setTitle("슈팅게임 만들기"); //프레임의 이름을 설정
        setSize(frameWidth, frameHeight); // 프레임 크기 적용
        Dimension screen = tk.getScreenSize();
        //프레임이 윈도우에 표시될 때 위치를 세팅하기 위해 현재 모니터의 해상도 값을 받아옴

        int frameXpos = (int)(screen.getWidth() / 2 - frameWidth / 2);
        int frameYpos = (int)(screen.getHeight() / 2 - frameHeight / 2);
        // 프레임을 모니터 화면 정중앙에 배치 시키기 위해 좌표값을 계산

        setLocation(frameXpos,frameYpos); //프레임을 화면에 배치
        setResizable(false); //resizable(크기를 조정할 수 있는). 이 메서드를 false로 설정해서 임으로 변경 못하게 설정한다.
        setVisible(true); //프레임을 눈에 보이게 띄움

    }

    public void init(){}
    public void start(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.clearRect(0, 0, frameWidth, frameHeight);
        //0,0 에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
        g.drawImage(meImg, 100, 100, this);
        //프레임에 me_img에 저장된 f15k.png 이미지를
        //x=100, y=100 좌표로 그려넣습니다.

    }
}