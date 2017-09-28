insert into usuario (id,nome, senha,tipo) values(1,'kleyton','123456','A')

select * from usuario where nome = 'kleyton'
update usuario set senha = '7c4a8d09ca3762af61e59520943dc26494f8941b' where id = 1


delete from usuario

alter table usuario  alter column senha type character varying(100)

-- Cria auto encremento 
CREATE SEQUENCE lusuario_id_seq
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
-- Restarta Auto-encremento

ALTER SEQUENCE libras.usuario_id_seq
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 RESTART 1
 CACHE 1;
  
ALTER TABLE usuario ALTER COLUMN id SET DEFAULT NEXTVAL('usuario_id_seq') ;