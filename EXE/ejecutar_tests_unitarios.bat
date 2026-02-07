@echo off
REM Asegura que la terminal se ubique dentro de la carpeta EXE
cd /d "%~dp0"

REM Nos salimos de EXE y nos situamos en la carpeta FONTS\subgrup-prop31.2
cd /d "..\FONTS\subgrup-prop31.2"

echo -----------------------------------------------------
echo Ejecutando tests unitarios desde la carpeta FONTS...
echo -----------------------------------------------------

REM Ejecutamos Gradle Wrapper para limpiar y lanzar los tests
call gradlew clean test

echo.
echo Tests unitarios finalizados.

