; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = alloca i32, align 4
%t4 = alloca i32, align 4
%t5 = alloca i32, align 4
store i32 0, i32* %t1
store i32 1, i32* %t0
store i32 0, i32* %t3
br label %L0
L0:
%t6 = load i32, i32* %t3
%t7 = icmp slt i32 %t6, 10
br i1 %t7, label %L2, label %L_END0
L1:
%t8 = load i32, i32* %t3
%t9 = add nsw i32 %t8, 1
store i32 %t9, i32* %t3
br label %L0
L2:
%t10 = load i32, i32* %t1
%t11 = load i32, i32* %t3
%t12 = add nsw i32 %t10, %t11
store i32 %t12, i32* %t1
br label %L1
L_END0:
%t13 = load i32, i32* %t1
%t14 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @.str.0 , i64 0, i64 0),i32 %t13)
%t15 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @.str.1 , i64 0, i64 0))
%t16 = load i32, i32* %t1
%t17 = sub nsw i32 %t16, 1
store i32 %t17, i32* %t1
store i32 2, i32* %t3
br label %L3
L3:
%t18 = load i32, i32* %t1
%t19 = icmp ne i32 %t18, 0
br i1 %t19, label %L4, label %W_END0
L4:
%t20 = load i32, i32* %t1
%t21 = load i32, i32* %t3
%t22 = sub nsw i32 %t20, %t21
store i32 %t22, i32* %t1
%t23 = load i32, i32* %t3
%t24 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str.2 , i64 0, i64 0),i32 %t23)
%t25 = load i32, i32* %t3
%t26 = add nsw i32 %t25, 1
store i32 %t26, i32* %t3
br label %L3
W_END0:
%t27 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([2 x i8], [2 x i8]* @.str.3 , i64 0, i64 0))

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [10 x i8] c"sum = %d\0A\00", align 1
@.str.1 = private unnamed_addr constant [8 x i8] c"sum = 1\00", align 1
@.str.2 = private unnamed_addr constant [4 x i8] c"+%d\00", align 1
@.str.3 = private unnamed_addr constant [2 x i8] c"\0A\00", align 1
