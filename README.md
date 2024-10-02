# Compile instructions for Java
filename.java

javac filename.java
java filename

or 

javac --source-path myapp -d bin myapp/*
    
    --source-path : folder where .java files are stored
    -d : destination where .class files are placed
    myapp/* : asterisk - taking all the files/folders and compiles all java files

java -cp bin myapp.HelloWorld 

# Git - create repo on the command line
echo "foldername" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -m main
git remote add origin https://github.com/lkas96/SDF-01.git (LINK TO REMOTE REPO ON GITHUB)
pit push -u origin main (PUSH TO GITHUB REPO)

# Basic Terminal Commands
cd - change directory
cd.. - return to parent folder
cls - clear terminal
