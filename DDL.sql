-- DROP SCHEMA public;

CREATE SCHEMA public AUTHORIZATION pg_database_owner;
-- public.proprietaire definition

-- Drop table

-- DROP TABLE public.proprietaire;

CREATE TABLE public.proprietaire (
	nom varchar NOT NULL,
	prenom varchar NOT NULL,
	id int8 NOT NULL,
	CONSTRAINT proprietaire_pk PRIMARY KEY (id)
);


-- public.voiture definition

-- Drop table

-- DROP TABLE public.voiture;

CREATE TABLE public.voiture (
	id int8 NOT NULL,
	marque varchar NOT NULL,
	immatriculation varchar NOT NULL,
	proprietaire_id int8 NULL,
	CONSTRAINT voiture_pkey PRIMARY KEY (id),
	CONSTRAINT voiture_proprietaire_id_fkey FOREIGN KEY (proprietaire_id) REFERENCES public.proprietaire(id)
);
-- DROP SCHEMA public;

CREATE SCHEMA public AUTHORIZATION pg_database_owner;
-- public.proprietaire definition

-- Drop table

-- DROP TABLE public.proprietaire;

CREATE TABLE public.proprietaire (
	nom varchar NOT NULL,
	prenom varchar NOT NULL,
	id int8 NOT NULL,
	CONSTRAINT proprietaire_pk PRIMARY KEY (id)
);


-- public.voiture definition

-- Drop table

-- DROP TABLE public.voiture;

CREATE TABLE public.voiture (
	id int8 NOT NULL,
	marque varchar NOT NULL,
	immatriculation varchar NOT NULL,
	proprietaire_id int8 NULL,
	CONSTRAINT voiture_pkey PRIMARY KEY (id),
	CONSTRAINT voiture_proprietaire_id_fkey FOREIGN KEY (proprietaire_id) REFERENCES public.proprietaire(id)
);
