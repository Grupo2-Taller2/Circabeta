BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "misiones" (
	"id"	INTEGER,
	"titulo"	TEXT NOT NULL,
	"descripcion"	TEXT,
	"objetivo"	TEXT,
	"completada"	BOOLEAN,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "secuaces" (
	"id"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"habilidad"	TEXT NOT NULL,
	"peligrosidad"	INTEGER NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "carmen_sandiego" (
	"id"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"localidad"	TEXT NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "errores" (
	"id"	INTEGER,
	"mensaje"	TEXT,
	"timestamp"	DATETIME DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("id")
);
CREATE TABLE IF NOT EXISTS "localidades" (
	"id"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"descripcion"	TEXT NOT NULL,
	"latitud"	REAL NOT NULL,
	"longitud"	REAL NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "pistas" (
	"id"	INTEGER,
	"localidad"	TEXT NOT NULL,
	"numero"	TEXT NOT NULL,
	"descripcion"	TEXT NOT NULL,
	"esCorrecta"	INTEGER NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "usuarios" (
	"id"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"apellido"	TEXT NOT NULL,
	"contrasena"	TEXT NOT NULL,
	"rango"	TEXT NOT NULL DEFAULT 'DETECTIVE JUNIOR',
	"capturas"	INTEGER DEFAULT 0,
	"progreso"	TEXT DEFAULT '',
	UNIQUE("nombre","apellido"),
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "detectives" (
	"id"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"apellido"	TEXT NOT NULL,
	"contrasena"	TEXT NOT NULL,
	"rango"	TEXT NOT NULL DEFAULT 'DETECTIVE JUNIOR',
	"capturas"	INTEGER DEFAULT 0,
	UNIQUE("nombre","apellido"),
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "misiones" VALUES (1,'Capturar a Betosecreto','Captura al secuaz Betosecreto en Montevideo','Betosecreto',0);
INSERT INTO "secuaces" VALUES (1,'Secuaz Actualizado','Nueva Habilidad',3);
INSERT INTO "secuaces" VALUES (2,'Secuaz 1','Habilidad 1',1);
INSERT INTO "secuaces" VALUES (3,'Secuaz 2','Habilidad 2',2);
INSERT INTO "secuaces" VALUES (4,'Secuaz 1','Habilidad 1',1);
INSERT INTO "secuaces" VALUES (5,'Secuaz 2','Habilidad 2',2);
INSERT INTO "secuaces" VALUES (6,'MOONabomber','Experto en explosivos',4);
INSERT INTO "secuaces" VALUES (7,'EllaBella','Experta en estafas',3);
INSERT INTO "secuaces" VALUES (8,'Mindy Ana Son','Experta en piedras preciosas y arte',5);
INSERT INTO "secuaces" VALUES (9,'Betosecreto','Entrenado en artes Ninjas',6);
INSERT INTO "secuaces" VALUES (10,'MOONabomber','Experto en explosivos',4);
INSERT INTO "secuaces" VALUES (11,'EllaBella','Experta en estafas',3);
INSERT INTO "secuaces" VALUES (12,'Mindy Ana Son','Experta en piedras preciosas y arte',5);
INSERT INTO "secuaces" VALUES (13,'Betosecreto','Entrenado en artes Ninjas',6);
INSERT INTO "carmen_sandiego" VALUES (1,'Carmen Sandiego','B');
INSERT INTO "carmen_sandiego" VALUES (2,'Carmen Sandiego','A');
INSERT INTO "errores" VALUES (1,'Error de ejemplo','2024-07-10 21:27:34');
INSERT INTO "errores" VALUES (2,'Error de ejemplo','2024-07-10 22:25:42');
INSERT INTO "localidades" VALUES (1,'A','Descripción de A',0.0,0.0);
INSERT INTO "localidades" VALUES (2,'B','Descripción de B',0.0,0.0);
INSERT INTO "localidades" VALUES (3,'C','Descripción de C',0.0,0.0);
INSERT INTO "localidades" VALUES (4,'D','Descripción de D',0.0,0.0);
INSERT INTO "localidades" VALUES (5,'E','Descripción de E',0.0,0.0);
INSERT INTO "localidades" VALUES (6,'F','Descripción de F',0.0,0.0);
INSERT INTO "localidades" VALUES (7,'G','Descripción de G',0.0,0.0);
INSERT INTO "localidades" VALUES (8,'H','Descripción de H',0.0,0.0);
INSERT INTO "localidades" VALUES (9,'I','Descripción de I',0.0,0.0);
INSERT INTO "localidades" VALUES (10,'J','Descripción de J',0.0,0.0);
INSERT INTO "localidades" VALUES (11,'K','Descripción de K',0.0,0.0);
INSERT INTO "localidades" VALUES (12,'L','Descripción de L',0.0,0.0);
INSERT INTO "localidades" VALUES (13,'M','Descripción de M',0.0,0.0);
INSERT INTO "localidades" VALUES (14,'N','Descripción de N',0.0,0.0);
INSERT INTO "localidades" VALUES (15,'O','Descripción de O',0.0,0.0);
INSERT INTO "localidades" VALUES (16,'P','Descripción de P',0.0,0.0);
INSERT INTO "localidades" VALUES (17,'Q','Descripción de Q',0.0,0.0);
INSERT INTO "localidades" VALUES (18,'R','Descripción de R',0.0,0.0);
INSERT INTO "localidades" VALUES (19,'S','Descripción de S',0.0,0.0);
INSERT INTO "localidades" VALUES (20,'T','Descripción de T',0.0,0.0);
INSERT INTO "localidades" VALUES (21,'U','Descripción de U',0.0,0.0);
INSERT INTO "localidades" VALUES (22,'V','Descripción de V',0.0,0.0);
INSERT INTO "localidades" VALUES (23,'W','Descripción de W',0.0,0.0);
INSERT INTO "localidades" VALUES (24,'X','Descripción de X',0.0,0.0);
INSERT INTO "localidades" VALUES (25,'Y','Descripción de Y',0.0,0.0);
INSERT INTO "localidades" VALUES (26,'Z','Descripción de Z',0.0,0.0);
INSERT INTO "localidades" VALUES (27,'AA','Descripción de AA',0.0,0.0);
INSERT INTO "localidades" VALUES (28,'AB','Descripción de AB',0.0,0.0);
INSERT INTO "localidades" VALUES (29,'AC','Descripción de AC',0.0,0.0);
INSERT INTO "localidades" VALUES (30,'AD','Descripción de AD',0.0,0.0);
INSERT INTO "localidades" VALUES (31,'AE','Descripción de AE',0.0,0.0);
INSERT INTO "localidades" VALUES (32,'AF','Descripción de AF',0.0,0.0);
INSERT INTO "localidades" VALUES (33,'AG','Descripción de AG',0.0,0.0);
INSERT INTO "localidades" VALUES (34,'AH','Descripción de AH',0.0,0.0);
INSERT INTO "localidades" VALUES (35,'AI','Descripción de AI',0.0,0.0);
INSERT INTO "localidades" VALUES (36,'AJ','Descripción de AJ',0.0,0.0);
INSERT INTO "localidades" VALUES (37,'AK','Descripción de AK',0.0,0.0);
INSERT INTO "localidades" VALUES (38,'AL','Descripción de AL',0.0,0.0);
INSERT INTO "localidades" VALUES (39,'AM','Descripción de AM',0.0,0.0);
INSERT INTO "localidades" VALUES (40,'AN','Descripción de AN',0.0,0.0);
INSERT INTO "pistas" VALUES (1,'A','1.1','Pista falsa en A 1.1',0);
INSERT INTO "pistas" VALUES (2,'A','1.2','Pista falsa en A 1.2',0);
INSERT INTO "pistas" VALUES (3,'A','1.3','Pista falsa en A 1.3',0);
INSERT INTO "pistas" VALUES (4,'A','1.4','Pista falsa en A 1.4',0);
INSERT INTO "pistas" VALUES (5,'A','1.5','Pista correcta en A 1.5',1);
INSERT INTO "pistas" VALUES (6,'B','2.1','Pista falsa en B 2.1',0);
INSERT INTO "pistas" VALUES (7,'B','2.2','Pista falsa en B 2.2',0);
INSERT INTO "pistas" VALUES (8,'B','2.3','Pista falsa en B 2.3',0);
INSERT INTO "pistas" VALUES (9,'B','2.4','Pista falsa en B 2.4',0);
INSERT INTO "pistas" VALUES (10,'B','2.5','Pista correcta en B 2.5',1);
INSERT INTO "pistas" VALUES (11,'C','3.1','Pista falsa en C 3.1',0);
INSERT INTO "pistas" VALUES (12,'C','3.2','Pista falsa en C 3.2',0);
INSERT INTO "pistas" VALUES (13,'C','3.3','Pista falsa en C 3.3',0);
INSERT INTO "pistas" VALUES (14,'C','3.4','Pista falsa en C 3.4',0);
INSERT INTO "pistas" VALUES (15,'C','3.5','Pista correcta en C 3.5',1);
INSERT INTO "pistas" VALUES (16,'D','4.1','Pista falsa en D 4.1',0);
INSERT INTO "pistas" VALUES (17,'D','4.2','Pista falsa en D 4.2',0);
INSERT INTO "pistas" VALUES (18,'D','4.3','Pista falsa en D 4.3',0);
INSERT INTO "pistas" VALUES (19,'D','4.4','Pista falsa en D 4.4',0);
INSERT INTO "pistas" VALUES (20,'D','4.5','Pista correcta en D 4.5',1);
INSERT INTO "pistas" VALUES (21,'E','5.1','Pista falsa en E 5.1',0);
INSERT INTO "pistas" VALUES (22,'E','5.2','Pista falsa en E 5.2',0);
INSERT INTO "pistas" VALUES (23,'E','5.3','Pista falsa en E 5.3',0);
INSERT INTO "pistas" VALUES (24,'E','5.4','Pista falsa en E 5.4',0);
INSERT INTO "pistas" VALUES (25,'E','5.5','Pista correcta en E 5.5',1);
INSERT INTO "pistas" VALUES (26,'F','6.1','Pista falsa en F 6.1',0);
INSERT INTO "pistas" VALUES (27,'F','6.2','Pista falsa en F 6.2',0);
INSERT INTO "pistas" VALUES (28,'F','6.3','Pista falsa en F 6.3',0);
INSERT INTO "pistas" VALUES (29,'F','6.4','Pista falsa en F 6.4',0);
INSERT INTO "pistas" VALUES (30,'F','6.5','Pista correcta en F 6.5',1);
INSERT INTO "pistas" VALUES (31,'G','7.1','Pista falsa en G 7.1',0);
INSERT INTO "pistas" VALUES (32,'G','7.2','Pista falsa en G 7.2',0);
INSERT INTO "pistas" VALUES (33,'G','7.3','Pista falsa en G 7.3',0);
INSERT INTO "pistas" VALUES (34,'G','7.4','Pista falsa en G 7.4',0);
INSERT INTO "pistas" VALUES (35,'G','7.5','Pista correcta en G 7.5',1);
INSERT INTO "pistas" VALUES (36,'H','8.1','Pista falsa en H 8.1',0);
INSERT INTO "pistas" VALUES (37,'H','8.2','Pista falsa en H 8.2',0);
INSERT INTO "pistas" VALUES (38,'H','8.3','Pista falsa en H 8.3',0);
INSERT INTO "pistas" VALUES (39,'H','8.4','Pista falsa en H 8.4',0);
INSERT INTO "pistas" VALUES (40,'H','8.5','Pista correcta en H 8.5',1);
INSERT INTO "pistas" VALUES (41,'I','9.1','Pista falsa en I 9.1',0);
INSERT INTO "pistas" VALUES (42,'I','9.2','Pista falsa en I 9.2',0);
INSERT INTO "pistas" VALUES (43,'I','9.3','Pista falsa en I 9.3',0);
INSERT INTO "pistas" VALUES (44,'I','9.4','Pista falsa en I 9.4',0);
INSERT INTO "pistas" VALUES (45,'I','9.5','Pista correcta en I 9.5',1);
INSERT INTO "pistas" VALUES (46,'J','10.1','Pista falsa en J 10.1',0);
INSERT INTO "pistas" VALUES (47,'J','10.2','Pista falsa en J 10.2',0);
INSERT INTO "pistas" VALUES (48,'J','10.3','Pista falsa en J 10.3',0);
INSERT INTO "pistas" VALUES (49,'J','10.4','Pista falsa en J 10.4',0);
INSERT INTO "pistas" VALUES (50,'J','10.5','Pista correcta en J 10.5',1);
INSERT INTO "pistas" VALUES (51,'K','11.1','Pista falsa en K 11.1',0);
INSERT INTO "pistas" VALUES (52,'K','11.2','Pista falsa en K 11.2',0);
INSERT INTO "pistas" VALUES (53,'K','11.3','Pista falsa en K 11.3',0);
INSERT INTO "pistas" VALUES (54,'K','11.4','Pista falsa en K 11.4',0);
INSERT INTO "pistas" VALUES (55,'K','11.5','Pista correcta en K 11.5',1);
INSERT INTO "pistas" VALUES (56,'L','12.1','Pista falsa en L 12.1',0);
INSERT INTO "pistas" VALUES (57,'L','12.2','Pista falsa en L 12.2',0);
INSERT INTO "pistas" VALUES (58,'L','12.3','Pista falsa en L 12.3',0);
INSERT INTO "pistas" VALUES (59,'L','12.4','Pista falsa en L 12.4',0);
INSERT INTO "pistas" VALUES (60,'L','12.5','Pista correcta en L 12.5',1);
INSERT INTO "pistas" VALUES (61,'M','13.1','Pista falsa en M 13.1',0);
INSERT INTO "pistas" VALUES (62,'M','13.2','Pista falsa en M 13.2',0);
INSERT INTO "pistas" VALUES (63,'M','13.3','Pista falsa en M 13.3',0);
INSERT INTO "pistas" VALUES (64,'M','13.4','Pista falsa en M 13.4',0);
INSERT INTO "pistas" VALUES (65,'M','13.5','Pista correcta en M 13.5',1);
INSERT INTO "pistas" VALUES (66,'N','14.1','Pista falsa en N 14.1',0);
INSERT INTO "pistas" VALUES (67,'N','14.2','Pista falsa en N 14.2',0);
INSERT INTO "pistas" VALUES (68,'N','14.3','Pista falsa en N 14.3',0);
INSERT INTO "pistas" VALUES (69,'N','14.4','Pista falsa en N 14.4',0);
INSERT INTO "pistas" VALUES (70,'N','14.5','Pista correcta en N 14.5',1);
INSERT INTO "pistas" VALUES (71,'O','15.1','Pista falsa en O 15.1',0);
INSERT INTO "pistas" VALUES (72,'O','15.2','Pista falsa en O 15.2',0);
INSERT INTO "pistas" VALUES (73,'O','15.3','Pista falsa en O 15.3',0);
INSERT INTO "pistas" VALUES (74,'O','15.4','Pista falsa en O 15.4',0);
INSERT INTO "pistas" VALUES (75,'O','15.5','Pista correcta en O 15.5',1);
INSERT INTO "pistas" VALUES (76,'P','16.1','Pista falsa en P 16.1',0);
INSERT INTO "pistas" VALUES (77,'P','16.2','Pista falsa en P 16.2',0);
INSERT INTO "pistas" VALUES (78,'P','16.3','Pista falsa en P 16.3',0);
INSERT INTO "pistas" VALUES (79,'P','16.4','Pista falsa en P 16.4',0);
INSERT INTO "pistas" VALUES (80,'P','16.5','Pista correcta en P 16.5',1);
INSERT INTO "pistas" VALUES (81,'Q','17.1','Pista falsa en Q 17.1',0);
INSERT INTO "pistas" VALUES (82,'Q','17.2','Pista falsa en Q 17.2',0);
INSERT INTO "pistas" VALUES (83,'Q','17.3','Pista falsa en Q 17.3',0);
INSERT INTO "pistas" VALUES (84,'Q','17.4','Pista falsa en Q 17.4',0);
INSERT INTO "pistas" VALUES (85,'Q','17.5','Pista correcta en Q 17.5',1);
INSERT INTO "pistas" VALUES (86,'R','18.1','Pista falsa en R 18.1',0);
INSERT INTO "pistas" VALUES (87,'R','18.2','Pista falsa en R 18.2',0);
INSERT INTO "pistas" VALUES (88,'R','18.3','Pista falsa en R 18.3',0);
INSERT INTO "pistas" VALUES (89,'R','18.4','Pista falsa en R 18.4',0);
INSERT INTO "pistas" VALUES (90,'R','18.5','Pista correcta en R 18.5',1);
INSERT INTO "pistas" VALUES (91,'S','19.1','Pista falsa en S 19.1',0);
INSERT INTO "pistas" VALUES (92,'S','19.2','Pista falsa en S 19.2',0);
INSERT INTO "pistas" VALUES (93,'S','19.3','Pista falsa en S 19.3',0);
INSERT INTO "pistas" VALUES (94,'S','19.4','Pista falsa en S 19.4',0);
INSERT INTO "pistas" VALUES (95,'S','19.5','Pista correcta en S 19.5',1);
INSERT INTO "pistas" VALUES (96,'T','20.1','Pista falsa en T 20.1',0);
INSERT INTO "pistas" VALUES (97,'T','20.2','Pista falsa en T 20.2',0);
INSERT INTO "pistas" VALUES (98,'T','20.3','Pista falsa en T 20.3',0);
INSERT INTO "pistas" VALUES (99,'T','20.4','Pista falsa en T 20.4',0);
INSERT INTO "pistas" VALUES (100,'T','20.5','Pista correcta en T 20.5',1);
INSERT INTO "pistas" VALUES (101,'U','21.1','Pista falsa en U 21.1',0);
INSERT INTO "pistas" VALUES (102,'U','21.2','Pista falsa en U 21.2',0);
INSERT INTO "pistas" VALUES (103,'U','21.3','Pista falsa en U 21.3',0);
INSERT INTO "pistas" VALUES (104,'U','21.4','Pista falsa en U 21.4',0);
INSERT INTO "pistas" VALUES (105,'U','21.5','Pista correcta en U 21.5',1);
INSERT INTO "pistas" VALUES (106,'V','22.1','Pista falsa en V 22.1',0);
INSERT INTO "pistas" VALUES (107,'V','22.2','Pista falsa en V 22.2',0);
INSERT INTO "pistas" VALUES (108,'V','22.3','Pista falsa en V 22.3',0);
INSERT INTO "pistas" VALUES (109,'V','22.4','Pista falsa en V 22.4',0);
INSERT INTO "pistas" VALUES (110,'V','22.5','Pista correcta en V 22.5',1);
INSERT INTO "pistas" VALUES (111,'W','23.1','Pista falsa en W 23.1',0);
INSERT INTO "pistas" VALUES (112,'W','23.2','Pista falsa en W 23.2',0);
INSERT INTO "pistas" VALUES (113,'W','23.3','Pista falsa en W 23.3',0);
INSERT INTO "pistas" VALUES (114,'W','23.4','Pista falsa en W 23.4',0);
INSERT INTO "pistas" VALUES (115,'W','23.5','Pista correcta en W 23.5',1);
INSERT INTO "pistas" VALUES (116,'X','24.1','Pista falsa en X 24.1',0);
INSERT INTO "pistas" VALUES (117,'X','24.2','Pista falsa en X 24.2',0);
INSERT INTO "pistas" VALUES (118,'X','24.3','Pista falsa en X 24.3',0);
INSERT INTO "pistas" VALUES (119,'X','24.4','Pista falsa en X 24.4',0);
INSERT INTO "pistas" VALUES (120,'X','24.5','Pista correcta en X 24.5',1);
INSERT INTO "pistas" VALUES (121,'Y','25.1','Pista falsa en Y 25.1',0);
INSERT INTO "pistas" VALUES (122,'Y','25.2','Pista falsa en Y 25.2',0);
INSERT INTO "pistas" VALUES (123,'Y','25.3','Pista falsa en Y 25.3',0);
INSERT INTO "pistas" VALUES (124,'Y','25.4','Pista falsa en Y 25.4',0);
INSERT INTO "pistas" VALUES (125,'Y','25.5','Pista correcta en Y 25.5',1);
INSERT INTO "pistas" VALUES (126,'Z','26.1','Pista falsa en Z 26.1',0);
INSERT INTO "pistas" VALUES (127,'Z','26.2','Pista falsa en Z 26.2',0);
INSERT INTO "pistas" VALUES (128,'Z','26.3','Pista falsa en Z 26.3',0);
INSERT INTO "pistas" VALUES (129,'Z','26.4','Pista falsa en Z 26.4',0);
INSERT INTO "pistas" VALUES (130,'Z','26.5','Pista correcta en Z 26.5',1);
INSERT INTO "pistas" VALUES (131,'AA','27.1','Pista falsa en AA 27.1',0);
INSERT INTO "pistas" VALUES (132,'AA','27.2','Pista falsa en AA 27.2',0);
INSERT INTO "pistas" VALUES (133,'AA','27.3','Pista falsa en AA 27.3',0);
INSERT INTO "pistas" VALUES (134,'AA','27.4','Pista falsa en AA 27.4',0);
INSERT INTO "pistas" VALUES (135,'AA','27.5','Pista correcta en AA 27.5',1);
INSERT INTO "pistas" VALUES (136,'AB','28.1','Pista falsa en AB 28.1',0);
INSERT INTO "pistas" VALUES (137,'AB','28.2','Pista falsa en AB 28.2',0);
INSERT INTO "pistas" VALUES (138,'AB','28.3','Pista falsa en AB 28.3',0);
INSERT INTO "pistas" VALUES (139,'AB','28.4','Pista falsa en AB 28.4',0);
INSERT INTO "pistas" VALUES (140,'AB','28.5','Pista correcta en AB 28.5',1);
INSERT INTO "pistas" VALUES (141,'AC','29.1','Pista falsa en AC 29.1',0);
INSERT INTO "pistas" VALUES (142,'AC','29.2','Pista falsa en AC 29.2',0);
INSERT INTO "pistas" VALUES (143,'AC','29.3','Pista falsa en AC 29.3',0);
INSERT INTO "pistas" VALUES (144,'AC','29.4','Pista falsa en AC 29.4',0);
INSERT INTO "pistas" VALUES (145,'AC','29.5','Pista correcta en AC 29.5',1);
INSERT INTO "pistas" VALUES (146,'AD','30.1','Pista falsa en AD 30.1',0);
INSERT INTO "pistas" VALUES (147,'AD','30.2','Pista falsa en AD 30.2',0);
INSERT INTO "pistas" VALUES (148,'AD','30.3','Pista falsa en AD 30.3',0);
INSERT INTO "pistas" VALUES (149,'AD','30.4','Pista falsa en AD 30.4',0);
INSERT INTO "pistas" VALUES (150,'AD','30.5','Pista correcta en AD 30.5',1);
INSERT INTO "pistas" VALUES (151,'AE','31.1','Pista falsa en AE 31.1',0);
INSERT INTO "pistas" VALUES (152,'AE','31.2','Pista falsa en AE 31.2',0);
INSERT INTO "pistas" VALUES (153,'AE','31.3','Pista falsa en AE 31.3',0);
INSERT INTO "pistas" VALUES (154,'AE','31.4','Pista falsa en AE 31.4',0);
INSERT INTO "pistas" VALUES (155,'AE','31.5','Pista correcta en AE 31.5',1);
INSERT INTO "pistas" VALUES (156,'AF','32.1','Pista falsa en AF 32.1',0);
INSERT INTO "pistas" VALUES (157,'AF','32.2','Pista falsa en AF 32.2',0);
INSERT INTO "pistas" VALUES (158,'AF','32.3','Pista falsa en AF 32.3',0);
INSERT INTO "pistas" VALUES (159,'AF','32.4','Pista falsa en AF 32.4',0);
INSERT INTO "pistas" VALUES (160,'AF','32.5','Pista correcta en AF 32.5',1);
INSERT INTO "pistas" VALUES (161,'AG','33.1','Pista falsa en AG 33.1',0);
INSERT INTO "pistas" VALUES (162,'AG','33.2','Pista falsa en AG 33.2',0);
INSERT INTO "pistas" VALUES (163,'AG','33.3','Pista falsa en AG 33.3',0);
INSERT INTO "pistas" VALUES (164,'AG','33.4','Pista falsa en AG 33.4',0);
INSERT INTO "pistas" VALUES (165,'AG','33.5','Pista correcta en AG 33.5',1);
INSERT INTO "pistas" VALUES (166,'AH','34.1','Pista falsa en AH 34.1',0);
INSERT INTO "pistas" VALUES (167,'AH','34.2','Pista falsa en AH 34.2',0);
INSERT INTO "pistas" VALUES (168,'AH','34.3','Pista falsa en AH 34.3',0);
INSERT INTO "pistas" VALUES (169,'AH','34.4','Pista falsa en AH 34.4',0);
INSERT INTO "pistas" VALUES (170,'AH','34.5','Pista correcta en AH 34.5',1);
INSERT INTO "pistas" VALUES (171,'AI','35.1','Pista falsa en AI 35.1',0);
INSERT INTO "pistas" VALUES (172,'AI','35.2','Pista falsa en AI 35.2',0);
INSERT INTO "pistas" VALUES (173,'AI','35.3','Pista falsa en AI 35.3',0);
INSERT INTO "pistas" VALUES (174,'AI','35.4','Pista falsa en AI 35.4',0);
INSERT INTO "pistas" VALUES (175,'AI','35.5','Pista correcta en AI 35.5',1);
INSERT INTO "pistas" VALUES (176,'AJ','36.1','Pista falsa en AJ 36.1',0);
INSERT INTO "pistas" VALUES (177,'AJ','36.2','Pista falsa en AJ 36.2',0);
INSERT INTO "pistas" VALUES (178,'AJ','36.3','Pista falsa en AJ 36.3',0);
INSERT INTO "pistas" VALUES (179,'AJ','36.4','Pista falsa en AJ 36.4',0);
INSERT INTO "pistas" VALUES (180,'AJ','36.5','Pista correcta en AJ 36.5',1);
INSERT INTO "pistas" VALUES (181,'AK','37.1','Pista falsa en AK 37.1',0);
INSERT INTO "pistas" VALUES (182,'AK','37.2','Pista falsa en AK 37.2',0);
INSERT INTO "pistas" VALUES (183,'AK','37.3','Pista falsa en AK 37.3',0);
INSERT INTO "pistas" VALUES (184,'AK','37.4','Pista falsa en AK 37.4',0);
INSERT INTO "pistas" VALUES (185,'AK','37.5','Pista correcta en AK 37.5',1);
INSERT INTO "pistas" VALUES (186,'AL','38.1','Pista falsa en AL 38.1',0);
INSERT INTO "pistas" VALUES (187,'AL','38.2','Pista falsa en AL 38.2',0);
INSERT INTO "pistas" VALUES (188,'AL','38.3','Pista falsa en AL 38.3',0);
INSERT INTO "pistas" VALUES (189,'AL','38.4','Pista falsa en AL 38.4',0);
INSERT INTO "pistas" VALUES (190,'AL','38.5','Pista correcta en AL 38.5',1);
INSERT INTO "pistas" VALUES (191,'AM','39.1','Pista falsa en AM 39.1',0);
INSERT INTO "pistas" VALUES (192,'AM','39.2','Pista falsa en AM 39.2',0);
INSERT INTO "pistas" VALUES (193,'AM','39.3','Pista falsa en AM 39.3',0);
INSERT INTO "pistas" VALUES (194,'AM','39.4','Pista falsa en AM 39.4',0);
INSERT INTO "pistas" VALUES (195,'AM','39.5','Pista correcta en AM 39.5',1);
INSERT INTO "pistas" VALUES (196,'AN','40.1','Pista falsa en AN 40.1',0);
INSERT INTO "pistas" VALUES (197,'AN','40.2','Pista falsa en AN 40.2',0);
INSERT INTO "pistas" VALUES (198,'AN','40.3','Pista falsa en AN 40.3',0);
INSERT INTO "pistas" VALUES (199,'AN','40.4','Pista falsa en AN 40.4',0);
INSERT INTO "pistas" VALUES (200,'AN','40.5','Pista correcta en AN 40.5',1);
COMMIT;
