Create Table Aluno(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nomeAluno varchar(50),
    idCurso int not null,
    idCidade int not null
);

ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Curso foreign key(idCurso) references curso(idCurso);
ALTER TABLE Aluno add CONSTRAINT FK_Aluno_Cidade foreign key(idCidade) references cidade(idCidade);

insert into Aluno(nomeAluno, idCurso, idCidade) values ('Matheus', 2, 4);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Vinicius', 3, 3);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Pedro', 3, 2);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Graziela', 5, 4);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Derek', 4, 1);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Victor', 6, 5);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Francis', 2, 7);
insert into Aluno(nomeAluno, idCurso, idCidade) values ('Isabela', 1, 8);