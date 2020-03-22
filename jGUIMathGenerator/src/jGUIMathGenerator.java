import javax.swing.*;
import java.awt.*;

public class jGUIMathGenerator extends JFrame {

    public void windowsBuilder(){
        JPanel jPanel = new JPanel(new GridBagLayout());
        //JFrame jFrame = new JFrame();
        //jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx=0;
        constraints1.weighty=0;
        constraints1.gridx=0;
        constraints1.gridy=0;
        constraints1.gridheight=1;
        constraints1.gridheight=1;
        JButton btGen = new JButton("Generate");

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx=0;
        constraints2.weighty=0;
        constraints2.gridx=1;
        constraints2.gridy=0;
        constraints2.gridheight=1;
        constraints2.gridheight=1;
        JButton btExit = new JButton("Exit");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel.add(btGen,constraints1);
        jPanel.add(btExit,constraints2);

        getContentPane().add(jPanel);
        setSize(300,300);
        setTitle("Math Generator");
        setVisible(true);
    }

    public static void main(String[] args) {
        jGUIMathGenerator frame = new jGUIMathGenerator();
        frame.windowsBuilder();
    }
}
