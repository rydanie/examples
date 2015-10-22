
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author woytek
 */
public class ConverterGUI {

    static JLabel answerField;
    static JButton convertButton;
    static JButton quitButton;
    static JTextField inputField;
    static GridBagLayout layout;
    static ButtonGroup unitSelection;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a window for our app
        JFrame myFrame = new JFrame("Converter GUI");
        // Set it to quit the app when we close the window
        // NOTE that this is the default behavior--we could omit this here
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // make it visible (important!)
        ////myFrame.setVisible( true );
        //myFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //myFrame.setLayout( new GridLayout( 2, 2, 50, 10 ) );
        layout = new GridBagLayout();
        myFrame.setLayout( layout );
        
        ActionListener listener = new MyListener();
        
        GridBagConstraints c = new GridBagConstraints();
        // general constraints
        c.fill = GridBagConstraints.BOTH;
        
        // label constraints
        c.weightx = 0.0;
        c.gridwidth = GridBagConstraints.RELATIVE;
        
        c.gridx = 0;
        c.gridy = 1;
        answerField = new JLabel( "Please enter a number to convert" );
        layout.setConstraints( answerField, c );
        myFrame.add( answerField );
        
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 0;
        inputField = new JTextField(30);
        layout.setConstraints( inputField, c );
        myFrame.add( inputField );
        
        c.weightx = 0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridx = 2;
        c.gridy = 0;
        JLabel unitLabel = new JLabel("m");
        layout.setConstraints( unitLabel, c );
        myFrame.add( unitLabel );
        
        c.gridwidth = GridBagConstraints.RELATIVE;
        
        unitSelection = new ButtonGroup();
        JRadioButton kiloRadio = new JRadioButton( "Kilometers" );
        JRadioButton inchesRadio = new JRadioButton( "Inches" );
        JRadioButton feetRadio = new JRadioButton( "Feet" );
        kiloRadio.setActionCommand( "convertKilo" );
        inchesRadio.setActionCommand( "convertInches" );
        feetRadio.setActionCommand( "convertFeet" );
        kiloRadio.addActionListener( listener );
        inchesRadio.addActionListener( listener );
        feetRadio.addActionListener( listener );
        
        
        unitSelection.add( kiloRadio );
        unitSelection.add( inchesRadio );
        unitSelection.add( feetRadio );
        
        JPanel unitSelectionPanel = new JPanel();
        unitSelectionPanel.setLayout( new GridLayout( 0, 3 ) );
        unitSelectionPanel.add( kiloRadio );
        unitSelectionPanel.add( inchesRadio );
        unitSelectionPanel.add( feetRadio );
        
        c.gridx = 0;
        c.gridy = 3;
        layout.setConstraints( unitSelectionPanel, c );
        myFrame.add( unitSelectionPanel );
        
        c.weightx = 1;
        c.gridx = 0;
        c.gridy = 4;
        convertButton = new JButton("Convert!");
        convertButton.setFont(new Font("TimesRoman", Font.ITALIC, 12));
        convertButton.setActionCommand( "convert" );
        
        convertButton.addActionListener(listener);
        layout.setConstraints( convertButton, c);
        myFrame.add(convertButton);
        
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 0;
        c.gridx = 2;
        c.gridy = 4;
        quitButton = new JButton( "Quit" );
        quitButton.setActionCommand( "quit" );
        
        layout.setConstraints( quitButton, c);
        quitButton.addActionListener( listener );
        myFrame.add(quitButton);
        
        c.gridwidth = GridBagConstraints.RELATIVE;
        
        
        
        
        /*
        // OK, now let's add a label
        myLabel = new JLabel("Hello, GUI World! This is awesome!");
        // let's set some properties
        // NOTE: These properties (font and color) come from AWT!!!!
        myLabel.setForeground(Color.BLUE);
        myLabel.setFont(new Font("TimesRoman", Font.BOLD, 24));
        layout.setConstraints( myLabel, c );
        // Now add it to the frame (ALSO IMPORTANT!!!!!!!)
        myFrame.add(myLabel);

        // button constraints
        c.gridwidth = GridBagConstraints.REMAINDER;
        // make button
        myButton = new JButton("Cycle Color");
        myButton.setFont(new Font("TimesRoman", Font.ITALIC, 12));

        ActionListener listener = new MyListener();
        myButton.addActionListener(listener);

        layout.setConstraints( myButton, c);
        myFrame.add(myButton);

        // text field setup
        // text field constraints
        c.gridwidth = GridBagConstraints.RELATIVE;
        myTextField = new JTextField( myLabel.getText(), 40 );
        layout.setConstraints(myTextField, c);
        myFrame.add( myTextField );
        
        // text button add
        c.gridwidth = GridBagConstraints.REMAINDER;
        textFieldUpdate = new JButton("Update Label");
        textFieldUpdate.addActionListener(listener);
        layout.setConstraints(textFieldUpdate, c);
        myFrame.add( textFieldUpdate );
        */
        
        myFrame.pack();
        myFrame.setSize( myFrame.getPreferredSize() );
        // Our size will be wrong, so let's fix it
        //myFrame.setSize(600, 200);
        // alternate: use pack
        //myFrame.pack();

        myFrame.setVisible(true);

    }

    static class MyListener implements ActionListener {

        int convertType = 0;

        public void actionPerformed(ActionEvent e) {
            //JButton eventSource = (JButton) e.getSource();
            //eventSource.setForeground(theColors[index++]);
            //JButton eventSource = (JButton)e.getSource();
            //answerField.setText( e.getActionCommand() );
            switch( e.getActionCommand() ) {
                case "quit":
                    System.exit(0);
                    break;
                case "convertKilo":
                    convertType = 1;
                    break;
                case "convertInches":
                    convertType = 2;
                    break;
                case "convertFeet":
                    convertType = 3;
                    break;
                case "convert":
                    if( inputField.getText().equals("") ) {
                        answerField.setText( "Please enter a number to convert!" );
                        break;
                    }
                    switch( convertType ) {
                        case 1:
                            answerField.setText(Double.toString(Double.parseDouble(inputField.getText()) * .001));
                            break;
                        case 2:
                            answerField.setText(Double.toString(Double.parseDouble(inputField.getText()) * 39.37));
                            break;
                        case 3:
                            answerField.setText(Double.toString(Double.parseDouble(inputField.getText()) * 3.281));
                            break;
                        default:
                            answerField.setText( "You have selected an invalid conversion type" );
                            break;
                    }
                    
            }
           
            /*
            if( eventSource.getText().equals("Update Label") ) {
                myLabel.setText( myTextField.getText() );
            } else {
                myLabel.setForeground( theColors[++index] );
                if (index >= theColors.length - 1) {
                    index = -1;
                }
            }
            */
        }
    }
    
}
