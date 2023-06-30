create database movie;
use movie;
create table director(
id_director int auto_increment primary key,
name_director varchar(50),
image_director text
);
create table nation(
id_nation int auto_increment primary key,
name_nation varchar(50)
);
create table genre(
id_genre int auto_increment primary key,
name_genre varchar(50)
);
create table movie(
id_movie int auto_increment primary key,
name_movie varchar(60),
time_movie int,
broadcast_date date,	-- ngày phát sóng 
date_of_manufacture date ,-- ngày sản xuất	
summary text,-- tóm tắt 
image_movie TEXT,
video TEXT,
view int,
id_Nation int , foreign key (id_Nation) references Nation(id_Nation),
id_director int , foreign key(id_director) references director(id_director)
);
create table Actor(
id_Actor int auto_increment primary key,
name_Actor varchar(50),
age tinyint ,
image_Actor TEXT
);
create table movie_genre(
id_movie int , foreign key(id_movie) references movie(id_movie),
id_genre int , foreign key (id_genre) references genre(id_genre),
primary key (id_movie,id_genre)
);
create table Actors(
id_movie int , foreign key (id_movie) references movie(id_movie),
id_Actor int , foreign key (id_Actor) references Actor(id_Actor),
primary key (id_movie , id_Actor)
);

create table users(
id_users int auto_increment primary key,
name_users varchar(50),
acc varchar(50) not null unique,
pass varchar(50) not null,
date_created date,
role varchar(10) not null default "client",
status BOOLEAN default "1"
);

CREATE TABLE add_movie (
  id_add INT AUTO_INCREMENT PRIMARY KEY,
  id_movie INT,
  id_users INT,
  FOREIGN KEY (id_movie) REFERENCES movie(id_movie),
  FOREIGN KEY (id_users) REFERENCES users(id_users)
);


INSERT INTO movie.nation (name_nation) VALUES ( 'England'),
('Finland'),
('Iceland'),
('Austria'),
('Germany'),
('Italy'),
('Russia'),
('Japan')
;

INSERT INTO `movie`.`users` (`name_users`, `acc`, `pass`, `date_created`) VALUES
( 'Le Van Tot', 'Totlethichbeeg123', 'beeg123', '2023-02-17'),
( 'Mai Ho Sy Dat', 'DatPhit123', 'Phit123', '2023-02-12'),
( 'Dao Thanh Tung', 'Tungsmile999', 'Smile666', '2023-01-9'),
( 'Nguyen Van Toan', 'Toanbdsm123', 'bdsm123', '2023-06-20'),
( 'Ha Manh Hung', 'Hungsexgay123', 'gay123', '2023-06-11'),
( 'Nguyen Quoc Trieu', 'million123', 'trieu123', '2023-04-20')
;


INSERT INTO `movie`.`director` (`name_director`, `image_director`) VALUES 
('Yabami Yumeko' , 'https://news-w.com/wp-content/uploads/2022/02/yumeko-4.jpg'),
('Gojo Satoru' , 'https://tiki.vn/blog/wp-content/uploads/2023/03/Satoru_Gojo_thumb.webp'),
('Minami Kotobuki' , 'https://cdn1.forevergeek.com/uploads/33/2023/05/Minami-Kotobuki-Oshi-No-Ko-1653-1140x641.jpg'),
('Mikey' , 'https://thankme.vn/wp-content/uploads/2022/07/110053.jpg'),
('Hanma Shuji' , 'https://i.pinimg.com/originals/b5/e9/fb/b5e9fb6eb87b915414236548d4e451d7.jpg'),
('Ryuguji Ken' , 'https://static.wikia.nocookie.net/tokyo-revengers/images/6/65/Ken_Ryuguji_%28Manga%29.png/revision/latest/scale-to-width-down/350?cb=20220411113838')
;
INSERT INTO `movie`.`genre` (`name_genre`) VALUES
( '18+'),
('Horror'),
('Romance'),
('Anime'),
('Action'),
('Documentary');






