/*
Assignment 1 part  1
Maxime Sotsky 0270251
COMP 1731
2019-02-13
*/

import becker.robots.*;

public class RandomBotMain
{
     public static void main(String[] args)
    {
        City randomCity = new City();
        RandomBot randomRob = new RandomBot(randomCity, 5, 0, Direction.EAST);
        
        int count = 0;

        while (count != 100)
        {
            randomRob.moveRandom(); //Yes it behaved differently the second time
            count += 1;
        }
    }
}