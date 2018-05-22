import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame {
    Container cp;
    private Timer t1;
    private int dirFlag = 1, objX = 50, objY = 50, objW = 50, objH = 50;
    private JButton jbnR = new JButton("RUN");
    private JButton jbnU = new JButton("↑");
    private JButton jbnD = new JButton("↓");
    private JButton jbnRI = new JButton("←");
    private JButton jbnL = new JButton("→");
    private JButton jbnE = new JButton("EXIT");
    private JLabel jlb = new JLabel();
    private ImageIcon icon = new ImageIcon("C:\\Users\\USER\\IdeaProjects\\untitled\\src\\moomin.jpg");

    public MFrame() {
        Ex1();
    }

    private void Ex1() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setLocation(100, 50);
        this.setSize(800, 600);
        cp = this.getContentPane();

        jbnR.setBounds(100, 450, 100, 100);
        jbnU.setBounds(200, 450, 100, 100);
        jbnD.setBounds(300, 450, 100, 100);
        jbnRI.setBounds(400, 450, 100, 100);
        jbnL.setBounds(500, 450, 100, 100);
        jbnE.setBounds(600, 450, 100, 100);
        jlb.setBounds(50, 50, 100, 100);
        jlb.setIcon(icon);

        this.add(jbnR);
        this.add(jbnU);
        this.add(jbnD);
        this.add(jbnRI);
        this.add(jbnL);
        this.add(jbnE);
        this.add(jlb);


        jbnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
            }
        });
        jbnU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag=1;
            }
        });
        jbnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag=2;
            }
        });
        jbnRI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag=3;
            }
        });
        jbnL.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dirFlag=4;
            }
        });
        t1 = new Timer(15, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (dirFlag) {
                    case 1:
                        if (objY - 2 > 0) {
                            objY -= 2;
                        }
                        break;
                    case 2:
                        if (objY < 300) {
                            objY += 2;
                        }
                        break;
                    case 3:
                        if (objX-2>0){
                            objX-=2;
                        }
                        break;
                    case 4:
                        if (objX<600){
                            objX+=2;
                        }
                        break;
                    case 5:
                        if (objW-2>0){
                            objW-=2;
                        }
                        break;
                    case 6:
                        if (objW<500){
                            objW+=2;
                        }
                        break;
                    case 7:
                        if (objH-2>0){
                            objH-=2;
                        }
                        break;
                    case 8:
                        if (objH<500){
                            objH+=2;
                        }
                        break;
                }
                jlb.setLocation(objX, objY);
            }
        });
        jbnE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }


}
