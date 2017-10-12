Beadandó feladat Alkalmazások fejlesztése nevezetû tárgyra.
Készítette: Kelecsényi Anna és Csapó Dániel

1. A feladat rövid leírása:
Mirõl szól a projekt?
Az alábbi projekt egy olyan program megvalósítására törekszik, amely egy multiplex mozi jegyeladásait képes kezelni. A program számos funkciói közé tartozik például a mozi által vetített filmek adatainak (cím, származás, szinkronizált-e, szinopszis, hossz, lejátszások maximális száma, korhatár besorolás) megtekinthetõsége; elõadás meghirdetése; lehetõség van a meghirdetett elõadásokra helyet foglalni stb.
A program célközönsége:
A program lehetséges felhasználói a mozi alkalmazottjai, akik a program segítségével képesek elõadásokat meghirdetni adott idõpontra, valamint azokat törölhetik is, amennyiben egyetlen nézõ sem foglalt rá helyet; tudnak a meghirdetett elõadásokra jegyet foglalni. A program elõnye, hogy figyeli két azonos teremben levõ elõadás ütközését, valamint korlátozza egy film párhuzamos vetíthetõségét (egyszerre maximum három teremben vetíthetõ egy film). A jegyeladások kezelését jelentõsen megkönnyíti a program azon funkciója, mely minden filmre megjeleníti az eladott jegyek számát, valamint minden elõadás esetén listázza a még szabad helyek számát.
A program számos funkciója átláthatóbbá, könnyebben kezelhetõvé teszi a jegyeladások nyilvántartását, kezelését. Ha ugyanezen adatokat papíron vezetnék a dolgozók és onnan kéne kikeresni az egyes adatokat, sokkal nehezebb dolguk lenne, valamint sokkal tovább tartana.
2. Adatbázis modell:
	Adatbázis sémák leírása:
![ide kattintva elérhetõ az adatbázis séma](resources/tables.png)
	Egyed-kapcsolat diagram:
![  ide kattintva elérhetõ az adatbázis terv](resources/tables2.png)
Az ábra egyszerûsége végett a kapcsolótáblák nem szerepelnek az egyed-kapcsolat diagramon.
3. Funkcionális követelmények:
* A fõoldalon megjelenik a napi program, azaz mely filmeket mikor vetítik, a mozi mely termében, amit minden szerepkörû (user, admin, guest) felhasználó megtekinthet.
* A filmeket kiválasztva megjelenik annak részletes leírása (cím, rendezõ, szinopszis, hossz, bevitel dátuma), valamint az összes elõadás idõpontja.
* Az idõpontot kiválasztva lehetõség nyílik helyfoglalásra az adott elõadásra. Ekkor a felhasználónak meg kell adnia a lefoglalandó hely sorszámát illetve oszlopszámát – ügyelve a terem kapacitására. Csak a szabad helyek foglalhatók le. A felhasználónak továbbá meg kell adnia nevét, telefonszámát, valamint email címét.
* Lehetõség van új film felvételére, de ezt csupán az adminisztrátor felhasználók tehetik meg. Ekkor ki kell tölteni a film adatait (cím, rendezõ, szinopszis, hossz, bevitel dátuma).
* Szintén admin szerepkörû funkcionalitás az új elõadások meghirdetése, amihez termet, filmet választva, valamint idõpont megadásával tehet meg az adminisztrátor. A meghirdetéskor ügyelni kell arra, hogy az elõadás ne ütközzön más elõadásokkal az adott teremben, illetve két elõadás között legalább 15 percnek kell eltelnie takarítás végett.
* A jegyvásárláshoz ki kell választani a filmet és az elõadást. Ezt követõen listázódnak a helyek (sor, oszlop, státusz), A szabad, illetve foglalt helyek eladhatók. A foglalt helyeket kiválasztva meg lehet tekinteni a foglaló adatait (név, telefonszám, email).
