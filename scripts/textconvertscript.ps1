cd C:\Users\tim\Desktop\Urteile
$FILES = ls *.txt
foreach ($f in $FILES) {
    java -jar converter-1.0-SNAPSHOT-jar-with-dependencies.jar $f $f
}