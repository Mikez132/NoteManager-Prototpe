/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst315groupthink;

import java.io.IOException;


/**
 *
 * @author Mike
 */
public class CST315GroupThink {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        Note newNote = new Note("Ch 1 Notes", "Ch 1 discusses several design patterns");
        NoteManager nm = new NoteManager();
        
        Student st2 = new Student("Joe", nm);
        Student st1 = new Student("Sam", nm);
        
        System.out.println("Sharing Note to Specific Student");
        
        nm.ShareNote(newNote,st2);
        
        System.out.println("Sharing Notes To all Students");
        
        
        Student st3 = new Student("Bob", nm);
        Note anotherNote = new Note("ch 2 Notes","UX Design and DevOps");
        nm.ShareNote(anotherNote);
        st3.addNote(newNote);
        System.out.println("Printing List of Notes for " +  st3.getName());
        System.out.println(st3.ViewNotes());
        
        
        
    }
    
}
