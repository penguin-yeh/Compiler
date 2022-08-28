#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int sum = 0;
    for(int i=0;i<100;i++)
    {
        sum += i;
        if(sum == 98)
            break;
        if(sum == 99)
            continue;
    }

    printf("sum = %d\n", sum);

    while(sum!=0)
    {
        sum -= 1;
    }
    return 0;
}