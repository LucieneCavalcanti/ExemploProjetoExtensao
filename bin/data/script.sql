create database bdProjetoExemplo
use bdProjetoExemplo

create table tbStatus (
id int not null identity primary key,
descricao varchar(100) not null
)
go

select * from tbStatus

insert into tbStatus
values ('1213213')

create table tbusuarios(
cpf int not null primary key,
nome varchar(200) not null,
email varchar(200) not null,
senha varchar(20) not null,
idstatus int not null,
foreign key (idstatus) references tbstatus(id)
)
create table tbclientes(
cpf int not null,
endereco varchar(300) not null,
telefone varchar(30) not null,
foreign key (cpf) references
tbusuarios(cpf)
)