
void main()
{
    int a;
    int b;
    int i;
    int j;
    int sum;
    int flag;

    sum = 0;
    flag = 1;

    for(i=0; i<10 ;i=i+1)
    {
        sum = sum + i;
    }
    printf("sum = %d\n", sum);

    printf("sum = 1");

    sum = sum - 1;
    i = 2;
    while(sum!=0)
    {
        sum = sum - i;
        printf("+%d", i);
        i = i + 1;
    }
    printf("\n");

}