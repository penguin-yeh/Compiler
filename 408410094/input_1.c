#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main()
{
    int a = 123;
    float b = 12.3;
    a = b + 1;
    a = b - 1;
    a = b / 1.0;
    a = b * 1.0;
    a += 1;
    a -= 1;
    a /= 1;
    a *= 1;
    if(a==b)
        printf("EQUAL\n");
    else
        printf("NON EQUAL\n");
    return 0;
}
