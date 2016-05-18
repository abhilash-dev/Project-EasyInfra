OutPutFolder=$HOME/EasyInfraOutputFolder
mkdir $OutPutFolder
while read line
do
	var=$OutPutFolder"/"$line
	mkdir $var
done<junctions.txt	
