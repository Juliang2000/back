INSERT INTO clientes (identificacion, nombre, direccion, correo) VALUES ('100', 'Cliente 1', 'Direccion 1', 'cliente1@gmail.com');
INSERT INTO clientes (identificacion, nombre, direccion, correo) VALUES ('200', 'Cliente 2', 'Direccion 2', 'cliente2@gmail.com');
INSERT INTO clientes (identificacion, nombre, direccion, correo) VALUES ('300', 'Cliente 3', 'Direccion 3', 'cliente3@gmail.com');
INSERT INTO clientes (identificacion, nombre, direccion, correo) VALUES ('400', 'Cliente 4', 'Direccion 4', 'cliente4@gmail.com');
INSERT INTO clientes (identificacion, nombre, direccion, correo) VALUES ('500', 'Cliente 5', 'Direccion 5', 'cliente5@gmail.com');

INSERT INTO MECANICOS (CORREO, DIRECCION, DOCUMENTO, PRIMER_APELLIDO, PRIMER_NOMBRE, SEGUNDO_APELLIDO, SEGUNDO_NOMBRE, TIPO_DOCUMENTO) VALUES ('julian@prueba.com', 'Calle prueba', '1018', 'Gil', 'Julian', 'Hernandez', 'Gustavo', '1');


INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('100', 'Disco de Frenos', 100000, SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('200', 'Pastilla de Frenos', 200000, SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('300', 'Amortiguadores', 300000, SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('400', 'Embragues', 400000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('500', 'Filtro de Aire', 500000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('600', 'Frenos', 600000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('700', 'Motor', 700000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('800', 'Embrague', 800000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('900', 'Suspencion', 900000,SYSDATE);
INSERT INTO repuestos(codigo,nombre,precio,fecha_creacion) VALUES('1000', 'Llanta', 1000000,SYSDATE);


INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 1);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 2);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 1);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 3);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 2);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 1);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 3);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 4);
INSERT INTO facturas(create_at, cliente_id) VALUES(SYSDATE, 2);

INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id ) VALUES(10, 10000, 1,1);
INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id) VALUES(15, 20000, 2,2);
INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id) VALUES(15, 30000, 3,3);
INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id) VALUES(15, 40000, 4,4);
INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id) VALUES(10, 50000, 5,5);
INSERT INTO items_factura(cantidad, precio, repuesto_id, factura_id) VALUES(10, 60000, 6,6);

