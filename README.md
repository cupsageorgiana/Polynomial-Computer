Obiectivul principal al temei este de a implementa un sistem de procesare al polinoamelor de o singură variabilă cu coeficienți întregi care sa realizeze principalele operații aritmetice, precum adunarea, scăderea, înmulțirea, împărțirea a doua polinoame introduse de la tastatură, dar și derivarea și integrarea unui singur polinom.

Acest calculator de polinoame este implementat pe baza unei analize a problemei care este modelată după un scenariu, in final rezultând programul care sa execute comenzile primite, adică realizarea operațiilor enunțate mai sus.

Polinoamele sunt realizate din termeni numiți monoame, care sunt alcătuite dintr-o constantă numită coeficient care este înmulțită cu una sau mai multe variabile. Fiecare variabilă poate avea un exponent constant întreg pozitiv. Exponentul unei variabile dintr-un monom este egal cu gradul acelei variabile în acel monom. Gradul unui monom este dat de valoarea exponentului variabilelor. Gradul polinomului este dat de valoarea maxima a gradului monoamelor din care este alcatuit acesta.

Adunarea a două polinoame reprezintă reuniunea termenilor celor două, având proprietatea că monoamelor de același grad li se adună coeficienții. În urma acestei operații va rezulta un nou polinom format din cele două fiind rezultatul operației de adunare.
Scăderea se realizează după același principiul ca și adunarea cu mențiunea că coeficienții monoamelor de același grad se scad. Rezultatul operației fiind de asemenea un nou polinom.

Înmulțirea se realizează prin înmulțirea fiecărui monom din primul polinom cu fiecare monom din cel de al doilea polinom pe baza principiului ca exponenții monoamelor se adună și coeficienții acestora se înmulțesc.

Împărțitrea se face cu ajutorul teoremei împărțirii cu rest.Astfel încât, monoamele dominante ale deîmpărțitului și împărțitorului se împart, monomul rezultat fiind adăugat câtului. Câtul este înmulțit cu împărțitorul, iar noul polinom va si scăzut din deîmpărțit.

Derivarea are loc la nivel de monoame. Astfel, se derivează fiecare monom în parte, termenul rezultat având coeficientul înmulțit cu exponentul termenului, iar exponentul va fi decrementat.

Integrarea se realizează tot la nivel de monoame. De această dată, exponentul va fi incrementat, iar coeficientul va fi împărțit la exponentul incrementat.

Aplicația realizată este funcțională pentru aceste operații cu precizarea că termenii trebuie introduși dupa un șablon “a*x^b”, unde a reprezintă coeficientul monomului care este de tipul real ( float ) și b este exponentului monomului care este de tipul întreg (int ). Monoamele pot fi introduse în ordine aleatorie în polinom, astfel încât există o funcție de sortarea a acestor în funcție de gradul lor. 
