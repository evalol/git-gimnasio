drop table if exists clientes;
create table clientes(
id_cliente int(4) not null primary key auto_increment,
nombre_cliente varchar(50),
apellidos_cliente varchar(50),
dni_cliente varchar(9) unique not null,
telefono_cliente varchar(9),
telefono_movil_cliente varchar(9),
direccion_domicilio_cliente varchar(50),
piso_domicilio_cliente varchar(50),
numero_domicilio_cliente varchar(50),
codigo_postal_cliente int(5),
localidad_cliente varchar(60),
provincia_cliente varchar(60),
fechanacimiento_cliente date not null,
cuentabancaria_cliente varchar(50) not null,
email_cliente varchar(60),
alta_cliente date,
id_tarifa_cliente int(4) references tarifas(id_tarifa),
formapago_cliente varchar(25) not null,
alta_empleado_cliente varchar(60)
);

INSERT INTO clientes (id_cliente, nombre_cliente, apellidos_cliente,dni_cliente,fecha, telefono_cliente,
telefono_movil_cliente, direccion_domicilio_cliente, piso_domicilio_cliente,numero_domicilio_cliente,fecha, 
codigo_postal_cliente, localidad_cliente, provincia_cliente, fechanacimiento_cliente,cuentabancaria_cliente,
email_cliente, alta_cliente, id_tarifa_cliente, formapago_cliente,alta_empleado_cliente) 
VALUES ('NIKON','AF-Nikkor 35mm F2 D',230,'NIKON','2008/12/17', 320);


drop table if exists empleados;
create table empleados(
id_empleado int(4) not null primary key auto_increment,
nombre_empleado varchar(50),
apellidos_empleado varchar(50),
dni_empleado varchar(9) unique not null,
email_empleado varchar(50),
telefono_empleado varchar(9),
movil_empleado varchar(9),
cuenta_bancaria_empleado varchar(50) not null,
fecha_nac_empleado date not null,
fecha_alta_empleado date,
sueldo_mes_empleado int(6),
suplemento_sueldo_empleado int(6),
direccion_empleado varchar(50),
piso_empleado varchar(50),
numero_empleado varchar(50),
codigo_postal_empleado int(5),
localidad_empleado varchar(60),
provincia_empleado varchar(60) 
);

drop table if exists tarifas;
create table tarifas(
id_tarifa int(4) not null primary key auto_increment,
nombre_tarifa varchar(50) not null,
edad_minima_tarifa int(4) not null,
edad_maxima_tarifa int(4) not null,
precio_tarifa int(4) not null
);

drop table if exists actividades;
create table actividades(
id_actividad int(4) not null primary key auto_increment,
nombre_actividad varchar(50),
empleado_encargado_actividad int(4) references empleados (id_empleado),
cuota_precio int(3)
);

drop table if exists horarios_actividades;
create table horarios_actividades(
id_horario int(4) not null primary key key auto_increment,
idactividad_horario int(4) references actividades(id_actividad),
dia_horario varchar(25),
horainicio_horario time,
horafin_horario time
);

drop table if exists actividadestarifas;
create table actividadestarifas(
idactividad_actividadestarifas int(4) references actividades(id_actividad),
idtarifas_actividadestarifas int(4) references tarifas(id_tarifa),
primary key (idactividad_actividadestarifas, idtarifas_actividadestarifas)
);



