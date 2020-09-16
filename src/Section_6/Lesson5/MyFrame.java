package Section_6.Lesson5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener{

    private JTextField nameTF;
    private JTextField emailTF;
    private JCheckBox news;
    public MyFrame(){
        super("Моя программа");
        setBounds(400,200,600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();//создали панель
        panel.setBorder(new EmptyBorder(10,0,0,0));//установить в панеле невидемую рамку (10 пикселей сверху)
        JLabel label = new JLabel("My Form"); //создали текст
        label.setFont(new Font("Algerian",Font.BOLD,22)); //шрифт жирный 22 размер
        panel.add(label);//добавили текст на панель

        JPanel form = new JPanel();//создали панель форм
        form.setLayout(new GridBagLayout());//________________________
        JLabel nameL = new JLabel("Имя:");//создали метку имя
        nameTF = new JTextField();//создали текстовое поле для имени
        JLabel emailL = new JLabel("E - mail:");//создали метку емейл
        emailTF = new JTextField();//создали поле для емайла

        nameL.setHorizontalAlignment(SwingConstants.RIGHT);//выровнять метку ИМЯ по правому боку
        emailL.setHorizontalAlignment(SwingConstants.RIGHT);//выровнять метку ЕМАЙЛ по правому боку
        nameTF.setPreferredSize(new Dimension(200,40));//разтягивает текстовое поле ИМЯ (выставляем размер)
        emailTF.setPreferredSize(new Dimension(200,40));//разтягивает текстовое поле ЕМАЙЛ (выставляем размер)

        GridBagConstraints gridBagConstraints = new GridBagConstraints();//____ПРОЧИТАТЬ ПРО ЭТОТ КЛАСС___________выводит по координатам элементы
        gridBagConstraints.insets = new Insets(0,0,15,20);// отступ между текстовых полях 15 пикселей, и 20 между меткой и текстовым поле
        gridBagConstraints.fill = GridBagConstraints.BOTH;//Это поле используется, когда область дисплея компонента больше чем требуемый размер компонента. Это определяет, изменить ли размеры компонента, и если так, как BOTH: Заставьте компонент заполнить свою область дисплея полностью.
        gridBagConstraints.gridx = 0;//водим координат Х
        gridBagConstraints.gridy = 0;//вводим координат Y
        form.add(nameL,gridBagConstraints);//сохраняем координаты выше для метки ИМЯ
        gridBagConstraints.gridx = 1;//водим координат Х
        gridBagConstraints.gridy = 0;//вводим координат Y
        form.add(nameTF,gridBagConstraints);//сохраняем координаты выше для текстового поля ИМЯ
        gridBagConstraints.gridx = 0;//водим координат Х
        gridBagConstraints.gridy = 1;//вводим координат Y
        form.add(emailL,gridBagConstraints);//сохраняем координаты выше для метки ЕМАЙЛ
        gridBagConstraints.gridx = 1;//водим координат Х
        gridBagConstraints.gridy = 1;//вводим координат Y
        form.add(emailTF,gridBagConstraints);//сохраняем координаты выше для текстового поля ЕМАЙЛ

        JPanel bottom = new JPanel();//создали панель кнопки
        bottom.setBorder(new EmptyBorder(0,0,10,0));//установить в панеле боттом невидемую рамку (10 пикселей снизу)
        news = new JCheckBox("Подписаться на новости");//создали чек бокс
        JButton button = new JButton("Отправить");//создали кнопку
        button.setPreferredSize(new Dimension(200,50));//установить размер кнопки (200 ширина,50 высота)
        bottom.add(news);//добавили чек бокс на панель
        bottom.add(button);//добавили кнопку на панель

        add(panel,BorderLayout.NORTH);//добавили в окно панель сверху
        add(form,BorderLayout.CENTER);//добавили в окно панель форм по центру
        add(bottom,BorderLayout.SOUTH);//добавили в окно панель кнопки снизу

        button.addActionListener(this);
        news.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        //System.out.println(ae.getActionCommand());
        if (ae.getActionCommand().equals("Подписаться на новости")){
            System.out.println("Нажат чекбокс");
        }else if (ae.getActionCommand().equals("Отправить")){
            //System.out.println("Нажата кнопка");
            String name = nameTF.getText();
            String email = emailTF.getText();
            boolean bNews = news.isSelected();
            try{
                User user = new User(name,email,bNews);
                User.add(user);
                User.printAllUsers();
            }catch (UserEx e){
                if (e.getCode()==UserEx.NO_NAME) showError("Вы не ввели имя");
                else if (e.getCode()==UserEx.NO_EMAIL) showError("Вы не ввели e-mail");
            }
        }
    }
    private void showError(String text){
        JOptionPane.showMessageDialog(this,text,"Ошибка",JOptionPane.ERROR_MESSAGE);
    }
}