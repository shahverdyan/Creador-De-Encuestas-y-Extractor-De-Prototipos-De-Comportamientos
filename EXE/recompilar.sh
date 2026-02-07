#!/bin/bash

# Asegura que la terminal se ubique dentro de la carpeta EXE
cd "$(dirname "$0")"

# Nos salimos de EXE y nos situamos en la carpeta FONTS/subgrup-prop31.2
cd ../FONTS/subgrup-prop31.2

echo "Recompilando proyecto desde FONTS..."

# Compilamos el proyecto haciendo un clean
./gradlew clean jar

# Copiamos el .jar generado en la carpeta EXE
cp build/libs/*.jar ../../EXE/program.jar

echo ""
echo "¡Hecho! Nuevo program.jar copiado a EXE."