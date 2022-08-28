; === prologue ====
declare dso_local i32 @printf(i8*, ...)

declare dso_local i32 @scanf(i8*, ...)

define dso_local i32 @main()
{
%t0 = alloca i32, align 4
%t1 = alloca i32, align 4
%t2 = alloca i32, align 4
%t3 = call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([9 x i8], [9 x i8]* @.str.0 , i64 0, i64 0),i32* %t2, i32* %t1, i32* %t0)
%t4 = load i32, i32* %t2
%t5 = load i32, i32* %t1
%t6 = load i32, i32* %t0
%t7 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @.str.1 , i64 0, i64 0),i32 %t4, i32 %t5, i32 %t6)

; === epilogue ===
ret i32 0
}
@.str.0 = private unnamed_addr constant [9 x i8] c"%d %d %d\00", align 1
@.str.1 = private unnamed_addr constant [18 x i8] c"a:%d, b:%d, c:%d\0A\00", align 1
