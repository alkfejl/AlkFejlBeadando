insert into student (first_name, last_name, neptun) values ('John', 'Wick', 'abcdef1');
insert into student (first_name, last_name, neptun) values ('John', 'Doe', 'abcdef2');
insert into student (first_name, last_name, neptun) values ('Johnathan', 'Apple', 'abcdef3');
insert into student (first_name, last_name, neptun) values ('Bob', null, 'abcdef4');
insert into student (first_name, last_name, neptun) values ('Ian', 'Thorne', 'abcdef5');

insert into user (email, password, role) values ('admin@email.hu', 'admin', 'admin');
insert into user (email, password, role) values ('club1@email.hu', 'club1', 'club_master');
insert into user (email, password, role) values ('club2@email.hu', 'club1', 'club_master');
insert into user (email, password, role) values ('band1@email.hu', 'band1', 'band_master');
insert into user (email, password, role) values ('band2@email.hu', 'band2', 'band_master');

insert into event (clubname, date, firstband, secondband, genre) values ('club1', '2017.11.10', 'band1', 'band2', 'genre1');
insert into event (clubname, date, firstband, secondband, genre) values ('club1', '2017.12.10', 'band3', 'band4', 'genre1');
insert into event (clubname, date, firstband, secondband, genre) values ('club2', '2017.11.13', 'band5', 'band6', 'genre2');
insert into event (clubname, date, firstband, secondband, genre) values ('club3', '2017.11.14', 'band6', 'band8', 'genre3');
insert into event (clubname, date, firstband, secondband, genre) values ('club4', '2017.11.15', 'band9', 'band0', 'genre4');

insert into band (bandname, genre) values ('band1', 'genre1');
insert into band (bandname, genre) values ('band2', 'genre1');
insert into band (bandname, genre) values ('band3', 'genre2');
insert into band (bandname, genre) values ('band4', 'genre2');
insert into band (bandname, genre) values ('band5', 'genre3');
insert into band (bandname, genre) values ('band6', 'genre3');

insert into club (clubname, genre) values ('club1', 'genre3');
insert into club (clubname, genre) values ('club2', 'genre3');
insert into club (clubname, genre) values ('club3', 'genre2');
insert into club (clubname, genre) values ('club4', 'genre2');
insert into club (clubname, genre) values ('club5', 'genre1');
insert into club (clubname, genre) values ('club6', 'genre1');