ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Curso foreign key(idCurso) references curso(idCurso);
ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Cidade foreign key(idCidade) references cidade(idCidade);

insert into Curso(nomecurso) values ('Administração');
insert into Curso(nomecurso) values ('Marketing');
insert into Curso(nomecurso) values ('Desenvolvimento de Sistemas');
insert into Curso(nomecurso) values ('Quimica');
insert into Curso(nomecurso) values ('Contabilidade');
insert into Curso(nomecurso) values ('Logistica');
insert into Curso(nomecurso) values ('Edificações');
insert into Curso(nomecurso) values ('Farmacia');

insert into Cidade(nomecidade, uf) values ('Teresina', 'PI');
insert into Cidade(nomecidade, uf) values ('Campo Grande', 'MS');
insert into Cidade(nomecidade, uf) values ('Rio Branco', 'AC');
insert into Cidade(nomecidade, uf) values ('Fortaleza', 'CE');
insert into Cidade(nomecidade, uf) values ('São Paulo', 'SP');
insert into Cidade(nomecidade, uf) values ('Curitiba', 'PR');
insert into Cidade(nomecidade, uf) values ('Rio de Janeiro', 'RJ');
insert into Cidade(nomecidade, uf) values ('Lençóis Paulista', 'SP');

insert into Aluno(nomealuno, idcurso, idcidade) values ('Matheus', 2, 4);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Vinicius', 3, 3);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Pedro', 3, 2);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Graziela', 5, 4);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Derek', 4, 1);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Victor', 6, 5);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Francis', 2, 7);
insert into Aluno(nomealuno, idcurso, idcidade) values ('Isabela', 1, 8);
