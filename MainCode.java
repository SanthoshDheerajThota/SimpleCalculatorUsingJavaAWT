//this code is completely written by T.Santhosh Dheeraj
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class App extends JFrame implements ActionListener{
    JLabel welcome=new JLabel("          WELCOME               ");
    JFrame frame=new JFrame("  CALCULATOR   ");
    JLabel label1=new JLabel("   ENTER NUMBER 1   ");
    JLabel label2=new JLabel("ENTER NUMBER 2");
    JTextField field1=new JTextField(20);
    JTextField field2=new JTextField(20);
    JButton sum=new JButton("  SUM  ");
    JButton product=new JButton("  PRODUCT  ");
    JLabel result=new JLabel("    RESULT          ");

    public void doIt() {
        frame.setSize(275,275);
        frame.setLayout(new FlowLayout());
        frame.add(welcome); 
        frame.add(label1); 
        frame.add(field1);
        frame.add(label2);  
        frame.add(field2); 
        frame.add(sum); 
        frame.add(product); 
        sum.addActionListener(this);
        product.addActionListener(this);
        frame.add(result); 
        frame.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==sum){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int sum=num1+num2;
            result.setText("     SUM  :  "+sum);
        }
        else if(e.getSource()==product){
            int num1=Integer.parseInt(field1.getText());
            int num2=Integer.parseInt(field2.getText());
            int product=num1*num2;
            result.setText("PRODUCT    :    "+product);
        }
    }
}
class temporary{
    public static void main(String[] args) {
        App myApp=new App();
        myApp.doIt();
    }
}
