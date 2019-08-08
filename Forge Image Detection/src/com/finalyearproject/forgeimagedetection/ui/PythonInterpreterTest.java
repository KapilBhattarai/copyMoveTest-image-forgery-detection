package com.finalyearproject.forgeimagedetection.ui;
import java.io.*;


import org.python.core.PyInstance;
import org.python.util.PythonInterpreter;

public class PythonInterpreterTest {
	PythonInterpreter interpreter = null;
	
	public PythonInterpreterTest() {
	      PythonInterpreter.initialize(System.getProperties(),  
                  System.getProperties(), new String[0]);  

          this.interpreter = new PythonInterpreter(); 

	}
	   void execfile( final String fileName )  
	   {  
	      this.interpreter.execfile(fileName);  
	   }  

	   PyInstance createClass( final String className, final String opts )  
	   {  
	      return (PyInstance) this.interpreter.eval(className + "(" + opts + ")");  
	   }  

	   public static void main( String gargs[] )  
	   {  
//		  // PythonInterpreter interpreter = null;
//		  // PythonInterpreterTest python = new PythonInterpreterTest();  
//		  // String command = "python /c start python path\to\script\detect.py";
//		   try {
//			    String cmd = "python/";
//			    String py = "detect";
//			    String run = "python  " +cmd+ py + ".py";
//			   // System.out.println(run);
//			   //Runtime.getRuntime().exec(run);
//
//			    Process p = Runtime.getRuntime().exec("python  detect.py");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		   
		      PythonInterpreterTest python = new PythonInterpreterTest();  

		      python.execfile("hello.py");  

		      PyInstance hello = python.createClass("hello", "None");  

		      hello.invoke("run");  
	   } 

}
