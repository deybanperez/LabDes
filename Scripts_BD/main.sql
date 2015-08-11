﻿
DROP TABLESPACE TRANSACCIONAL INCLUDING CONTENTS AND DATAFILES;
CREATE TABLESPACE TRANSACCIONAL DATAFILE 'TRANSACCIONAL.DBF' SIZE 200M;

DROP USER TRANS CASCADE;
CREATE USER TRANS IDENTIFIED BY TRANS123;
ALTER USER TRANS QUOTA UNLIMITED ON TRANSACCIONAL;
ALTER USER TRANS DEFAULT TABLESPACE TRANSACCIONAL;

GRANT ALL PRIVILEGES TO TRANS WITH ADMIN OPTION;

/*
Antes de la ejecución del archivo 'main.sql' debe cambiar las rutas donde se encuentran los archivos
a la ubicación física dentro de su equipo 
*/

CONNECT TRANS/TRANS123;
@'C:/BD/cre_transaccional.sql'
@'C:/BD/insert_transaccional.sql'

COMMIT;