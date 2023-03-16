/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquiteturaemcamadas.service;

import arquiteturaemcamadas.entities.Tarefa;
import arquiteturaemcamadas.entities.TarefaDAO;
import java.util.List;

/**
 *
 * @author santo
 */
public class ServiceTarefa implements IServiceTarefa{
    
    private final TarefaDAO tarefaDao = new TarefaDAO();

    @Override
    public Tarefa saveAluno(Tarefa tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteAluno(Tarefa tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tarefa updateAluno(Tarefa tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Tarefa> getAllTarefa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
