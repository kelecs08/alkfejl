Beadandó feladat Alkalmazások fejlesztése nevezetû tárgyra.
Készítette: Kelecsényi Anna és Csapó Dániel


1. A feladat rövid leírása:
A program egy mozi jegyeladásait tudja kezelni, az alábbi funkciókkal:
* A programban megtekinthetõk a filmek adatai (cím, rendezõ, szinopszis, hossz, beviteli dátum), megjelenik minden filmre az eladott jegyek száma.
* Adminisztrátorként lehet egy adott filmet, illetve termet kiválasztva új elõadást hirdetni adott idõpontra, valamint elõadást lehet törölni, amennyiben senki sem foglalt rá helyet. A programnak figyelnie kell, hogy két elõadás ne ütközzön az adott teremben (a film hossza után kell 15 perc takarítási idõt számolni).
* A program listázza ki az elõadásokat idõpont szerint, és azt lehessen szûrni film, illetve terem alapján. Minden elõadásnál legyen látható, mennyi szabad hely van még rá.
* A meghirdetett elõadásokra lehet helyet foglalni. A helyfoglalás adott székre (sor illetve oszlop megadásával) történik figyelembe véve, hogy a szék még nincs lefoglalva. A lefoglalt helyek ezek után bármikor kiadhatók. Kiadott jegyet már nem lehet újra kiadni, de foglalást lehet visszavonni.
2. Adatbázis modell:
![  ide kattintva elérhetõ az adatbázis terv](resources/tables.png)
3. Funkcionális követelmények:
* A fõoldalon megjelenik a napi program, azaz mely filmeket mikor vetítik, a mozi mely termében, amit minden szerepkörû (user, admin, guest) felhasználó megtekinthet.
* A filmeket kiválasztva megjelenik annak részletes leírása (cím, rendezõ, szinopszis, hossz, bevitel dátuma), valamint az összes elõadás idõpontja.
* Az idõpontot kiválasztva lehetõség nyílik helyfoglalásra az adott elõadásra. Ekkor a felhasználónak meg kell adnia a lefoglalandó hely sorszámát illetve oszlopszámát – ügyelve a terem kapacitására. Csak a szabad helyek foglalhatók le. A felhasználónak továbbá meg kell adnia nevét, telefonszámát, valamint email címét.
* Lehetõség van új film felvételére, de ezt csupán az adminisztrátor felhasználók tehetik meg. Ekkor ki kell tölteni a film adatait (cím, rendezõ, szinopszis, hossz, bevitel dátuma).
* Szintén admin szerepkörû funkcionalitás az új elõadások meghirdetése, amihez termet, filmet választva, valamint idõpont megadásával tehet meg az adminisztrátor. A meghirdetéskor ügyelni kell arra, hogy az elõadás ne ütközzön más elõadásokkal az adott teremben, illetve két elõadás között legalább 15 percnek kell eltelnie takarítás végett.
* A jegyvásárláshoz ki kell választani a filmet és az elõadást. Ezt követõen listázódnak a helyek (sor, oszlop, státusz), A szabad, illetve foglalt helyek eladhatók. A foglalt helyeket kiválasztva meg lehet tekinteni a foglaló adatait (név, telefonszám, email).
