/*
Assignment 1 part  1
Maxime Sotsky 0270251
COMP 1731
2019-02-12
*/

import becker.robots.*;
import java.util.*;

public class RaceTrack
{
    public static void main(String[] args)
    {
        City rome = new City(12, 12);
        new Wall(rome, 2, 2, Direction.NORTH);
        new Wall(rome, 2, 3, Direction.NORTH);
        new Wall(rome, 2, 4, Direction.NORTH);
        new Wall(rome, 2, 5, Direction.NORTH);
        new Wall(rome, 2, 6, Direction.NORTH);
        new Wall(rome, 2, 7, Direction.NORTH);
        new Wall(rome, 2, 8, Direction.NORTH);

        new Wall(rome, 2, 2, Direction.WEST);
        new Wall(rome, 3, 2, Direction.WEST);
        new Wall(rome, 4, 2, Direction.WEST);
        new Wall(rome, 5, 2, Direction.WEST);
        new Wall(rome, 6, 2, Direction.WEST);
        new Wall(rome, 7, 2, Direction.WEST);
        new Wall(rome, 8, 2, Direction.WEST);

        new Wall(rome, 8, 2, Direction.SOUTH);
        new Wall(rome, 8, 3, Direction.SOUTH);
        new Wall(rome, 8, 4, Direction.SOUTH);
        new Wall(rome, 8, 5, Direction.SOUTH);
        new Wall(rome, 8, 6, Direction.SOUTH);
        new Wall(rome, 8, 7, Direction.SOUTH);
        new Wall(rome, 8, 8, Direction.SOUTH);

        new Wall(rome, 2, 8, Direction.EAST);
        new Wall(rome, 3, 8, Direction.EAST);
        new Wall(rome, 4, 8, Direction.EAST);
        new Wall(rome, 5, 8, Direction.EAST);
        new Wall(rome, 6, 8, Direction.EAST);
        new Wall(rome, 7, 8, Direction.EAST);
        new Wall(rome, 8, 8, Direction.EAST);

        new Wall(rome, 3, 3, Direction.NORTH);
        new Wall(rome, 3, 4, Direction.NORTH);
        new Wall(rome, 3, 5, Direction.NORTH);
        new Wall(rome, 3, 6, Direction.NORTH);
        new Wall(rome, 3, 7, Direction.NORTH);

        new Wall(rome, 3, 3, Direction.WEST);
        new Wall(rome, 4, 3, Direction.WEST);
        new Wall(rome, 5, 3, Direction.WEST);
        new Wall(rome, 6, 3, Direction.WEST);
        new Wall(rome, 7, 3, Direction.WEST);

        new Wall(rome, 7, 3, Direction.SOUTH);
        new Wall(rome, 7, 4, Direction.SOUTH);
        new Wall(rome, 7, 5, Direction.SOUTH);
        new Wall(rome, 7, 6, Direction.SOUTH);
        new Wall(rome, 7, 7, Direction.SOUTH);

        new Wall(rome, 3, 7, Direction.EAST);
        new Wall(rome, 4, 7, Direction.EAST);
        new Wall(rome, 5, 7, Direction.EAST);
        new Wall(rome, 6, 7, Direction.EAST);
        new Wall(rome, 7, 7, Direction.EAST);
//=======================================================================================
        Robot meg = new Robot(rome, 8, 8, Direction.NORTH);

        int startStreet = meg.getStreet();
        int startAvenue = meg.getAvenue();

        Scanner numLapsString = new Scanner(System.in);
        System.out.println("Enter amount of lap:");
        //int numLaps = Integer.parseInt(numLapsString);
        int numLaps = numLapsString.nextInt();
//=======================================================================================

        if(!meg.frontIsClear())
        {
            meg.turnLeft();
        }
        if ((numLaps * 4) <= 0)
        {
            System.out.println("*Robot stands still*");
        }
        else
        {
            meg.move();
        }
            
//=======================================================================================

int countTurns = 0;

        while(meg.getStreet() != startStreet || meg.getAvenue() != startAvenue)
        {
            
            while (countTurns != (4 * numLaps))
            {
                if (!meg.frontIsClear())
                {
                    meg.turnLeft();
                    countTurns += 1;
                } 
                    meg.move();
                }
        } 
    } 
} 