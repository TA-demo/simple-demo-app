echo "defect" >> dummy.txt 
git commit -am "defect #1005: commit"
echo "effect" >> dummy.txt 
git commit -am "defect #1007: commit"
echo "defect" >> dummy.txt 
git commit -am "defect #1061: commit"
echo "effect" >> dummy.txt 
git commit -am "defect #1062: commit"



echo "story" >> dummy.txt 
git commit -am "user story #1004: commit"
echo "sorry" >> dummy.txt 
git commit -am "user story #1006: commit"
echo "story" >> dummy.txt 
git commit -am "user story #1065: commit"
echo "sorry" >> dummy.txt 
git commit -am "user story #1066: commit"
echo "story" >> dummy.txt 
git commit -am "user story #1055: commit"
echo "sorry" >> dummy.txt 
git commit -am "user story #1056: commit"
echo "story" >> dummy.txt 
git commit -am "user story #1084: commit"
echo "sorry" >> dummy.txt 
git commit -am "user story #1085: commit"


echo.  >> src\main\resources\spring-security-context.xml 
echo.  >> src\main\resources\persistence.properties 
echo.  >> src\main\resources\logback.xml 
git commit -am "defect #1084: Fixing NullPointerException in connection pool"

git push origin master