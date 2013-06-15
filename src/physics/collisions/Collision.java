package physics.collisions;

import main.Constants;
import physics.objects.GameObject;



public class Collision{
	public static enum Type {
		TOP,//moving object approaches from above block
		BOTTOM,//approaches from underneath block
		RIGHT,//approaches from the right
		LEFT//approaches from the left
	};
}
