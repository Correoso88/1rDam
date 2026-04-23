@Echo off
cls

:start
SET /P user=Pon el Usuario:
SET /P passw=Pon la contraseña:
SET /A i=0

IF "user"=="admin"(
   ELSE IF "passw"=="1234"(
      ECHO "---Welcome---"
      ECHO "Date: "%date%
      ECHO "Time: "%time%
   )
   ELSE(ECHO ERROR 
	SET /A i=i+1
	GOTO start
	IF %i% EQU 3(GOTO end
)))