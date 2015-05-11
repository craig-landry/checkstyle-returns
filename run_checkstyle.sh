#!/bin/sh

#Run this from the root of the project directory (where this file is located).

java -jar checkstyle-6.6-all.jar -c config.xml src/com/example/CheckstyleReturnCheck.java