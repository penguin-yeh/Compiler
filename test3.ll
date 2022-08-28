; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
store i32 20, i32* %t2
store i32 20, i32* %t1
store i32 30, i32* %t0
%t3 = load i32, i32* %t2
%t4 = icmp eq i32 %t3, 10
br i1 %t4, label %L0, label %L1
L0:
%t5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @.str.0 , i64 0, i64 0))
br label %END
L1:
%t6 = load i32, i32* %t1
%t7 = icmp eq i32 %t6, 20
br i1 %t7, label %L2, label %L3
L2:
%t8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([27 x i8], [27 x i8]* @.str.1 , i64 0, i64 0))
br label %END
L3:
%t9 = load i32, i32* %t0
%t10 = icmp eq i32 %t9, 30
br i1 %t10, label %L4, label %L5
L4:
%t11 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @.str.2 , i64 0, i64 0))
br label %END
L5:
%t12 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([20 x i8], [20 x i8]* @.str.3 , i64 0, i64 0))
br label %END
END:

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [18 x i8] c"At if statement.\0A\00", align 1
@.str.1 = private unnamed_addr constant [27 x i8] c"At 1st-else-if statement.\0A\00", align 1
@.str.2 = private unnamed_addr constant [24 x i8] c"At 2nd-else statement.\0A\00", align 1
@.str.3 = private unnamed_addr constant [20 x i8] c"At else statement.\0A\00", align 1
