
package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*; // random ke liye
import com.toedter.calendar.JDateChooser;  // calender ke liye
import java.awt.event.*; // ActionListener

public class AddStudent extends JFrame implements ActionListener{
    
    // globly declare 
    JTextField tfname, tffname ,tfaddress ,tfphone,  tfemail, tfx, tfxii, tfadhar;
    JLabel labelrollno;
    JDateChooser dcdob;
    JComboBox cbcourse, cbbranch;
    JButton submit, cancel;
    
    
    Random ran =new Random();
    long first4=Math.abs((ran.nextLong()%9000L)+1000L);
    
    AddStudent(){
        setSize(900,700);
        setLocation(350,50);
        
        setLayout(null);
        
        JLabel heading =new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);
        
        // student name
        JLabel lblname =new JLabel("Name");
        lblname.setBounds(50, 150, 100, 30);
        lblname.setFont(new Font("serif", Font.BOLD, 20));
        add( lblname);
        // text field of student name
        tfname=new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        // father name
        JLabel lblfname =new JLabel("Father's Name");
        lblfname.setBounds(400, 150, 200, 30);
        lblfname.setFont(new Font("serif", Font.BOLD, 20));
        add( lblfname);
        // text field of father name
        tffname=new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
        JLabel lblrollno =new JLabel("Roll Number");
        lblrollno.setBounds(50, 200, 200, 30);
        lblrollno.setFont(new Font("serif", Font.BOLD, 20));
        add( lblrollno);
        
        // random roll no 
        labelrollno =new JLabel("1533"+first4);
        labelrollno.setBounds(200, 200, 200, 30);
        labelrollno.setFont(new Font("serif", Font.BOLD, 20));
        add( labelrollno);
        
        // Date of birth of Student
        JLabel lbldob =new JLabel("Date Of Birth");
        lbldob.setBounds(400, 200, 200, 30);
        lbldob.setFont(new Font("serif", Font.BOLD, 20));
        add( lbldob);
        
        // calender ke liye
        dcdob=new JDateChooser();
        dcdob.setBounds(600, 200, 150, 30);
        add(dcdob);

        // Address
        JLabel lbladdress =new JLabel("Address");
        lbladdress.setBounds(50, 250, 200, 30);
        lbladdress.setFont(new Font("serif", Font.BOLD, 20));
        add( lbladdress);
        // text field of addresss
        tfaddress=new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        
        // Phone number 
        JLabel lblphone =new JLabel("Phone Number");
        lblphone.setBounds(400, 250, 200, 30);
        lblphone.setFont(new Font("serif", Font.BOLD, 20));
        add( lblphone);
        // text field of phone number
        tfphone=new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        // Email 
        JLabel lblemail =new JLabel("Email Id");
        lblemail.setBounds(50, 300, 200, 30);
        lblemail.setFont(new Font("serif", Font.BOLD, 20));
        add( lblemail);
        // text field of addresss
        tfemail=new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        
        // Class X (%)
        JLabel lblx =new JLabel("Class X (%)");
        lblx.setBounds(400, 300, 200, 30);
        lblx.setFont(new Font("serif", Font.BOLD, 20));
        add( lblx);
        // text field of class X
        tfx=new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
        //class XII
        JLabel lblxii =new JLabel("Class XII (%)");
        lblxii.setBounds(50, 350, 200, 30);
        lblxii.setFont(new Font("serif", Font.BOLD, 20));
        add( lblxii);
        // text field of class XII 
        tfxii =new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
        
        
         // Adharcard number
        JLabel lbladhar =new JLabel("Aadhar Number");
        lbladhar.setBounds(400, 350, 200, 30);
        lbladhar.setFont(new Font("serif", Font.BOLD, 20));
        add( lbladhar);
        // text field of Aadhar number
        tfadhar=new JTextField();
        tfadhar.setBounds(600, 350, 150, 30);
        add(tfadhar);
        
        
        //course label
        JLabel lblcourse =new JLabel("Course");
        lblcourse.setBounds(50, 400, 200, 30);
        lblcourse.setFont(new Font("serif", Font.BOLD, 20));
        add( lblcourse);
        // JComboBox ke liye 
        String course[]={"B.Tech","BBA","BCA","MCA","Bsc","B.Com","Msc","MBA","M.Tech","M.Com","MA","BA"};
        cbcourse =new JComboBox(course);
        cbcourse.setBounds(200, 400, 150,30);
        cbcourse.setBackground(Color.WHITE);
        add(cbcourse);
        
        
        //Branch label
        JLabel lblbranch =new JLabel("Branch");
        lblbranch.setBounds(400, 400, 200, 30);
        lblbranch.setFont(new Font("serif", Font.BOLD, 20));
        add( lblbranch);
        // JComboBox ke liye 
        String branch[]={"Computer Science","Electronics","Mechanical","Civil","IT","CA"};
        cbbranch =new JComboBox(branch);
        cbbranch.setBounds(600, 400, 150,30);
        cbbranch.setBackground(Color.WHITE);
        add(cbbranch);
        
        // create submit button
        submit=new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);  // button pr click krne action kre esliye use kiya hai
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        // create canclet button
        cancel=new JButton("Cancle");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);  // button pr click krne action kre esliye use kiya hai
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== submit){
            String name=tfname.getText();
            String fname=tffname.getText();
            String rollno=labelrollno.getText();
            String dob=((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();
            String x=tfx.getText();
            String xii=tfxii.getText();
            String adhar=tfadhar.getText();
            String course=(String)cbcourse.getSelectedItem();
            String branch=(String)cbbranch.getSelectedItem();
            
            try{
                String query="insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+adhar+"', '"+course+"', '"+branch+"')";
                
                Conn con=new Conn();
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }
    
    public static void main(String[] args){
        new AddStudent();
    }
}
