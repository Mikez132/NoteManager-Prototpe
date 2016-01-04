/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst315groupthink;

import java.util.*;

/**
 *
 * @author Mike
 */
public final class NoteManager implements Subject{
    
   
    private LinkedList<Observer> observers = new LinkedList<>();
    private HashMap<Observer,String>NameList = new HashMap<>();//Maps Observers and Student Names
    
    
    
    public NoteManager(Note n){
        
        
        //personalNotes = new LinkedList<>();
        //personalNotes.add(n);
       
        
    }
    
    public NoteManager(){
        
        //personalNotes = new LinkedList<>();
        
    }
    
    public NoteManager(Student s, Note n){
        
    
       // personalNotes = new LinkedList<>();
       // personalNotes.add(n);
       
        
    }
    
    public void ShareNote(Note n,Student S){
           
       
        notifyObserver(n,S);
     
    }
    public void ShareNote(Note n){
        
        notifyObserver(n);
        
    }
    /*
    public void addNote(Note m){
        
        
        personalNotes.add(m);
        
    }
    public void deleteNote(Note n){
       
        personalNotes.remove(n);
        
    }
    public boolean doesNoteExist(Note n){
        
         boolean result = personalNotes.contains(n);
         return result;
        
        
    }
    public int numOfNotes(){
        
        return personalNotes.size();
        
    }
    public boolean isEmpty(){
        
        return personalNotes.isEmpty();
        
    }
    
    
   
    @Override
    public String toString(){
        
        return personalNotes.toString();
        
        
    }
    */
    

    @Override
    public void regObserver(Observer obs,String nameString) {
        
      
        observers.add(obs);
        NameList.put(obs, nameString);
        
    }

    @Override
    public void delObserver(Observer obs) {
        
        observers.remove(obs);
        
    }

    @Override
    public void notifyObserver(Note n,Student student) {
        
       
      Set set = NameList.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      String name = student.getName();
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         
         if(me.getValue() == name){
            
             Observer obs = (Observer)me.getKey();
             obs.update(n, student);
             
         }
      
      }
           
       
    }

    @Override
    public void notifyObserver(Note n) {
         for(Observer observer : observers)
                    observer.update(n);
    }
    
    
    
    
    
}
