package com.grupocice.tmu;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.camunda.bpm.engine.runtime.Execution;

public class Tarea1 implements TaskListener {

	public void notify(DelegateTask arg0) {
		// TODO Auto-generated method stub
		DelegateExecution exe = arg0.getExecution();
		String nombreActividad = exe.getCurrentActivityName();
		String nombreEvento = exe.getEventName();
		
		String msg = arg0.getVariable("mensaje").toString();
        System.out.println("Tarea ejecutada, con mensaje:" + msg );
	    System.out.println("Actividad: "+nombreActividad);
	    System.out.println("Evento: "+nombreEvento);
	    
	
	}

}
