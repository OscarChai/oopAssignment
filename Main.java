import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Add Two Numbers");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JLabel result = new JLabel("The result is ");
        JButton button = new JButton("Add");

        t1.setBounds(50, 30, 150, 25);
        t2.setBounds(50, 70, 150, 25);
        button.setBounds(50, 110, 150, 30);
        result.setBounds(50, 150, 200, 25);

        button.addActionListener(e -> {
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            result.setText("Result is " + (a + b));
        });

        frame.add(t1);
        frame.add(t2);
        frame.add(button);
        frame.add(result);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}