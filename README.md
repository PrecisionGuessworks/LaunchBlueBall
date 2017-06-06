+----------------------------------------------------------------------------------+
|                          1646 LaunchBlueBall Project                             |
|                          Authors: Hyung Ki, Alex Ryker                           |
+----------------------------------------------------------------------------------+

		         The LaunchBlueBall project is an effort to create a working,
		         RoboRIO-compatible codebase for the 2014 Precision Guessworks
		                                   robot.

		         The 2014 robot has a 4-CIM, 6-wheel tank drive based on the
		         AndyMark kit bot from that year. There is also a ball intake
		         mechanism that utilizes two pneumatic pistons and a single
		         BaneBot motor to collect the game piece. Two additional
		         BaneBot motors are used to power the ball shooting mechanism,
		         which is driven by a winch. There is an additional pneumatic
		         piston controlling a claw at the end of the ball shooting
		                                 mechanism.

		         The motor controllers used are a mix of Talons and Victors.
		         PWM(as opposed to CAN) is used to control all motor controllers.
