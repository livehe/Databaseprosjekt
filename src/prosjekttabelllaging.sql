create table Film (
	FilmId	integer not null,
    Tittel	varchar(20),
    Lengde	int,
    Utgivelsesår	int,
    Lanseringsdato	int,
    Beskrivelse	text,
    LagetFor	varchar(20),
    Video	int,
	constraint Film_PK primary key (FilmID));

create table Serie (
	SerieID integer not null,
    Serienavn	varchar(20),
    constraint Serie_PK primary key (SerieID));

create table SerieEpisode (
	FilmID	integer not null,
    SerieID	integer not null,
    Sesong	integer,
    constraint SerieEpisode_PK primary key (FilmID, SerieID),
    constraint SerieEpisode_FK1 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade,
	constraint SerieEpisode_FK2 foreign key (SerieID) references Serie(SerieID) on update cascade on delete cascade);
    
create table Person (
	PID	integer not null,
    Navn	varchar(30),
    Fødselsår	integer,
    Land	varchar(20),
    constraint Person_PK primary key (PID));
    
create table Regissør (
	PID	integer not null,
    FilmID	integer not null,
    constraint Regissør_PK primary key (PID, FilmID),
    constraint Regissør_FK1 foreign key (PID) references Person(PID) on update cascade on delete cascade,
    constraint Regissør_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);
    
create table Skuespiller (
	PID	integer not null,
    FilmID	integer not null,
    rolle	varchar(20),
    constraint Skuespiller_PK primary key (PID, FilmID),
    constraint Skuespiller_FK1 foreign key (PID) references Person(PID) on update cascade on delete cascade,
    constraint Skuespiller_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);
    
create table Manusforfatter (
	PID	integer not null,
    FilmID	integer not null,
    constraint Manusforfatter_PK primary key (PID, FilmID),
    constraint Manusforfatter_FK1 foreign key (PID) references Person(PID) on update cascade on delete cascade,
    constraint Manusforfatter_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);
    
create table Utgiver (
	UtgiverID	integer not null,
    URL	varchar(30),
    Adresse varchar(50),
    Land	varchar(20),
    constraint Utgiver_PK primary key (UtgiverID));
    
create table Utgitt (
	UtgiverID	integer not null,
    FilmID	integer not null,
    constraint Utgitt_PK primary key (UtgiverID, FilmID),
    constraint Utgitt_FK1 foreign key (UtgiverID) references Utgiver(UtgiverID) on update cascade on delete cascade,
    constraint Utgitt_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);

create table Musikk (
	MusikkID integer not null,
	Komponist	varchar(50),
	Artist	varchar(50),
	constraint Musikk_PK primary key (MusikkID));

create table FilmMusikk (
	MusikkID integer not null,
    FilmID integer not null,
    constraint FilmMusikk_PK primary key (MusikkID, FilmID),
    constraint FilmMusikk_FK1 foreign key (MusikkID) references Musikk(MusikkID) on update cascade on delete cascade,
    constraint FilmMusikk_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);

create table Sjanger (
	Sjangernavn varchar(30) not null,
    constraint Sjanger_PK primary key (Sjangernavn));
    
create table FilmSjanger (
	Sjangernavn varchar(30) not null,
    FilmID	integer not null,
    constraint FilmSjanger_PK primary key (Sjangernavn, FilmID),
    constraint FilmSjanger_FK1 foreign key (Sjangernavn) references Sjanger(Sjangernavn) on update cascade on delete cascade,
    constraint FilmSjanger_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);
    
create table Bruker (
	Brukernavn	varchar(30),
    constraint Bruker_PK primary key (Brukernavn));

create table Anmeldelse (
	AnmID	integer not null,
    Tekst	text,
    rating	integer,
    Brukernavn	varchar(30) not null,
    FilmID integer not null,
    constraint Anmeldelse_PK primary key (AnmID),
    constraint Anmeldelse_FK1 foreign key (Brukernavn) references Bruker(Brukernavn) on update cascade on delete cascade,
    constraint Anmeldelse_FK2 foreign key (FilmID) references Film(FilmID) on update cascade on delete cascade);

