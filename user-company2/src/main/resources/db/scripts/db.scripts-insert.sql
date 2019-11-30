--liquibase formatted sql

--changeset jefferson:1
INSERT INTO `company`(`document`,`name`,`site`,`vacancies`) VALUES (123456789,"Empresa 1", "www.empresa1.com.br", 1);
INSERT INTO `company`(`document`,`name`,`site`,`vacancies`) VALUES (3215468789,"Empresa 2","www.empresa2.com.br", 3);
INSERT INTO `company`(`document`,`name`,`site`,`vacancies`) VALUES (87454512135,"Empresa 3","www.empresa3.com.br", 1);
INSERT INTO `company`(`document`,`name`,`site`,`vacancies`) VALUES (987512231,"Empresa 4","www.empresa4.com.br", 5);
INSERT INTO `company`(`document`,`name`,`site`,`vacancies`) VALUES (231545689,"Empresa 5","www.empresa5.com.br", 10);

--changeset jefferson:2
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(6544848956, 20, "user1", "Usuário 1", 2000.00, "user1", 1);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(54532454353, 23, "user2", "Usuário 2", 2430.10, "user2", 2);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(12421342134, 54, "user3", "Usuário 3", 5000.00, "user3", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(2312342423, 32, "user4", "Usuário 4", 4030.80, "user4", 4);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(656346431, 33, "user5", "Usuário 5", 5340.50, "user5", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(9876202838, 43, "user6", "Usuário 6", 6030.00, "user6", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(9876534567, 52, "user7", "Usuário 7", 1570.44, "user7", 2);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(2356343234, 18, "user8", "Usuário 8", 5630.05, "user8", 3);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(2343675434, 23, "user9", "Usuário 9", 4543.50, "user9", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(2145566576, 32, "user10", "Usuário 10", 6216.10, "user10", 2);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(8799898789, 53, "user11", "Usuário 11", 4805.00, "user11", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(78974654632, 25, "user12", "Usuário 12", 7582.00, "user12", 5);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(6568655453, 45, "user13", "Usuário 13", 5820.40, "user13", 2);
INSERT INTO `user`(`document`,`idade`,`login`,`name`,`salario`,`senha`,`company_id`)VALUES(53456798726, 29, "user14", "Usuário 14", 2850.97, "user14", 5);
