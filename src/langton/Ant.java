package langton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ant
{
    private Direction direction = Direction.values()[(int) (Math.random() * (4) + 0.5)];
    private List<Direction> directions = new ArrayList<>(Arrays.asList(Direction.values()));
    private int x;
    private int y;
    private LangtonField langtonField;

    public Ant(LangtonField langtonField,
        int x,
        int y)
    {
        this.x = x;
        this.y = y;
        this.langtonField = langtonField;

    }

    public Direction getDirection()
    {
        return direction;
    }

    public void move()
    {
        int index = directions.indexOf(direction);
        if (langtonField.getPosition(x, y) == LangtonField.Color.Black)
        {
            direction = directions.get(index + 1 / directions.size());
        } else
        {
            direction = directions.get(((index - 1) == -1) ? (directions.size() - 1) : (index - 1));
        }

        langtonField.flipPosition(x, y);
        switch (direction)
        {
            case East:
                y = y < langtonField.getWidth() ? y + 1 : y;
                break;
            case West:
                y = y > 0 ? y - 1 : y;
                break;
            case North:
                x = x > 0 ? x - 1 : x;
                break;
            case South:
                x = x < langtonField.getWidth() ? x + 1 : x;
                break;
        }
    }

    public enum Direction
    {
        North, East, South, West
    }
}
