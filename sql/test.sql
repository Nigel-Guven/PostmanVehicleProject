-- Create a new database called 'AUDIPHOENIXDB'
-- Connect to the 'master' database to run this snippet
USE master
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = N'AUDIPHOENIXDB'
)
CREATE DATABASE AUDIPHOENIXDB
GO

SELECT * FROM master

ALTER TABLE AUDIPHOENIXDB;

sp_rename 'AUDIPHOENIXDB', 'phoenixdb'

USE name
GO
EXEC sp_rename 'AUDIPHOENIXDB', 'phoenixdb';
GO

USE master;  
GO  
EXEC sp_rename 'AUDIPHOENIXDB', 'phoenixdb';  
GO 

ALTER DATABASE AUDIPHOENIXDB MODIFY NAME = phoenixdb ;
SELECT Name From sys.databases
WHERE name = AUDIPHOENIXDB in sys.databases


USE phoenixdb;
CREATE TABLE vehicles (VehicleID int, Name varchar(255), Transmission varchar(255), Body varchar(255), Engine_Size  varchar(255), Fuel_Type varchar(255), Color varchar(255));

INSERT INTO vehicles VALUES (1, 'Audi A8', 'Manual', 'Sedan','3.0', 'Diesel', 'White');

SELECT * FROM vehicles
