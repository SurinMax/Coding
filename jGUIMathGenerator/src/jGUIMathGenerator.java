import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import static java.awt.GridBagConstraints.*;

public class jGUIMathGenerator extends JFrame {

    JTextField txtFrom;
    JTextField txtTo;
    JTextField txtCount;
    JCheckBox checkBoxAdd;
    JCheckBox checkBoxSub;
    ActionGenerate btGenAction;
    JTextField txtPath;
    JLabel lbCount;
    JLabel lbFinish;
    private final String DEFAUILTFROM = "1";
    private final String DEFAUILTTO = "100";
    private final String DEFAUILTCOUNT = "50";
    private final String DEFAULTPATH = "E:\\test.txt";

    public void windowsBuilder(){
        txtFrom = new JTextField(DEFAUILTFROM);
        txtTo = new JTextField(DEFAUILTTO);
        txtCount = new JTextField(DEFAUILTCOUNT);
        txtPath = new JTextField(DEFAULTPATH);
        checkBoxAdd = new JCheckBox("Add",false);
        checkBoxSub = new JCheckBox("Sub",false);
        JPanel jPanel = new JPanel(new GridBagLayout());
        //JFrame jFrame = new JFrame();
        //jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        JLabel lbFrom = new JLabel("From");
        GridBagConstraints constraints6 = new GridBagConstraints();
        constraints6.weightx=0;
        constraints6.weighty=0;
        constraints6.gridx=0;
        constraints6.gridy=0;
        constraints6.gridheight=1;
        constraints6.gridwidth=1;
        constraints6.fill = NORTH;

        JLabel lbTo = new JLabel("To");
        GridBagConstraints constraints7 = new GridBagConstraints();
        constraints7.weightx=0;
        constraints7.weighty=0;
        constraints7.gridx=1;
        constraints7.gridy=0;
        constraints7.gridheight=1;
        constraints7.gridwidth=1;
        constraints7.fill = NORTH;

        lbCount = new JLabel("Count");
        GridBagConstraints constraints11 = new GridBagConstraints();
        constraints11.weightx=0;
        constraints11.weighty=0;
        constraints11.gridx=2;
        constraints11.gridy=0;
        constraints11.gridheight=1;
        constraints11.gridwidth=1;
        constraints11.fill = NORTH;

        lbFinish = new JLabel("Finish");
        GridBagConstraints constraints13 = new GridBagConstraints();
        lbFinish.setVisible(false);
        constraints13.weightx=0;
        constraints13.weighty=0;
        constraints13.gridx=0;
        constraints13.gridy=6;
        constraints13.gridheight=1;
        constraints13.gridwidth=3;
        constraints13.anchor = CENTER;

        GridBagConstraints constraints8 = new GridBagConstraints();
        constraints8.weightx=0;
        constraints8.weighty=0;
        constraints8.gridx=0;
        constraints8.gridy=1;
        constraints8.gridheight=1;
        constraints8.gridwidth=1;
        constraints8.fill = BOTH;

        GridBagConstraints constraints9 = new GridBagConstraints();
        constraints9.weightx=0;
        constraints9.weighty=0;
        constraints9.gridx=1;
        constraints9.gridy=1;
        constraints9.gridheight=1;
        constraints9.gridwidth=1;
        constraints9.fill = BOTH;

        GridBagConstraints constraints12 = new GridBagConstraints();
        constraints12.weightx=0;
        constraints12.weighty=0;
        constraints12.gridx=2;
        constraints12.gridy=1;
        constraints12.gridheight=1;
        constraints12.gridwidth=1;
        constraints12.fill = BOTH;

        JLabel lbPatch = new JLabel("Patch");
        GridBagConstraints constraints10 = new GridBagConstraints();
        constraints10.weightx=0;
        constraints10.weighty=0;
        constraints10.gridx=0;
        constraints10.gridy=2;
        constraints10.gridheight=1;
        constraints10.gridwidth=1;
        constraints10.fill = BOTH;

        GridBagConstraints constraints5 = new GridBagConstraints();
        constraints5.weightx=0;
        constraints5.weighty=0;
        constraints5.gridx=0;
        constraints5.gridy=3;
        constraints5.gridheight=1;
        constraints5.gridwidth=3;
        constraints5.fill = BOTH;

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx=0;
        constraints1.weighty=0;
        constraints1.gridx=0;
        constraints1.gridy=4;
        constraints1.gridheight=1;
        constraints1.gridwidth=1;
        constraints1.fill = CENTER;

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
        constraints4.gridwidth=2;
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
        jPanel.add(lbCount,constraints11);
        jPanel.add(txtCount,constraints12);
        jPanel.add(lbFinish,constraints13);

        ActionExit btExitAction = new ActionExit();
        btExit.addActionListener(btExitAction);
        btGenAction = new ActionGenerate();
        btGen.addActionListener(btGenAction);

        getContentPane().add(jPanel);
        setSize(300,200);
        setTitle("Math Generator");
        setVisible(true);
    }

    private static class ActionExit implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    private class ActionGenerate implements ActionListener{
        private int firstNumber;
        private int secondNumber;
        private int startRange;
        private int endRange;

        /**
         * Генерирует первое число для примера
         */
        public void genFirstNumber(){
            firstNumber = new Random().nextInt((endRange - startRange) + 1) + startRange;
        }

        /**
         * Генерирует второе число для примера
         */
        public void genSecondNumber(){
            secondNumber = new Random().nextInt((endRange - startRange) + 1) + startRange;
        }

        /**
         * Метод проверяет правильность введенного диапазона генерации
         * @return true/false
         */
        public boolean checkRange(){
            return startRange < endRange;
        }

        /**
         * Метод проверят корректсность сгенерированного примера. Применять только для примеров с вычетанием.
         * @return true/false
         */
        public boolean checkGen(){
            return firstNumber > secondNumber;
        }

        /**
         * Функцтя возвращает первое число в примере
         * @return число
         */
        public int getFirstNumber() {
            return firstNumber;
        }

        /**
         * Функиия возвращает второе число в примере
         * @return число
         */
        public int getSecondNumber() {
            return secondNumber;
        }

        /**
         * Функция получает из текстового поля, первое число для диапазона герератора
         * @return число
         */
        public int getStartRange() {
            try {
                return Integer.parseInt(txtFrom.getText());
            }catch (NumberFormatException e){
                System.out.println("Use default value");
                return Integer.parseInt(DEFAUILTFROM);
            }

        }

        /**
         * Функция получает из текстового поля, второе число для диапазона герератора
         * @return число
         */
        public int getEndRange(){
            try {
                return Integer.parseInt(txtTo.getText());
            }catch (NumberFormatException e){
                System.out.println("Use default value");
                return Integer.parseInt(DEFAUILTTO);
            }
        }

        /**
         * Функция возвращает число необходимых примеров для генерации.
         * @return число примеров
         */
        public int getCount(){
            try {
                return Integer.parseInt(txtCount.getText());
            }catch (NumberFormatException e){
                System.out.println("Use default value");
                return Integer.parseInt(DEFAUILTCOUNT);
            }
        }

        /**
         * Функиця возвращает путь куда нужна записать результаты
         * @return строка
         */
        public String getPath(){
            return  txtPath.getText();
        }

        /**
         * Функиия записи/дозаписи примеров в файл
         * @param pathToFile путь к файлу
         * @param lineWrite что пишем в файл
         */
        public void WriteToFile(String pathToFile, String lineWrite){
            try {
                FileWriter fw = new FileWriter(pathToFile,true);
                fw.write(lineWrite);
                fw.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            lbFinish.setVisible(false);
            startRange = getStartRange();
            endRange = getEndRange();
            if(!checkRange()){
                lbFinish.setText("Range error");
                lbFinish.setVisible(true);
            }
            else {
                if(checkBoxAdd.isSelected() || checkBoxSub.isSelected()){
                    WriteToFile(getPath(),new Date().toString()+"\n");
                    for(int i=1;i<=getCount();i++) {
                        genFirstNumber();
                        genSecondNumber();
                        if(checkBoxAdd.isSelected()){
                            WriteToFile(getPath(),i+": "+getFirstNumber()+"+"+getSecondNumber()+"="+"\n");
                            i++;
                        }
                        if(checkBoxSub.isSelected()){
                            do{
                                genFirstNumber();
                                genSecondNumber();
                            }while (!checkGen());
                            WriteToFile(getPath(),i+": "+getFirstNumber()+"-"+getSecondNumber()+"="+"\n");
                        }
                    }
                    lbFinish.setText("Finish");
                    lbFinish.setVisible(true);
                }
            }
        }
    }

    public static void main(String[] args) {
        jGUIMathGenerator frame = new jGUIMathGenerator();
        frame.windowsBuilder();
    }
}
