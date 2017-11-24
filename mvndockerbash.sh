#!/bin/bash -login

for file in ./*
do
	if test -d $file
    	then
		cd $file
		mvn clean package docker:build -Dmaven.test.skip=true
		cd ..
    	fi
done
