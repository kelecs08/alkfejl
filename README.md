Beadand� feladat Alkalmaz�sok fejleszt�se nevezet� t�rgyra.
K�sz�tette: Kelecs�nyi Anna �s Csap� D�niel


1. A feladat r�vid le�r�sa:
A program egy mozi jegyelad�sait tudja kezelni, az al�bbi funkci�kkal:
* A programban megtekinthet�k a filmek adatai (c�m, rendez�, szinopszis, hossz, beviteli d�tum), megjelenik minden filmre az eladott jegyek sz�ma.
* Adminisztr�tork�nt lehet egy adott filmet, illetve termet kiv�lasztva �j el�ad�st hirdetni adott id�pontra, valamint el�ad�st lehet t�r�lni, amennyiben senki sem foglalt r� helyet. A programnak figyelnie kell, hogy k�t el�ad�s ne �tk�zz�n az adott teremben (a film hossza ut�n kell 15 perc takar�t�si id�t sz�molni).
* A program list�zza ki az el�ad�sokat id�pont szerint, �s azt lehessen sz�rni film, illetve terem alapj�n. Minden el�ad�sn�l legyen l�that�, mennyi szabad hely van m�g r�.
* A meghirdetett el�ad�sokra lehet helyet foglalni. A helyfoglal�s adott sz�kre (sor illetve oszlop megad�s�val) t�rt�nik figyelembe v�ve, hogy a sz�k m�g nincs lefoglalva. A lefoglalt helyek ezek ut�n b�rmikor kiadhat�k. Kiadott jegyet m�r nem lehet �jra kiadni, de foglal�st lehet visszavonni.
2. Adatb�zis modell:
![  ide kattintva el�rhet� az adatb�zis terv](resources/tables.png)
3. Funkcion�lis k�vetelm�nyek:
* A f�oldalon megjelenik a napi program, azaz mely filmeket mikor vet�tik, a mozi mely term�ben, amit minden szerepk�r� (user, admin, guest) felhaszn�l� megtekinthet.
* A filmeket kiv�lasztva megjelenik annak r�szletes le�r�sa (c�m, rendez�, szinopszis, hossz, bevitel d�tuma), valamint az �sszes el�ad�s id�pontja.
* Az id�pontot kiv�lasztva lehet�s�g ny�lik helyfoglal�sra az adott el�ad�sra. Ekkor a felhaszn�l�nak meg kell adnia a lefoglaland� hely sorsz�m�t illetve oszlopsz�m�t � �gyelve a terem kapacit�s�ra. Csak a szabad helyek foglalhat�k le. A felhaszn�l�nak tov�bb� meg kell adnia nev�t, telefonsz�m�t, valamint email c�m�t.
* Lehet�s�g van �j film felv�tel�re, de ezt csup�n az adminisztr�tor felhaszn�l�k tehetik meg. Ekkor ki kell t�lteni a film adatait (c�m, rendez�, szinopszis, hossz, bevitel d�tuma).
* Szint�n admin szerepk�r� funkcionalit�s az �j el�ad�sok meghirdet�se, amihez termet, filmet v�lasztva, valamint id�pont megad�s�val tehet meg az adminisztr�tor. A meghirdet�skor �gyelni kell arra, hogy az el�ad�s ne �tk�zz�n m�s el�ad�sokkal az adott teremben, illetve k�t el�ad�s k�z�tt legal�bb 15 percnek kell eltelnie takar�t�s v�gett.
* A jegyv�s�rl�shoz ki kell v�lasztani a filmet �s az el�ad�st. Ezt k�vet�en list�z�dnak a helyek (sor, oszlop, st�tusz), A szabad, illetve foglalt helyek eladhat�k. A foglalt helyeket kiv�lasztva meg lehet tekinteni a foglal� adatait (n�v, telefonsz�m, email).
