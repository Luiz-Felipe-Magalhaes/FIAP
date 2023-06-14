-- Gerado por Oracle SQL Developer Data Modeler 22.2.0.165.1149
--   em:        2023-05-29 13:30:58 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE t_categoria (
    cod_categoria         VARCHAR2(10) NOT NULL,
    t_usuario_cod_usuario VARCHAR2(10) NOT NULL,
    nom_categoria         VARCHAR2(30) NOT NULL,
    des_cor               VARCHAR2(10) NOT NULL
);

ALTER TABLE t_categoria ADD CONSTRAINT t_categoria_pk PRIMARY KEY ( cod_categoria );

CREATE TABLE t_conta (
    cod_conta             VARCHAR2(10) NOT NULL,
    t_usuario_cod_usuario VARCHAR2(10) NOT NULL,
    val_saldo             NUMBER(10, 2) NOT NULL,
    nom_conta             VARCHAR2(30) NOT NULL
);

ALTER TABLE t_conta ADD CONSTRAINT t_conta_pk PRIMARY KEY ( cod_conta );

CREATE TABLE t_meta (
    cod_meta              VARCHAR2(10) NOT NULL,
    t_usuario_cod_usuario VARCHAR2(10) NOT NULL,
    des_meta              VARCHAR2(50) NOT NULL,
    val_meta              NUMBER(10, 2) NOT NULL,
    dat_inicio            DATE NOT NULL,
    dat_termino           DATE NOT NULL
);

ALTER TABLE t_meta ADD CONSTRAINT t_meta_pk PRIMARY KEY ( cod_meta );

CREATE TABLE t_transacao (
    cod_transacao             VARCHAR2(20) NOT NULL,
    t_conta_cod_conta         VARCHAR2(10) NOT NULL,
    t_categoria_cod_categoria VARCHAR2(10) NOT NULL,
    ind_tipo_transacao        CHAR(1) NOT NULL,
    val_transacao             NUMBER(10, 2) NOT NULL,
    idt_consolidada           CHAR(1) NOT NULL,
    dat_transacao             DATE NOT NULL,
    des_transacao             VARCHAR2(256),
    num_parcela_inicio        INTEGER,
    num_parcela_fim           INTEGER
);

ALTER TABLE t_transacao ADD CONSTRAINT t_transacao_pk PRIMARY KEY ( cod_transacao );

CREATE TABLE t_usuario (
    cod_usuario VARCHAR2(10) NOT NULL,
    nom_usuario VARCHAR2(100) NOT NULL,
    des_email   VARCHAR2(256) NOT NULL,
    des_senha   VARCHAR2(256) NOT NULL
);

ALTER TABLE t_usuario ADD CONSTRAINT t_usuario_pk PRIMARY KEY ( cod_usuario );

ALTER TABLE t_categoria
    ADD CONSTRAINT t_categoria_t_usuario_fk FOREIGN KEY ( t_usuario_cod_usuario )
        REFERENCES t_usuario ( cod_usuario );

ALTER TABLE t_conta
    ADD CONSTRAINT t_conta_t_usuario_fk FOREIGN KEY ( t_usuario_cod_usuario )
        REFERENCES t_usuario ( cod_usuario );

ALTER TABLE t_meta
    ADD CONSTRAINT t_meta_t_usuario_fk FOREIGN KEY ( t_usuario_cod_usuario )
        REFERENCES t_usuario ( cod_usuario );

ALTER TABLE t_transacao
    ADD CONSTRAINT t_transacao_t_categoria_fk FOREIGN KEY ( t_categoria_cod_categoria )
        REFERENCES t_categoria ( cod_categoria );

ALTER TABLE t_transacao
    ADD CONSTRAINT t_transacao_t_conta_fk FOREIGN KEY ( t_conta_cod_conta )
        REFERENCES t_conta ( cod_conta );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             0
-- ALTER TABLE                             10
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
