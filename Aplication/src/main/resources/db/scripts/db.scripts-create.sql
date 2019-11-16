--liquibase formatted sql

--changeset jefferson:1

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

--changeset jefferson:2

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

--changeset jefferson:3

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
