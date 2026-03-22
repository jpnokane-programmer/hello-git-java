import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class MotivationalAppGUI {

    public static void main (String[]args){

        //creating the window
        JFrame frame = new JFrame("Motivational Qoute of the Day!");
        frame.setSize(600, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Array of qoutes 
        String[] quotes = {
            " Great things never come from comfort zones.",
            " Believe you can and you're halfway there.",
            " The secrete of getting ahead is  getting starting.",
            " Don't watch the clock , do what it does. Keep going.",
            " Your limitions its only your imagination." 
        };

        //Label to display the qoute
        JLabel label = new JLabel("Click the button for a quote!", JLabel.CENTER);
        label.setFont(new Font("Serif", Font.BOLD, 30));

        //Buton to get a new quote 
        JButton button = new JButton("Show Quote");

        // Random generator
        Random random = new Random();

        // Add action when button is clicked
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = random.nextInt(quotes.length);
                label.setText(quotes[index]);
            }
        });

        // Layout
        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        //Show the window
        frame.setVisible(true);

    }
}

