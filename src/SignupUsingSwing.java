import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class SignupUsingSwing extends JFrame {

    JLabel title, headerText, birthday,gender;
    JTextArea footerText, policyText;
    JTextField firstname, lastname, email_OR_Phone;
    JPasswordField password;
    JRadioButton male, female, custom;
    JComboBox day, month, year;
    JButton signup;
    //    Font font;
    public SignupUsingSwing(){
        setTitle("Facebook Signup");
        setSize(500,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        title = new JLabel("Sign Up");
        title.setFont(new Font("Arial", Font.BOLD,35));
        title.setBounds(20,10,500,50);
        add(title);

        headerText = new JLabel("It's quick and easy.");
        headerText.setFont(new Font("Arial", Font.PLAIN,14));
        headerText.setForeground(Color.GRAY);
        headerText.setBounds(20,40,500,50);
        add(headerText);




        firstname = new JTextField();
        firstname.setText("First Name");
        firstname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (firstname.getText().equals("First Name")){
                    firstname.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (firstname.getText().equals("")){
                    firstname.setText("First Name");
                }
            }
        });
        firstname.setBounds(15,100,220,35);
        add(firstname);

        // last name textField for name textField
        lastname = new JTextField();
        lastname.setText("Last Name");
        lastname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (lastname.getText().equals("Last Name")){
                    lastname.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (lastname.getText().equals("")){
                    lastname.setText("Last Name");
                }
            }
        });
        lastname.setBounds(245,100,220,35);
        add(lastname);



        email_OR_Phone = new JTextField();
        email_OR_Phone.setText("Mobile number or email");
        email_OR_Phone.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (email_OR_Phone.getText().equals("Mobile number or email")){
                    email_OR_Phone.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (email_OR_Phone.getText().equals("")){
                    email_OR_Phone.setText("Mobile number or email");
                }
            }
        });
        email_OR_Phone.setBounds(15,150,450,35);
        add(email_OR_Phone);



        password = new JPasswordField();
        password.setText("New Password");
        password.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (password.getText().equals("New Password")){
                    password.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (password.getText().equals("")){
                    password.setText("New Password");
                }
            }
        });
        password.setBounds(15,200,450,35);
        add(password);



        birthday = new JLabel("Birthday");
        birthday.setFont(new Font("Arial", Font.PLAIN,14));
        birthday.setForeground(Color.GRAY);
        birthday.setBounds(20,250,400,50);
        add(birthday);


        //date selection comboBox for birthday
        month = new JComboBox<>(new String[] { "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep",
                "Oct", "Nov", "Dec" });
        month.setBounds(20,290,140,35);
        add(month);


        day = new JComboBox<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13",
                "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31" });
        day.setBounds(170,290,140,35);
        add(day);


        year = new JComboBox<>(new String[] { "Year", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013",
                "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000",
                "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987",
                "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974",
                "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961",
                "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" });
        year.setBounds(320,290,140,35);
        add(year);



        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN,14));
        gender.setForeground(Color.GRAY);
        gender.setBounds(20,340,400,50);
        add(gender);

        //Radio button to choose gender
        ButtonGroup group = new ButtonGroup();

        female= new JRadioButton("Female");
        female.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        female.setBounds(20,370,140,35);
        add(female);

        male= new JRadioButton("Male");
        male.setBounds(170,370,140,35);
        add(male);

        custom= new JRadioButton("Custom");
        custom.setBounds(320,370,140,35);
        add(custom);

        group.add(female);group.add(male);group.add(custom);




        footerText = new JTextArea();
        footerText.setText("People who use our service may have uploaded your contact information to\nFacebook. Learn more.");
        footerText.setFont(new Font("Arial", Font.PLAIN, 13));
        footerText.setLineWrap(true);
        footerText.setWrapStyleWord(true);
        footerText.setEditable(false);
        footerText.setOpaque(false);
        footerText.setBounds(20,420,450, 50);
        add(footerText);


        policyText = new JTextArea();
        policyText.setText("By clicking Sign Up, you agree to our Terms, Privacy Policy and Cookies Policy.\nYou may receive SMS Notifications from us and can opt out any time.");
        policyText.setFont(new Font("Arial", Font.PLAIN, 13));
        policyText.setLineWrap(true);
        policyText.setWrapStyleWord(true);
        policyText.setEditable(false);
        policyText.setOpaque(false);
        policyText.setBounds(20,480,450, 50);
        add(policyText);


        /*========== SIGNUP BOTTOM ==========*/
        signup = new JButton("Sign Up");
        signup.setBounds(125,580,200,50);
        add(signup);

        setVisible(true);
    }

    public static void main(String[] args) {
        SignupUsingSwing fb = new SignupUsingSwing();
    }

}

