
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAssignment extends JFrame {

    //gui components
    JPanel panel;
    JLabel label;
    JLabel imageLabel;
    JButton textButton;
    JButton colorButton;

    //constructor
    public SwingAssignment() {

        setTitle("Java Swing Assignment");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        label = new JLabel(
                "Welcome to Java Swing First Individual Assignment by Manu Bejai-Kumar!"
        );

        label.setFont(new Font("Tahoma", Font.BOLD, 20));

        //app icon
        ImageIcon appIcon = new ImageIcon("App.png");
        setIconImage(appIcon.getImage());
        //image label
        ImageIcon originalImage = new ImageIcon("Ae.png");
        Image scaledImage = originalImage.getImage()
                .getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        ImageIcon welcomeImage = new ImageIcon(scaledImage);
        imageLabel = new JLabel(welcomeImage);
        textButton = new JButton("Change Text");
        colorButton = new JButton("Change Background");
        textButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello! Welcome to my Java application!");
                label.setAlignmentX(Component.CENTER_ALIGNMENT);
                imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
                textButton.setAlignmentX(Component.CENTER_ALIGNMENT);
                colorButton.setAlignmentX(Component.CENTER_ALIGNMENT);
            }
        });

        colorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.RED);
            }
        });
        //add components
        panel.add(label);
        panel.add(imageLabel);
        panel.add(textButton);
        panel.add(colorButton);

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new SwingAssignment();
    }
}
