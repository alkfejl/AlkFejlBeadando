insert into band (bandmaster, bandname, genre) values ('bandmaster1', 'band1', 'genre3');
insert into band (bandmaster, bandname, genre) values ('bandmaster2', 'band2', 'genre3');
insert into band (bandmaster, bandname, genre) values ('bandmaster3', 'band3', 'genre2');
insert into band (bandmaster, bandname, genre) values ('bandmaster4', 'band4', 'genre1');
insert into band (bandmaster, bandname, genre) values ('bandmaster5', 'band5', 'genre1');

insert into club (clubmaster, clubname, genre) values ('clubmaster1', 'club5', 'genre1');
insert into club (clubmaster, clubname, genre) values ('clubmaster2', 'club4', 'genre2');
insert into club (clubmaster, clubname, genre) values ('clubmaster3', 'club3', 'genre2');
insert into club (clubmaster, clubname, genre) values ('clubmaster4', 'club2', 'genre3');
insert into club (clubmaster, clubname, genre) values ('clubmaster5', 'club1', 'genre3');

insert into event (bandname, clubname, date) values ('band1', 'club5', '2017.10.30.');
insert into event (bandname, clubname, date) values ('band2', 'club4', '2017.10.30.');
insert into event (bandname, clubname, date) values ('band3', 'club3', '2017.10.30.');
insert into event (bandname, clubname, date) values ('band4', 'club2', '2017.10.30.');
insert into event (bandname, clubname, date) values ('band5', 'club1', '2017.10.30.');

insert into user (username, email, password, role) values ('admin', 'admin@gmail.com', 'admin', 'ADMIN');
insert into user (username, email, password, role) values ('bandmaster1', 'bandmaster1@gmail.com', 'bandmaster1', 'BANDMASTER');
insert into user (username, email, password, role) values ('bandmaster2', 'bandmaster2@gmail.com', 'bandmaster2', 'BANDMASTER');
insert into user (username, email, password, role) values ('clubmaster1', 'clubmaster1@gmail.com', 'clubmaster1', 'CLUBMASTER');
insert into user (username, email, password, role) values ('clubmaster2', 'clubmaster2@gmail.com', 'clubmaster2', 'CLUBMASTER');