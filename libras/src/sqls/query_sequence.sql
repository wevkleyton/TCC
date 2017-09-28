insert into usuario (nome, senha,tipo) values('kleyton','123456','A')

select nome from usuario where nome = 'kleyton'

delete from usuario


-- Cria auto encremento 
CREATE SEQUENCE usuario_id_seq
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 START 1
 CACHE 1;
-- Restarta Auto-encremento

ALTER SEQUENCE usuario_id_seq
 INCREMENT 1
 MINVALUE 1
 MAXVALUE 9223372036854775807
 RESTART 1
 CACHE 1;
  
ALTER TABLE usuario ALTER COLUMN id SET DEFAULT NEXTVAL('usuario_id_seq') ;