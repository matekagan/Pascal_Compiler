Program Lesson1_Program3;
Var       
    Num1, Num2, Sum : Integer;

function dupa( x : Integer) : Integer;
begin
	dupa := x + 6;
end;
	
Begin {no semicolon}

	if Sum <> 2 then Sum := 1;
	
	while Sum = 2 do Sum := 1;
	
	repeat Sum := Sum + 1 until Sum > 5;

	For I := 1 to 20 do
	begin
		Sum := Sum + dupa(I);
	end;
	
End.