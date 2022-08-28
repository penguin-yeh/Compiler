#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct block
{
    int width;
    int length;
    /* data */
};


int main()
{
    int a,b;
    struct block tmp;
    scanf("%d %d", &a, &b);
    a = a & 1;
    tmp.length = a;
    tmp.width = b;
    return 0;
}