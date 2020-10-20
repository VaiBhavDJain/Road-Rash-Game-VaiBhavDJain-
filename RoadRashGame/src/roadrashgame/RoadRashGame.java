package Code;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

public class RoadRashGame implements KeyListener {
    public static JPanel panel;
    public static int ded=0,x0,x1,x2,x3,x4,herox,heroy;
    static Graphics graphics,graphics1;
    public static Image dead=null,rail=null;



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        panel = new JPanel();
        panel.setPreferredSize(new Dimension(1300, 700));
        panel.setFocusable(true);
        frame.add(panel);


        frame.pack();
        frame.setResizable(true);
        frame.setVisible(true);

        int A[][]=new int[5][5];
        Image bg1=null;
        Image dash=null;
        Image bg2=null;
        Image bot[][]=new Image[4][5];
        Image hero=null;
        int p=-1;



        A[0][0]=610;
        A[0][1]=625;
        A[0][2]=644;
        A[0][3]=663;
        A[0][4]=678;

        A[1][0]=560;
        A[1][1]=610;
        A[1][2]=642;
        A[1][3]=674;
        A[1][4]=724;

        A[2][0]=480;
        A[2][1]=560;
        A[2][2]=642;
        A[2][3]=724;
        A[2][4]=804;

        A[3][0]=370;
        A[3][1]=510;
        A[3][2]=640;
        A[3][3]=770;
        A[3][4]=910;

        A[4][0]=230;
        A[4][1]=450;
        A[4][2]=640;
        A[4][3]=830;
        A[4][4]=1050;



        try {
            bg1=ImageIO.read(RoadRashGame.class.getResource("../images/73933.jpg"));
            bg2=ImageIO.read(RoadRashGame.class.getResource("../images/73933_20160911154803859_20160911155318472.jpg"));
            dash=ImageIO.read(RoadRashGame.class.getResource("../images/1473537068236.png"));


            bot[0][0]=ImageIO.read(RoadRashGame.class.getResource("../images/bota25.png"));
            bot[0][1]=ImageIO.read(RoadRashGame.class.getResource("../images/bota50.png"));
            bot[0][2]=ImageIO.read(RoadRashGame.class.getResource("../images/bota75.png"));
            bot[0][3]=ImageIO.read(RoadRashGame.class.getResource("../images/bota100.png"));
            bot[0][4]=ImageIO.read(RoadRashGame.class.getResource("../images/bota125.png"));


            bot[1][0]=ImageIO.read(RoadRashGame.class.getResource("../images/botb25.png"));
            bot[1][1]=ImageIO.read(RoadRashGame.class.getResource("../images/botb50.png"));
            bot[1][2]=ImageIO.read(RoadRashGame.class.getResource("../images/botb75.png"));
            bot[1][3]=ImageIO.read(RoadRashGame.class.getResource("../images/botb100.png"));
            bot[1][4]=ImageIO.read(RoadRashGame.class.getResource("../images/botb125.png"));


            bot[2][0]=ImageIO.read(RoadRashGame.class.getResource("../images/botc25.png"));
            bot[2][1]=ImageIO.read(RoadRashGame.class.getResource("../images/botc50.png"));
            bot[2][2]=ImageIO.read(RoadRashGame.class.getResource("../images/botc75.png"));
            bot[2][3]=ImageIO.read(RoadRashGame.class.getResource("../images/botc100.png"));
            bot[2][4]=ImageIO.read(RoadRashGame.class.getResource("../images/botc125.png"));


            bot[3][0]=ImageIO.read(RoadRashGame.class.getResource("../images/botd25.png"));
            bot[3][1]=ImageIO.read(RoadRashGame.class.getResource("../images/botd50.png"));
            bot[3][2]=ImageIO.read(RoadRashGame.class.getResource("../images/botd75.png"));
            bot[3][3]=ImageIO.read(RoadRashGame.class.getResource("../images/botd100.png"));
            bot[3][4]=ImageIO.read(RoadRashGame.class.getResource("../images/botd125.png"));


            hero=ImageIO.read(RoadRashGame.class.getResource("../images/hero125.png"));
            rail=ImageIO.read(RoadRashGame.class.getResource("../images/manz.png"));
            dead=ImageIO.read(RoadRashGame.class.getResource("../images/maxresdefault.jpg"));




        } catch (IOException e) {
            e.printStackTrace();
        }
        Image mainImage= new BufferedImage(1300, 700, BufferedImage.TYPE_INT_RGB);
        int thuk=0;p=1;int y0=0,i0=0,y1=0,i1=0,y2=0,y3=0,y4=0;
        int i2=0,i3=0,i4=0,rand0=0,rand1=4,rand2=1,rand3=3,rand4=4;herox=640;heroy=445;
        Random random;x0=0;x1=0;x2=0;x3=0;x4=0;
        panel.requestFocus();
        panel.addKeyListener(new RoadRashGame());


        while(true) {
            p++;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(p==2) {
                do{random = new Random();
                rand0 = random.nextInt(5);}while(rand0==rand4||rand0==(rand4-1)||rand0==(rand4+1));
                x0 = A[0][rand0];
                y0 = 340;
                i0 = 0;

                x1 = A[1][rand1];
                y1 = 365;
                i1 = 1;

                x2 = A[2][rand2];
                y2 = 400;
                i2 = 2;

                x3 = A[3][rand3];
                y3 = 445;
                i3 = 3;

                x4 = A[4][rand4];
                y4 = 500;
                i4 = 4;
            thuk=x3;}
        if(p==4)
        {
            x0=A[1][rand0];
            y0=365;
            i0=1;

            x1 = A[2][rand1];
            y1 = 400;
            i1 = 2;

            x2 = A[3][rand2];
            y2 = 445;
            i2 = 3;

            x3 = A[4][rand3];
            y3 = 500;
            i3 = 4;

            do {
                random = new Random();
                rand4 = random.nextInt(5);
            } while(rand4==(rand0-1)||rand4==(rand0+1)||rand4==rand0);
            x4 = A[0][rand4];
            y4 = 340;
            i4 = 0;
            thuk=x2;
        }

        if(p==6) {
            x0=A[2][rand0];
            y0=400;
            i0=2;

            x1 = A[3][rand1];
            y1 = 445;
            i1 = 3;

            x2 = A[4][rand2];
            y2 = 500;
            i2 = 4;

            do{
                random = new Random();
                rand3 = random.nextInt(5);
            } while(rand3==(rand4-1)||rand3==(rand4+1)||rand3==rand4);
            x3 = A[0][rand3];
            y3= 340;
            i3 = 0;

            x4 = A[1][rand4];
            y4 = 365;
            i4 = 1;
            thuk=x1;
        }
        if(p==8) {
            x0=A[3][rand0]; 
            y0=445;
            i0=3;

            x1 = A[4][rand1];
            y1 = 500;
            i1 = 4;
            do{
                random = new Random();
                rand2 = random.nextInt(5);
            }while(rand2==(rand3-1)||rand2==(rand3+1)||rand2==rand3);
            
            x2 = A[0][rand2];
            y2 = 340;
            i2 = 0;

            x3 = A[1][rand3];
            y3 = 365;
            i3 = 1;

            x4 = A[2][rand4];
            y4 = 400;
            i4 = 2;
            thuk=x0;
        }

        if(p==10) {
            p=1;
            x0=A[4][rand0];
            y0=500;
            i0=4;

            do{
                random = new Random();
                rand1 = random.nextInt(5);
            }while(rand1==(rand2-1)||rand1==(rand2+1)||rand1==rand2);
            x1 = A[0][rand1];
            y1 = 340;
            i1 = 0;



            x2 = A[1][rand2];
            y2 = 365;
            i2 = 1;

            x3 = A[2][rand3];
            y3 = 400;
            i3 = 2;

            x4 = A[3][rand4];
            y4 = 445;
            i4 = 3;
            thuk=x4;
        }
            graphics=mainImage.getGraphics();
            graphics1=panel.getGraphics();
            graphics.clearRect(0,0,1300,700);
            graphics.drawImage(bg1,0,0,null);
            graphics.drawImage(bot[0][i0],x0,y0,null);
            graphics.drawImage(bot[1][i1],x1,y1,null);
            graphics.drawImage(bot[2][i2],x2,y2,null);

            graphics.drawImage(bot[3][i3],x3,y3,null);
            graphics.drawImage(hero,herox,heroy,null);

            graphics.drawImage(dash,237,535,null);graphics.dispose();
            graphics1.clearRect(0,0,1300,700);
            graphics1.drawImage(mainImage,0,0,null);graphics1.dispose(); try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            graphics=mainImage.getGraphics();
            graphics1=panel.getGraphics();
            graphics.clearRect(0,0,1300,700);
            graphics.drawImage(bg2,0,0,null);
            graphics.drawImage(bot[0][i0],x0,y0,null);
            graphics.drawImage(bot[1][i1],x1,y1,null);
            graphics.drawImage(bot[2][i2],x2,y2,null);
            graphics.drawImage(bot[3][i3],x3,y3,null);
            thuk=pass(y0,y1,y2,y3);
            graphics.drawImage(hero,herox,heroy,null);
            graphics.drawImage(dash,237,535,null);graphics.dispose();
            if(ded==1)
            {
                graphics1.drawImage(rail,0,0,null);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.exit(0);
            }
            if(herox==thuk)
            {
                graphics1.drawImage(dead,0,0,null);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }System.exit(0);
            }
            graphics1.clearRect(0,0,1300,700);
            graphics1.drawImage(mainImage,0,0,null);graphics1.dispose();

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Intentionally blank
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 37) {
            int h=0;
            if (herox == 770&&h==0)
            {
                herox = 640;h=1;
            }
            if (herox == 640&&h==0)
            {
                herox = 510;h=1;
            }
            if (herox == 510&&h==0)
            {
                herox = 370;h=1;
            }
            if (herox == 910&&h==0)
            {
                herox = 770;h=1;
            }
            if (herox == 370&&h==0) {
                ded=1;
            }
        }
        if (e.getKeyCode() == 39){
            int h=0;
            if (herox == 770&&h==0)
            { 
                herox = 910;h=1;
            }
            if (herox == 640&&h==0)
            {
                herox = 770;h=1;
            }
            if (herox == 510&&h==0)
            {
                herox = 640;h=1;
            }
            if (herox == 370&&h==0)
            {
                herox = 510;h=1;
            }
            if (herox == 910&&h==0) {
                ded=1;
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Intentionally blank
    }
    public static int pass(int a,int b,int c,int d)
    {
        if(a==445)
            return(x0);
        if(b==445)
            return(x1);
        if(c==445)
            return(x2);
        if(d==445)
            return(x3);
        else
            return(0);
    }
}
