--  *********************************************************************
--  SQL to roll back currently unexecuted changes
--  *********************************************************************
--  Change Log: src/main/resources/db/changelog/db.changelog-master.xml
--  Ran at: 23/11/19 16:25
--  Against: jeff@localhost@jdbc:mysql://localhost:3306/codenation
--  Liquibase version: 3.8.0
--  *********************************************************************

--  Lock Database
UPDATE database_changelog_lock SET `LOCKED` = 1, LOCKEDBY = '10.101.13.200 (10.101.13.200)', LOCKGRANTED = '2019-11-23 16:25:33.087' WHERE ID = 1 AND `LOCKED` = 0;

--  Release Database Lock
UPDATE database_changelog_lock SET `LOCKED` = 0, LOCKEDBY = NULL, LOCKGRANTED = NULL WHERE ID = 1;

