#!/bin/bash
#enter chmod +x run_spoot_factory.sh

javac -d ../out SpootFactory.java
if [ $? -eq 0 ]
then
  echo "Welcome to the Spoot Factory!"
  java -cp ../out SpootFactory
else
  echo "Failed to load program"
fi