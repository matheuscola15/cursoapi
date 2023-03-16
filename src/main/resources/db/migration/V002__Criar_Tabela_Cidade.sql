Create Table Cidade(
    idCidade int not null auto_increment primary key,
    nomeCidade varchar(50),
    uf varchar(50)
);

insert into Cidade(nomeCidade, uf) values ('Teresina', 'PI');
insert into Cidade(nomeCidade, uf) values ('Campo Grande', 'MS');
insert into Cidade(nomeCidade, uf) values ('Rio Branco', 'AC');
insert into Cidade(nomeCidade, uf) values ('Fortaleza', 'CE');
insert into Cidade(nomeCidade, uf) values ('São Paulo', 'SP');
insert into Cidade(nomeCidade, uf) values ('Curitiba', 'PR');
insert into Cidade(nomeCidade, uf) values ('Rio de Janeiro', 'RJ');
insert into Cidade(nomeCidade, uf) values ('Lençóis Paulista', 'SP');