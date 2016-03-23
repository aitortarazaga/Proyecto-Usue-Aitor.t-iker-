CREATE OR REPLACE PACKAGE paquete_centro
IS 
  TYPE V_CURSOR IS REF CURSOR;
  PROCEDURE visualizar_lista_centro
  (idCentro CENTRO.ID%TYPE,
  V_Us_Curs OUT V_CURSOR);
  
  
PROCEDURE ver_administracion
    (idCentros ADMINISTRACION.IDCENTRO%TYPE,
    pdni ADMINISTRACION.DNI%TYPE,
    V_Us_Curs OUT V_CURSOR);
  
  PROCEDURE ver_logistica
    (idCentros LOGISTICA.IDCENTRO%TYPE,
    pdni LOGISTICA.DNI%TYPE,
    V_Us_Curs OUT V_CURSOR);
END;
    
CREATE OR REPLACE PACKAGE BODY paquete_centro IS
 PROCEDURE ver_administracion
    (idCentros ADMINISTRACION.IDCENTRO%TYPE,
    pdni ADMINISTRACION.DNI%TYPE,
    V_Us_Curs OUT V_CURSOR)
  IS
  BEGIN
    open V_Us_Curs for
      SELECT *
      FROM administracion
      WHERE IDCENTRO = idCentros
      AND dni = pdni;
  END ver_administracion;
  
  PROCEDURE ver_logistica
    (idCentros LOGISTICA.IDCENTRO%TYPE,
    pdni LOGISTICA.DNI%TYPE,
    V_Us_Curs OUT vCursor)
  IS
  BEGIN
    open V_Us_Curs for
      SELECT *
      FROM logistica
      WHERE IDCENTRO = idCentros;
  END ver_logistica;
  
  PROCEDURE visualizar_lista_centro
    (idCentro CENTRO.ID%TYPE,
    V_Us_Curs OUT V_CURSOR)
  IS
  BEGIN
    SELECT *
      FROM CENTRO
      WHERE id = idCentro;
  END visualizar_lista_centro;
END;