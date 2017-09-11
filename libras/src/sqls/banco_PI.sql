-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.8.2
-- PostgreSQL version: 9.5
-- Project Site: pgmodeler.com.br
-- Model Author: ---


-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: novo_banco_de_dados | type: DATABASE --
-- -- DROP DATABASE IF EXISTS novo_banco_de_dados;
-- CREATE DATABASE novo_banco_de_dados
-- ;
-- -- ddl-end --
-- 

-- object: libras | type: SCHEMA --
-- DROP SCHEMA IF EXISTS libras CASCADE;
CREATE SCHEMA libras;
-- ddl-end --
ALTER SCHEMA libras OWNER TO postgres;
-- ddl-end --

SET search_path TO pg_catalog,public,libras;
-- ddl-end --

-- object: public.libras | type: SEQUENCE --
-- DROP SEQUENCE IF EXISTS public.libras CASCADE;
CREATE SEQUENCE public.libras
	INCREMENT BY 1
	MINVALUE 0
	MAXVALUE 2147483647
	START WITH 1
	CACHE 1
	NO CYCLE
	OWNED BY NONE;
-- ddl-end --
ALTER SEQUENCE public.libras OWNER TO postgres;
-- ddl-end --

-- object: libras.usuario | type: TABLE --
-- DROP TABLE IF EXISTS libras.usuario CASCADE;
CREATE TABLE libras.usuario(
	id uuid NOT NULL,
	nome varchar NOT NULL,
	senha varchar,

);
-- ddl-end --
ALTER TABLE libras.usuario OWNER TO postgres;
-- ddl-end --

-- object: libras.imagen | type: TABLE --
-- DROP TABLE IF EXISTS libras.imagen CASCADE;
CREATE TABLE libras.imagen(
	id uuid NOT NULL,
	descricao varchar NOT NULL,
	imagen bytea NOT NULL,
	video bytea NOT NULL,
	codigo_libra varchar,
	ativo bool NOT NULL DEFAULT false,

);
-- ddl-end --
ALTER TABLE libras.imagen OWNER TO postgres;
-- ddl-end --


