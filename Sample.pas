Program projekt;

const
	Stala = 1;
var
	i : Integer;
	j : Integer;
function dodaj(x: Integer;y:Integer) : Integer;
var
 Result : Integer;
begin
    Result:=x + y;

	case x of
	1: 
	begin
	writeln('jeden');
	writeln('drugi napis')
	end;
	else writeln('niejeden');
	end;
	
end;

function silnia(z:Integer) : Integer;
var 
    s: Integer;
    i: Integer;
begin
  i:=1;
  s:=1;
  while i<=z and i > z-12 do 
  begin
    s:=s*i;
    i:=i+1;
  end;
  
  silnia:=s;
end;


begin
	writeln(dodaj(1,1));
    writeln(dodaj(4,5));
    
     for i := 1 to 5 do
     begin
      Writeln(i);
     end;
    
	


     writeln(silnia(5));

    
end.