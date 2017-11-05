# Beadand� feladat Alkalmaz�sok fejleszt�se nevezet� t�rgyra. #
### K�sz�tette: Kelecs�nyi Anna �s Csap� D�niel ###



1. A feladat r�vid le�r�sa:

Mir�l sz�l a projekt?
* Az al�bbi projekt egy olyan program megval�s�t�s�ra t�rekszik, amely egy multiplex mozi jegyelad�sait k�pes kezelni. A program sz�mos funkci�i k�z� tartozik p�ld�ul a mozi �ltal vet�tett filmek adatainak (c�m, rendez�, szinopszis, hossz) megtekinthet�s�ge; el�ad�s meghirdet�se; lehet�s�g van a meghirdetett el�ad�sokra helyet foglalni stb.
* A program c�lk�z�ns�ge:

A program felhaszn�l�i egyr�szt a mozi alkalmazottjai (admin), akik a program seg�ts�g�vel k�pesek el�ad�sokat meghirdetni adott id�pontra, valamint azokat t�r�lhetik is. A lefoglalt, valamint a szabad helyeket ki tudj�k adni.

A m�sik felhaszn�l�i r�teg (user, guest) a fentiekhez k�pest kevesebb funkci�val rendelkezik. �k az el�ad�sok kezel�s�re nem jogosultak, de meg tudj�k tekinteni, milyen filmeket vet�t a mozi �s mikor, stb., valamint jegyet foglalhatnak el�ad�sokra.

* A program sz�mos funkci�ja �tl�that�bb�, k�nnyebben kezelhet�v� teszi a jegyelad�sok nyilv�ntart�s�t, kezel�s�t. Ha ugyanezen adatokat pap�ron vezetn�k a dolgoz�k �s onnan k�ne kikeresni az egyes adatokat, sokkal nehezebb dolguk lenne, valamint sokkal tov�bb tartana.
2. Adatb�zis modell:
   * Adatb�zis s�m�k le�r�sa:
![ide kattintva el�rhet� az adatb�zis s�ma](resources/tables.png)
   * Egyed-kapcsolat diagram:
![  ide kattintva el�rhet� az adatb�zis terv](resources/tables2.png)

Az �bra egyszer�s�ge v�gett a kapcsol�t�bl�k nem szerepelnek az egyed-kapcsolat diagramon.

3. Funkcion�lis k�vetelm�nyek:
* A f�oldalon megjelenik a napi program, azaz mely filmeket mikor vet�tik, a mozi mely term�ben, amit minden szerepk�r� (user, admin, guest) felhaszn�l� megtekinthet.
* A filmeket kiv�lasztva megjelenik annak r�szletes le�r�sa (c�m, rendez�, szinopszis, hossz, bevitel d�tuma), valamint az �sszes el�ad�s id�pontja.
* Az id�pontot kiv�lasztva lehet�s�g ny�lik helyfoglal�sra az adott el�ad�sra. Ekkor a felhaszn�l�nak meg kell adnia a lefoglaland� hely sorsz�m�t illetve oszlopsz�m�t � �gyelve a terem kapacit�s�ra. Csak a szabad helyek foglalhat�k le. A felhaszn�l�nak tov�bb� meg kell adnia nev�t, telefonsz�m�t, valamint email c�m�t.
* Lehet�s�g van �j film felv�tel�re, de ezt csup�n az adminisztr�tor felhaszn�l�k tehetik meg. Ekkor ki kell t�lteni a film adatait (c�m, rendez�, szinopszis, hossz, bevitel d�tuma).
* Szint�n admin szerepk�r� funkcionalit�s az �j el�ad�sok meghirdet�se, amihez termet, filmet v�lasztva, valamint id�pont megad�s�val tehet meg az adminisztr�tor. A meghirdet�skor �gyelni kell arra, hogy az el�ad�s ne �tk�zz�n m�s el�ad�sokkal az adott teremben, illetve k�t el�ad�s k�z�tt legal�bb 15 percnek kell eltelnie takar�t�s v�gett.
* A jegyv�s�rl�shoz ki kell v�lasztani a filmet �s az el�ad�st. Ezt k�vet�en list�z�dnak a helyek (sor, oszlop, st�tusz), A szabad, illetve foglalt helyek eladhat�k. A foglalt helyeket kiv�lasztva meg lehet tekinteni a foglal� adatait (n�v, telefonsz�m, email).