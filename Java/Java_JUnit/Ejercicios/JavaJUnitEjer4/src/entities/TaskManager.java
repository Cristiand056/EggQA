/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class TaskManager {

    private ArrayList<String> tasks = new ArrayList<String>() {
    };

    public boolean agregarTarea(int id, String task) {
        try
        {
            if (tasks.get(id).equals(""))
            {
                tasks.add(task);
                return true;
            } else
            {
                return false;
            }
        } catch (Exception e)
        {         
                tasks.add(task);
                return true;
        }
    }
    
    public boolean eliminarTarea(int id) {
        try
        {       
                tasks.remove(id);
                return true;
   
        } catch (Exception e)
        {         
                return false;
        }
    }
    
    public boolean listarTareas(){
        if(!tasks.isEmpty()){
            for(String t : tasks){
                System.out.println(t);
            }
            return true;
        }else{
            return false;
        }
    }
}
