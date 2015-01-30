// ----------------------------------------------------------------------------
// Copyright (C) 2015 Louise A. Dennis, and Michael Fisher 
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
package eass.sticky_wheel.ros;

import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.topic.Subscriber;
import org.ros.node.topic.Publisher;
import org.ros.concurrent.CancellableLoop;
import sticky_wheel_msgs.ActionStatus;
import sticky_wheel_msgs.PositionInfo;

import java.util.Scanner;
import java.util.ArrayList;


public class ManualControl extends AbstractNodeMain {

	public GraphName getDefaultNodeName() {
		return GraphName.of("human/fake_robot");
	}
	
	public void onStart(final ConnectedNode connectedNode) {
		final Publisher<sticky_wheel_msgs.ActionStatus> actionPublisher =
				connectedNode.newPublisher("human/actionStatus", sticky_wheel_msgs.ActionStatus._TYPE);
		final Publisher<sticky_wheel_msgs.PositionInfo> positionPublisher =
				connectedNode.newPublisher("human/position", sticky_wheel_msgs.PositionInfo._TYPE);
		final Scanner in = new Scanner(System.in);
		
		connectedNode.executeCancellableLoop(new CancellableLoop() {
			protected void loop() throws InterruptedException {
				System.out.println("Send Command");
				String yn = in.nextLine();
				
				if (yn.equals("e")) {
					ActionStatus message = actionPublisher.newMessage();				
					message.setActionid("executing");
					actionPublisher.publish(message);
				} else if (yn.equals("d")) {
					ActionStatus message = actionPublisher.newMessage();				
					message.setActionid("done");
					actionPublisher.publish(message);
				} else if (yn.equals("p")) {
					PositionInfo message = positionPublisher.newMessage();
					System.out.println("x coordinate?");
					String xs = in.nextLine();
					message.setX(Double.parseDouble(xs));
					System.out.println("y coordinate?");
					String ys = in.nextLine();
					message.setY(Double.parseDouble(ys));
					System.out.println("angle?");
					String thetas = in.nextLine();
					message.setTheta(Double.parseDouble(thetas));
					positionPublisher.publish(message);
				}

				Thread.sleep(1000);
			}
		});
	}

}
