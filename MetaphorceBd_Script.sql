create database MetaphorceBd;
use MetaphorceBd;


create table Contract(
	contractType int primary key auto_increment,
    nameContract varchar(50) not null,
	descriptionContract varchar(200) not null
);

insert into Contract (contractType,nameContract ,descriptionContract) values
(default,"Permanent", "is permanent"),
(default,"Fixed-Term", "is Fixed-Term"),
(default,"External", "is external");


create table Employee(
	idEmployee int primary key auto_increment,
    nameEmployee varchar(50) not null,
    lastName varchar(50) not null,
    birthDate date not null,
    email varchar(50) not null,
    cellPhone varchar(20) not null,
    contractType int not null,
    isActive boolean not null,
    foreign key(contractType) references Contract(contractType)
);


select * from Contract;

select * from Employee  where isActive=1;