# Beadand� feladat Alkalmaz�sok fejleszt�se nevezet� t�rgyra. #
### K�sz�tette: Kelecs�nyi Anna �s Csap� D�niel ###

## 1.K�vetelm�nyanal�zis ##

#### 1.1.A feladat r�vid le�r�sa: ####

Mir�l sz�l a projekt?
* Az al�bbi projekt egy olyan program megval�s�t�s�ra t�rekszik, amely egy multiplex mozi jegyelad�sait k�pes kezelni. A program sz�mos funkci�i k�z� tartozik p�ld�ul a mozi �ltal vet�tett filmek adatainak (c�m, rendez�, szinopszis, hossz) megtekinthet�s�ge; el�ad�s meghirdet�se stb.
* A program c�lk�z�ns�ge:

A program felhaszn�l�i egyr�szt a mozi alkalmazottjai (admin), akik a program seg�ts�g�vel k�pesek el�ad�sokat meghirdetni adott id�pontra, valamint azokat t�r�lhetik is. A lefoglalt, valamint a szabad helyeket ki tudj�k adni.

A m�sik felhaszn�l�i r�teg (user, guest) a fentiekhez k�pest kevesebb funkci�val rendelkezik. �k az el�ad�sok kezel�s�re nem jogosultak, de meg tudj�k tekinteni, milyen filmeket vet�t a mozi �s mikor, stb., valamint jegyet foglalhatnak el�ad�sokra.

* A program sz�mos funkci�ja �tl�that�bb�, k�nnyebben kezelhet�v� teszi a jegyelad�sok nyilv�ntart�s�t, kezel�s�t. Ha ugyanezen adatokat pap�ron vezetn�k a dolgoz�k �s onnan k�ne kikeresni az egyes adatokat, sokkal nehezebb dolguk lenne, valamint sokkal tov�bb tartana.

#### 1.2.Nem funkcion�lis elv�r�sok: ####
* Felhaszn�l�bar�t, egyszer�, letisztult fel�let
* Keres�si eredm�nyek gyors megjelen�t�se
* Jelszavas azonos�t�s

#### 1.3.Funkcion�lis k�vetelm�nyek: ####
* A f�oldalon megjelenik a napi program, azaz mely filmeket mikor vet�tik, a mozi mely term�ben, amit minden szerepk�r� (user, admin, guest) felhaszn�l� megtekinthet.
* A filmeket kiv�lasztva megjelenik annak r�szletes le�r�sa (c�m, rendez�, szinopszis, hossz), valamint az �sszes el�ad�s id�pontja.
* Az id�pontot kiv�lasztva lehet�s�g ny�lik helyfoglal�sra az adott el�ad�sra. Ekkor a felhaszn�l�nak meg kell adnia a lefoglaland� hely sorsz�m�t illetve oszlopsz�m�t � �gyelve a terem kapacit�s�ra. Csak a szabad helyek foglalhat�k le. A felhaszn�l�nak tov�bb� meg kell adnia nev�t, telefonsz�m�t, valamint email c�m�t.
* Lehet�s�g van �j film felv�tel�re, de ezt csup�n az adminisztr�tor felhaszn�l�k tehetik meg. Ekkor ki kell t�lteni a film adatait (c�m, rendez�, szinopszis, hossz, bevitel d�tuma).
* Szint�n admin szerepk�r� funkcionalit�s az �j el�ad�sok meghirdet�se, amihez termet, filmet v�lasztva, valamint id�pont megad�s�val tehet meg az adminisztr�tor. A meghirdet�skor �gyelni kell arra, hogy az el�ad�s ne �tk�zz�n m�s el�ad�sokkal az adott teremben, illetve k�t el�ad�s k�z�tt legal�bb 15 percnek kell eltelnie takar�t�s v�gett.
* A jegyv�s�rl�shoz ki kell v�lasztani a filmet �s az el�ad�st. Ezt k�vet�en list�z�dnak a helyek (sor, oszlop, st�tusz), A szabad, illetve foglalt helyek eladhat�k. A foglalt helyeket kiv�lasztva meg lehet tekinteni a foglal� adatait (n�v, telefonsz�m, email).

## 2.Tervez�s ##

#### 2.1.Adatb�zis modell: ####
   * Adatb�zis s�m�k le�r�sa:
![ide kattintva el�rhet� az adatb�zis s�ma](resources/tables.png)
   * Egyed-kapcsolat diagram:
![  ide kattintva el�rhet� az adatb�zis terv](resources/tables2.png)

Az �bra egyszer�s�ge v�gett a kapcsol�t�bl�k nem szerepelnek az egyed-kapcsolat diagramon.

#### 2.2.V�gpontok: ####
* GET / - F�oldal, napi program
* GET /auth/login � Bejelentkez� oldal
* POST /auth/login � Bejelentkez�s elk�ld�se
* POST /auth/logout � Kijelentkez�s
* GET /debug � Jelenlegi felhaszn�l� lek�rdez�se
* GET /film/add � Film hozz�ad�sa oldal
* POST /film/add - Film hozz�ad�s�nak elk�ld�se
* GET /film - Filmek list�j�nak lek�r�se
* GET /film/:id � Film r�szletes le�r�sa, film vet�t�s�nek id�pontjai
* GET /booking/:id Kiv�lasztott el�ad�s foglal�si oldala
* POST /booking/:id/book Foglal�s elk�ld�se
* GET /film/:id/edit � Film adatainak szerkeszt�se
* POST /film/:id/edit Film szerkesztett adatainak elk�ld�se
* POST /film/delete/:id � Film t�rl�se
* GET /performance - El�ad�sok megtekint��se
* GET /performance/add � El�ad�s hozz�ad�sa oldal
* POST /performance/add � El�ad�s hozz�ad�s�nak elk�ld�se
* POST /performance/delete/:id - El�ad�s t�rl�se
* GET /performance/:id/edit � El�ad�s szerkeszt�s�nek oldala
* POST /performance/:id/edit � El�ad�s szerkesztett adatainak elk�ld�se

    * Egy v�gpont r�szletes le�r�sa(/performance/:id/book):
![ide kattintva el�rhet� az szekvenciadiagram](resources/sequence.png)

#### 2.3.Haszn�lati eset diagram (use-case modell): ####
![ide kattintva el�rhet� a haszn�lati eset diagram](resources/use_case.png)
* Guest: nem regisztr�lt felhaszn�l�, a filmeket, el�ad�sokat megtekintheti, de pl.: jegyet nem foglalhat el�ad�sra.
* User: regisztr�lt �s bejelentkezett l�togat�, aki m�r jogosult pl.: jegyfoglal�sra.
* Admin: olyan felhaszn�l�, akinek a program minden funkcionalit�s�hoz van jogosults�ga.

## 3.Implement�ci� ##

#### 3.1.Felhaszn�lt eszk�z�k: ####
* Git verzi�kezel�, Github a projekt k�zz�t�tel�hez
* Node.js JavaScript k�rnyezet
* Angular.js TypeScript k�rnyezet
* Visual Studio Code lok�lis IDE

#### 3.2.Fejleszt�k�rnyezet fel�ll�t�sa: ####
* Git verzi�kezel� telep�t�se - Githubon t�rt�n� regisztr�ci� aj�nlott
* Node.js k�rnyezet telep�t�se
* Projekt kl�noz�sa lok�lis g�pre: git clone https://github.com/kelecs08/alkfejl.git , vagy t�m�r�tett projekt let�lt�se �s kicsomagol�sa, 
* A projektk�nyvt�rban a f�gg�s�gek telep�t�se: npm install
* App ind�t�sa: backend-en spring-boot:run goal a pom.xml f�jlon, frontend-en nmp start - alapesetben a localhost:4200-on fut a program


#### 3.3.K�nyvt�rstrukt�ra: ####
Backend:
* CinemaApplication
* annotation
    * Role
* controller
    * AuthController
    * FilmController
    * PerformanceController
    * RoomController
* entity
    * BaseEntity
    * Film
    * Performance
    * Room
    * Seat
    * User
* interceptor
    * AuthInterceptor
* repository
    * FilmRepository
    * PerformanceRepository
    * RoomRepository
    * SeatRepository
    * UserRepository
* service
    * SessionService

Frontend:
* classes
    * film
    * performance
    * room
    * seat
    * user
* components
    * addform
    * book-seat
    * delete
    * film-details
    * films
    * login
    * performance
    * register
* config
    * api
* modules
    * app-router
    * ui
* services
    * auth
    * film
    * performance
    * room
    * route-guard
    * seat
	
## 4.Felhaszn�l�i dokument�ci� ##

Ind�t�s: a backend elind�t�sa ut�n, az npm start parancs kiad�s�t k�vet�en t�lts�k be a b�ng�sz�ben az oldalt (http://localhost:4200)

* Bejelentkez�s
Bizonyos funkci� el�r�s�hez be kell jelentkeznie a felhaszn�l�nak, melyet a jobb fels� sarokban lev� login gombra kattintva tehet meg. Ha olyan funkci�t szeretn�nk el�rni, amihez nincs jogosults�gunk, a program �tir�ny�t a bejelentkez�s oldalra.
* Filmek adatainak megtekint�se
Az alkalmaz�s elind�t�sakor r�gt�n az adatb�zisban tal�lhat� filmek list�j�t l�thatjuk. Egy filmc�mre kattintva, az adott film r�szletit l�thatjuk, valamint megjelennek a filmhez tartoz� el�ad�s id�pontok.
* El�ad�sok adatainak megtekint�se
A performances men�pontra kattintva megtekinthetj�k az adatb�zisban lev� el�ad�sok adatait.
* Adminisztr�tori felhaszn�l�k t�r�lhetnek filmet, el�ad�st, termet
Csup�n adminisztr�torin jogosults�ggal t�r�lhet�nk az adatb�zisb�l adott filmet, el�ad�st, vagy termet. Ehhez a funkcionalit�shoz szint�n be kell jelentkezni a megfelel� felhaszn�l�n�v-jelsz� p�rossal.

## 5.Tesztel�s ##

