package org.eclipse.cdt.interfacegenerator.generate.test;

import mockmaker.ReturnValues;
import mockmaker.VoidReturnValues;
import mockmaker.ExceptionalReturnValue;
import com.mockobjects.*;
import org.eclipse.core.runtime.IProgressMonitor;
public class MockIProgressMonitor implements IProgressMonitor{
   private ExpectationCounter myBeginTaskCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor BeginTaskCalls");
   private ReturnValues myActualBeginTaskReturnValues = new VoidReturnValues(false);
   private ExpectationList myBeginTaskParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor java.lang.String");
   private ExpectationList myBeginTaskParameter1Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor int");
   private ExpectationCounter myDoneCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor DoneCalls");
   private ReturnValues myActualDoneReturnValues = new VoidReturnValues(false);
   private ExpectationCounter myInternalWorkedCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor InternalWorkedCalls");
   private ReturnValues myActualInternalWorkedReturnValues = new VoidReturnValues(false);
   private ExpectationList myInternalWorkedParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor double");
   private ExpectationCounter myIsCanceledCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor IsCanceledCalls");
   private ReturnValues myActualIsCanceledReturnValues = new ReturnValues(false);
   private ExpectationCounter mySetCanceledCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor SetCanceledCalls");
   private ReturnValues myActualSetCanceledReturnValues = new VoidReturnValues(false);
   private ExpectationList mySetCanceledParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor boolean");
   private ExpectationCounter mySetTaskNameCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor SetTaskNameCalls");
   private ReturnValues myActualSetTaskNameReturnValues = new VoidReturnValues(false);
   private ExpectationList mySetTaskNameParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor java.lang.String");
   private ExpectationCounter mySubTaskCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor SubTaskCalls");
   private ReturnValues myActualSubTaskReturnValues = new VoidReturnValues(false);
   private ExpectationList mySubTaskParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor java.lang.String");
   private ExpectationCounter myWorkedCalls = new ExpectationCounter("org.eclipse.core.runtime.IProgressMonitor WorkedCalls");
   private ReturnValues myActualWorkedReturnValues = new VoidReturnValues(false);
   private ExpectationList myWorkedParameter0Values = new ExpectationList("org.eclipse.core.runtime.IProgressMonitor int");
   public void setExpectedBeginTaskCalls(int calls){
      myBeginTaskCalls.setExpected(calls);
   }
   public void addExpectedBeginTaskValues(String arg0, int arg1){
      myBeginTaskParameter0Values.addExpected(arg0);
      myBeginTaskParameter1Values.addExpected(new Integer(arg1));
   }
   public void beginTask(String arg0, int arg1){
      myBeginTaskCalls.inc();
      myBeginTaskParameter0Values.addActual(arg0);
      myBeginTaskParameter1Values.addActual(new Integer(arg1));
      Object nextReturnValue = myActualBeginTaskReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionBeginTask(Throwable arg){
      myActualBeginTaskReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedDoneCalls(int calls){
      myDoneCalls.setExpected(calls);
   }
   public void done(){
      myDoneCalls.inc();
      Object nextReturnValue = myActualDoneReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionDone(Throwable arg){
      myActualDoneReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedInternalWorkedCalls(int calls){
      myInternalWorkedCalls.setExpected(calls);
   }
   public void addExpectedInternalWorkedValues(double arg0){
      myInternalWorkedParameter0Values.addExpected(new Double(arg0));
   }
   public void internalWorked(double arg0){
      myInternalWorkedCalls.inc();
      myInternalWorkedParameter0Values.addActual(new Double(arg0));
      Object nextReturnValue = myActualInternalWorkedReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionInternalWorked(Throwable arg){
      myActualInternalWorkedReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedIsCanceledCalls(int calls){
      myIsCanceledCalls.setExpected(calls);
   }
   public boolean isCanceled(){
      myIsCanceledCalls.inc();
      return false;
   }
   public void setupExceptionIsCanceled(Throwable arg){
      myActualIsCanceledReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setupIsCanceled(boolean arg){
      myActualIsCanceledReturnValues.add(new Boolean(arg));
   }
   public void setExpectedSetCanceledCalls(int calls){
      mySetCanceledCalls.setExpected(calls);
   }
   public void addExpectedSetCanceledValues(boolean arg0){
      mySetCanceledParameter0Values.addExpected(new Boolean(arg0));
   }
   public void setCanceled(boolean arg0){
      mySetCanceledCalls.inc();
      mySetCanceledParameter0Values.addActual(new Boolean(arg0));
      Object nextReturnValue = myActualSetCanceledReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionSetCanceled(Throwable arg){
      myActualSetCanceledReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedSetTaskNameCalls(int calls){
      mySetTaskNameCalls.setExpected(calls);
   }
   public void addExpectedSetTaskNameValues(String arg0){
      mySetTaskNameParameter0Values.addExpected(arg0);
   }
   public void setTaskName(String arg0){
      mySetTaskNameCalls.inc();
      mySetTaskNameParameter0Values.addActual(arg0);
      Object nextReturnValue = myActualSetTaskNameReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionSetTaskName(Throwable arg){
      myActualSetTaskNameReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedSubTaskCalls(int calls){
      mySubTaskCalls.setExpected(calls);
   }
   public void addExpectedSubTaskValues(String arg0){
      mySubTaskParameter0Values.addExpected(arg0);
   }
   public void subTask(String arg0){
      mySubTaskCalls.inc();
      mySubTaskParameter0Values.addActual(arg0);
      Object nextReturnValue = myActualSubTaskReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionSubTask(Throwable arg){
      myActualSubTaskReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void setExpectedWorkedCalls(int calls){
      myWorkedCalls.setExpected(calls);
   }
   public void addExpectedWorkedValues(int arg0){
      myWorkedParameter0Values.addExpected(new Integer(arg0));
   }
   public void worked(int arg0){
      myWorkedCalls.inc();
      myWorkedParameter0Values.addActual(new Integer(arg0));
      Object nextReturnValue = myActualWorkedReturnValues.getNext();
      if (nextReturnValue instanceof ExceptionalReturnValue && ((ExceptionalReturnValue)nextReturnValue).getException() instanceof RuntimeException)
          throw (RuntimeException)((ExceptionalReturnValue)nextReturnValue).getException();
   }
   public void setupExceptionWorked(Throwable arg){
      myActualWorkedReturnValues.add(new ExceptionalReturnValue(arg));
   }
   public void verify(){
      myBeginTaskCalls.verify();
      myBeginTaskParameter0Values.verify();
      myBeginTaskParameter1Values.verify();
      myDoneCalls.verify();
      myInternalWorkedCalls.verify();
      myInternalWorkedParameter0Values.verify();
      myIsCanceledCalls.verify();
      mySetCanceledCalls.verify();
      mySetCanceledParameter0Values.verify();
      mySetTaskNameCalls.verify();
      mySetTaskNameParameter0Values.verify();
      mySubTaskCalls.verify();
      mySubTaskParameter0Values.verify();
      myWorkedCalls.verify();
      myWorkedParameter0Values.verify();
   }
}
