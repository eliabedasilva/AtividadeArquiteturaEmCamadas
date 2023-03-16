/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquiteturaemcamadas.service;

import arquiteturaemcamadas.entities.Tarefa;
import java.util.List;

/**
 *
 * @author santo
 */
public interface IServiceTarefa {
    //salva a tarefa
    public abstract Tarefa saveAluno(Tarefa tarefa);
    //deleta a tarefa
    public abstract void deleteAluno(Tarefa tarefa);
    
    public abstract Tarefa updateAluno(Tarefa tarefa);
    // Metodo que retorna todas as tarefas da base de dados
    public abstract List<Tarefa> getAllTarefa();
}
