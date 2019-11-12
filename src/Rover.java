import java.util.Objects;

public class Rover {

    private Direction directionType;
    private int y;
    private int x;

    public Rover(int x, int y, String direction) {
        this.directionType = Direction.create(direction);
        this.y = y;
        this.x = x;
    }

    public void receive(String commandsSequence)

    {
        for (int i = 0; i < commandsSequence.length(); ++i) {
            String command = commandsSequence.substring(i, i + 1);

            if (command.equals("l")) {
                // Rotate Rover
                if (directionType.equals(Direction.N)) {
                    directionType = Direction.W;
                } else if (directionType.equals(Direction.S)) {
                    directionType = Direction.E;
                } else if (directionType.equals(Direction.W)) {
                    directionType = Direction.S;
                } else {
                    directionType = Direction.N;
                }
            } else if (command.equals("r")) {
                // Rotate Rover
                if (directionType.equals(Direction.N)) {
                    directionType = Direction.E;
                } else if (directionType.equals(Direction.S)) {
                    directionType = Direction.W;
                } else if (directionType.equals(Direction.W)) {
                    directionType = Direction.N;
                } else {
                    directionType = Direction.S;
                }

            } else if (command.equals("f")) {
                int displacement = 1;
                if (directionType.equals(Direction.N)) {
                    y += displacement;
                } else if (directionType.equals(Direction.S)) {
                    y -= displacement;
                } else if (directionType.equals(Direction.W)) {
                    x -= displacement;
                } else {
                    x += displacement;
                }

            } else {
                int displacement = -1;
                if (directionType.equals(Direction.N)) {
                    y += displacement;
                } else if (directionType.equals(Direction.S)) {
                    y -= displacement;
                } else if (directionType.equals(Direction.W)) {
                    x -= displacement;
                } else {
                    x += displacement;
                }
            }

        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
        return y == rover.y &&
                x == rover.x &&
                directionType == rover.directionType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(directionType, y, x);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "directionType=" + directionType +
                ", y=" + y +
                ", x=" + x +
                '}';
    }
}
