-- Database: albums

-- DROP DATABASE IF EXISTS albums;

/*
DROP TABLE Artists;
DROP TABLE Genres;
DROP TABLE Albums;
DROP TABLE Associative;
*/

CREATE TABLE Artists (
	Id INT PRIMARY KEY,
	Name VARCHAR(50)
);

CREATE TABLE Genres (
    Id INT PRIMARY KEY,
	Name VARCHAR(50)
);

CREATE TABLE Albums (
    Id INT PRIMARY KEY,
	ReleaseYear INT,
	Title VARCHAR(50),
	Artist VARCHAR(50),
	Genre VARCHAR(50)
);

CREATE TABLE Associative (
    Id_artist INT,
	Id_genre INT,
	Id_album INT
);

ALTER TABLE Associative 
ADD CONSTRAINT FK_Id_artist
FOREIGN KEY (Id_artist) REFERENCES Artists(Id);
ALTER TABLE Associative 
ADD CONSTRAINT FK_Id_genre
FOREIGN KEY (Id_genre) REFERENCES Genres(Id);
ALTER TABLE Associative 
ADD CONSTRAINT FK_Id_album
FOREIGN KEY (Id_album) REFERENCES Albums(Id);

INSERT INTO Genres
VALUES (1, 'Rock');

SELECT * FROM Artists;
/*DELETE FROM Artists;*/