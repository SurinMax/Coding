import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.BOTH;
import static java.awt.GridBagConstraints.CENTER;

public class jGUIMathGenerator extends JFrame {

    public void windowsBuilder(){
        JPanel jPanel = new JPanel(new GridBagLayout());
        //JFrame jFrame = new JFrame();
        //jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        JTextField txtPath = new JTextField("E:\\test.txt");
        GridBagConstraints constraints5 = new GridBagConstraints();
        constraints5.weightx=0;
        constraints5.weighty=0;
        constraints5.gridx=0;
        constraints5.gridy=0;
        constraints5.gridheight=1;
        constraints5.gridwidth=2;
        constraints5.fill = BOTH;

        JCheckBox checkBoxAdd = new JCheckBox("Add",false);
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx=0;
        constraints1.weighty=0;
        constraints1.gridx=0;
        constraints1.gridy=1;
        constraints1.gridheight=1;
        constraints1.gridwidth=1;
        constraints1.fill = CENTER;

        JCheckBox checkBoxSub = new JCheckBox("Sub",false);
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx=0;
        constraints2.weighty=0;
        constraints2.gridx=1;
        constraints2.gridy=1;
        constraints2.gridheight=1;
        constraints2.gridwidth=1;
        constraints2.fill = CENTER;

        JButton btGen = new JButton("Generate");
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx=0;
        constraints3.weighty=0;
        constraints3.gridx=0;
        constraints3.gridy=2;
        constraints3.gridheight=1;
        constraints3.gridwidth=1;
        constraints3.fill = BOTH;

        JButton btExit = new JButton("Exit");
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx=0;
        constraints4.weighty=0;
        constraints4.gridx=1;
        constraints4.gridy=2;
        constraints4.gridheight=1;
        constraints4.gridwidth=1;
        constraints4.fill = BOTH;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.add(checkBoxAdd,constraints1);
        jPanel.add(checkBoxSub,constraints2);
        jPanel.add(btGen,constraints3);
        jPanel.add(btExit,constraints4);
        jPanel.add(txtPath,constraints5);

        ActionExit btExitAction = new ActionExit();
        btExit.addActionListener(btExitAction);

        getContentPane().add(jPanel);
        setSize(300,200);
        setTitle("Math Generator");
        setVisible(true);
    }

    private class ActionExit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        jGUIMathGenerator frame = new jGUIMathGenerator();
        frame.windowsBuilder();
    }
}
