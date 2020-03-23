import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.awt.GridBagConstraints.*;

public class jGUIMathGenerator extends JFrame {

    public void windowsBuilder(){
        JPanel jPanel = new JPanel(new GridBagLayout());
        //JFrame jFrame = new JFrame();
        //jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        JLabel lbFrom = new JLabel("FROM");
        GridBagConstraints constraints6 = new GridBagConstraints();
        constraints6.weightx=0;
        constraints6.weighty=0;
        constraints6.gridx=0;
        constraints6.gridy=0;
        constraints6.gridheight=1;
        constraints6.gridwidth=1;
        constraints6.fill = NORTH;

        JLabel lbTo = new JLabel("TO");
        GridBagConstraints constraints7 = new GridBagConstraints();
        constraints7.weightx=0;
        constraints7.weighty=0;
        constraints7.gridx=1;
        constraints7.gridy=0;
        constraints7.gridheight=1;
        constraints7.gridwidth=1;
        constraints7.fill = NORTH;

        JTextField txtFrom = new JTextField("1");
        GridBagConstraints constraints8 = new GridBagConstraints();
        constraints8.weightx=0;
        constraints8.weighty=0;
        constraints8.gridx=0;
        constraints8.gridy=1;
        constraints8.gridheight=1;
        constraints8.gridwidth=1;
        constraints8.fill = BOTH;

        JTextField txtTo = new JTextField("100");
        GridBagConstraints constraints9 = new GridBagConstraints();
        constraints9.weightx=0;
        constraints9.weighty=0;
        constraints9.gridx=1;
        constraints9.gridy=1;
        constraints9.gridheight=1;
        constraints9.gridwidth=1;
        constraints9.fill = BOTH;

        JLabel lbPatch = new JLabel("Путь");
        GridBagConstraints constraints10 = new GridBagConstraints();
        constraints10.weightx=0;
        constraints10.weighty=0;
        constraints10.gridx=0;
        constraints10.gridy=2;
        constraints10.gridheight=1;
        constraints10.gridwidth=1;
        constraints10.fill = BOTH;

        JTextField txtPath = new JTextField("E:\\test.txt");
        GridBagConstraints constraints5 = new GridBagConstraints();
        constraints5.weightx=0;
        constraints5.weighty=0;
        constraints5.gridx=0;
        constraints5.gridy=3;
        constraints5.gridheight=1;
        constraints5.gridwidth=2;
        constraints5.fill = BOTH;

        JCheckBox checkBoxAdd = new JCheckBox("Add",false);
        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx=0;
        constraints1.weighty=0;
        constraints1.gridx=0;
        constraints1.gridy=4;
        constraints1.gridheight=1;
        constraints1.gridwidth=1;
        constraints1.fill = CENTER;

        JCheckBox checkBoxSub = new JCheckBox("Sub",false);
        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx=0;
        constraints2.weighty=0;
        constraints2.gridx=1;
        constraints2.gridy=4;
        constraints2.gridheight=1;
        constraints2.gridwidth=1;
        constraints2.fill = CENTER;

        JButton btGen = new JButton("Generate");
        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx=0;
        constraints3.weighty=0;
        constraints3.gridx=0;
        constraints3.gridy=5;
        constraints3.gridheight=1;
        constraints3.gridwidth=1;
        constraints3.fill = BOTH;

        JButton btExit = new JButton("Exit");
        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx=0;
        constraints4.weighty=0;
        constraints4.gridx=1;
        constraints4.gridy=5;
        constraints4.gridheight=1;
        constraints4.gridwidth=1;
        constraints4.fill = BOTH;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jPanel.add(btGen,constraints3);
        jPanel.add(btExit,constraints4);

        jPanel.add(checkBoxAdd,constraints1);
        jPanel.add(checkBoxSub,constraints2);
        jPanel.add(txtPath,constraints5);
        jPanel.add(lbFrom,constraints6);
        jPanel.add(lbTo,constraints7);
        jPanel.add(txtFrom,constraints8);
        jPanel.add(txtTo,constraints9);
        jPanel.add(lbPatch,constraints10);

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
