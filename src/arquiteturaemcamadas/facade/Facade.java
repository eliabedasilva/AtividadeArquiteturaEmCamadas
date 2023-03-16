/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquiteturaemcamadas.facade;

import arquiteturaemcamadas.entities.Tarefa;
import arquiteturaemcamadas.entities.TarefaDAO;
import java.util.List;

/**
 *
 * @author santo
 */
public class Facade implements IFacade{
    
    private TarefaDAO tarefaDAO;

    public Facade() {
        this.tarefaDAO = new TarefaDAO();
    }

    

    @Override
    public void saveTarefa(Tarefa tarefa) {
        this.tarefaDAO.save(tarefa);
    }

    @Override
    public void uptadeTarefa(Tarefa tarefa) {
        this.tarefaDAO.update(tarefa);
    }

    @Override
    public void deleteTarefa(Tarefa tarefa) {
        this.tarefaDAO.delete(tarefa);
    }

    @Override
    public List<Tarefa> getAllTarefa() {
        return this.tarefaDAO.findAll();
    }
    
}
