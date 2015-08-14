CREATE TABLE MATERIA_SEMESTRE(
	ID_MATERIA 		NUMBER,
	SEMESTRE       VARCHAR2(7),
	NOMBRE_MATERIA			VARCHAR2(510),
	CANT_PLAZAS_PI    NUMBER,
	CANT_PLAZAS_PII   NUMBER,
	CONSTRAINT MAT_SEM_PK PRIMARY KEY (ID_MATERIA,SEMESTRE)	
);

CREATE TABLE USUARIO(
	CEDULA 	NUMBER,
	PASSWORD 	VARCHAR2(510),
	NOMBRE_USUARIO VARCHAR2(510),
	APELLIDO 	VARCHAR2(510),
	FECHA_NAC 	VARCHAR2(510),
	TIPO_USUARIO 		VARCHAR2(510),
	CORREOE 	VARCHAR2(510),
	CONSTRAINT USER_PK PRIMARY KEY (CEDULA)
);

CREATE TABLE ASPIRANTE(
	CEDULA 	NUMBER,	
	CREDITOSAPR	NUMBER,
	EFICIENCIA	FLOAT,
	CONSTRAINT ASP_FK FOREIGN KEY (CEDULA) REFERENCES USUARIO(CEDULA),
	CONSTRAINT ASP_PK PRIMARY KEY (CEDULA)
);
	
CREATE TABLE PREPARADOR(
	CEDULA 	NUMBER,	
	TIPO_PREPARADOR	NUMBER,
	ID_MATERIA NUMBER,
	SEMESTRE   VARCHAR2(7),
	CONSTRAINT PRE1_FK FOREIGN KEY (ID_MATERIA,SEMESTRE) REFERENCES MATERIA_SEMESTRE(ID_MATERIA,SEMESTRE),
	CONSTRAINT PRE2_FK FOREIGN KEY (CEDULA) REFERENCES USUARIO(CEDULA),
	CONSTRAINT PRE_PK PRIMARY KEY (CEDULA)
);

CREATE TABLE COORDINADOR(
	CEDULA NUMBER,
	ID_MATERIA  NUMBER,
	SEMESTRE   VARCHAR2(7),
	CONSTRAINT COOR1_FK FOREIGN KEY (ID_MATERIA,SEMESTRE) REFERENCES MATERIA_SEMESTRE(ID_MATERIA,SEMESTRE),
	CONSTRAINT COOR2_FK FOREIGN KEY (CEDULA) REFERENCES USUARIO(CEDULA),
	CONSTRAINT COOR_PK PRIMARY KEY (CEDULA,ID_MATERIA,SEMESTRE)
);



CREATE TABLE PLANILLA(
	ID_DOC			VARCHAR2(510),
	EMISOR			VARCHAR2(510),
	DESTINATARIO	VARCHAR2(510),
	URL				VARCHAR2(510),
	CONSTRAINT PLA_PK PRIMARY KEY (ID_DOC)	
);

CREATE SEQUENCE recaudo_seq
  START WITH 1
  INCREMENT BY 1;


CREATE TABLE RECAUDO(
	ID_DOC			VARCHAR2(510),
	EMISOR			VARCHAR2(510),
	DESTINATARIO	VARCHAR2(510),
	FECHA_ENT		VARCHAR2(510),
	URL				VARCHAR2(510),
	CONSTRAINT RE_PK PRIMARY KEY (ID_DOC)	
);


CREATE SEQUENCE solicitud_seq
  START WITH 1
  INCREMENT BY 1;


CREATE TABLE SOLICITUD(
	ID_SOLICITUD	NUMBER,
	CEDULA_EMISOR	NUMBER,
	CEDULA_DESTINATARIO	NUMBER,
	CONTENIDO			VARCHAR2(1000),
	CONSTRAINT SOL_FK1 FOREIGN KEY (CEDULA_EMISOR) REFERENCES USUARIO(CEDULA),
	CONSTRAINT SOL_FK2 FOREIGN KEY (CEDULA_DESTINATARIO) REFERENCES USUARIO(CEDULA),
	CONSTRAINT SOL_PK PRIMARY KEY (ID_SOLICITUD)	
);


CREATE TABLE CONCURSO(
	ID_CONCURSO	NUMBER,
	STATUS VARCHAR2(10),
	ID_MATERIA NUMBER,
	SEMESTRE VARCHAR2(7),
	CEDULA_COORDINADOR NUMBER,
	FECHA_INICIO VARCHAR2(10),
	FECHA_FIN VARCHAR2(10),
	CONSTRAINT CONCURSO_MATERIA_FK FOREIGN KEY (ID_MATERIA,SEMESTRE) REFERENCES MATERIA_SEMESTRE(ID_MATERIA,SEMESTRE),
	CONSTRAINT CONCURSO_COOR_FK FOREIGN KEY (CEDULA_COORDINADOR) REFERENCES USUARIO(CEDULA),
	CONSTRAINT CONCURSO_PK PRIMARY KEY (ID_CONCURSO,CEDULA_COORDINADOR,ID_MATERIA,SEMESTRE)
);

CREATE SEQUENCE concurso_seq
  START WITH 1
  INCREMENT BY 1;
<<<<<<< HEAD
  



=======
>>>>>>> 3dfd7b6e23225e88b6f8e6f1388af1aee8502ae1

CREATE TABLE ASPIRACIONES(
	CODIGO_ASPIRACION NUMBER,
	ID_ASPIRANTE NUMBER,
	ID_CONCURSO NUMBER,
	STATUS VARCHAR2(510),
	SEMESTRE VARCHAR2(7),
	CEDULA_COORDINADOR NUMBER,
	ID_MATERIA NUMBER,
	NOTA NUMBER,
	CONSTRAINT ASPIRACIONES_IDA_FK FOREIGN KEY (ID_ASPIRANTE) REFERENCES ASPIRANTE(CEDULA),
	CONSTRAINT ASPIRACIONES_IDC_FK FOREIGN KEY (ID_CONCURSO,CEDULA_COORDINADOR,ID_MATERIA,SEMESTRE) REFERENCES CONCURSO(ID_CONCURSO,CEDULA_COORDINADOR,ID_MATERIA,SEMESTRE),
	CONSTRAINT ASPIRACIONES_PK PRIMARY KEY (CODIGO_ASPIRACION,ID_ASPIRANTE)
);
