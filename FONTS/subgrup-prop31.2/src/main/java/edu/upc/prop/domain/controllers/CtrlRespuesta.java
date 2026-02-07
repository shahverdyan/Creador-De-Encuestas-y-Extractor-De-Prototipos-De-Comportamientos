package edu.upc.prop.domain.controllers;

import edu.upc.prop.domain.classes.model.Respuesta;
import edu.upc.prop.persistence.controllers.CtrlPersistencia;

import java.util.List;


public class CtrlRespuesta {

    private final CtrlPersistencia ctrlPersistencia;

    public CtrlRespuesta(CtrlPersistencia ctrlPersistencia) {
        this.ctrlPersistencia = ctrlPersistencia;
    }


    public void agregar(String encuestaId, Respuesta r) {
        ctrlPersistencia.Radd(encuestaId, r);
    }

    public List<Respuesta> listarRespuestas(String encuestaId) {
        return ctrlPersistencia.Rall(encuestaId);
    }

    public boolean eliminarPorParticipante(String encuestaId, String participante) {
        return ctrlPersistencia.RremoveById(encuestaId, participante);
    }

    public void eliminarTodas(String encuestaId) {
        ctrlPersistencia.Rclear(encuestaId);
    }

    public int getSize(String encuestaId) {
        return ctrlPersistencia.Rsize(encuestaId);
    }

    public void eliminarPreguntaR(String encuestaId, String preguntaId) {
        ctrlPersistencia.RremoveQuestion(encuestaId, preguntaId);
    }
}