#!/bin/bash
#enter chmod +x run_spoot_factory.sh

javac SpootFactory.java
if [ $? -eq 0 ]
then
  echo "Welcome to the Spoot Factory!"
  java SpootFactory
else
  echo "Failed to load program"
fi