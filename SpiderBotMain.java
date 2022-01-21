/*
Assignment 1 part  1
Maxime Sotsky 0270251
COMP 1731
2019-02-13
*/

import becker.robots.*;

public class SpiderBotMain
{
    public static void main(String[] args)
    {
        City newYork = new City();
        SpiderBot spider = new SpiderBot(newYork, 5, 0, Direction.EAST);
        
//==========================================================================
//Wall(City city, int street, int avenue, Direction orientation) 
// (STREET,AVE) S = | A = __
        Wall w1b1 = new Wall(newYork, 5, 1, Direction.EAST);
        Wall w2b1 = new Wall(newYork, 4, 1, Direction.EAST);
        Wall w3b1 = new Wall(newYork, 3, 1, Direction.EAST);
        Wall w4b1 = new Wall(newYork, 2, 1, Direction.EAST);
        Wall w5b1 = new Wall(newYork, 1, 1, Direction.EAST);
        Wall w6b1 = new Wall(newYork, 5, 1, Direction.WEST);
        Wall w7b1 = new Wall(newYork, 4, 1, Direction.WEST);
        Wall w8b1 = new Wall(newYork, 3, 1, Direction.WEST);
        Wall w9b1 = new Wall(newYork, 2, 1, Direction.WEST);
        Wall w10b1 = new Wall(newYork, 1, 1, Direction.WEST);
        Wall w11b1 = new Wall(newYork, 0, 1, Direction.SOUTH);

        Wall w1b2 = new Wall(newYork, 5, 3, Direction.EAST);
        Wall w2b2 = new Wall(newYork, 4, 3, Direction.EAST);
        Wall w3b2 = new Wall(newYork, 3, 3, Direction.EAST);
        Wall w4b2 = new Wall(newYork, 2, 3, Direction.EAST);
        Wall w5b2 = new Wall(newYork, 1, 3, Direction.EAST);
        Wall w6b2 = new Wall(newYork, 5, 3, Direction.WEST);
        Wall w7b2 = new Wall(newYork, 4, 3, Direction.WEST);
        Wall w8b2 = new Wall(newYork, 3, 3, Direction.WEST);
        Wall w9b2 = new Wall(newYork, 2, 3, Direction.WEST);
        Wall w10b2 = new Wall(newYork, 1, 3, Direction.WEST);
        Wall w11b2 = new Wall(newYork, 0, 3, Direction.SOUTH);

        Wall w1b3 = new Wall(newYork,5, 5,Direction.EAST);
        Wall w2b3 = new Wall(newYork,4, 5,Direction.EAST);
        Wall w3b3 = new Wall(newYork,3, 5,Direction.EAST);
        Wall w4b3 = new Wall(newYork,2, 5,Direction.EAST);
        Wall w5b3 = new Wall(newYork,1, 5,Direction.EAST);
        Wall w6b3 = new Wall(newYork,5, 5,Direction.WEST);
        Wall w7b3 = new Wall(newYork,4, 5,Direction.WEST);
        Wall w8b3 = new Wall(newYork,3, 5,Direction.WEST);
        Wall w9b3 = new Wall(newYork,2, 5,Direction.WEST);
        Wall w10b3 = new Wall(newYork,1, 5,Direction.WEST);
        Wall w11b3 = new Wall(newYork,0 ,5,Direction.SOUTH);
/*
        Wall w1b4 = new Wall(newYork,5, 7,Direction.EAST);
        Wall w2b4 = new Wall(newYork,4, 7,Direction.EAST);
        Wall w3b4 = new Wall(newYork,3, 7,Direction.EAST);
        Wall w4b4 = new Wall(newYork,2, 7,Direction.EAST);
        Wall w5b4 = new Wall(newYork,1, 7,Direction.EAST);  //If more builds (VAR RESET TEST)
        Wall w6b4 = new Wall(newYork,5, 7,Direction.WEST);
        Wall w7b4 = new Wall(newYork,4, 7,Direction.WEST);
        Wall w8b4 = new Wall(newYork,3, 7,Direction.WEST);
        Wall w9b4 = new Wall(newYork,2, 7,Direction.WEST);
        Wall w10b4 = new Wall(newYork,1, 7,Direction.WEST);
        Wall w11b4 = new Wall(newYork,0 ,7,Direction.SOUTH);
*///=========================================================================================

        spider.crawlWalls();


    }
}