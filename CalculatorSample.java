import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.multi.MultiLabelUI;

public class CalculatorSample implements ActionListener{
    

    boolean isOperatorClicked=false; 

    String oldValue;

    JFrame jf;
    JLabel displayLable;
    JButton seveButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton minusButton;
    JButton plusButton;
    JButton clearButton;
    
 
    public CalculatorSample(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(300, 150);

        displayLable=new JLabel();
        displayLable.setBounds(30, 50, 540, 40);
        displayLable.setBackground(Color.GRAY);
        displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLable.setForeground(Color.WHITE);
        displayLable.setOpaque(true);
        jf.add(displayLable);

        seveButton=new JButton("7");
        seveButton.setBounds(30, 130, 80 , 80);
        seveButton.addActionListener(this);
        seveButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(seveButton);

        eightButton=new JButton("8");
        eightButton.setBounds(130, 130, 80 , 80);
        eightButton.addActionListener(this);
        eightButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(230, 130, 80 , 80);
        nineButton.addActionListener(this);
        nineButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 230, 80 , 80);
        fourButton.addActionListener(this);
        fourButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(fourButton);

        fiveButton=new JButton("5");
        fiveButton.setBounds(130, 230, 80 , 80);
        fiveButton.addActionListener(this);
        fiveButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(230, 230, 80 , 80);
        sixButton.addActionListener(this);
        sixButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(sixButton);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 330, 80 , 80);
        oneButton.addActionListener(this);
        oneButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(oneButton);

        twoButton=new JButton("2");
        twoButton.setBounds(130, 330, 80 , 80);
        twoButton.addActionListener(this);
        twoButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(230, 330, 80 , 80);
        threeButton.addActionListener(this);
        threeButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30, 430, 80 , 80);
        dotButton.addActionListener(this);
        dotButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(dotButton);

        zeroButton=new JButton("0");
        zeroButton.setBounds(130, 430, 80 , 80);
        zeroButton.addActionListener(this);
        zeroButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(230, 430, 80 , 80);
        equalButton.addActionListener(this);
        equalButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(330, 130, 80 , 80);
        divButton.addActionListener(this);
        divButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(divButton);

        
        mulButton=new JButton("x");
        mulButton.setBounds(330, 230, 80 , 80);
        mulButton.addActionListener(this);
        mulButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(mulButton);

        
        minusButton=new JButton("-");
        minusButton.setBounds(330, 330, 80 , 80);
        minusButton.addActionListener(this);
        minusButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(minusButton);

        plusButton=new JButton("+");
        plusButton.setBounds(330, 430, 80 , 80);
        plusButton.addActionListener(this);
        plusButton.setFont(new Font("Arial", Font.PLAIN,25));
        jf.add(plusButton);

        clearButton=new JButton("Clear");
        clearButton.setBounds(430, 430, 80 , 80);
        clearButton.addActionListener(this);
        clearButton.setFont(new Font("Arial", Font.PLAIN,15));
        jf.add(clearButton);




        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
    public static void main(String[] args) {
        new CalculatorSample();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== seveButton){
            if(isOperatorClicked){

                displayLable.setText("7");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"7");

            }
            
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){

                displayLable.setText("8");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"8");

            }
            
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){

                displayLable.setText("9");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"9");

            }
            
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){

                displayLable.setText("4");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"4");

            }
            
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){

                displayLable.setText("5");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"5");

            }
            
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){

                displayLable.setText("6");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"6");

            }
            
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){

                displayLable.setText("1");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"1");

            }
            
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){

                displayLable.setText("2");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"2");

            }
            
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){

                displayLable.setText("3");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"3");

            }
            
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){

                displayLable.setText("0");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+"0");

            }
        
        }else if(e.getSource()==dotButton){
            if(isOperatorClicked){

                displayLable.setText(".");
                isOperatorClicked=false;

            }else{

                displayLable.setText(displayLable.getText()+".");

            }
            
        }else if(e.getSource()==equalButton){

            String newValue=displayLable.getText();

            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);

            float result=oldValueF+newValueF;

            displayLable.setText(result+"");

        }else if(e.getSource()==plusButton){

            isOperatorClicked=true;
            oldValue=displayLable.getText();

        }else if(e.getSource()==divButton){

        }else if(e.getSource()==mulButton){

        }else if(e.getSource()==minusButton){

        }else if(e.getSource()==clearButton){
            displayLable.setText("");
        }
    }
    
   
 
    


}
