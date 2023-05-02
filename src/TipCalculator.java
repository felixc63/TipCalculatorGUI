import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculator extends JFrame{
    private JPanel panel1;
    private JTextArea a00TextArea;
    private JTextArea a00TextArea1;
    private JTextArea a00TextArea2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton computeButton;
    private JLabel tip;
    private JLabel total;

    public TipCalculator(){
        createUIComponents();
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea.setText("" + (Double.parseDouble(a00TextArea.getText()) + 1));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea.setText("" + (Double.parseDouble(a00TextArea.getText()) - 1));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea1.setText("" + (Double.parseDouble(a00TextArea1.getText()) + 1));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea1.setText("" + (Double.parseDouble(a00TextArea1.getText()) - 1));
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea2.setText("" + (Double.parseDouble(a00TextArea2.getText()) + 1));
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a00TextArea2.setText("" + (Double.parseDouble(a00TextArea2.getText()) - 1));
            }
        });
        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tip.setText("Tip: $" + ((Double.parseDouble(a00TextArea.getText())*Double.parseDouble(a00TextArea1.getText())/100)/Double.parseDouble(a00TextArea2.getText())));
                total.setText("Total: $" + (Double.parseDouble(a00TextArea.getText())/Double.parseDouble(a00TextArea2.getText()) + ((Double.parseDouble(a00TextArea.getText())*Double.parseDouble(a00TextArea1.getText())/100)/Double.parseDouble(a00TextArea2.getText()))));
            }
        });
    }

    private void createUIComponents(){
        setContentPane(panel1);
        setTitle("Tip Calculator For Per Person");
        setSize(800,100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
