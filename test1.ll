; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
store i32 10, i32* %t2
%t4 = load i32, i32* %t2
%t5 = add nsw i32 %t4, 198
store i32 %t5, i32* %t3
%t6 = load i32, i32* %t3
%t7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str.0 , i64 0, i64 0),i32 %t6)
store i32 20, i32* %t1
store i32 30, i32* %t0
%t8 = load i32, i32* %t0
%t9 = load i32, i32* %t2
%t10 = sdiv i32 %t8, %t9
%t11 = load i32, i32* %t0
%t12 = load i32, i32* %t1
%t13 = srem i32 %t11, %t12
%t14 = add nsw i32 %t10, %t13
%t15 = load i32, i32* %t1
%t16 = load i32, i32* %t0
%t17 = mul nsw i32 %t15, %t16
%t18 = add nsw i32 %t14, %t17
%t19 = load i32, i32* %t0
%t20 = srem i32 %t19, 3
%t21 = sub nsw i32 %t18, %t20
%t22 = sub nsw i32 %t21, 20
%t23 = load i32, i32* %t0
%t24 = add nsw i32 %t22, 3
store i32 %t24, i32* %t3
%t25 = load i32, i32* %t3
%t26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @.str.1 , i64 0, i64 0),i32 %t25)

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [14 x i8] c"result1 = %d\0A\00", align 1
@.str.1 = private unnamed_addr constant [14 x i8] c"result2 = %d\0A\00", align 1
