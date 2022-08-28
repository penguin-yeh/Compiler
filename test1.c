
void main()
{
    int a;
    int b;
    int c;
    int d;

    b = 10;
    a = b + 2*(100-1);
    printf("result1 = %d\n", a);

    c = 20;
    d = 30;
    a = d/b + d%c + c*d - d%3 - 300%40 + 3%d;
    printf("result2 = %d\n", a);

}