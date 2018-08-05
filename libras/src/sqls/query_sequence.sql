/* Seleção de usuario*/
select * from usuario
/* Inclusão de usuario*/
insert into usuario values (nextval('imagem_id_seq'::regclass),'wev','7c4a8d09ca3762af61e59520943dc26494f8941b','U');
/* Update de usuario*/
update usuario set senha = '7c4a8d09ca3762af61e59520943dc26494f8941b' where id = 1
/* Deleta Todos os usuarios*/
delete from usuario

/* Altera coluna*/
alter table usuario  alter column senha type character varying(100)

-- Cria auto encremento 
CREATE SEQUENCE img_id_seq
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
  
ALTER TABLE imagens ALTER COLUMN id SET DEFAULT NEXTVAL('img_id_seq') ;




select * from imagem

/*Adiciona Imagem*/
INSERT INTO imagem (id,descricao,imagem) VALUES (1,'jasper',lo_import('/tmp/wev.jpg'));

/*Select Imagem*/
select lo_export(imagem ,'/tmp/erros.png') from imagem where descricao = 'errors'

