/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package cst315groupthink;
import java.util.LinkedList;
/**
 *
 * @author Mike
 */
public class Student extends User implements Observer{

    
    
    private String name;
    private String major;
    private String hobbies;
    private int notifications;//number of notifications a student has
    private LinkedList<Note> personalNotes;
    private Subject subject;
    
    public Student(String nameofStudentString,Subject subject){
       personalNotes = new LinkedList<>();
       name = nameofStudentString;
       major = "UNDECLARED";
       hobbies = "";
       notifications = 0;
       subject.regObserver(this,nameofStudentString);
       this.subject = subject;
       
        
    }
    
    public Student(String namString, String majString,Subject s){
        
        personalNotes = new LinkedList<>();
        name = namString;
        major = majString;
        hobbies = "";
        notifications = 0;
        subject.regObserver(this,namString);
        this.subject = s;
       
        
    }
   public void addNote(Note n){
       
       personalNotes.add(n);
   }
   public boolean removeNote(Note n){
       return personalNotes.remove(n);
   }
    
   public String ViewNotes(){
       
       return personalNotes.toString();
   }
    public void CreateThread(){}
    public void postForum(String msg){}
    public void Chat(Student S,String msg){}
    @Override
    public void VerifyLogin(){}
    @Override
    public void VerifyUser() {}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

   
    @Override
    public void update(Note n,Student S) {
        
        System.out.println(S.getName() + " Has recieved a Note");
        System.out.println("Note Contents :" + n.toString());
        personalNotes.add(n);
        
    }

    @Override
    public void update(Note n) {
        System.out.println(this.getName() + ": has recieved a Note");
        System.out.println("Contents of Note: " + n.toString()); 
        personalNotes.add(n);
    }

    
    
    
    
}
