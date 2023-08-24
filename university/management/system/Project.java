
package university.management.system;

import java.awt.*;  // image awt package ke under hota hai
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener{
    
    Project(){
        setSize(1540,850);
        
        // create image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/medi.jpeg"));
        Image i2=i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        //menu bar ke liye
        
        JMenuBar mb=new JMenuBar();
        // new information
        JMenu newInformation=new JMenu("New Information");
        
        newInformation.setForeground(Color.BLUE);
        mb.add(newInformation);
        
        // add new faculty
        JMenuItem facultyInfo=new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);
        
        // new student 
        JMenuItem studentInfo=new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);
        
        
        // Details
        JMenu details=new JMenu("View Details");
        details.setForeground(Color.RED);
        mb.add(details);
        
        // view faculty
        JMenuItem facultyDetails=new JMenuItem("view Faculty Details");
        facultyDetails.setBackground(Color.WHITE);
        facultyDetails.addActionListener(this);
        details.add(facultyDetails);
        
        // view student 
        JMenuItem studentDetails=new JMenuItem("view Student Details");
        studentDetails.setBackground(Color.WHITE);
        studentDetails.addActionListener(this);
        details.add(studentDetails);
        
         // Leave
        JMenu leave=new JMenu("Apply Leave");
        leave.setForeground(Color.BLUE);
        mb.add(leave);
        
        // Leave faculty
        JMenuItem facultyLeave=new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);
        
        // Leave student 
        JMenuItem studentLeave=new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);
        
        
         // Leave details
        JMenu leaveDetails=new JMenu(" Leave Details");
        leaveDetails.setForeground(Color.RED);
        mb.add( leaveDetails);
        
        // Leave faculty details
        JMenuItem facultyLeaveDetails=new JMenuItem("Faculty Leave Details");
        facultyLeaveDetails.setBackground(Color.WHITE);
        facultyLeaveDetails.addActionListener(this);
        leaveDetails.add(facultyLeaveDetails);
        
        // Leave student details
        JMenuItem studentLeaveDetails=new JMenuItem("Student Leave Details");
        studentLeaveDetails.setBackground(Color.WHITE);
        studentLeaveDetails.addActionListener(this);
        leaveDetails.add(studentLeaveDetails);
        
        
        // Exam
        JMenu exam=new JMenu(" Examination");
        exam.setForeground(Color.BLUE);
        mb.add( exam);
        
        // Leave faculty
        JMenuItem examDetails=new JMenuItem("Examinatin Results");
        examDetails.setBackground(Color.WHITE);
        examDetails.addActionListener(this);
        exam.add(examDetails);
        
        // Leave student 
        JMenuItem enterMarks=new JMenuItem("Enter Marks");
        enterMarks.setBackground(Color.WHITE);
        enterMarks.addActionListener(this);
        exam.add(enterMarks);
        
        
        // Update
        JMenu updateInfo=new JMenu(" Update Details");
        updateInfo.setForeground(Color.RED);
        mb.add( updateInfo);
        
        // update faculty
        JMenuItem updateFacultyInfo=new JMenuItem("Update Faculty Details");
        updateFacultyInfo.setBackground(Color.WHITE);
        updateFacultyInfo.addActionListener(this);
        updateInfo.add(updateFacultyInfo);
        
        // update student 
        JMenuItem updateStudentInfo=new JMenuItem("Update Student Details");
        updateStudentInfo.setBackground(Color.WHITE);
        updateStudentInfo.addActionListener(this);
        updateInfo.add(updateStudentInfo);
        
        
        // fees
        JMenu fees=new JMenu("Fees Details");
        fees.setForeground(Color.BLUE);
        mb.add( fees);
        
        // fees structure
        JMenuItem feestructure=new JMenuItem("Fees Strucure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fees.add(feestructure);
        
        // fees form 
        JMenuItem feesForm=new JMenuItem("Student Fee Form");
        feesForm.setBackground(Color.WHITE);
        feesForm.addActionListener(this);
        fees.add(feesForm);
        
         // Utility
        JMenu utility=new JMenu(" Utility");
        utility.setForeground(Color.RED);
        mb.add( utility);
        
        // note pad
        JMenuItem notePad=new JMenuItem("Notepad");
        notePad.setBackground(Color.WHITE);
        notePad.addActionListener(this);
        utility.add(notePad);
        
        // calculator
        JMenuItem calc=new JMenuItem("Calculator");
        calc.setBackground(Color.WHITE);
        calc.addActionListener(this);
        utility.add(calc);
        
         // about
        JMenu about=new JMenu("About");
        about.setForeground(Color.BLUE);
        mb.add( about);
        
        // note pad
        JMenuItem ab=new JMenuItem("About");
        ab.setBackground(Color.WHITE);
        ab.addActionListener(this);
        about.add(ab);
        
         // Exit
        JMenu exit=new JMenu(" Exit");
        exit.setForeground(Color.RED);
        mb.add( exit);
        
        // note pad
        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.WHITE);
        ex.addActionListener(this);
        exit.add(ex);
        
        

        
        setJMenuBar(mb);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String msg=ae.getActionCommand();
        
        if (msg.equals("Exit")){
            setVisible(false);
        } else if (msg.equals("Calculator")){
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch(Exception e){
               
            }
        }else if(msg.equals("Notepad")){
            try{
                Runtime.getRuntime().exec("notePad.exe");
            }catch (Exception e){
                
            }
        }else if(msg.equals("New Faculty Information")){
            new AddTeacher();
        }else if(msg.equals("New Student Information")){
            new AddStudent();
        }else if(msg.equals("view Faculty Details")){
            new TeacherDetails();
        }else if(msg.equals("view Student Details")){
            new StudentDetails();
        }else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }else if(msg.equals("Student Leave")){
            new StudentLeave();
        }else if(msg.equals("Faculty Leave Details")){
            new TeacherLeaveDetails();
        }else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }else if(msg.equals("Update Faculty Details")){
             new UpdateTeacher();
        }else if(msg.equals("Update Student Details")){
            new UpdateStudent();
        }else if(msg.equals("Enter Marks")){
            new EnterMarks();
        }else if(msg.equals("Examinatin Results")){
            new ExaminationDetails();
        }else if(msg.equals("Fees Strucure")){
            new FeeStructure();
        }else if(msg.equals("About")){
            new About();
        }else if(msg.equals("Student Fee Form")){
            new StudentFeeForm();
        }
                
    }
    
    
    
    public static void main(String[] args){
        new Project();
    }
    
}
