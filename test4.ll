; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
store i32 10, i32* %t2
store i32 20, i32* %t1
store i32 30, i32* %t0
%t3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @.str.0 , i64 0, i64 0))
%t4 = load i32, i32* %t2
%t5 = load i32, i32* %t1
%t6 = load i32, i32* %t0
%t7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @.str.1 , i64 0, i64 0),i32 %t4, i32 %t5, i32 %t6)
%t8 = load i32, i32* %t2
%t9 = load i32, i32* %t1
%t10 = add nsw i32 %t8, %t9
%t11 = load i32, i32* %t1
%t12 = load i32, i32* %t0
%t13 = add nsw i32 %t11, %t12
%t14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @.str.2 , i64 0, i64 0),i32 %t10, i32 %t13)
%t15 = load i32, i32* %t2
%t16 = load i32, i32* %t1
%t17 = add nsw i32 %t15, %t16
%t18 = load i32, i32* %t0
%t19 = add nsw i32 %t17, %t18
%t20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @.str.3 , i64 0, i64 0),i32 %t19)

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [15 x i8] c"Hello World!!\0A\00", align 1
@.str.1 = private unnamed_addr constant [18 x i8] c"a:%d, b:%d, c:%d\0A\00", align 1
@.str.2 = private unnamed_addr constant [24 x i8] c"a + b = %d, b + c = %d\0A\00", align 1
@.str.3 = private unnamed_addr constant [16 x i8] c"a + b + c = %d\0A\00", align 1
