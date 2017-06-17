#!bin/bash
source ~/.bash_profile
for file in ./*
do
	if test -d $file
    	then
		cd $file
		mvndocker
		cd ..
    	fi
done
