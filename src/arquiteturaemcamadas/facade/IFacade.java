/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquiteturaemcamadas.facade;

import arquiteturaemcamadas.entities.Tarefa;
import java.util.List;

/**
 *
 * @author santo
 */
public interface IFacade {
    
    //------------------- TAREFA -------------------------------//
    
    public abstract void saveTarefa(Tarefa tarefa);
    public abstract void uptadeTarefa(Tarefa tarefa);
    public abstract void deleteTarefa(Tarefa tarefa);
    public abstract List<Tarefa> getAllTarefa();
    
    
    
}
