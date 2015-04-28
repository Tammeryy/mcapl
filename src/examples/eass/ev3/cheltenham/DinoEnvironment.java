// ----------------------------------------------------------------------------
// Copyright (C) 2012 Louise A. Dennis, and  Michael Fisher 
//
// This file is part of the Engineering Autonomous Space Software (EASS) Library.
// 
// The EASS Library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// The EASS Library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with the EASS Library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//
//----------------------------------------------------------------------------

package eass.ev3.cheltenham;

import ail.util.AILexception;
import ail.mas.NActionScheduler;
import ail.mas.RoundRobinScheduler;
import ail.syntax.Predicate;
import ail.syntax.Term;
import ail.syntax.Unifier;
import ail.syntax.Action;
import ail.syntax.Literal;
import ail.syntax.NumberTerm;
import ail.syntax.VarTerm;
import eass.mas.ev3.EASSEV3Environment;
import eass.mas.ev3.EASSUltrasonicSensor;
import eass.mas.ev3.LegoRobot;
import eass.mas.ev3.BasicRobot;
import eass.mas.ev3.EASSSensor;
import lejos.hardware.device.NXTMMX;
import lejos.hardware.motor.NXTRegulatedMotor;
import lejos.hardware.port.SensorPort;
import lejos.robotics.navigation.DifferentialPilot;
import lejos.remote.ev3.RemoteRequestPilot;
import lejos.remote.ev3.RemoteRequestRegulatedMotor;
import lejos.remote.ev3.RemoteRequestEV3;
import lejos.robotics.RegulatedMotor;
import lejos.robotics.navigation.ArcRotateMoveController;

import java.io.PrintStream;
import java.util.Set;


/**
 * A simple environment for NXT Robots including sub-classes for two robot builds.  We need a more generic way of representing different robots
 * and robot configurations.
 * 
 * @author louiseadennis
 *
 */
public class DinoEnvironment extends EASSEV3Environment {
	boolean rule1 = false;
	boolean rule2 = false;
	boolean rule3 = false;
	boolean rule4 = false;
	boolean do_growl = false;
	boolean achieve_water = false;
	
	static Literal activer1 = new Literal("active");
	static {activer1.addTerm(new Literal("rule1"));};
	
	static Literal activer2 = new Literal("active");
	static {activer2.addTerm(new Literal("rule2"));};
	
	static Literal activer3 = new Literal("active");
	static {activer3.addTerm(new Literal("rule3"));};
	
	static Literal activer4 = new Literal("active");
	static {activer4.addTerm(new Literal("rule4"));};
	
	static Literal scaregoal = new Literal("goal");
	static {scaregoal.addTerm(new Literal("scare"));};
	
	static Literal watergoal = new Literal("goal");
	static {watergoal.addTerm(new Literal("water"));};
	
	private LineFollowingThread line_follower;
	
	DinoUI ui;
	
	/**
	 * Construct the Environment.
	 */
	public DinoEnvironment() {
		super();
		RoundRobinScheduler s = new RoundRobinScheduler();
		s.addJobber(this);
		setScheduler(s);
		addPerceptListener(s);
	}
	
	public void setUI(DinoUI ui) {
		this.ui = ui;
	}
	
	/**
	 * Create the relevant object for the robot.
	 */
	public LegoRobot createRobot(String agent) throws Exception {
		Dinor3x robot;
		try {
			System.err.println("Contacting Robot");
			robot = new Dinor3x("10.0.1.1");
			System.err.println("Connection Established");
			addRobot(agent, robot);
			line_follower = new LineFollowingThread(robot);
			addSharedBelief(agent, create_rule_action("rule1", "act1", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_action("rule1", "act2", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_action("rule1", "act3", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_action("rule2", "act1", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_action("rule2", "act2", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_action("rule2", "act3", new Predicate("do_nothing")));
			addSharedBelief(agent, create_rule_context("rule1", new Predicate("anything")));
			addSharedBelief(agent, create_rule_context("rule2", new Predicate("anything")));
			addSharedBelief(agent, create_rule_context("rule3", new Predicate("anything")));
			addSharedBelief(agent, create_rule_context("rule4", new Predicate("anything")));
			return robot;
		} catch (Exception e) {
			System.err.println(e.getMessage());
			throw e;
		}
	}
	
	
	public Set<Predicate> getPercepts(String agName, boolean update) {
		   String rname = rationalName(agName);
		   Dinor3x robot = (Dinor3x) getRobot(rname);
		   synchronized(robot) {
			   return super.getPercepts(agName, update);
		   }
		
	}

	/*
	 * (non-Javadoc)
	 * @see eass.mas.nxt.EASSNXTEnvironment#executeAction(java.lang.String, ail.syntax.Action)
	 */
	public Unifier executeAction(String agName, Action act) throws AILexception {
		   Unifier u = new Unifier();
		   String rname = rationalName(agName);
		   Dinor3x robot = (Dinor3x) getRobot(rname);
		   synchronized(robot) {
			     
		   	if (act.getFunctor().equals("forward")) {
		   		if (robot.hasPilot()) {
		   			line_follower.stopFollowing();
		   			robot.getPilot().forward();
		   		}
		   	} else if (act.getFunctor().equals("stop")) {
		   		if (robot.hasPilot()) {
		   			line_follower.stopFollowing();
		   			robot.getPilot().stop();
		   			// robot.stopGrowling();
		   		}
		   	} else if (act.getFunctor().equals("right")) {
		   		if (robot.hasPilot()) {
		   			line_follower.stopFollowing();
		   			robot.getPilot().steer(100);
		   		}
		   	} else if (act.getFunctor().equals("left")) {
		   		if (robot.hasPilot()) {
		   			line_follower.stopFollowing();
		   			robot.getPilot().steer(-100);
		   		}
		   	} else if (act.getFunctor().equals("backward")) {
		   		if (robot.hasPilot()) {
		   			line_follower.stopFollowing();
		   			robot.getPilot().backward();
		   		}
		   	} else if (act.getFunctor().equals("follow_line")) {
		   		synchronized (line_follower) {
		   			if (!line_follower.isRunning()) {
		   				line_follower.start();
		   			}
		   		}
		   	} else if (act.getFunctor().equals("do_growl")) {
		   		if (!do_growl) {
		   			addSharedBelief(rname, scaregoal);
		   			do_growl = true;
		   		} else {
		   			removeSharedBelief(rname, scaregoal);
		   			do_growl = false;
		   		}
		   	} else if (act.getFunctor().equals("achieve_water")) {
		   		if (!achieve_water) {
		   			addSharedBelief(rname, watergoal);
		   			achieve_water = true;
		   		} else {
		   			removeSharedBelief(rname, watergoal);
		   			achieve_water = false;
		   		}
		   	} else if (act.getFunctor().equals("growl")) {
		   		RegulatedMotor motor = robot.getMotor();
		   		int pos = motor.getTachoCount();
		   		motor.rotateTo(pos + 10);
		   		motor.waitComplete();
		   		motor.rotateTo(pos);
		   	} else if (act.getFunctor().equals("rule1")) {
		   		if (!rule1) {
		   			addSharedBelief(rname, activer1);
		   			rule1 = true;
		   		} else {
		   			removeSharedBelief(rname, activer1);
		   			rule1 = false;
		   		}
		   		return u;
		   	} else if (act.getFunctor().equals("rule3")) {
		   		if (!rule3) {
		   			addSharedBelief(rname, activer3);
		   			rule3 = true;
		   		} else {
		   			removeSharedBelief(rname, activer3);
		   			rule3 = false;
		   		}
		   		return u;
		   	} else if (act.getFunctor().equals("rule4")) {
		   		if (!rule4) {
		   			addSharedBelief(rname, activer4);
		   			rule4 = true;
		   		} else {
		   			removeSharedBelief(rname, activer4);
		   			rule4 = false;
		   		}
		   		return u;
		   	} else if (act.getFunctor().equals("rule2")) {
		   		if (!rule2) {
		   			addSharedBelief(rname, activer2);
		   			rule2 = true;
		   		} else {
		   			removeSharedBelief(rname, activer2);
		   			rule2 = false;
		   		}
		   		return u;
		   	} else if (act.getFunctor().equals("r1action1")) {
		   		change_rule_action(rname, act, "rule1", "act1");
		   		return u;
		   	} else if (act.getFunctor().equals("r1action2")) {
		   		change_rule_action(rname, act, "rule1", "act2");
		   		return u;
		   	} else if (act.getFunctor().equals("r1action3")) {
		   		change_rule_action(rname, act, "rule1", "act3");
		   		return u;
		   	} else if (act.getFunctor().equals("r2action1")) {
		   		change_rule_action(rname, act, "rule2", "act1");
		   		return u;
		   	} else if (act.getFunctor().equals("r2action2")) {
		   		change_rule_action(rname, act, "rule2", "act2");
		   		return u;
		   	} else if (act.getFunctor().equals("r2action3")) {
		   		change_rule_action(rname, act, "rule2", "act3");
		   		return u;
		   	} else if (act.getFunctor().equals("r3action1")) {
		   		change_rule_action(rname, act, "rule3", "act1");
		   		return u;
		   	} else if (act.getFunctor().equals("r3action2")) {
		   		change_rule_action(rname, act, "rule3", "act2");
		   		return u;
		   	} else if (act.getFunctor().equals("r3action3")) {
		   		change_rule_action(rname, act, "rule3", "act3");
		   		return u;
		   	} else if (act.getFunctor().equals("r4action1")) {
		   		change_rule_action(rname, act, "rule4", "act1");
		   		return u;
		   	} else if (act.getFunctor().equals("r4action2")) {
		   		change_rule_action(rname, act, "rule4", "act2");
		   		return u;
		   	} else if (act.getFunctor().equals("r4action3")) {
		   		change_rule_action(rname, act, "rule4", "act3");
		   		return u;
		   	} else if (act.getFunctor().equals("r1context")) {
		   		change_rule_context(rname, act.getTerm(0), "rule1");
		   		return u;
		   	} else if (act.getFunctor().equals("r2context")) {
		   		change_rule_context(rname, act.getTerm(0), "rule2");
		   		return u;
		   	} else if (act.getFunctor().equals("r3context")) {
		   		change_rule_context(rname, act.getTerm(0), "rule3");
		   		return u;
		   	} else if (act.getFunctor().equals("r4context")) {
		   		change_rule_context(rname, act.getTerm(0), "rule4");
		   		return u;
		   	} else if (act.getFunctor().equals("obstacle_distance")) {
		   		Literal distance_threshold = new Literal("change_distance");
		   		distance_threshold.addTerm(act.getTerm(0));
		   		String abstraction_name = "abstraction_" + rname;
		   		addPercept(abstraction_name, distance_threshold);
		   	} else if (act.getFunctor().equals("show_belief")) {
		   		Predicate belief = (Predicate) act.getTerm(0);
		   		ui.addToBeliefList(belief.toString());
		   	} else if (act.getFunctor().equals("remove_belief")) {
		   		Predicate belief = (Predicate) act.getTerm(0);
		   		ui.removeFromBeliefList(belief.toString());
		   	}
		   }
		   	
		   	u = super.executeAction(agName, act);
		   	return u;
	}
	
	private void change_rule_action(String rname, Action act, String rule_string, String action_string) {
   		removeUnifiesShared(rname, create_rule_action(rule_string, action_string, new VarTerm("A")));
   		addSharedBelief(rname, create_rule_action(rule_string, action_string, act.getTerm(0)));
		
	}
	
	private void change_rule_context(String rname, Term context, String rule_string) {
		Predicate finalcontext = Predicate.PTrue;
		if (context.getFunctor().equals("there is water")) {
			finalcontext = new Predicate("water");
		} else if (context.getFunctor().equals("there is no water")) {
			finalcontext = new Predicate("no_water");
		} else {
			finalcontext = new Predicate("anything");
		}
   		removeUnifiesShared(rname, create_rule_context(rule_string, new VarTerm("A")));
   		addSharedBelief(rname, create_rule_context(rule_string, finalcontext));
		
	}

	private Literal create_rule_context(String rule_string, Term context) {
  		Literal ract = new Literal("context");
   		ract.addTerm(new Literal(rule_string));
   		ract.addTerm(context);
   		return ract;	
	}

	
	private Literal create_rule_action(String rule_string, String action_string, Term action) {
  		Literal ract = new Literal("rule");
   		ract.addTerm(new Literal(rule_string));
   		ract.addTerm(new Literal(action_string));
   		ract.addTerm(action);
   		return ract;	
	}
	
	/**
	 * Actions are called by an agent called abstract_rname, but the actual robot's name is just rname.  This method does
	 * the necessary string manipulations.
	 * @param name
	 * @return
	 */
	public String rationalName(String name) {
		int index = 12;
		if (name.length() > index) {
			return name.substring(index);
		} else {
			return name;
		}
	}
	
	/**
	 * Setting the print stream if the robot has an Ultrasonic sensor.  This means output from the sensor can be piped to the
	 * interface.
	 * @param rname
	 * @param s
	 */
	public void setUltraPrintStream(String rname, PrintStream s) {
		Dinor3x robot = (Dinor3x) getRobot(rname);
		if (robot != null) {
			robot.setUPrintStream(s);
		}
	}
	
	
	public void cleanup(String rname) {
		Dinor3x robot = (Dinor3x) getRobot(rname);
		synchronized(robot) {
			robot.close();
		}
	}
	
	public class LineFollowingThread extends Thread {
    	boolean isrunning = false;
    	Dinor3x robot;
    	
    	public LineFollowingThread(Dinor3x dino) {
    		robot = dino;
    	}
    	
    	public void run() {
    		isrunning = true;
    		boolean steering_right = false;
    		boolean steering_left = false;
    		while (isrunning) {
		   		if (DinoEnvironment.this.values.containsKey("light")) {
		   			Predicate light = DinoEnvironment.this.values.get("light");
		   			double value = ((NumberTerm) light.getTerm(0)).solve();
		   			if (value > 0.5) {
		   				if (!steering_right) {
		   					robot.getPilot().steer(100);
		   					steering_left = false;
		   					steering_right = true;
		   				}
		   			} else {
		   				if (!steering_left) {
		   					robot.getPilot().steer(-100);
		   					steering_left = true;
		   					steering_right = false;
		   				}
		   			}
		   		}
    		}
    	}
    	
    	public boolean isRunning() {
    		return isrunning;
    	}
    	
    	public void stopFollowing() {
    		isrunning = false;
    	}
	}


}