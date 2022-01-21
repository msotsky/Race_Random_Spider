/*
Assignment 1 part  1
Maxime Sotsky 0270251
COMP 1731
2019-02-13
*/

import becker.robots.*;
import java.util.*;

public class RandomBot extends RobotSE
{
    public RandomBot(City city, int street, int ave, Direction dir)
    {
        super(city, street, ave, dir);
    }

    public void moveRandom()
    {
        Random rVar = new Random();
        int randomVar = rVar.nextInt(4);

        if (randomVar == 0)
        {
            move(2);
        }
        if (randomVar == 1)
        {
            turnLeft();
            move();
        }
        if (randomVar == 2)
        {
            turnRight();
            move();
        }
        if (randomVar == 3)
        {
            turnLeft(2);
            move(2);
        }

    }
}