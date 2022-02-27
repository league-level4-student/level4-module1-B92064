package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		int x = 0;
		int y = 0;
		switch (currentDirection) {
		case RIGHT:
			x = -1;
			break;

		case LEFT:
			x = 1;
			break;

		case UP:
			y = -1;
			break;

		case DOWN:
			y = 1;
			break;
		}

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		for (int i = snake.size()-1; i > 0; i--) {
			snake.get(i).setLocation(snake.get(i - 1).getLocation());
		}

		//3. set the location of the head to the new location calculated in step 1
		Location front = new Location(head.getLocation().x + x, head.getLocation().y + y);
		head.setLocation(front);
		//4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.

		if ((currentDirection == Direction.DOWN && d != Direction.UP)
				|| (currentDirection == Direction.UP && d != Direction.DOWN)
				|| (currentDirection == Direction.LEFT && d != Direction.RIGHT)
				|| (currentDirection == Direction.RIGHT && d != Direction.LEFT)) {
			return;
		}
		if (canMove) {
			canMove = false;
			currentDirection = d;
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		Location starter = new Location(_00_SnakeGame.WIDTH / 2, _00_SnakeGame.HEIGHT / 2);
		head.setLocation(starter);
		//3. add the head to the snake
		snake.add(head);
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		if (_00_SnakeGame.WIDTH < head.getLocation().x) {
			return true;
		} else if (_00_SnakeGame.HEIGHT < head.getLocation().y) {
			return true;
		} else if (0 > head.getLocation().y) {
			return true;
		}
		return false;
	}

	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment

		for (int i = 0; i < snake.size(); i++) {
			if (head.getLocation().equals(snake.get(i).getLocation()))
				return true;
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for (int i = 0; i < snake.size(); i++) {
			if (loc.equals(snake.get(i).getLocation()))
				return true;
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
