--liquibase formatted sql

--changeset jefferson:1.0

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `district` varchar(255) NOT NULL,
  `number` int(11) NOT NULL,
  `street` varchar(255) NOT NULL,
  `zip_code` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--rollback drop table `Address`;

--changeset jefferson:1.1

CREATE TABLE `company` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `document` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `site` varchar(255) NOT NULL,
  `vacancies` int(11) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn6u8jp11ac07ya5eda2agod5o` (`address_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--rollback drop table `Company`;

--changeset jefferson:1.2

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `document` varchar(255) NOT NULL,
  `idade` int(11) NOT NULL,
  `login` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `salario` decimal(19,2) DEFAULT NULL,
  `senha` varchar(255) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `company_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlq0qkm58rh351bb84y4o5c447` (`address_id`),
  KEY `FK1w9rdxn4dh1ej5lkpywwbakix` (`company_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--rollback drop table `User`;

--changeset jefferson:1.3

CREATE TABLE role
(
    id bigint(20) auto_increment,
    name varchar(255) not null,
    constraint role_pk
        primary key (id)
);

-- changeset jefferson:1.4

INSERT INTO role (name)
    values("ADMIN");
INSERT INTO role (name)
    values("CLIENT");

-- changeset jefferson:1.5

CREATE TABLE user_role
(
    id bigint not null auto_increment,
    user_id bigint,
    role_id bigint,
    constraint user_role_pk
		primary key (id),
    constraint user_role_user_fk
		foreign key (user_id) references user (id),
    constraint user_role_role_fk
		foreign key (role_id) references role (id)
);