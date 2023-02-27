SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0; 
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

CREATE TABLE IF NOT EXISTS `hospital database_management system`.`doctor` (
`Doctor_ID` INT NOT NULL,
`Doctor_Name` VARCHAR(45) NOT NULL,
`Doctor_Specialization` VARCHAR(45) NOT NULL, PRIMARY KEY (`Doctor_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`employee` (
`E_Id` INT NOT NULL,
`E_Name` VARCHAR(45) NOT NULL,
`E_Phone_Number` INT NOT NULL,
`E_Address` VARCHAR(45) NOT NULL,
`E_Salary` INT NOT NULL,
`E_job` VARCHAR(45) NOT NULL, PRIMARY KEY (`E_Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`patientdetails` (
 `Patients_Id` INT NOT NULL,
 `Patient_Name` TEXT NOT NULL,
 `Medicine_Id` INT NULL DEFAULT NULL,
 `Patient_Address` TEXT NOT NULL,
 `Patient_Blood_Group` TEXT NOT NULL,
 `Patient_Age` INT NOT NULL,
 `Patient_Gender` TEXT NOT NULL,
 `Patient_Phone_Number` TEXT NULL DEFAULT NULL,
 `Patient_Discharge_date` TEXT NULL DEFAULT NULL,
 `Patient_Admit_date` TEXT NOT NULL,
 `Patient_Room_No` INT NOT NULL,
 PRIMARY KEY (`Patients_Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`medicines` 
(
 `Medicine_Id` INT NOT NULL,
 `Medicine_Name` TEXT NOT NULL,
 `Medicine_Price` INT NOT NULL,
 `Patient_Id` INT NULL DEFAULT NULL,
 PRIMARY KEY (`Medicine_Id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`nurse` (
 `Nurse_Id` INT NOT NULL ,
 `Nurse_Name` TEXT NOT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`patients_doctor` (
`Patients_ID` INT NOT NULL,
`Doctor_ID` INT NOT NULL,
`Doctor_Name` VARCHAR(45) NOT NULL, PRIMARY KEY (`Patients_ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


CREATE TABLE IF NOT EXISTS `hospital database_management system`.`rooms` (
`Room_No` INT NOT NULL,
`Room_Type` TEXT NOT NULL,
`Room_Cost` INT NOT NULL, PRIMARY KEY (`Room_No`)) ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;
