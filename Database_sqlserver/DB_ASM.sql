create database DB_ASM
use DB_ASM

create table asm_mskaryawan (
	id_karyawan varchar(5) primary key, 
	nama_karyawan varchar(30), 
	jabatan varchar(30),
	divisi varchar(50)
);
create table asm_msmodul (
	id_modul int identity(1,1) primary key, 
	nama varchar(30),
	kategori_modul varchar(5), 
	versi_modul varchar(10),
	status_modul int
);
create table asm_traksesmodul (
	id_karyawan varchar(5),
	id_modul int, 
	tanggal_akses date,
	jam_login time, 
	status_akses varchar(15),
	primary key (id_karyawan, id_modul),
	foreign key (id_karyawan) references asm_mskaryawan(id_karyawan),
	foreign key (id_modul) references asm_msmodul(id_modul)
); 
