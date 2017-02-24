cd C:\Users\tim\Desktop\Urteile
$FILES = ls *.pdf
foreach ($f in $FILES) {
    & 'C:\Program Files\xpdf\bin64\pdftotext.exe' -enc UTF-8 $f
}