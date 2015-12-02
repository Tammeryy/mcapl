// ----------------------------------------------------------------------------
// Copyright (C) 2015 Louise A. Dennis, Michael Fisher and Koen Hindriks
// 
// This file is part of GOAL (AIL version) - GOAL-AIL
//
// GOAL-AIL is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 3 of the License, or (at your option) any later version.
// 
// GOAL-AIL is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public
// License along with GOAL-AIL if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
// 
// To contact the authors:
// http://www.csc.liv.ac.uk/~lad
//----------------------------------------------------------------------------
package goal.mas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import eis.EnvironmentInterfaceStandard;
import eis.iilang.Identifier;
import eis.iilang.Parameter;
import goal.util.LaunchPolicy;
import ail.mas.eis.EISEnvironmentWrapper;
import ail.mas.scheduling.ActionScheduler;
import ail.syntax.Predicate;
import ajpf.MCAPLcontroller;
import ajpf.util.AJPFLogger;

public class GOALEISEnvironment extends EISEnvironmentWrapper {
	
	String logname = "goal.mas.GOALEISEnvironment";
	
	LaunchPolicy lp;
	Map<String, Parameter> initMap = new HashMap<String, Parameter>();
	
	
	public GOALEISEnvironment(String filename) {
		super(filename);
		ActionScheduler s = new ActionScheduler();
		setScheduler(s);
		addPerceptListener(s);
		lp = new LaunchPolicy(getEISEnvironment());
	}
	
	public LaunchPolicy getLaunchPolicy() {
		return lp;
	}
	
	@Override
	public void initialise() {
		EnvironmentInterfaceStandard eis = getEISEnvironment();
		
		try {
			eis.init(initMap);
		} catch (Exception e) {
			AJPFLogger.severe(logname, e.getMessage());
		}
		
	}

	public void addFileToInitMap(String s, String f) {
		try {
			String filename = MCAPLcontroller.getFilename(f);
			initMap.put(s, new Identifier(filename));
		} catch (Exception e) {
			AJPFLogger.severe(logname, e.getMessage());
		}
	}
	
	public void addToInitMap(String s, Identifier i) {
		try {
			initMap.put(s, i);
		} catch (Exception e) {
			AJPFLogger.severe(logname, e.getMessage());
		}
	}

	@Override
	public void handleNewEntity(String arg0) {
		getLaunchPolicy().handleNewEntity(arg0);
	}

	
}