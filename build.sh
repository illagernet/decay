#!/bin/bash

spigot='spigot-1.14.4.jar'
name='Decay'
version='1.0'

# Download Dependancies
mkdir -p lib
if test ! -f lib/$spigot; then
    echo "Downloading Spigot"
    curl "https://cdn.getbukkit.org/spigot/$spigot" \
        --progress-bar \
        --output lib/$spigot
fi

# Compile plugin
echo "Compiling plugin"
rm -rf bin
mkdir bin
javac $(find src -name "*.java") \
    -classpath lib/$spigot \
    -source 8 \
    -target 8 \
    -d bin
if [ $? -eq 1 ]; then
    exit 1
fi

# Archive plugin
echo "Packaging plugin"
jar -cvf $name-$version.jar \
    -C res . \
    -C bin .

# Done
echo "Built"
