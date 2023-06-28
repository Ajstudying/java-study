package Shooting;

import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*; //파일 클래스 사용을 위한 임포트 추가
import javax.imageio.*;
import java.awt.image.*; // 버퍼 이미지 클래스 사용을 위한 임포트추가

public class Game {
    public static void main(String[] args) {
        GameFrame gf = new GameFrame();
    }
}

class GameFrame extends JFrame implements KeyListener, Runnable {
    //프레임 생성을 위한 JFrame상속
    //키보드 이벤트 처리를 위한 KeyListener 상속
    //스레드를 돌리기 위한 Runnable 상속
    int frameWidth = 800; // 생성할 프레임 넓이
    int frameHeight = 600; //생성할 프레임의 높이

    int x, y; //캐릭터의 좌표변수
    boolean KeyUp = false; // 키보드 입력 처리를 위한 변수
    boolean KeyDown = false;
    boolean KeyLeft = false;
    boolean KeyRight = false;
    boolean KeySpace = false; //미사일 발사를 위한 키보드 스페이스키 입력을 추가
    int cnt; //각종 타이밍 조절을 위해 무한 루프를 카운터할 변수
    int enemyWidth, enemyHeight; // 적 이미지의 크기값을 받을 변수
    int missileWidth, missileHeight; //미사일 이미지의 크기값을 받을 변수
    Thread th; //스레드 생성

    Toolkit tk = Toolkit.getDefaultToolkit();
    //이미지를 불러오기 위한 툴킷
    Image meImg;
    //f15k 라는 비행기 이미지를 불러옴.
    Image missileImg; // 미사일 이미지변수
    Image enemyImage; //적 이미지를 받아들일 이미지 변수
    ArrayList<Missile> missileList = new ArrayList(); //다수의 미사일을 관리하기 위한 배열
    ArrayList<Enemy> enemyList = new ArrayList<>(); //다수의 적을 등장시켜야 하므로 배열을 이용
    Image buffImage;//더블 버퍼링용
    Graphics buffg; // 더블 버퍼링용

    Missile ms; // 미사일 클래스 객체
    Enemy en;   // 에너미 클래스 객체


    GameFrame(){
        init();
        start();

        setTitle("슈팅게임 만들기");
        setSize(frameWidth,frameHeight);
        Dimension screen = tk.getScreenSize();

        int frameXpos = (int)(screen.getWidth() / 2 - frameWidth / 2);
        int frameYpos = (int)(screen.getHeight() /2 -  frameWidth / 2);

        setLocation(frameXpos,frameYpos);
        setResizable(false);
        setVisible(true);
    }

    public void init() { //편의를 위해 init에서 기본적인 세팅을 합니다.
        x = 100; //캐릭터의 최초 좌표
        y = 100;
        frameWidth = 800;
        frameHeight = 600;

        meImg = tk.getImage("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\f15k.png");
        missileImg = tk.getImage("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\Missile.png");
        //위에는 비행기 이미지 아래거는 미사일 이미지.
        enemyImage = tk.getImage("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\enemy.png");
        //적 이미지 생성
        enemyWidth = imageWidthValue("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\enemy.png");
        enemyHeight = imageHeightValue("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\enemy.png");
        //적 이미지의 넓이값, 높이값을 계산하여 받습니다.
        //해당 메소드는 아래에 이미지 크기값 계산용으로 추가된 메소드
        missileWidth = imageWidthValue("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\Missile.png");
        missileHeight = imageHeightValue("C:\\Users\\tjoeun\\IdeaProjects\\java-study\\src\\Shooting\\Missile.png");
        //미사일 이미지의 넓이값, 높이값.

    }
    public void start() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //프레임 오른쪽 위에 X버튼을 눌렀을 때 프로그램이 정상적으로 종료하게 만들어줌.

        addKeyListener(this); // 키보드 이벤트 실행
        th = new Thread(this); //스레드 생성
        th.start(); //스레드 실행
    }

    public void run() {
        try{ //예외 옵션 설정으로 에러방지
            while (true) { // 무한 루프
                KeyProcess(); //키보드 입력 처리를 하여 x, y 갱신
                enemyProcess(); //적 움직임 처리 메소드 실행
                missileProcess(); //미사일 처리 메소드 실행

                repaint();  //갱신된 x, y 값으로 이미지 새로 그리기
                Thread.sleep(20);  // 20 milli sec로 스레드 돌리기
                cnt++;//무한 루프 카운터
            }
        }catch (Exception e){
        }
    }

    /*public void paint(Graphics g){
        super.paint(g);
        g.clearRect(0,0,frameWidth,frameHeight);
        // 0,0에서 위에서 정한 해상도 크기만큼 화면을 지웁니다.
        g.drawImage(meImg, x, y, this);
        //변경되는 좌표에 따라 이미지가 새로 그려지게 하기.
//        g.drawImage(meImg, 100,100,this);
        //프레임에 meImg에 저장된 비행기 이미지를 x = 100, y = 100 좌표에 그려넣습니다.
    }*/
    public void enemyProcess() { //적 행동 처리 메소드
        for (int i = 0; i < enemyList.size(); i++) {
            en = enemyList.get(i);
            //배열에 적이 생성되어있을 때 해당되는 적을 판별
            en.move(); //해당 적을 이동시킨다.
            if(en.x < -200){//적의 좌표가 화면 밖으로 넘어가면
                enemyList.remove(i); //해당 적을 배열에서 삭제
            }
        }
        if (cnt % 300 == 0) {//루프 카운트 300회 마다
            en = new Enemy(frameWidth + 100, 100);
            enemyList.add(en);
            //각 좌표로 적을 생성한 후 배열에 추가한다.
            en = new Enemy(frameWidth + 100, 200);
            enemyList.add(en);
            en = new Enemy(frameWidth + 100, 300);
            enemyList.add(en);
            en = new Enemy(frameWidth + 100, 400);
            enemyList.add(en);
            en = new Enemy(frameWidth + 100, 500);
            enemyList.add(en);

        }
    }
    public void missileProcess() { //미사일 처리 메소드
        if(KeySpace){ // 스페이스바 키 상태가 true이면
            ms = new Missile(x + 150,y + 30); //좌표 체크하여 넘기기
            //미사일 발사 위치를 제대로 하기 위한 좌표 조정
            missileList.add(ms); //해당 미사일 추가
        }
        for (int i = 0; i < missileList.size(); ++i) {
            //미사일 존재 유무 확인
            ms = missileList.get(i);
            //미사일 위치값을 확인
            buffg.drawImage(missileImg, ms.x + 150, ms.y + 30, this);//현재 좌표에 미사일 그리기
            // 이미지 크기를 감안한 미사일 발사좌표는 수정됨.
            ms.move();
            //그려진 미사일을 정해진 숫자만큼 이동시키기
            if(ms.x > frameWidth - 20){
                missileList.remove(i);
            }
            // 미사일 이동과 미사일이 화면에서 벗어났을 때 명령처리
            for (int j = 0; j < enemyList.size(); ++j) {
                en = enemyList.get(j);
                if(crash(ms.x, ms.y, en.x, en.y, missileWidth, missileHeight, enemyWidth, enemyHeight)){
                    //미사일과 적 객체를 하나하나 판별하여 접촉했을 시 미사일과 적을 화면에서 지움.
                    missileList.remove(i);
                    enemyList.remove(j);
                }
            }
        }

    }

    public boolean crash(int msX, int msY, int enX, int enY, int missileWidth, int missileHeight, int enemyWidth, int enemyHeight){
        //충돌 판정을 위한 새로운 crash 메서드
        // 판정을 위해 충돌할 두 사각 이미지의 좌표 및 넓이, 높이 값을 받는다.
        boolean check = false;
        if (Math.abs((msX + missileWidth / 2) - (enX + enemyWidth / 2)) < (enemyWidth /2 + missileWidth / 2) && ((msY + missileHeight / 2) - (enY + enemyHeight /2)) < (enemyHeight / 2 + missileHeight /2)){
            //충돌 계산식. 사각형 두개의 거리 및 겹치는 여부 확인하는 방식.
            check = true;
        }else {
            check = false;
        }return check;
    }

    public void paint(Graphics g) {
        buffImage = createImage(frameWidth,frameHeight);
        //더블 버퍼링 버퍼 크기를 화면크기와 같게 설정
        buffg = buffImage.getGraphics();

        update(g);
    }

    public void update(Graphics g) {
        drawChar(); //실제로 그려진 그림을 가져온다.
        drawEnemy(); //그려진 적 이미지를 가져온다.
        drawMissile(); //그려진 미사일 가져와 실행
        g.drawImage(buffImage, 0,0,this);
        //화면에 버퍼에 그린 그림을 가져와 그리기
    }

    public void drawChar(){ //실제로 그림들을 그릴 부분
        buffg.clearRect(0,0,frameWidth,frameHeight);
        buffg.drawImage(meImg,x,y,this);
    }
    public void drawMissile() { //미사일 그리는 메소드
        for(int i = 0; i < missileList.size(); ++i){
            //미사일 존재 유무 확인
            ms = missileList.get(i);
            //미사일 위치값을 확인
            buffg.drawImage(missileImg, ms.x + 150, ms.y + 30, this);
            //현재 좌표에 미사일 그리기
            // 이미지 크기를 감안한 미사일 발사좌표는 수정됨.

        }
    }
    public void drawEnemy(){ //적 이미지를 그리는 부분
        for (int i = 0; i < enemyList.size(); ++i){
            en = (Enemy)(enemyList.get(i));
            buffg.drawImage(enemyImage, en.x, en.y, this);
            //배열에 생성된 각 적을 판별하여 이미지 그리기
        }

    }

    public void keyPressed(KeyEvent e) {
        //키보드가 눌러졌을 때 이벤트 처리 하는 곳
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                KeyUp =true;
                break;
            case KeyEvent.VK_DOWN:
                KeyDown = true;
                break;
            case KeyEvent.VK_LEFT:
                KeyLeft = true;
                break;
            case KeyEvent.VK_RIGHT:
                KeyRight = true;
                break;
            case KeyEvent.VK_SPACE: //스페이스키 입력 처리 추가
                KeySpace = true;
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        //키보드가 눌렀다가 떼어졌을 때 이벤트 처리하는 곳
        switch(e.getKeyCode()){
            case KeyEvent.VK_UP :
                KeyUp = false;
                break;
            case KeyEvent.VK_DOWN :
                KeyDown = false;
                break;
            case KeyEvent.VK_LEFT :
                KeyLeft = false;
                break;
            case KeyEvent.VK_RIGHT :
                KeyRight = false;
                break;
            case KeyEvent.VK_SPACE: //스페이스키 입력처리 추가
                KeySpace = false;
                break;
        }
    }
    public void keyTyped(KeyEvent e) {
        //키보드가 타이핑 될 때 이벤트 처리하는 곳
    }
    public void KeyProcess() {
        //실제로 캐릭터 움직임 실현을 위해
        //위에서 받아들인 키 값을 바탕으로 키 입력시마다 5만큼의 이동을 시킨다.

        if(KeyUp == true) y -= 5;
        if(KeyDown == true) y += 5;
        if(KeyLeft == true) x -= 5;
        if(KeyRight == true) x += 5;
    }
    public int imageWidthValue(String file){
        //이미지 넓이 크기 값 계산용
        //파일을 받아들여 그 파일 값을 계산
        int x = 0;
        try {
            File f = new File(file);//파일을 받는다.
            BufferedImage bi = ImageIO.read(f);
            //받을 파일을 이미지로 읽는다.
            x= bi.getWidth();//이미지의 넓이값을 받는다.
        }catch (IOException e){}return x;
    }

    public int imageHeightValue(String file){
        //이미지 높이 크기 값 계산
        int y = 0;
        try{
            File f = new File(file);
            BufferedImage bi = ImageIO.read(f);
            y = bi.getHeight();
        }catch (IOException e){} return y;
    }
}

class Missile{ //미사일 위치 파악 및 이동을 위한 클래스 추가
    int x;
    int y;//미사일 좌표 변수
    Missile(int x, int y){ //미사일 좌표를 입력받는 메소드
        this.x = x;
        this.y = y;//미사일 좌표를 체크
    }
    public void move(){ //미사일 이동을 위한 메소드
        this.x += 10; //x좌표에 10만큼 미사일 이동
    }
}

class Enemy{ //적 위치 파악 및 이동을 위한 클래스
    int x;
    int y;
    Enemy (int x, int y){ //적 좌표를 받아 객체화 시키기 위한 메소드
        this.x = x;
        this.y = y;
    }
    public void move(){ //x좌표 -3만큼 이동시키는 명령 메소드
        x -= 3;
    }
}
