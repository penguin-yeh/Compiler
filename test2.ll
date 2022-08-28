; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
store i32 10, i32* %t2
store i32 0, i32* %t1
%t3 = load i32, i32* %t2
%t4 = load i32, i32* %t1
%t5 = icmp sgt i32 %t3, %t4
%t6 = zext i1 %t5 to i32
store i32 %t6, i32* %t0
%t7 = load i32, i32* %t0
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @.str.0 , i64 0, i64 0),i32 %t7)
%t9 = load i32, i32* %t2
%t10 = load i32, i32* %t1
%t11 = icmp slt i32 %t9, %t10
%t12 = zext i1 %t11 to i32
store i32 %t12, i32* %t0
%t13 = load i32, i32* %t0
%t14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @.str.1 , i64 0, i64 0),i32 %t13)
%t15 = load i32, i32* %t2
%t16 = load i32, i32* %t1
%t17 = icmp sge i32 %t15, %t16
%t18 = zext i1 %t17 to i32
store i32 %t18, i32* %t0
%t19 = load i32, i32* %t0
%t20 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @.str.2 , i64 0, i64 0),i32 %t19)
%t21 = load i32, i32* %t2
%t22 = load i32, i32* %t1
%t23 = icmp sle i32 %t21, %t22
%t24 = zext i1 %t23 to i32
store i32 %t24, i32* %t0
%t25 = load i32, i32* %t0
%t26 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @.str.3 , i64 0, i64 0),i32 %t25)
%t27 = load i32, i32* %t2
%t28 = load i32, i32* %t1
%t29 = icmp eq i32 %t27, %t28
%t30 = zext i1 %t29 to i32
store i32 %t30, i32* %t0
%t31 = load i32, i32* %t0
%t32 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @.str.4 , i64 0, i64 0),i32 %t31)
%t33 = load i32, i32* %t2
%t34 = load i32, i32* %t1
%t35 = icmp ne i32 %t33, %t34
%t36 = zext i1 %t35 to i32
store i32 %t36, i32* %t0
%t37 = load i32, i32* %t0
%t38 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @.str.5 , i64 0, i64 0),i32 %t37)

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [10 x i8] c"a>b = %d\0A\00", align 1
@.str.1 = private unnamed_addr constant [10 x i8] c"a<b = %d\0A\00", align 1
@.str.2 = private unnamed_addr constant [11 x i8] c"a>=b = %d\0A\00", align 1
@.str.3 = private unnamed_addr constant [11 x i8] c"a<=b = %d\0A\00", align 1
@.str.4 = private unnamed_addr constant [11 x i8] c"a==b = %d\0A\00", align 1
@.str.5 = private unnamed_addr constant [11 x i8] c"a!=b = %d\0A\00", align 1
