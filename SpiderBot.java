/*
Assignment 1 part  1
Maxime Sotsky 0270251
COMP 1731
2019-02-13
*/

import becker.robots.*;

public class SpiderBot extends RobotSE
{
    public SpiderBot(City city, int street, int ave, Direction dir)
    {
        super(city, street, ave, dir);
    }

    public void crawlWalls_DID_NOT_READ()
    {
        int count = 0;
        while(count != 3)
        {
            if (!frontIsClear()) //if in front 5 x 1 builds (x3)
            {
                turnLeft();
                move(5);
                turnRight();
                move(2);
                turnRight();
                move(5);
                turnLeft();
                count += 1;
                if (count == 3 && !frontIsClear()) //in case of more builds var reset
                {
                    count = 0;
                }
            }
        }   

    
    }
    public void crawlWalls()
    {
        while (!frontIsClear())
        {
            crawlOneBuilding();//stepwise refinement
        }
    }
    public void crawlOneBuilding()
    {
        turnLeft();
        move(5);
        turnRight();
        move(2);
        turnRight();
        move(5);
        turnLeft();
    }
}

