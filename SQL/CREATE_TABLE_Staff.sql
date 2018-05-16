CREATE TABLE `Staff` (
    `StaffID`  bigint(4) NOT NULL AUTO_INCREMENT ,
    `StaffAccount`  varchar(50) NOT NULL ,
    `StaffPwd`  varchar(50) NOT NULL ,
    `StaffName`  varchar(50) NULL ,
    `StaffSex`  varchar(50) NULL ,
    `StaffEmail`  varchar(50) NULL ,
    `StaffPhone`  varchar(50) NULL ,
    `StaffDate`  datetime(6) NULL ,
    PRIMARY KEY (`StaffID`)
);