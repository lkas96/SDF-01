# Compile instructions for Java
filename.java

    Example 1
        javac filename.java
        java filename

        ** No specific classpath, just in root folder
        ** No package

    Example 2
        javac --source-path myapp -d bin myapp/*
            
            --source-path : folder where .java files are stored
            -d bin : destination where .class files are placed, bin folder in this case
            myapp/* : asterisk - taking all the files/folders and compiles all java files

        java -cp bin myapp.HelloWorld

        ** Has specific classpath
        ** Has package

    Example 3
        javac --source-path . -d bin ./*.java

            --source-path . : dot is root folder
            -d bin : destination where .class files are placed, bin folder in this case

# Creating JAR files

            Folder Tree

            SDF-01
            >>myapp (source code files resides in)
            >>bin (compiled class files resides in)

In CMD, cd to the bin folder, create the JAR files in the bin directory

jar -c -v -f jar.jar -e myapp.HelloWorld .

            jar.jar : jarfilename.jar
            -e myapp.HelloWorld : specify the main class

To run the jar file
java -jar jar.jar


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
