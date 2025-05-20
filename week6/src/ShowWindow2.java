import javax.swing.*;
import java.awt.*;

public class ShowWindow2 extends JFrame {

    JPanel panel1;

    JPanel panel2;

    JLabel messageLabel1;

    JLabel messageLabel2;

    JTextField showWindowTextField1;

    JTextField showWindowTextField2;


    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;



    public ShowWindow2() {

        setTitle("My Simple Window");

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(Color.RED);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(40, 20, 20, 20)); // top, left, bottom, right


        buildPanel1();
        buildPanel2();


        mainPanel.add(panel1);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 15))); // vertical space between the panels
        mainPanel.add(panel2);

        add(mainPanel);

        setLocationRelativeTo(null);

        setVisible(true);

    }

    public void buildPanel1() {

        messageLabel1 = new JLabel("My First Big Label!!!");
        messageLabel1.setFont(new Font("Times New Romen", Font.PLAIN, 18));

        showWindowTextField1 = new JTextField(10);
        showWindowTextField1.setMaximumSize(new Dimension(200, 25));

        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBackground(Color.RED);

        messageLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
        showWindowTextField1.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel1.add(messageLabel1);
        panel1.add(Box.createRigidArea(new Dimension(0, 10)));
        panel1.add(showWindowTextField1);


    }

    public void buildPanel2() {

        messageLabel2 = new JLabel("My Second Big Label!");
        messageLabel2.setFont(new Font("Times New Romen", Font.BOLD, 14));

        showWindowTextField2 = new JTextField(10);
        showWindowTextField2.setMaximumSize(new Dimension(200, 25));

        panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBackground(Color.RED);

        messageLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
        showWindowTextField2.setAlignmentX(Component.LEFT_ALIGNMENT);

        panel2.add(messageLabel2);
        panel2.add(Box.createRigidArea(new Dimension(0, 10)));
        panel2.add(showWindowTextField2);



    }



    public static void main(String[] args) {

        new ShowWindow2();

    }




}





//    v--Code before adding mainPanel--v

//public class ShowWindow2 extends JFrame {
//
//        JPanel panel1;
//
//        JPanel panel2;
//
//        JLabel messageLabel1;
//
//        JLabel messageLabel2;
//
//        JTextField showWindowTextField1;
//
//        JTextField showWindowTextField2;
//
//
//        final int WINDOW_WIDTH = 350;
//        final int WINDOW_HEIGHT = 450;
//
//
//
//        public ShowWindow2() {
//
//            setTitle("My Simple Window");
//
//            setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
//
//            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            setLayout(new GridLayout(2, 1));
//
//
//            buildPanel1();
//            buildPanel2();
//
//            add(panel1);
//            add(panel2);
//
//            getContentPane().setBackground(java.awt.Color.RED);
//
//            setLocationRelativeTo(null);
//
//            setVisible(true);
//
//        }
//
//        public void buildPanel1() {
//
//            messageLabel1 = new JLabel("My First Big Label!!!");
//            messageLabel1.setFont(new Font("Times New Romen", Font.PLAIN, 18));
//
//            showWindowTextField1 = new JTextField(10);
//            showWindowTextField1.setMaximumSize(new Dimension(200, 25));
//
//            panel1 = new JPanel();
//            panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
//            panel1.setBackground(Color.RED);
//
//            messageLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
//            showWindowTextField1.setAlignmentX(Component.LEFT_ALIGNMENT);
//
//            panel1.add(messageLabel1);
//            panel1.add(Box.createRigidArea(new Dimension(10, 10)));
//            panel1.add(showWindowTextField1);
//
//
//        }
//
//        public void buildPanel2() {
//
//            messageLabel2 = new JLabel("My Second Big Label!");
//            messageLabel2.setFont(new Font("Times New Romen", Font.BOLD, 14));
//
//            showWindowTextField2 = new JTextField(10);
//            showWindowTextField2.setMaximumSize(new Dimension(200, 25));
//
//            panel2 = new JPanel();
//            panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
//            panel2.setBackground(Color.RED);
//
//            messageLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);
//            showWindowTextField2.setAlignmentX(Component.LEFT_ALIGNMENT);
//
//            panel2.add(messageLabel2);
//            panel2.add(Box.createRigidArea(new Dimension(10, 10)));
//            panel2.add(showWindowTextField2);
//
//
//
//        }
//
//
//
//        public static void main(String[] args) {
//
//            new ShowWindow2();
//
//        }
//
//
//
//
//}