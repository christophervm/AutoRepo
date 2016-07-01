CREATE DATABASE BDIntiTours
GO

USE  BDIntiTours
GO


CREATE TABLE TBUsuario
(CodUsuario varchar(50)primary key,
 Clave varchar(50)not null
)
GO

CREATE TABLE TBMarca
(CodMarca int identity not null primary key,
 Descripcion_Marca varchar(50)not null
)
GO

CREATE TABLE TBModelo
(CodModelo int identity not null primary key,
 CodMarca int not null,
 Descripcion varchar(50)not null,
 foreign key (CodMarca) references TBMarca
)
GO

CREATE TABLE TBEmpleado
(CodEmpleado char(5)not null primary key,
 Nombre varchar(50)not null,
 Apellidos varchar(50)not null,
 DNI varchar(8)not null,
 Sueldo money not null,
 CodUsuario varchar(50) unique,
 foreign key (CodUsuario) references TBUsuario
)
GO

CREATE TABLE TBCliente
(CodCliente int identity not null primary key,
 Nombre varchar(50)not null,
 Apellidos varchar(50)not null,
 DNI varchar(8)null,
 NroBrevete varchar(8)not null,
 NroCarnetExtranjeria varchar(8)null,
 CodUsuario varchar(50) unique,
 foreign key (CodUsuario) references TBUsuario
)
GO
CREATE TABLE TBAuto
(Placa char(7)not null primary key,
 CodModelo int not null,
 Nombre varchar(50),
 Precio money not null,
 Estado varchar(50)not null
 foreign key (CodModelo) references TBModelo
)
GO
CREATE TABLE TBAlquiler
(CodAlquiler int identity not null primary key,
 FechaIncio datetime null,
 FechaEntrega datetime null,
 CodCliente int not null,
 Placa char(7) not null,
 foreign key (CodCliente) references TBCliente,
 foreign key (Placa) references TBAuto
)
GO
CREATE TABLE TBReserva
(CodReserva int identity not null primary key,
 FechaReserva datetime not null,
 FechaLimite datetime not null,
 CodCliente int not null,
 Placa char(7) not null,
 Estado varchar(50),
 foreign key (CodCliente) references TBCliente,
 foreign key (Placa) references TBAuto
)
GO

create procedure sp_RegiEntrega
@pl char(7),
@codalqu int
as
begin
update TBAlquiler set FechaEntrega =GETDATE() where @pl = Placa and @codalqu = CodAlquiler;
update TBAuto set Estado='DISPONIBLE' where @pl = Placa
end
go

create procedure sp_RegiAlquiler
@codcli int,
@placa char(7)
as
begin
insert into TBAlquiler values (GETDATE(),null,@codcli,@placa)
update TBAuto set Estado = 'NO DISPONIBLE' where @placa = Placa
end
go

create procedure sp_RegReserva
@pl char(7),
@fecr datetime,
@ccli int
as
begin
insert into TBReserva values(@fecr,DATEADD(dd,7,@fecr),@ccli,@pl,'NO ALQUILADO')
update TBAuto set Estado='NO DISPONIBLE' where @pl = Placa
end
go

create proc sp_AReserva
@ccli int = null,
@placa char(7) = null,
@codres int
as
begin
set @ccli = (select CodCliente from TBReserva where CodReserva  = @codres)
set @placa = (select Placa from TBReserva where CodReserva  = @codres)
insert into TBAlquiler values(getdate(),null,@ccli,@placa)
update TBReserva set Estado = 'ALQUILADO' where CodReserva = @codres 
end


INSERT INTO TBUsuario VALUES('User01','123')
INSERT INTO TBUsuario VALUES('User02','456')
INSERT INTO TBUsuario VALUES('User03','789')
INSERT INTO TBUsuario VALUES('User04','1234')
INSERT INTO TBUsuario VALUES('User05','4567')
INSERT INTO TBUsuario VALUES('User06','7891')
INSERT INTO TBUsuario VALUES('User07','12345')
INSERT INTO TBUsuario VALUES('User08','45678')
INSERT INTO TBUsuario VALUES('User09','78912')
INSERT INTO TBUsuario VALUES('User10','123456')
INSERT INTO TBUsuario VALUES('User11','456789')
INSERT INTO TBUsuario VALUES('User12','789123')
INSERT INTO TBUsuario VALUES('User13','1234567')
INSERT INTO TBUsuario VALUES('User14','4567891')
INSERT INTO TBUsuario VALUES('User15','7891234')
INSERT INTO TBUsuario VALUES('User16','12345678')
INSERT INTO TBUsuario VALUES('User17','45678912')
INSERT INTO TBUsuario VALUES('User18','78912345')
INSERT INTO TBUsuario VALUES('User19','123456789')
INSERT INTO TBUsuario VALUES('User20','456789123')

INSERT INTO TBCliente VALUES('Raul','Perez Luna','12234567','BREV156','','User01')
INSERT INTO TBCliente VALUES('Piero','Suñiga Paredes','12334567','BREV157','','User02')
INSERT INTO TBCliente VALUES('Jimena','Solayo Mesa','12344567','BREV158','','User03')
INSERT INTO TBCliente VALUES('Sara','Almonte Alvarado','12345567','BREV159','','User04')
INSERT INTO TBCliente VALUES('Anibal','Virrueta Palos','12345667','BREV160','','User05')
INSERT INTO TBCliente VALUES('Roberto','Nuñez Peña','12345677','BREV161','','User06')
INSERT INTO TBCliente VALUES('Sandra','Peñares Olivera','11234567','BREV162','','User07')
INSERT INTO TBCliente VALUES('Mariela','Olivar Mejia','12223456','BREV163','','User08')
INSERT INTO TBCliente VALUES('Paola','Puente Caceres','12233456','BREV164','','User09')
INSERT INTO TBCliente VALUES('Juan','Luque Laines','12234456','BREV165','','User10')

INSERT INTO TBEmpleado VALUES('REC01','Sofia','Laqui','76543221',1000,'User11')
INSERT INTO TBEmpleado VALUES('REC02','Miguel','Molina','76543321',785,'User12')
INSERT INTO TBEmpleado VALUES('REC03','Pamela' ,'Montes','76544321',820,'User13')
INSERT INTO TBEmpleado VALUES('REC04','Angel',' Morales','76554321',750,'User14')
INSERT INTO TBEmpleado VALUES('REC05','Javier',' Losa','76654321',750,'User15')
INSERT INTO TBEmpleado VALUES('REC06','Tomas',' Campos','77654321',820,'User16')
INSERT INTO TBEmpleado VALUES('REC07','Oliver',' Porras','65432221',820,'User17')
INSERT INTO TBEmpleado VALUES('REC08','Omar',' Condori','65433221',1500,'User18')
INSERT INTO TBEmpleado VALUES('REC09','Margarita',' Juarez','65443221',1520,'User19')
INSERT INTO TBEmpleado VALUES('REC10','Jaime',' Zoraida','65543221',1400,'User20')



INSERT INTO TBMarca VALUES('Toyota')
INSERT INTO TBMarca VALUES('Chevrolet')
INSERT INTO TBMarca VALUES('Honda')
INSERT INTO TBMarca VALUES('Hyundai')
INSERT INTO TBMarca VALUES('Kia')
INSERT INTO TBMarca VALUES('Mitsubishi')
INSERT INTO TBMarca VALUES('Nissan')
INSERT INTO TBMarca VALUES('Suzuki')
INSERT INTO TBMarca VALUES('Subaru')
INSERT INTO TBMarca VALUES('Cadillac')
INSERT INTO TBMarca VALUES('Morgan')
INSERT INTO TBMarca VALUES('Mercedes')
INSERT INTO TBMarca VALUES('Mazda')
INSERT INTO TBMarca VALUES('Mahindra')
INSERT INTO TBMarca VALUES('Lexus')
INSERT INTO TBMarca VALUES('Lada')
INSERT INTO TBMarca VALUES('Maserati')
INSERT INTO TBMarca VALUES('Isuzu')
INSERT INTO TBMarca VALUES('Tesla')
INSERT INTO TBMarca VALUES('Bugatti')
INSERT INTO TBMarca VALUES('Rolls-Royce')

INSERT INTO TBModelo VALUES('1','Corola')
INSERT INTO TBModelo VALUES('1','Yaris')
INSERT INTO TBModelo VALUES('1','Verso')
INSERT INTO TBModelo VALUES('2','Spark GT')
INSERT INTO TBModelo VALUES('2','Sail Sendán Classic')
INSERT INTO TBModelo VALUES('2','Sail Sendán')
INSERT INTO TBModelo VALUES('2','Sonic')
INSERT INTO TBModelo VALUES('2','Cruze')
INSERT INTO TBModelo VALUES('2','Malibu')
INSERT INTO TBModelo VALUES('4','Accent')
INSERT INTO TBModelo VALUES('4','Accent Hatchback')
INSERT INTO TBModelo VALUES('4','Eon')
INSERT INTO TBModelo VALUES('4','Sonata Hibrido')
INSERT INTO TBModelo VALUES('5','Rio')
INSERT INTO TBModelo VALUES('5','Optima')
INSERT INTO TBModelo VALUES('5','Sorento')
INSERT INTO TBModelo VALUES('5','Venga')
INSERT INTO TBModelo VALUES('8','Celerio')
INSERT INTO TBModelo VALUES('8','Swift')
INSERT INTO TBModelo VALUES('8','Swift Sport')


INSERT INTO TBAuto VALUES('GR5-YTV','1','5 Personas','250','DISPONIBLE')
INSERT INTO TBAuto VALUES('JK4-YHW','2','8 Personas','240','DISPONIBLE')
INSERT INTO TBAuto VALUES('PL3-FFW','3','4 Personas','225','DISPONIBLE')
INSERT INTO TBAuto VALUES('YT2-YJK','4','2 Personas','245','DISPONIBLE')
INSERT INTO TBAuto VALUES('SZ1-POJ','5','4 Personas','258','DISPONIBLE')
INSERT INTO TBAuto VALUES('KB6-ERV','6','4 Personas','264','DISPONIBLE')
INSERT INTO TBAuto VALUES('CB7-UJM','7','5 Personas','213','DISPONIBLE')
INSERT INTO TBAuto VALUES('IT8-VLP','8','6 Personas','210','DISPONIBLE')
INSERT INTO TBAuto VALUES('MX9-YTW','9','12 Personas','317','DISPONIBLE')
INSERT INTO TBAuto VALUES('QR5-YTW','10','10 Personas','223','DISPONIBLE')
INSERT INTO TBAuto VALUES('GR5-YTX','1','4 Personas','250','DISPONIBLE')

