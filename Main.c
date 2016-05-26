#include <stdlib.h>
#include <stdio.h>
#include <string.h>

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
int main()
{
    int lightX; // the X position of the light of power
    int lightY; // the Y position of the light of power
    int initialTX; // Thor's starting X position
    int initialTY; // Thor's starting Y position
    scanf("%d%d%d%d", &lightX, &lightY, &initialTX, &initialTY);

    int Thor_X=initialTX;
    int Thor_Y=initialTY;

    // game loop
    while (1) {
        int remainingTurns; // The remaining amount of turns Thor can move. Do not remove this line.
        scanf("%d", &remainingTurns);
        char *Pos_X = "";
        char *Pos_Y = "";
        
        if (Thor_X > lightX) {
            Pos_X = "W";
            Thor_X--;
        } else if (Thor_X < lightX) {
            Pos_X = "E";
            Thor_X++;
        }
        if (Thor_Y > lightY) {
            Pos_Y = "N";
            Thor_Y--;
        } else if (Thor_Y < lightY) {
            Pos_Y = "S";
            Thor_Y++;
        }
        printf("%s%s\n", Pos_Y, Pos_X);
    }

    return 0;
}
