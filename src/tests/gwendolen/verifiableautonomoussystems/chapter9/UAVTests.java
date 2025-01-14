package gwendolen.verifiableautonomoussystems.chapter9;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.util.test.TestJPF;
import gwendolen.GwendolenAgentBuilder;
import gwendolen.semantics.GwendolenAgent;
import junit.framework.Assert;
import ail.util.AJPF_w_AIL;
import ajpf.MCAPLcontroller;

public class UAVTests extends TestJPF {
	 static final String[] JPF_ARGS = { "suppress_version = true" };
	
	  @Test //----------------------------------------------------------------------
	  public void certification1_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "1";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }
	  
	  @Test //----------------------------------------------------------------------
	  public void certification2_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "2";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }

	  @Test //----------------------------------------------------------------------
	  public void certification3_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "3";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }

	  @Test //----------------------------------------------------------------------
	  public void certification4_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "4";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }

	  @Test //----------------------------------------------------------------------
	  public void certification5_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "5";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }

	  @Test //----------------------------------------------------------------------
	  public void certification6_ajpf () {
	   if (verifyNoPropertyViolation(JPF_ARGS)) {
	    	String filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/uav2.ail";
	    	String prop_filename =  "/src/examples/gwendolen/verifiableautonomoussystems/chapter9/certification.psl";
	    	String[] args = new String[3];
	    	args[0] = filename;
	    	args[1] = prop_filename;
	    	args[2] = "6";
	    	AJPF_w_AIL.run(args);
	   }
	 	// }
	  }




}
