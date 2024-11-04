import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TheatreSeatBookingSystem extends JFrame implements ActionListener {

    private JComboBox cityComboBox;
    private JComboBox movieComboBox;
    private JComboBox timingComboBox;
    private JCheckBox popcornCheckBox;
    private JCheckBox cokeCheckBox;
    private JButton bookButton;
    private JLabel statusLabel;

    public TheatreSeatBookingSystem() {
        setTitle("Theatre Seat Booking System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(5, 5, 5, 5);

        JLabel headingJLabel = new JLabel("Book my Show App:");
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(headingJLabel, constraints);

        JLabel cityLabel = new JLabel("Destination:");
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(cityLabel, constraints);

        String[] cities = {"Delhi", "Mumbai", "Indore", "Pune", "Goa", "Ahemdabad","Banaglore"};
        cityComboBox = new JComboBox(cities);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(cityComboBox, constraints);

        JLabel movieLabel = new JLabel("Movie:");
        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(movieLabel, constraints);

        String[] movies = {"Pathaan\t\t\t; 146 mins\t; (IMDb):6.1/10\t; Action/Thriller\t\t", "Bholaa\t\t\t; 143 mins; \t(Koimoi):3/5; \tAction/Adventure; ", "John Wick Chapter: 4; \t\t169 mins; \t(IMDb):8.3/10; \tAction/Neo-noir;","Fast X; \t\t\t130 mins; \t(IMDB):7/10; \tAction/Adventure;","Plane\t\t\t\t; 107 mins\t; (IMDB):6.5/10; \tAction/Thriller;"};
        movieComboBox = new JComboBox(movies);
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(movieComboBox, constraints);

        JLabel formatLabel = new JLabel("Select Format:");
        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(formatLabel, constraints);

        String[] formats = {"2D","3D","4D","4D MAX"};
        JComboBox formatsComboBox = new JComboBox(formats);
        constraints.gridx = 1;
        constraints.gridy = 3;
        panel.add(formatsComboBox, constraints);

        JLabel languagJLabel = new JLabel("Select Language:");
        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(languagJLabel, constraints);

        String[] languages = {"English","Hindi","Tamil","Telegu"};
        JComboBox languagesComboBox = new JComboBox(languages);
        constraints.gridx = 1;
        constraints.gridy = 4;
        panel.add(languagesComboBox, constraints);

        JLabel seatsLabel = new JLabel("Number of Seats:");
        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(seatsLabel, constraints);

        String[] seats = {"1","2","3","4","5","6","7","8","9","10"};
        JComboBox seatsComboBox = new JComboBox(seats);
        constraints.gridx = 1;
        constraints.gridy = 5;
        panel.add(seatsComboBox, constraints);

        JLabel seatclassLabel = new JLabel("Which class of seats you want?");
        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(seatclassLabel, constraints);

        String[] seatclasses = {"Silver - Rs.180+GST","Gold - Rs.240+GST","Platinum - Rs.320+GST","Platinum Recliner - Rs.440+GST"};
        JComboBox seatsclassesComboBox = new JComboBox(seatclasses);
        constraints.gridx = 1;
        constraints.gridy = 6;
        panel.add(seatsclassesComboBox, constraints);

        JLabel timingLabel = new JLabel("Timing:");
        constraints.gridx = 0;
        constraints.gridy = 7;
        panel.add(timingLabel, constraints);

        String[] timings = {"10:00 AM", "1:00 PM", "4:00 PM", "7:00 PM", "10:00 PM"};
        timingComboBox = new JComboBox(timings);
        constraints.gridx = 1;
        constraints.gridy = 7;
        panel.add(timingComboBox, constraints);

        JLabel foodLabel = new JLabel("Food & Beverages:");
        constraints.gridx = 0;
        constraints.gridy = 8;
        panel.add(foodLabel, constraints);

        popcornCheckBox = new JCheckBox("Popcorn: 200+GST");
        constraints.gridx = 1;
        constraints.gridy = 8;
        panel.add(popcornCheckBox, constraints);

        cokeCheckBox = new JCheckBox("Coke: 140+GST");
        constraints.gridx = 1;
        constraints.gridy = 9;
        panel.add(cokeCheckBox, constraints);

        JCheckBox nachosCheckBox = new JCheckBox("Nachos: 240+GST");
        constraints.gridx = 1;
        constraints.gridy = 10;
        panel.add(nachosCheckBox, constraints);

        JCheckBox pizzaCheckBox = new JCheckBox("Pizza: 350+GST");
        constraints.gridx = 1;
        constraints.gridy = 11;
        panel.add(pizzaCheckBox, constraints);

        bookButton = new JButton("Book Seats");
        bookButton.addActionListener(this);
        constraints.gridx = 1;
        constraints.gridy = 12;
        panel.add(bookButton, constraints);

        statusLabel = new JLabel();
        constraints.gridx = 1;
        constraints.gridy = 13;
        panel.add(statusLabel, constraints);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String city = (String) cityComboBox.getSelectedItem();
        String movie = (String) movieComboBox.getSelectedItem();
        String timing = (String) timingComboBox.getSelectedItem();
        boolean popcorn = popcornCheckBox.isSelected();
        boolean coke = cokeCheckBox.isSelected();

        // Book seats and update status label
        // ...

        statusLabel.setText("Seats booked successfully!");
    }

    public static void main(String[] args) {
        new TheatreSeatBookingSystem();
    }
}
